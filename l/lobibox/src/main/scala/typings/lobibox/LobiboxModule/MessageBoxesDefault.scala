package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxesDefault extends js.Object {
  var baseClass: js.UndefOr[String] = js.undefined
  // when messagebox remove method is called but before it is actually hidden
  var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  var buttonsAlign: js.UndefOr[String] = js.undefined
    // Height is automatically given calculated by width
  var closeButton: js.UndefOr[Boolean] = js.undefined
   // Position where buttons should be aligned
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  // after messagebox is hidden
  var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
    // Make messagebox draggable
  var customBtnClass: js.UndefOr[String] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
    // Close messagebox on Esc press
  var delayToRemove: js.UndefOr[Double] = js.undefined
    // Show close button or not
  var draggable: js.UndefOr[Boolean] = js.undefined
  var getTitle: js.UndefOr[js.Function0[String]] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  // methods
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  var hideClass: js.UndefOr[String] = js.undefined
  var horizontalOffset: js.UndefOr[Double] = js.undefined
   // Class for custom buttons
  var modal: js.UndefOr[Boolean] = js.undefined
  var msg: js.UndefOr[String] = js.undefined
  // events
  // when messagebox show is called but before it is actually shown
  var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], this.type]] = js.undefined
  var setPosition: js.UndefOr[
    js.Function2[/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double], this.type]
  ] = js.undefined
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], this.type]
  ] = js.undefined
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.undefined
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], this.type]] = js.undefined
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  var showClass: js.UndefOr[String] = js.undefined
  // after messagebox is shown
  var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, Unit]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MessageBoxesDefault {
  @scala.inline
  def apply(
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Unit = null,
    buttonsAlign: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Unit = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: js.UndefOr[Double] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getTitle: () => String = null,
    height: String = null,
    hide: () => MessageBoxesDefault = null,
    hideClass: String = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Unit = null,
    setHeight: /* height */ js.UndefOr[Double] => MessageBoxesDefault = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => MessageBoxesDefault = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => MessageBoxesDefault = null,
    setTitle: /* title */ js.UndefOr[String] => MessageBoxesDefault = null,
    setWidth: /* width */ js.UndefOr[Double] => MessageBoxesDefault = null,
    show: () => MessageBoxesDefault = null,
    showClass: String = null,
    shown: /* lobibox */ js.Any => Unit = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): MessageBoxesDefault = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayToRemove)) __obj.updateDynamic("delayToRemove")(delayToRemove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxesDefault]
  }
}

