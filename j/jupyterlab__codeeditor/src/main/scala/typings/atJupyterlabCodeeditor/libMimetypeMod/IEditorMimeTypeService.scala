package typings.atJupyterlabCodeeditor.libMimetypeMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ILanguageInfoMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorMimeTypeService extends js.Object {
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
  def getMimeTypeByFilePath(filePath: String): String
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
  def getMimeTypeByLanguage(info: ILanguageInfoMetadata): String
}

@JSImport("@jupyterlab/codeeditor/lib/mimetype", "IEditorMimeTypeService")
@js.native
object IEditorMimeTypeService extends js.Object {
  /**
    * The default mime type.
    */
  val defaultMimeType: String = js.native
}

