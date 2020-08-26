package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DimensionValue resource.
  */
@js.native
trait SchemaDimensionValue extends js.Object {
  /**
    * The name of the dimension.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID associated with the value if available.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#dimensionValue.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Determines how the &#39;value&#39; field is matched when filtering. If
    * not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION,
    * &#39;*&#39; is allowed as a placeholder for variable length character
    * sequences, and it can be escaped with a backslash. Note, only paid search
    * dimensions (&#39;dfa:paidSearch*&#39;) allow a matchType other than
    * EXACT.
    */
  var matchType: js.UndefOr[String] = js.native
  /**
    * The value of the dimension.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaDimensionValue {
  @scala.inline
  def apply(): SchemaDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionValue]
  }
  @scala.inline
  implicit class SchemaDimensionValueOps[Self <: SchemaDimensionValue] (val x: Self) extends AnyVal {
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
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

