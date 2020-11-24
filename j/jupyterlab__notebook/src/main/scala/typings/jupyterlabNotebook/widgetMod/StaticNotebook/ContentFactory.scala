package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
class ContentFactory ()
  extends typings.jupyterlabCells.mod.Cell.ContentFactory
     with IContentFactory {
  
  /**
    * The readonly editor factory that create code editors
    */
  /* InferMemberOverrides */
  @JSName("editorFactory")
  override def editorFactory_MContentFactory_ : Factory = js.native
}
/**
  * A namespace for the staic notebook content factory.
  */
@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  
  /**
    * Options for the content factory.
    */
  type IOptions = typings.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions
}
