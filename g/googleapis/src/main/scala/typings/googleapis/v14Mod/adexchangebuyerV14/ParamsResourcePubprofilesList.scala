package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePubprofilesList
  extends StObject
     with StandardParameters {
  
  /**
    * The accountId of the publisher to get profiles for.
    */
  var accountId: js.UndefOr[Double] = js.undefined
}
object ParamsResourcePubprofilesList {
  
  inline def apply(): ParamsResourcePubprofilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePubprofilesList]
  }
  
  extension [Self <: ParamsResourcePubprofilesList](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
