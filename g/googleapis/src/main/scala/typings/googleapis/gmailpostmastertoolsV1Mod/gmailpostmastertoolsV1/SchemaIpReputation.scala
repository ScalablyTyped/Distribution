package typings.googleapis.gmailpostmastertoolsV1Mod.gmailpostmastertoolsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIpReputation extends StObject {
  
  /**
    * Total number of unique IPs in this reputation category. This metric only pertains to traffic that passed [SPF](http://www.openspf.org/) or [DKIM](http://www.dkim.org/).
    */
  var ipCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reputation category this IP reputation represents.
    */
  var reputation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A sample of IPs in this reputation category.
    */
  var sampleIps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaIpReputation {
  
  inline def apply(): SchemaIpReputation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpReputation]
  }
  
  extension [Self <: SchemaIpReputation](x: Self) {
    
    inline def setIpCount(value: String): Self = StObject.set(x, "ipCount", value.asInstanceOf[js.Any])
    
    inline def setIpCountNull: Self = StObject.set(x, "ipCount", null)
    
    inline def setIpCountUndefined: Self = StObject.set(x, "ipCount", js.undefined)
    
    inline def setReputation(value: String): Self = StObject.set(x, "reputation", value.asInstanceOf[js.Any])
    
    inline def setReputationNull: Self = StObject.set(x, "reputation", null)
    
    inline def setReputationUndefined: Self = StObject.set(x, "reputation", js.undefined)
    
    inline def setSampleIps(value: js.Array[String]): Self = StObject.set(x, "sampleIps", value.asInstanceOf[js.Any])
    
    inline def setSampleIpsNull: Self = StObject.set(x, "sampleIps", null)
    
    inline def setSampleIpsUndefined: Self = StObject.set(x, "sampleIps", js.undefined)
    
    inline def setSampleIpsVarargs(value: String*): Self = StObject.set(x, "sampleIps", js.Array(value*))
  }
}
