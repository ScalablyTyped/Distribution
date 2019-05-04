package typings
package atJupyterlabFileeditorLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorFactory")
@js.native
class FileEditorFactory protected ()
  extends atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.ABCWidgetFactory[
      atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[FileEditor, atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel], 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.ICodeModel
    ] {
  /**
    * Construct a new editor widget factory.
    */
  def this(options: atJupyterlabFileeditorLib.libWidgetMod.FileEditorFactoryNs.IOptions) = this()
  var _services: js.Any = js.native
  /**
    * Create a new widget given a context.
    */
  /* protected */ def createNewWidget(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.CodeContext): atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[FileEditor, atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel] = js.native
}

