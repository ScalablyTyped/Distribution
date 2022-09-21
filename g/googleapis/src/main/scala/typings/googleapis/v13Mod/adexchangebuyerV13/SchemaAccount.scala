package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapis.anon.MaximumQps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccount extends StObject {
  
  /**
    * Your bidder locations that have distinct URLs.
    */
  var bidderLocation: js.UndefOr[js.Array[MaximumQps] | Null] = js.undefined
  
  /**
    * The nid parameter value used in cookie match requests. Please contact your technical account manager if you need to change this.
    */
  var cookieMatchingNid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The base URL used in cookie match requests.
    */
  var cookieMatchingUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account id.
    */
  var id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of active creatives that an account can have, where a creative is active if it was inserted or bid with in the last 30 days. Please contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sum of all bidderLocation.maximumQps values cannot exceed this. Please contact your technical account manager if you need to change this.
    */
  var maximumTotalQps: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of creatives that this account inserted or bid with in the last 30 days.
    */
  var numberActiveCreatives: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAccount {
  
  inline def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  extension [Self <: SchemaAccount](x: Self) {
    
    inline def setBidderLocation(value: js.Array[MaximumQps]): Self = StObject.set(x, "bidderLocation", value.asInstanceOf[js.Any])
    
    inline def setBidderLocationNull: Self = StObject.set(x, "bidderLocation", null)
    
    inline def setBidderLocationUndefined: Self = StObject.set(x, "bidderLocation", js.undefined)
    
    inline def setBidderLocationVarargs(value: MaximumQps*): Self = StObject.set(x, "bidderLocation", js.Array(value*))
    
    inline def setCookieMatchingNid(value: String): Self = StObject.set(x, "cookieMatchingNid", value.asInstanceOf[js.Any])
    
    inline def setCookieMatchingNidNull: Self = StObject.set(x, "cookieMatchingNid", null)
    
    inline def setCookieMatchingNidUndefined: Self = StObject.set(x, "cookieMatchingNid", js.undefined)
    
    inline def setCookieMatchingUrl(value: String): Self = StObject.set(x, "cookieMatchingUrl", value.asInstanceOf[js.Any])
    
    inline def setCookieMatchingUrlNull: Self = StObject.set(x, "cookieMatchingUrl", null)
    
    inline def setCookieMatchingUrlUndefined: Self = StObject.set(x, "cookieMatchingUrl", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaximumActiveCreatives(value: Double): Self = StObject.set(x, "maximumActiveCreatives", value.asInstanceOf[js.Any])
    
    inline def setMaximumActiveCreativesNull: Self = StObject.set(x, "maximumActiveCreatives", null)
    
    inline def setMaximumActiveCreativesUndefined: Self = StObject.set(x, "maximumActiveCreatives", js.undefined)
    
    inline def setMaximumTotalQps(value: Double): Self = StObject.set(x, "maximumTotalQps", value.asInstanceOf[js.Any])
    
    inline def setMaximumTotalQpsNull: Self = StObject.set(x, "maximumTotalQps", null)
    
    inline def setMaximumTotalQpsUndefined: Self = StObject.set(x, "maximumTotalQps", js.undefined)
    
    inline def setNumberActiveCreatives(value: Double): Self = StObject.set(x, "numberActiveCreatives", value.asInstanceOf[js.Any])
    
    inline def setNumberActiveCreativesNull: Self = StObject.set(x, "numberActiveCreatives", null)
    
    inline def setNumberActiveCreativesUndefined: Self = StObject.set(x, "numberActiveCreatives", js.undefined)
  }
}
