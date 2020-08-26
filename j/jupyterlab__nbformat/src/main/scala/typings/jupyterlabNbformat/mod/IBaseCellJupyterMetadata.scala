package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseCellJupyterMetadata extends PartialJSONObject {
  /**
    * Whether the source is hidden.
    */
  var source_hidden: Boolean = js.native
}

object IBaseCellJupyterMetadata {
  @scala.inline
  def apply(source_hidden: Boolean): IBaseCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(source_hidden = source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseCellJupyterMetadata]
  }
  @scala.inline
  implicit class IBaseCellJupyterMetadataOps[Self <: IBaseCellJupyterMetadata] (val x: Self) extends AnyVal {
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
  }
  
}

