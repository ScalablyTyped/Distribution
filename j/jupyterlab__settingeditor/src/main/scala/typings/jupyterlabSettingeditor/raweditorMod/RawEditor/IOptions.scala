package typings.jupyterlabSettingeditor.raweditorMod.RawEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a raw editor.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: ICommandBundle = js.native
  
  /**
    * The editor factory used by the raw editor.
    */
  var editorFactory: Factory = js.native
  
  /**
    * A function the raw editor calls on save errors.
    */
  def onSaveError(reason: js.Any): Unit = js.native
  
  /**
    * The setting registry used by the editor.
    */
  var registry: ISettingRegistry = js.native
  
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    commands: ICommandBundle,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    onSaveError: js.Any => Unit,
    registry: ISettingRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), onSaveError = js.Any.fromFunction1(onSaveError), registry = registry.asInstanceOf[js.Any])
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
    def setCommands(value: ICommandBundle): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = this.set("editorFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSaveError(value: js.Any => Unit): Self = this.set("onSaveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegistry(value: ISettingRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendermime: Self = this.set("rendermime", js.undefined)
  }
}
