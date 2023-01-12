package typings.kafkajs.anon

import typings.kafkajs.mod.ConfigResourceTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigEntries extends StObject {
  
  var configEntries: js.Array[typings.kafkajs.mod.ConfigEntries]
  
  var errorCode: Double
  
  var errorMessage: String
  
  var resourceName: String
  
  var resourceType: ConfigResourceTypes
}
object ConfigEntries {
  
  inline def apply(
    configEntries: js.Array[typings.kafkajs.mod.ConfigEntries],
    errorCode: Double,
    errorMessage: String,
    resourceName: String,
    resourceType: ConfigResourceTypes
  ): ConfigEntries = {
    val __obj = js.Dynamic.literal(configEntries = configEntries.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigEntries] (val x: Self) extends AnyVal {
    
    inline def setConfigEntries(value: js.Array[typings.kafkajs.mod.ConfigEntries]): Self = StObject.set(x, "configEntries", value.asInstanceOf[js.Any])
    
    inline def setConfigEntriesVarargs(value: typings.kafkajs.mod.ConfigEntries*): Self = StObject.set(x, "configEntries", js.Array(value*))
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ConfigResourceTypes): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
