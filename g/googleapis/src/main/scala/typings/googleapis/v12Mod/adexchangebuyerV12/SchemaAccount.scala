package typings.googleapis.v12Mod.adexchangebuyerV12

import typings.googleapis.anon.MaximumQps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration data for an Ad Exchange buyer account.
  */
trait SchemaAccount extends StObject {
  
  /**
    * Your bidder locations that have distinct URLs.
    */
  var bidderLocation: js.UndefOr[js.Array[MaximumQps]] = js.undefined
  
  /**
    * The nid parameter value used in cookie match requests. Please contact
    * your technical account manager if you need to change this.
    */
  var cookieMatchingNid: js.UndefOr[String] = js.undefined
  
  /**
    * The base URL used in cookie match requests.
    */
  var cookieMatchingUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Account id.
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of active creatives that an account can have, where a
    * creative is active if it was inserted or bid with in the last 30 days.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double] = js.undefined
  
  /**
    * The sum of all bidderLocation.maximumQps values cannot exceed this.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumTotalQps: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of creatives that this account inserted or bid with in the
    * last 30 days.
    */
  var numberActiveCreatives: js.UndefOr[Double] = js.undefined
}
object SchemaAccount {
  
  @scala.inline
  def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  @scala.inline
  implicit class SchemaAccountMutableBuilder[Self <: SchemaAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidderLocation(value: js.Array[MaximumQps]): Self = StObject.set(x, "bidderLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidderLocationUndefined: Self = StObject.set(x, "bidderLocation", js.undefined)
    
    @scala.inline
    def setBidderLocationVarargs(value: MaximumQps*): Self = StObject.set(x, "bidderLocation", js.Array(value :_*))
    
    @scala.inline
    def setCookieMatchingNid(value: String): Self = StObject.set(x, "cookieMatchingNid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieMatchingNidUndefined: Self = StObject.set(x, "cookieMatchingNid", js.undefined)
    
    @scala.inline
    def setCookieMatchingUrl(value: String): Self = StObject.set(x, "cookieMatchingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieMatchingUrlUndefined: Self = StObject.set(x, "cookieMatchingUrl", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMaximumActiveCreatives(value: Double): Self = StObject.set(x, "maximumActiveCreatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumActiveCreativesUndefined: Self = StObject.set(x, "maximumActiveCreatives", js.undefined)
    
    @scala.inline
    def setMaximumTotalQps(value: Double): Self = StObject.set(x, "maximumTotalQps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTotalQpsUndefined: Self = StObject.set(x, "maximumTotalQps", js.undefined)
    
    @scala.inline
    def setNumberActiveCreatives(value: Double): Self = StObject.set(x, "numberActiveCreatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberActiveCreativesUndefined: Self = StObject.set(x, "numberActiveCreatives", js.undefined)
  }
}
