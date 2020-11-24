package typings.jupyterlabApputils.dialogMod.Dialog

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to create a dialog.
  */
@js.native
trait IOptions[T] extends js.Object {
  
  /**
    * The main body element for the dialog or a message to display.
    * Defaults to an empty string.
    *
    * #### Notes
    * If a widget is given as the body, it will be disposed after the
    * dialog is resolved.  If the widget has a `getValue()` method,
    * the method will be called prior to disposal and the value
    * will be provided as part of the dialog result.
    * A string argument will be used as raw `textContent`.
    * All `input` and `select` nodes will be wrapped and styled.
    */
  var body: Body[T] = js.native
  
  /**
    * The buttons to display. Defaults to cancel and accept buttons.
    */
  var buttons: js.Array[IButton] = js.native
  
  /**
    * The index of the default button.  Defaults to the last button.
    */
  var defaultButton: Double = js.native
  
  /**
    * A selector for the primary element that should take focus in the dialog.
    * Defaults to an empty string, causing the [[defaultButton]] to take
    * focus.
    */
  var focusNodeSelector: String = js.native
  
  /**
    * The host element for the dialog. Defaults to `document.body`.
    */
  var host: HTMLElement = js.native
  
  /**
    * An optional renderer for dialog items.  Defaults to a shared
    * default renderer.
    */
  var renderer: IRenderer = js.native
  
  /**
    * The top level text for the dialog.  Defaults to an empty string.
    */
  var title: Header = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T](
    body: Body[T],
    buttons: js.Array[IButton],
    defaultButton: Double,
    focusNodeSelector: String,
    host: HTMLElement,
    renderer: IRenderer,
    title: Header
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any], focusNodeSelector = focusNodeSelector.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setBody(value: Body[T]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: IButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[IButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultButton(value: Double): Self = this.set("defaultButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusNodeSelector(value: String): Self = this.set("focusNodeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Header): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
