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
  def apply(thirdPartyClaims: StringDictionary[js.Any] = null): SchemaThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    if (thirdPartyClaims != null) __obj.updateDynamic("thirdPartyClaims")(thirdPartyClaims.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThirdPartyPrincipal]
  }
}

