package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsPublisherprofilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The id for the publisher profile to get.
    */
  var publisherProfileId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsPublisherprofilesGet {
  
  inline def apply(): ParamsResourceAccountsPublisherprofilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsPublisherprofilesGet]
  }
  
  extension [Self <: ParamsResourceAccountsPublisherprofilesGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setPublisherProfileId(value: String): Self = StObject.set(x, "publisherProfileId", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfileIdUndefined: Self = StObject.set(x, "publisherProfileId", js.undefined)
  }
}
