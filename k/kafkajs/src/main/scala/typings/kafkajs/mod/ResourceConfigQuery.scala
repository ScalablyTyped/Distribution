package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceConfigQuery extends StObject {
  
  var configNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: String
  
  var `type`: ConfigResourceTypes
}
object ResourceConfigQuery {
  
  inline def apply(name: String, `type`: ConfigResourceTypes): ResourceConfigQuery = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConfigQuery]
  }
  
  extension [Self <: ResourceConfigQuery](x: Self) {
    
    inline def setConfigNames(value: js.Array[String]): Self = StObject.set(x, "configNames", value.asInstanceOf[js.Any])
    
    inline def setConfigNamesUndefined: Self = StObject.set(x, "configNames", js.undefined)
    
    inline def setConfigNamesVarargs(value: String*): Self = StObject.set(x, "configNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConfigResourceTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
