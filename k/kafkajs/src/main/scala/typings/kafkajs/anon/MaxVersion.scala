package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxVersion extends StObject {
  
  var maxVersion: Double
  
  var minVersion: Double
}
object MaxVersion {
  
  inline def apply(maxVersion: Double, minVersion: Double): MaxVersion = {
    val __obj = js.Dynamic.literal(maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxVersion]
  }
  
  extension [Self <: MaxVersion](x: Self) {
    
    inline def setMaxVersion(value: Double): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersion(value: Double): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
  }
}
