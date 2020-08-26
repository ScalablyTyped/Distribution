package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter used to match traffic data in your report.
  */
@js.native
trait SchemaFilterPair extends js.Object {
  /**
    * Filter type.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Filter value.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaFilterPair {
  @scala.inline
  def apply(): SchemaFilterPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterPair]
  }
  @scala.inline
  implicit class SchemaFilterPairOps[Self <: SchemaFilterPair] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

