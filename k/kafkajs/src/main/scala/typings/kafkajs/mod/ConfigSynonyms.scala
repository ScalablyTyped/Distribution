package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSynonyms extends StObject {
  
  var configName: String
  
  var configSource: ConfigSource
  
  var configValue: String
}
object ConfigSynonyms {
  
  inline def apply(configName: String, configSource: ConfigSource, configValue: String): ConfigSynonyms = {
    val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any], configSource = configSource.asInstanceOf[js.Any], configValue = configValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSynonyms]
  }
  
  extension [Self <: ConfigSynonyms](x: Self) {
    
    inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
    
    inline def setConfigSource(value: ConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigValue(value: String): Self = StObject.set(x, "configValue", value.asInstanceOf[js.Any])
  }
}
