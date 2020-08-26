package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to the external linked source content.
  */
@js.native
trait SchemaLinkedContentReference extends js.Object {
  /**
    * A reference to the linked chart.
    */
  var sheetsChartReference: js.UndefOr[SchemaSheetsChartReference] = js.native
}

object SchemaLinkedContentReference {
  @scala.inline
  def apply(): SchemaLinkedContentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinkedContentReference]
  }
  @scala.inline
  implicit class SchemaLinkedContentReferenceOps[Self <: SchemaLinkedContentReference] (val x: Self) extends AnyVal {
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
    def setSheetsChartReference(value: SchemaSheetsChartReference): Self = this.set("sheetsChartReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetsChartReference: Self = this.set("sheetsChartReference", js.undefined)
  }
  
}

