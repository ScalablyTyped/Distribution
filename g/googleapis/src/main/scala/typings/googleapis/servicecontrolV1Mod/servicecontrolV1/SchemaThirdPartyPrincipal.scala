package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third party identity principal.
  */
@js.native
trait SchemaThirdPartyPrincipal extends js.Object {
  /**
    * Metadata about third party identity.
    */
  var thirdPartyClaims: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaThirdPartyPrincipal {
  @scala.inline
  def apply(): SchemaThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyPrincipal]
  }
  @scala.inline
  implicit class SchemaThirdPartyPrincipalOps[Self <: SchemaThirdPartyPrincipal] (val x: Self) extends AnyVal {
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
    def setThirdPartyClaims(value: StringDictionary[js.Any]): Self = this.set("thirdPartyClaims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThirdPartyClaims: Self = this.set("thirdPartyClaims", js.undefined)
  }
  
}

