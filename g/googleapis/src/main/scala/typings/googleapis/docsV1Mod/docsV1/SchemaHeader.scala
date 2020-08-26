package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document header.
  */
@js.native
trait SchemaHeader extends js.Object {
  /**
    * The contents of the header.  The indexes for a header&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  /**
    * The ID of the header.
    */
  var headerId: js.UndefOr[String] = js.native
}

object SchemaHeader {
  @scala.inline
  def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  @scala.inline
  implicit class SchemaHeaderOps[Self <: SchemaHeader] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: SchemaStructuralElement*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setHeaderId(value: String): Self = this.set("headerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderId: Self = this.set("headerId", js.undefined)
  }
  
}

