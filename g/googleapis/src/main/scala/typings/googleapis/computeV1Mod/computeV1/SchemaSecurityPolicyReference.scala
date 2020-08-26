package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSecurityPolicyReference extends js.Object {
  var securityPolicy: js.UndefOr[String] = js.native
}

object SchemaSecurityPolicyReference {
  @scala.inline
  def apply(): SchemaSecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyReference]
  }
  @scala.inline
  implicit class SchemaSecurityPolicyReferenceOps[Self <: SchemaSecurityPolicyReference] (val x: Self) extends AnyVal {
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
    def setSecurityPolicy(value: String): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
  }
  
}

