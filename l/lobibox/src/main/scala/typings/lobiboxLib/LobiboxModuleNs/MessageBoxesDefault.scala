package typings
package lobiboxLib.LobiboxModuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBoxesDefault extends js.Object {
  var baseClass: js.UndefOr[java.lang.String] = js.undefined
  // when messagebox remove method is called but before it is actually hidden
  var beforeClose: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
  var buttonsAlign: js.UndefOr[java.lang.String] = js.undefined
    // Height is automatically given calculated by width
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
   // Position where buttons should be aligned
  var closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined
  // after messagebox is hidden
  var closed: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
    // Make messagebox draggable
  var customBtnClass: js.UndefOr[java.lang.String] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
    // Close messagebox on Esc press
  var delayToRemove: js.UndefOr[scala.Double] = js.undefined
    // Show close button or not
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  // methods
  var hide: js.UndefOr[js.Function0[this.type]] = js.undefined
  var hideClass: js.UndefOr[java.lang.String] = js.undefined
  var horizontalOffset: js.UndefOr[scala.Double] = js.undefined
   // Class for custom buttons
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var msg: js.UndefOr[java.lang.String] = js.undefined
  // events
  // when messagebox show is called but before it is actually shown
  var onShow: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[scala.Double], this.type]] = js.undefined
  var setPosition: js.UndefOr[
    js.Function2[
      /* left */ js.UndefOr[scala.Double | java.lang.String], 
      /* top */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  var setSize: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[scala.Double], this.type]] = js.undefined
  var show: js.UndefOr[js.Function0[this.type]] = js.undefined
  var showClass: js.UndefOr[java.lang.String] = js.undefined
  // after messagebox is shown
  var shown: js.UndefOr[js.Function1[/* lobibox */ js.Any, scala.Unit]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MessageBoxesDefault {
  @scala.inline
  def apply(
    baseClass: java.lang.String = null,
    beforeClose: /* lobibox */ js.Any => scala.Unit = null,
    buttonsAlign: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[scala.Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => scala.Unit = null,
    customBtnClass: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    delayToRemove: scala.Int | scala.Double = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    getTitle: () => java.lang.String = null,
    height: java.lang.String = null,
    hide: () => MessageBoxesDefault = null,
    hideClass: java.lang.String = null,
    horizontalOffset: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    msg: java.lang.String = null,
    onShow: /* lobibox */ js.Any => scala.Unit = null,
    setHeight: /* height */ js.UndefOr[scala.Double] => MessageBoxesDefault = null,
    setPosition: (/* left */ js.UndefOr[scala.Double | java.lang.String], /* top */ js.UndefOr[scala.Double]) => MessageBoxesDefault = null,
    setSize: (/* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => MessageBoxesDefault = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => MessageBoxesDefault = null,
    setWidth: /* width */ js.UndefOr[scala.Double] => MessageBoxesDefault = null,
    show: () => MessageBoxesDefault = null,
    showClass: java.lang.String = null,
    shown: /* lobibox */ js.Any => scala.Unit = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): MessageBoxesDefault = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delayToRemove != null) __obj.updateDynamic("delayToRemove")(delayToRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (height != null) __obj.updateDynamic("height")(height)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass)
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (msg != null) __obj.updateDynamic("msg")(msg)
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass)
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxesDefault]
  }
}

