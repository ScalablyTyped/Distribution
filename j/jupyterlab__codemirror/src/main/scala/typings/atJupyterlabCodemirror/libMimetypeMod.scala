package typings.atJupyterlabCodemirror

import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ILanguageInfoMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/mimetype", JSImport.Namespace)
@js.native
object libMimetypeMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService * / any */ @js.native
  class CodeMirrorMimeTypeService () extends js.Object {
    /**
      * Returns a mime type for the given file path.
      *
      * #### Notes
      * If a mime type cannot be found returns the default mime type `text/plain`, never `null`.
      */
    def getMimeTypeByFilePath(path: String): String = js.native
    /**
      * Returns a mime type for the given language info.
      *
      * #### Notes
      * If a mime type cannot be found returns the defaul mime type `text/plain`, never `null`.
      */
    def getMimeTypeByLanguage(info: ILanguageInfoMetadata): String = js.native
  }
  
}

