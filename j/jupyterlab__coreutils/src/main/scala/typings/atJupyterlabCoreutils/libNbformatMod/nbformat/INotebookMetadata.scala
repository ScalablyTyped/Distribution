package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default metadata for the notebook.
  */
trait INotebookMetadata extends JSONObject {
  var kernelspec: js.UndefOr[IKernelspecMetadata] = js.undefined
  var language_info: js.UndefOr[ILanguageInfoMetadata] = js.undefined
  var orig_nbformat: Double
}

object INotebookMetadata {
  @scala.inline
  def apply(
    orig_nbformat: Double,
    kernelspec: IKernelspecMetadata = null,
    language_info: ILanguageInfoMetadata = null
  ): INotebookMetadata = {
    val __obj = js.Dynamic.literal(orig_nbformat = orig_nbformat)
    if (kernelspec != null) __obj.updateDynamic("kernelspec")(kernelspec)
    if (language_info != null) __obj.updateDynamic("language_info")(language_info)
    __obj.asInstanceOf[INotebookMetadata]
  }
}

