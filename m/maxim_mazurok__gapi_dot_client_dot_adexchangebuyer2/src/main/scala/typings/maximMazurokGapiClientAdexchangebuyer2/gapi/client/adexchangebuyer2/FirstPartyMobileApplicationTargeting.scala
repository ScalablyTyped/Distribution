package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstPartyMobileApplicationTargeting extends StObject {
  
  /** A list of application IDs to be excluded. */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of application IDs to be included. */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.native
}
object FirstPartyMobileApplicationTargeting {
  
  @scala.inline
  def apply(): FirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstPartyMobileApplicationTargeting]
  }
  
  @scala.inline
  implicit class FirstPartyMobileApplicationTargetingMutableBuilder[Self <: FirstPartyMobileApplicationTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedAppIds(value: js.Array[String]): Self = StObject.set(x, "excludedAppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedAppIdsUndefined: Self = StObject.set(x, "excludedAppIds", js.undefined)
    
    @scala.inline
    def setExcludedAppIdsVarargs(value: String*): Self = StObject.set(x, "excludedAppIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetedAppIds(value: js.Array[String]): Self = StObject.set(x, "targetedAppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedAppIdsUndefined: Self = StObject.set(x, "targetedAppIds", js.undefined)
    
    @scala.inline
    def setTargetedAppIdsVarargs(value: String*): Self = StObject.set(x, "targetedAppIds", js.Array(value :_*))
  }
}
