package typings.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper

import typings.jupyterlabCodeeditor.anon.PartialIConfig
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a code editor widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The configuration options for the editor.
    */
  var config: js.UndefOr[PartialIConfig] = js.native
  
  /**
    * A code editor factory.
    *
    * #### Notes
    * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
    * object because it needs to provide its own node as the host.
    */
  var factory: Factory = js.native
  
  /**
    * The model used to initialize the code editor.
    */
  var model: IModel = js.native
  
  /**
    * The default selection style for the editor.
    */
  var selectionStyle: js.UndefOr[ISelectionStyle] = js.native
  
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateOnShow: js.UndefOr[Boolean] = js.native
  
  /**
    * The desired uuid for the editor.
    */
  var uuid: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    factory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    model: IModel
  ): IOptions = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction1(factory), model = model.asInstanceOf[js.Any])
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
    def setFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = this.set("factory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModel(value: IModel): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: PartialIConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: ISelectionStyle): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setUpdateOnShow(value: Boolean): Self = this.set("updateOnShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateOnShow: Self = this.set("updateOnShow", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
