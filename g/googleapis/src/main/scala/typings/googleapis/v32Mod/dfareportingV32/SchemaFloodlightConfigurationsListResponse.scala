package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Floodlight Configuration List Response
  */
@js.native
trait SchemaFloodlightConfigurationsListResponse extends js.Object {
  /**
    * Floodlight configuration collection.
    */
  var floodlightConfigurations: js.UndefOr[js.Array[SchemaFloodlightConfiguration]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightConfigurationsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaFloodlightConfigurationsListResponse {
  @scala.inline
  def apply(): SchemaFloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightConfigurationsListResponse]
  }
  @scala.inline
  implicit class SchemaFloodlightConfigurationsListResponseOps[Self <: SchemaFloodlightConfigurationsListResponse] (val x: Self) extends AnyVal {
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
    def setFloodlightConfigurationsVarargs(value: SchemaFloodlightConfiguration*): Self = this.set("floodlightConfigurations", js.Array(value :_*))
    @scala.inline
    def setFloodlightConfigurations(value: js.Array[SchemaFloodlightConfiguration]): Self = this.set("floodlightConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightConfigurations: Self = this.set("floodlightConfigurations", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

