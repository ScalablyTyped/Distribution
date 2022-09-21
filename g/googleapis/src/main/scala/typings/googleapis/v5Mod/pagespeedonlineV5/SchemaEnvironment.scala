package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnvironment extends StObject {
  
  /**
    * The benchmark index number that indicates rough device class.
    */
  var benchmarkIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The user agent string of the version of Chrome used.
    */
  var hostUserAgent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user agent string that was sent over the network.
    */
  var networkUserAgent: js.UndefOr[String | Null] = js.undefined
}
object SchemaEnvironment {
  
  inline def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  
  extension [Self <: SchemaEnvironment](x: Self) {
    
    inline def setBenchmarkIndex(value: Double): Self = StObject.set(x, "benchmarkIndex", value.asInstanceOf[js.Any])
    
    inline def setBenchmarkIndexNull: Self = StObject.set(x, "benchmarkIndex", null)
    
    inline def setBenchmarkIndexUndefined: Self = StObject.set(x, "benchmarkIndex", js.undefined)
    
    inline def setHostUserAgent(value: String): Self = StObject.set(x, "hostUserAgent", value.asInstanceOf[js.Any])
    
    inline def setHostUserAgentNull: Self = StObject.set(x, "hostUserAgent", null)
    
    inline def setHostUserAgentUndefined: Self = StObject.set(x, "hostUserAgent", js.undefined)
    
    inline def setNetworkUserAgent(value: String): Self = StObject.set(x, "networkUserAgent", value.asInstanceOf[js.Any])
    
    inline def setNetworkUserAgentNull: Self = StObject.set(x, "networkUserAgent", null)
    
    inline def setNetworkUserAgentUndefined: Self = StObject.set(x, "networkUserAgent", js.undefined)
  }
}
