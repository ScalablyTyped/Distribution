package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCodeeditor.anon.PartialIConfig
import typings.jupyterlabCodeeditor.anon.PartialISelectionStyle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize an editor.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[PartialIConfig] = js.native
  
  /**
    * The host widget used by the editor.
    */
  var host: HTMLElement = js.native
  
  /**
    * The model used by the editor.
    */
  var model: IModel = js.native
  
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[PartialISelectionStyle] = js.native
  
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(host: HTMLElement, model: IModel): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: PartialIConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: PartialISelectionStyle): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
