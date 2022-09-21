package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1MetricSpec extends StObject {
  
  /**
    * metric name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Target specifies the target value for the given metric; once real metric deviates from the threshold by a certain percentage, the node count changes.
    */
  var target: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1MetricSpec {
  
  inline def apply(): SchemaGoogleCloudMlV1MetricSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1MetricSpec]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1MetricSpec](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
