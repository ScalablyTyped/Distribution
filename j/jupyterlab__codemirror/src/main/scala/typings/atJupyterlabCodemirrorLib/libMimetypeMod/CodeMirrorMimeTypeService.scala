package typings
package atJupyterlabCodemirrorLib.libMimetypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/codemirror/lib/mimetype", "CodeMirrorMimeTypeService")
@js.native
class CodeMirrorMimeTypeService () extends js.Object {
  /**
    * Returns a mime type for the given file path.
    *
    * #### Notes
    * If a mime type cannot be found returns the default mime type `text/plain`, never `null`.
    */
  def getMimeTypeByFilePath(path: java.lang.String): java.lang.String = js.native
  /**
    * Returns a mime type for the given language info.
    *
    * #### Notes
    * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
    */
  def getMimeTypeByLanguage(info: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ILanguageInfoMetadata): java.lang.String = js.native
}

