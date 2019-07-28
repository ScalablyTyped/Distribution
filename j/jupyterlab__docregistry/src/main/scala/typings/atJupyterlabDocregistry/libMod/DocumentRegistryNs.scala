package typings.atJupyterlabDocregistry.libMod

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IFileType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib", "DocumentRegistry")
@js.native
object DocumentRegistryNs extends js.Object {
  /**
    * The default directory file type used by the document registry.
    */
  val defaultDirectoryFileType: IFileType = js.native
  /**
    * The default file types used by the document registry.
    */
  val defaultFileTypes: js.Array[Partial[IFileType]] = js.native
  /**
    * The default notebook file type used by the document registry.
    */
  val defaultNotebookFileType: IFileType = js.native
  /**
    * The default text file type used by the document registry.
    */
  val defaultTextFileType: IFileType = js.native
  /**
    * The defaults used for a file type.
    */
  val fileTypeDefaults: IFileType = js.native
}

