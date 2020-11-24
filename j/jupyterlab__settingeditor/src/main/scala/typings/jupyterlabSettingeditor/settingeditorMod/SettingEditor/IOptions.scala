package typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.anon.Registry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The instantiation options for a setting editor.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The toolbar commands and registry for the setting editor toolbar.
    */
  var commands: Registry = js.native
  
  /**
    * The editor factory used by the setting editor.
    */
  var editorFactory: Factory = js.native
  
  /**
    * The state database key for the editor's state management.
    */
  var key: String = js.native
  
  /**
    * The setting registry the editor modifies.
    */
  var registry: ISettingRegistry = js.native
  
  /**
    * The optional MIME renderer to use for rendering debug messages.
    */
  var rendermime: js.UndefOr[IRenderMimeRegistry] = js.native
  
  /**
    * The state database used to store layout.
    */
  var state: IStateDB[ReadonlyPartialJSONValue] = js.native
  
  /**
    * The point after which the editor should restore its state.
    */
  var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    commands: Registry,
    editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
    key: String,
    registry: ISettingRegistry,
    state: IStateDB[ReadonlyPartialJSONValue]
  ): IOptions = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), key = key.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: ISettingRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendermime: Self = this.set("rendermime", js.undefined)
    
    @scala.inline
    def setWhenVarargs(value: js.Promise[js.Any]*): Self = this.set("when", js.Array(value :_*))
    
    @scala.inline
    def setWhen(value: js.Promise[_] | js.Array[js.Promise[_]]): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
