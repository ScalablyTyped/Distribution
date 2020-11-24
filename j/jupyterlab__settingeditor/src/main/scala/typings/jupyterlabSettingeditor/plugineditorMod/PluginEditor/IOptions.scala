package typings.jupyterlabSettingeditor.plugineditorMod.PluginEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.anon.Registry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a plugin editor.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: Registry = js.native
  
  /**
    * The editor factory used by the plugin editor.
    */
  var editorFactory: Factory = js.native
  
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
    commands: Registry,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    registry: ISettingRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), registry = registry.asInstanceOf[js.Any])
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
    def setCommands(value: Registry): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = this.set("editorFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegistry(value: ISettingRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendermime: Self = this.set("rendermime", js.undefined)
  }
}
