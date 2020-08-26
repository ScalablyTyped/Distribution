package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * City List Response
  */
@js.native
trait SchemaCitiesListResponse extends js.Object {
  /**
    * City collection.
    */
  var cities: js.UndefOr[js.Array[SchemaCity]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#citiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCitiesListResponse {
  @scala.inline
  def apply(): SchemaCitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCitiesListResponse]
  }
  @scala.inline
  implicit class SchemaCitiesListResponseOps[Self <: SchemaCitiesListResponse] (val x: Self) extends AnyVal {
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
    def setCitiesVarargs(value: SchemaCity*): Self = this.set("cities", js.Array(value :_*))
    @scala.inline
    def setCities(value: js.Array[SchemaCity]): Self = this.set("cities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCities: Self = this.set("cities", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

