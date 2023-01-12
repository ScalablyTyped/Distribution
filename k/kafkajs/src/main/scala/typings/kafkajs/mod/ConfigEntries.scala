package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigEntries extends StObject {
  
  var configName: String
  
  var configSource: ConfigSource
  
  var configSynonyms: js.Array[ConfigSynonyms]
  
  var configValue: String
  
  var isDefault: Boolean
  
  var isSensitive: Boolean
  
  var readOnly: Boolean
}
object ConfigEntries {
  
  inline def apply(
    configName: String,
    configSource: ConfigSource,
    configSynonyms: js.Array[ConfigSynonyms],
    configValue: String,
    isDefault: Boolean,
    isSensitive: Boolean,
    readOnly: Boolean
  ): ConfigEntries = {
    val __obj = js.Dynamic.literal(configName = configName.asInstanceOf[js.Any], configSource = configSource.asInstanceOf[js.Any], configSynonyms = configSynonyms.asInstanceOf[js.Any], configValue = configValue.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isSensitive = isSensitive.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigEntries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigEntries] (val x: Self) extends AnyVal {
    
    inline def setConfigName(value: String): Self = StObject.set(x, "configName", value.asInstanceOf[js.Any])
    
    inline def setConfigSource(value: ConfigSource): Self = StObject.set(x, "configSource", value.asInstanceOf[js.Any])
    
    inline def setConfigSynonyms(value: js.Array[ConfigSynonyms]): Self = StObject.set(x, "configSynonyms", value.asInstanceOf[js.Any])
    
    inline def setConfigSynonymsVarargs(value: ConfigSynonyms*): Self = StObject.set(x, "configSynonyms", js.Array(value*))
    
    inline def setConfigValue(value: String): Self = StObject.set(x, "configValue", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsSensitive(value: Boolean): Self = StObject.set(x, "isSensitive", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
