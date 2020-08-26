package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a service configuration with its name and id.
  */
@js.native
trait SchemaConfigRef extends js.Object {
  /**
    * Resource name of a service config. It must have the following format:
    * &quot;services/{service name}/configs/{config id}&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaConfigRef {
  @scala.inline
  def apply(): SchemaConfigRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigRef]
  }
  @scala.inline
  implicit class SchemaConfigRefOps[Self <: SchemaConfigRef] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

