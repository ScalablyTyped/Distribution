package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPublisherconnectionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the publisher whose connection information is to be retrieved. In the pattern `bidders/{bidder\}/publisherConnections/{publisher\}` where `{bidder\}` is the account ID of the bidder, and `{publisher\}` is the ads.txt/app-ads.txt publisher ID. See publisherConnection.name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersPublisherconnectionsGet {
  
  inline def apply(): ParamsResourceBiddersPublisherconnectionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPublisherconnectionsGet]
  }
  
  extension [Self <: ParamsResourceBiddersPublisherconnectionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
