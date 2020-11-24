package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridModalDialog
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var buttonApplyDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired when the button Cancel is clicked
    */
  var buttonCancelClick: js.UndefOr[ButtonCancelClickEvent] = js.native
  
  /**
    * Event fired when the button OK/Apply is clicked
    */
  var buttonOKClick: js.UndefOr[ButtonOKClickEvent] = js.native
  
  /**
    * If true and Enter is pressed - close modal dialog(NOTE: buttonApplyDisabled should be set to false - otherwise this options is ignored)
    */
  var closeModalDialogOnEnter: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Event fired after the modal dialog has been closed.
    */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.native
  
  /**
    * Event fired before the modal dialog is closed.
    */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.native
  
  /**
    * Event fired after the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.native
  
  /**
    * Event fired before the contents of the modal dialog are rendered.
    */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.native
  
  /**
    * The default modal dialog height in pixels.
    */
  var modalDialogHeight: js.UndefOr[Double] = js.native
  
  /**
    * Event fired every time the modal dialog changes its position.
    */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.native
  
  /**
    * Event fired after the modal dialog is already opened.
    */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.native
  
  /**
    * Event fired before the modal dialog is opened.
    */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.native
  
  /**
    * The default modal dialog width in pixels.
    */
  var modalDialogWidth: js.UndefOr[Double] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  var renderFooterButtons: js.UndefOr[Boolean] = js.native
  
  /**
    * Tab index to assign to containers and buttons inside the dialog
    */
  var tabIndex: js.UndefOr[Double] = js.native
}
object IgGridModalDialog {
  
  @scala.inline
  def apply(): IgGridModalDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridModalDialog]
  }
  
  @scala.inline
  implicit class IgGridModalDialogOps[Self <: IgGridModalDialog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setButtonApplyDisabled(value: Boolean): Self = this.set("buttonApplyDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonApplyDisabled: Self = this.set("buttonApplyDisabled", js.undefined)
    
    @scala.inline
    def setButtonCancelClick(value: (/* event */ Event, /* ui */ ButtonCancelClickEventUIParam) => Unit): Self = this.set("buttonCancelClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteButtonCancelClick: Self = this.set("buttonCancelClick", js.undefined)
    
    @scala.inline
    def setButtonOKClick(value: (/* event */ Event, /* ui */ ButtonOKClickEventUIParam) => Unit): Self = this.set("buttonOKClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteButtonOKClick: Self = this.set("buttonOKClick", js.undefined)
    
    @scala.inline
    def setCloseModalDialogOnEnter(value: Boolean): Self = this.set("closeModalDialogOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseModalDialogOnEnter: Self = this.set("closeModalDialogOnEnter", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setModalDialogClosed(value: (/* event */ Event, /* ui */ ModalDialogClosedEventUIParam) => Unit): Self = this.set("modalDialogClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogClosed: Self = this.set("modalDialogClosed", js.undefined)
    
    @scala.inline
    def setModalDialogClosing(value: (/* event */ Event, /* ui */ ModalDialogClosingEventUIParam) => Unit): Self = this.set("modalDialogClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogClosing: Self = this.set("modalDialogClosing", js.undefined)
    
    @scala.inline
    def setModalDialogContentsRendered(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderedEventUIParam) => Unit): Self = this.set("modalDialogContentsRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogContentsRendered: Self = this.set("modalDialogContentsRendered", js.undefined)
    
    @scala.inline
    def setModalDialogContentsRendering(value: (/* event */ Event, /* ui */ ModalDialogContentsRenderingEventUIParam) => Unit): Self = this.set("modalDialogContentsRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogContentsRendering: Self = this.set("modalDialogContentsRendering", js.undefined)
    
    @scala.inline
    def setModalDialogHeight(value: Double): Self = this.set("modalDialogHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalDialogHeight: Self = this.set("modalDialogHeight", js.undefined)
    
    @scala.inline
    def setModalDialogMoving(value: (/* event */ Event, /* ui */ ModalDialogMovingEventUIParam) => Unit): Self = this.set("modalDialogMoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogMoving: Self = this.set("modalDialogMoving", js.undefined)
    
    @scala.inline
    def setModalDialogOpened(value: (/* event */ Event, /* ui */ ModalDialogOpenedEventUIParam) => Unit): Self = this.set("modalDialogOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogOpened: Self = this.set("modalDialogOpened", js.undefined)
    
    @scala.inline
    def setModalDialogOpening(value: (/* event */ Event, /* ui */ ModalDialogOpeningEventUIParam) => Unit): Self = this.set("modalDialogOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteModalDialogOpening: Self = this.set("modalDialogOpening", js.undefined)
    
    @scala.inline
    def setModalDialogWidth(value: Double): Self = this.set("modalDialogWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalDialogWidth: Self = this.set("modalDialogWidth", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRenderFooterButtons(value: Boolean): Self = this.set("renderFooterButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFooterButtons: Self = this.set("renderFooterButtons", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
}
