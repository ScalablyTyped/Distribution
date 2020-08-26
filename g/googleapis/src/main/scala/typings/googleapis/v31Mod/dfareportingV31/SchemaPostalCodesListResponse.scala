package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Postal Code List Response
  */
@js.native
trait SchemaPostalCodesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#postalCodesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Postal code collection.
    */
  var postalCodes: js.UndefOr[js.Array[SchemaPostalCode]] = js.native
}

object SchemaPostalCodesListResponse {
  @scala.inline
  def apply(): SchemaPostalCodesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodesListResponse]
  }
  @scala.inline
  implicit class SchemaPostalCodesListResponseOps[Self <: SchemaPostalCodesListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPostalCodesVarargs(value: SchemaPostalCode*): Self = this.set("postalCodes", js.Array(value :_*))
    @scala.inline
    def setPostalCodes(value: js.Array[SchemaPostalCode]): Self = this.set("postalCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodes: Self = this.set("postalCodes", js.undefined)
  }
  
}

