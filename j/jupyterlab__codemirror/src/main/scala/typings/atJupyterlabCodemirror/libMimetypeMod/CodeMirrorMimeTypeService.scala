package typings.atJupyterlabCodemirror.libMimetypeMod

import typings.atJupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ILanguageInfoMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/mimetype", "CodeMirrorMimeTypeService")
@js.native
class CodeMirrorMimeTypeService () extends IEditorMimeTypeService {
  /**
    * Get a mime type for the given file path.
    *
    * @param filePath - The full path to the file.
    *
    * @returns A valid mimetype.
    *
    * #### Notes
    * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
    */
  /* CompleteClass */
  override def getMimeTypeByFilePath(filePath: String): String = js.native
  /**
    * Get a mime type for the given language info.
    *
    * @param info - The language information.
    *
    * @returns A valid mimetype.
    *
    * #### Notes
    * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
    */
  /* CompleteClass */
  override def getMimeTypeByLanguage(info: ILanguageInfoMetadata): String = js.native
}

