package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Third party identity principal.
  */
trait SchemaThirdPartyPrincipal extends StObject {
  
  /**
    * Metadata about third party identity.
    */
  var thirdPartyClaims: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object SchemaThirdPartyPrincipal {
  
  @scala.inline
  def apply(): SchemaThirdPartyPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThirdPartyPrincipal]
  }
  
  @scala.inline
  implicit class SchemaThirdPartyPrincipalMutableBuilder[Self <: SchemaThirdPartyPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThirdPartyClaims(value: StringDictionary[js.Any]): Self = StObject.set(x, "thirdPartyClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyClaimsUndefined: Self = StObject.set(x, "thirdPartyClaims", js.undefined)
  }
}
