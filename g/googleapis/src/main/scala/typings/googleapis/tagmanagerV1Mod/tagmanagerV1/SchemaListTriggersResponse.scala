package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List triggers response.
  */
@js.native
trait SchemaListTriggersResponse extends js.Object {
  /**
    * All GTM Triggers of a GTM Container.
    */
  var triggers: js.UndefOr[js.Array[SchemaTrigger]] = js.native
}

object SchemaListTriggersResponse {
  @scala.inline
  def apply(): SchemaListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTriggersResponse]
  }
  @scala.inline
  implicit class SchemaListTriggersResponseOps[Self <: SchemaListTriggersResponse] (val x: Self) extends AnyVal {
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
    def setTriggersVarargs(value: SchemaTrigger*): Self = this.set("triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: js.Array[SchemaTrigger]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
  }
  
}

