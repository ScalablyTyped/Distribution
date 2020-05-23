package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridModalDialog
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var buttonApplyDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Event fired when the button Cancel is clicked
    */
  var buttonCancelClick: js.UndefOr[ButtonCancelClickEvent] = js.undefined
  /**
    * Event fired when the button OK/Apply is clicked
    */
  var buttonOKClick: js.UndefOr[ButtonOKClickEvent] = js.undefined
  /**
    * If true and Enter is pressed - close modal dialog(NOTE: buttonApplyDisabled should be set to false - otherwise this options is ignored)
    */
  var closeModalDialogOnEnter: js.UndefOr[Boolean] = js.undefined
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
    * Event fired after the modal dialog has been closed.
    */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.undefined
  /**
    * Event fired before the modal dialog is closed.
    */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.undefined
  /**
    * Event fired after the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.undefined
  /**
    * Event fired before the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.undefined
  /**
    * The default modal dialog height in pixels.
    */
  var modalDialogHeight: js.UndefOr[Double] = js.undefined
  /**
    * Event fired every time the modal dialog changes its position.
    */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.undefined
  /**
    * Event fired after the modal dialog is already opened.
    */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.undefined
  /**
    * Event fired before the modal dialog is opened.
    */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.undefined
  /**
    * The default modal dialog width in pixels.
    */
  var modalDialogWidth: js.UndefOr[Double] = js.undefined
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  var renderFooterButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * Tab index to assign to containers and buttons inside the dialog
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
}

object IgGridModalDialog {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationDuration: js.UndefOr[Double] = js.undefined,
    buttonApplyDisabled: js.UndefOr[Boolean] = js.undefined,
    buttonCancelClick: (/* event */ Event, /* ui */ ButtonCancelClickEventUIParam) => Unit = null,
    buttonOKClick: (/* event */ Event, /* ui */ ButtonOKClickEventUIParam) => Unit = null,
    closeModalDialogOnEnter: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: js.Any = null,
    modalDialogClosed: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit = null,
    modalDialogClosing: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit = null,
    modalDialogContentsRendered: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit = null,
    modalDialogContentsRendering: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit = null,
    modalDialogHeight: js.UndefOr[Double] = js.undefined,
    modalDialogMoving: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit = null,
    modalDialogOpened: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit = null,
    modalDialogOpening: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit = null,
    modalDialogWidth: js.UndefOr[Double] = js.undefined,
    regional: String | js.Object = null,
    renderFooterButtons: js.UndefOr[Boolean] = js.undefined,
    tabIndex: js.UndefOr[Double] = js.undefined
  ): IgGridModalDialog = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonApplyDisabled)) __obj.updateDynamic("buttonApplyDisabled")(buttonApplyDisabled.get.asInstanceOf[js.Any])
    if (buttonCancelClick != null) __obj.updateDynamic("buttonCancelClick")(js.Any.fromFunction2(buttonCancelClick))
    if (buttonOKClick != null) __obj.updateDynamic("buttonOKClick")(js.Any.fromFunction2(buttonOKClick))
    if (!js.isUndefined(closeModalDialogOnEnter)) __obj.updateDynamic("closeModalDialogOnEnter")(closeModalDialogOnEnter.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (modalDialogClosed != null) __obj.updateDynamic("modalDialogClosed")(js.Any.fromFunction2(modalDialogClosed))
    if (modalDialogClosing != null) __obj.updateDynamic("modalDialogClosing")(js.Any.fromFunction2(modalDialogClosing))
    if (modalDialogContentsRendered != null) __obj.updateDynamic("modalDialogContentsRendered")(js.Any.fromFunction2(modalDialogContentsRendered))
    if (modalDialogContentsRendering != null) __obj.updateDynamic("modalDialogContentsRendering")(js.Any.fromFunction2(modalDialogContentsRendering))
    if (!js.isUndefined(modalDialogHeight)) __obj.updateDynamic("modalDialogHeight")(modalDialogHeight.get.asInstanceOf[js.Any])
    if (modalDialogMoving != null) __obj.updateDynamic("modalDialogMoving")(js.Any.fromFunction2(modalDialogMoving))
    if (modalDialogOpened != null) __obj.updateDynamic("modalDialogOpened")(js.Any.fromFunction2(modalDialogOpened))
    if (modalDialogOpening != null) __obj.updateDynamic("modalDialogOpening")(js.Any.fromFunction2(modalDialogOpening))
    if (!js.isUndefined(modalDialogWidth)) __obj.updateDynamic("modalDialogWidth")(modalDialogWidth.get.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (!js.isUndefined(renderFooterButtons)) __obj.updateDynamic("renderFooterButtons")(renderFooterButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridModalDialog]
  }
}

