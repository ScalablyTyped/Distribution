package typings.jupyterlabNbformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.IBaseCellJupyterMetadata> */
@js.native
trait PartialIBaseCellJupyterMe extends js.Object {
  var source_hidden: js.UndefOr[Boolean] = js.native
}

object PartialIBaseCellJupyterMe {
  @scala.inline
  def apply(): PartialIBaseCellJupyterMe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIBaseCellJupyterMe]
  }
  @scala.inline
  implicit class PartialIBaseCellJupyterMeOps[Self <: PartialIBaseCellJupyterMe] (val x: Self) extends AnyVal {
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
    def setSource_hidden(value: Boolean): Self = this.set("source_hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource_hidden: Self = this.set("source_hidden", js.undefined)
  }
  
}

