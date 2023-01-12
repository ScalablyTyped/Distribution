package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brokers extends StObject {
  
  var brokers: js.Array[Host]
  
  var clusterId: String
  
  var controller: Double | Null
}
object Brokers {
  
  inline def apply(brokers: js.Array[Host], clusterId: String): Brokers = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], clusterId = clusterId.asInstanceOf[js.Any], controller = null)
    __obj.asInstanceOf[Brokers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brokers] (val x: Self) extends AnyVal {
    
    inline def setBrokers(value: js.Array[Host]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
    
    inline def setBrokersVarargs(value: Host*): Self = StObject.set(x, "brokers", js.Array(value*))
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setController(value: Double): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerNull: Self = StObject.set(x, "controller", null)
  }
}
