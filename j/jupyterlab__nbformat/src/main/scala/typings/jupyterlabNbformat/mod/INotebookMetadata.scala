package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotebookMetadata extends PartialJSONObject {
  var kernelspec: js.UndefOr[IKernelspecMetadata] = js.native
  var language_info: js.UndefOr[ILanguageInfoMetadata] = js.native
  var orig_nbformat: Double = js.native
}

object INotebookMetadata {
  @scala.inline
  def apply(orig_nbformat: Double): INotebookMetadata = {
    val __obj = js.Dynamic.literal(orig_nbformat = orig_nbformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
  @scala.inline
  implicit class INotebookMetadataOps[Self <: INotebookMetadata] (val x: Self) extends AnyVal {
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
    def setOrig_nbformat(value: Double): Self = this.set("orig_nbformat", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernelspec(value: IKernelspecMetadata): Self = this.set("kernelspec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelspec: Self = this.set("kernelspec", js.undefined)
    @scala.inline
    def setLanguage_info(value: ILanguageInfoMetadata): Self = this.set("language_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage_info: Self = this.set("language_info", js.undefined)
  }
  
}

