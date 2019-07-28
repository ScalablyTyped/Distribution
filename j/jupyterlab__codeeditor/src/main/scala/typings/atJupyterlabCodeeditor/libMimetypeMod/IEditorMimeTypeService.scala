package typings.atJupyterlabCodeeditor.libMimetypeMod

import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ILanguageInfoMetadata
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

object IEditorMimeTypeService {
  @scala.inline
  def apply(getMimeTypeByFilePath: String => String, getMimeTypeByLanguage: ILanguageInfoMetadata => String): IEditorMimeTypeService = {
    val __obj = js.Dynamic.literal(getMimeTypeByFilePath = js.Any.fromFunction1(getMimeTypeByFilePath), getMimeTypeByLanguage = js.Any.fromFunction1(getMimeTypeByLanguage))
  
    __obj.asInstanceOf[IEditorMimeTypeService]
  }
}

