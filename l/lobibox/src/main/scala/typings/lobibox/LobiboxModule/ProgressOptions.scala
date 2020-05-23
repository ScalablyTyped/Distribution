package typings.lobibox.LobiboxModule

import typings.lobibox.anon.Cancel
import typings.lobibox.anon.Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressOptions
  extends MessageBoxesOptions
     with ProgressMethods
     with ProgressEvents {
    // Show percentage of progress
  var label: js.UndefOr[String] = js.undefined
  var progressCompleted: js.UndefOr[js.Any] = js.undefined
    // Show progress label
  var progressTpl: js.UndefOr[Boolean] = js.undefined
    //Template of progress bar
  //Events
  @JSName("progressUpdated")
  var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.undefined
  var showProgressLabel: js.UndefOr[Boolean] = js.undefined
}

object ProgressOptions {
  @scala.inline
  def apply(
    baseClass: String = null,
    beforeClose: /* lobibox */ js.Any => Unit = null,
    bodyClass: String = null,
    buttons: Cancel | js.Any = null,
    buttonsAlign: js.Any = null,
    callback: (/* lobibox */ js.Any, /* type */ js.UndefOr[String], /* ev */ js.UndefOr[js.Any]) => Unit = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    closed: /* lobibox */ js.Any => Unit = null,
    customBtnClass: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayToRemove: js.UndefOr[Double] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    getProgress: () => Double = null,
    getTitle: () => String = null,
    height: String = null,
    hide: () => ProgressOptions = null,
    hideClass: String = null,
    horizontalOffset: js.UndefOr[Double] = js.undefined,
    label: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    modalClasses: Confirm = null,
    msg: String = null,
    onShow: /* lobibox */ js.Any => Unit = null,
    progressComplete: /* lobibox */ LobiboxStatic => Unit = null,
    progressCompleted: js.Any = null,
    progressTpl: js.UndefOr[Boolean] = js.undefined,
    progressUpdated: js.Any = null,
    setHeight: /* height */ js.UndefOr[Double] => ProgressOptions = null,
    setPosition: (/* left */ js.UndefOr[Double | String], /* top */ js.UndefOr[Double]) => ProgressOptions = null,
    setProgress: /* progress */ Double => ProgressOptions = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => ProgressOptions = null,
    setTitle: /* title */ js.UndefOr[String] => ProgressOptions = null,
    setWidth: /* width */ js.UndefOr[Double] => ProgressOptions = null,
    show: () => ProgressOptions = null,
    showClass: String = null,
    showProgressLabel: js.UndefOr[Boolean] = js.undefined,
    shown: /* lobibox */ js.Any => Unit = null,
    title: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): ProgressOptions = {
    val __obj = js.Dynamic.literal()
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1(beforeClose))
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (buttonsAlign != null) __obj.updateDynamic("buttonsAlign")(buttonsAlign.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.get.asInstanceOf[js.Any])
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (customBtnClass != null) __obj.updateDynamic("customBtnClass")(customBtnClass.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayToRemove)) __obj.updateDynamic("delayToRemove")(delayToRemove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (getProgress != null) __obj.updateDynamic("getProgress")(js.Any.fromFunction0(getProgress))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (hideClass != null) __obj.updateDynamic("hideClass")(hideClass.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOffset)) __obj.updateDynamic("horizontalOffset")(horizontalOffset.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (modalClasses != null) __obj.updateDynamic("modalClasses")(modalClasses.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (progressComplete != null) __obj.updateDynamic("progressComplete")(js.Any.fromFunction1(progressComplete))
    if (progressCompleted != null) __obj.updateDynamic("progressCompleted")(progressCompleted.asInstanceOf[js.Any])
    if (!js.isUndefined(progressTpl)) __obj.updateDynamic("progressTpl")(progressTpl.get.asInstanceOf[js.Any])
    if (progressUpdated != null) __obj.updateDynamic("progressUpdated")(progressUpdated.asInstanceOf[js.Any])
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction2(setPosition))
    if (setProgress != null) __obj.updateDynamic("setProgress")(js.Any.fromFunction1(setProgress))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (showClass != null) __obj.updateDynamic("showClass")(showClass.asInstanceOf[js.Any])
    if (!js.isUndefined(showProgressLabel)) __obj.updateDynamic("showProgressLabel")(showProgressLabel.get.asInstanceOf[js.Any])
    if (shown != null) __obj.updateDynamic("shown")(js.Any.fromFunction1(shown))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressOptions]
  }
}

