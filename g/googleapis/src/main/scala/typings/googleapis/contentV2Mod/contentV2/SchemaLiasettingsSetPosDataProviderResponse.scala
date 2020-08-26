package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiasettingsSetPosDataProviderResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsSetPosDataProviderResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaLiasettingsSetPosDataProviderResponse {
  @scala.inline
  def apply(): SchemaLiasettingsSetPosDataProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsSetPosDataProviderResponse]
  }
  @scala.inline
  implicit class SchemaLiasettingsSetPosDataProviderResponseOps[Self <: SchemaLiasettingsSetPosDataProviderResponse] (val x: Self) extends AnyVal {
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
  }
  
}

