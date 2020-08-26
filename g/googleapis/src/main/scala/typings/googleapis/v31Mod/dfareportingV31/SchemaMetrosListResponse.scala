package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metro List Response
  */
@js.native
trait SchemaMetrosListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#metrosListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metro collection.
    */
  var metros: js.UndefOr[js.Array[SchemaMetro]] = js.native
}

object SchemaMetrosListResponse {
  @scala.inline
  def apply(): SchemaMetrosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrosListResponse]
  }
  @scala.inline
  implicit class SchemaMetrosListResponseOps[Self <: SchemaMetrosListResponse] (val x: Self) extends AnyVal {
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
    def setMetrosVarargs(value: SchemaMetro*): Self = this.set("metros", js.Array(value :_*))
    @scala.inline
    def setMetros(value: js.Array[SchemaMetro]): Self = this.set("metros", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetros: Self = this.set("metros", js.undefined)
  }
  
}

