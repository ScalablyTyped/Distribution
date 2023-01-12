package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResourceConfig extends StObject {
  
  var configEntries: js.Array[IResourceConfigEntry]
  
  var name: String
  
  var `type`: ConfigResourceTypes
}
object IResourceConfig {
  
  inline def apply(configEntries: js.Array[IResourceConfigEntry], name: String, `type`: ConfigResourceTypes): IResourceConfig = {
    val __obj = js.Dynamic.literal(configEntries = configEntries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResourceConfig] (val x: Self) extends AnyVal {
    
    inline def setConfigEntries(value: js.Array[IResourceConfigEntry]): Self = StObject.set(x, "configEntries", value.asInstanceOf[js.Any])
    
    inline def setConfigEntriesVarargs(value: IResourceConfigEntry*): Self = StObject.set(x, "configEntries", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConfigResourceTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
