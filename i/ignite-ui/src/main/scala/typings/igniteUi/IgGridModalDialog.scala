package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridModalDialog
  extends StObject
     with /**
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
  
  inline def apply(): IgGridModalDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridModalDialog]
  }
  
  extension [Self <: IgGridModalDialog](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setButtonApplyDisabled(value: Boolean): Self = StObject.set(x, "buttonApplyDisabled", value.asInstanceOf[js.Any])
    
    inline def setButtonApplyDisabledUndefined: Self = StObject.set(x, "buttonApplyDisabled", js.undefined)
    
    inline def setButtonCancelClick(value: (/* event */ Event, /* ui */ ButtonCancelClickEventUIParam) => Unit): Self = StObject.set(x, "buttonCancelClick", js.Any.fromFunction2(value))
    
    inline def setButtonCancelClickUndefined: Self = StObject.set(x, "buttonCancelClick", js.undefined)
    
    inline def setButtonOKClick(value: (/* event */ Event, /* ui */ ButtonOKClickEventUIParam) => Unit): Self = StObject.set(x, "buttonOKClick", js.Any.fromFunction2(value))
    
    inline def setButtonOKClickUndefined: Self = StObject.set(x, "buttonOKClick", js.undefined)
    
    inline def setCloseModalDialogOnEnter(value: Boolean): Self = StObject.set(x, "closeModalDialogOnEnter", value.asInstanceOf[js.Any])
    
    inline def setCloseModalDialogOnEnterUndefined: Self = StObject.set(x, "closeModalDialogOnEnter", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setModalDialogClosed(value: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosed", js.Any.fromFunction2(value))
    
    inline def setModalDialogClosedUndefined: Self = StObject.set(x, "modalDialogClosed", js.undefined)
    
    inline def setModalDialogClosing(value: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogClosing", js.Any.fromFunction2(value))
    
    inline def setModalDialogClosingUndefined: Self = StObject.set(x, "modalDialogClosing", js.undefined)
    
    inline def setModalDialogContentsRendered(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendered", js.Any.fromFunction2(value))
    
    inline def setModalDialogContentsRenderedUndefined: Self = StObject.set(x, "modalDialogContentsRendered", js.undefined)
    
    inline def setModalDialogContentsRendering(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogContentsRendering", js.Any.fromFunction2(value))
    
    inline def setModalDialogContentsRenderingUndefined: Self = StObject.set(x, "modalDialogContentsRendering", js.undefined)
    
    inline def setModalDialogHeight(value: Double): Self = StObject.set(x, "modalDialogHeight", value.asInstanceOf[js.Any])
    
    inline def setModalDialogHeightUndefined: Self = StObject.set(x, "modalDialogHeight", js.undefined)
    
    inline def setModalDialogMoving(value: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = StObject.set(x, "modalDialogMoving", js.Any.fromFunction2(value))
    
    inline def setModalDialogMovingUndefined: Self = StObject.set(x, "modalDialogMoving", js.undefined)
    
    inline def setModalDialogOpened(value: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpened", js.Any.fromFunction2(value))
    
    inline def setModalDialogOpenedUndefined: Self = StObject.set(x, "modalDialogOpened", js.undefined)
    
    inline def setModalDialogOpening(value: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = StObject.set(x, "modalDialogOpening", js.Any.fromFunction2(value))
    
    inline def setModalDialogOpeningUndefined: Self = StObject.set(x, "modalDialogOpening", js.undefined)
    
    inline def setModalDialogWidth(value: Double): Self = StObject.set(x, "modalDialogWidth", value.asInstanceOf[js.Any])
    
    inline def setModalDialogWidthUndefined: Self = StObject.set(x, "modalDialogWidth", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRenderFooterButtons(value: Boolean): Self = StObject.set(x, "renderFooterButtons", value.asInstanceOf[js.Any])
    
    inline def setRenderFooterButtonsUndefined: Self = StObject.set(x, "renderFooterButtons", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
  }
}
