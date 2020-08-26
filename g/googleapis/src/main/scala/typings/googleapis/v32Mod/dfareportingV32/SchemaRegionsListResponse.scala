package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Region List Response
  */
@js.native
trait SchemaRegionsListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#regionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Region collection.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.native
}

object SchemaRegionsListResponse {
  @scala.inline
  def apply(): SchemaRegionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionsListResponse]
  }
  @scala.inline
  implicit class SchemaRegionsListResponseOps[Self <: SchemaRegionsListResponse] (val x: Self) extends AnyVal {
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
    def setRegionsVarargs(value: SchemaRegion*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[SchemaRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

