package typings.kafkajs.anon

import typings.kafkajs.mod.IResourceConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resources extends StObject {
  
  var resources: js.Array[IResourceConfig]
  
  var validateOnly: Boolean
}
object Resources {
  
  inline def apply(resources: js.Array[IResourceConfig], validateOnly: Boolean): Resources = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], validateOnly = validateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
    
    inline def setResources(value: js.Array[IResourceConfig]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: IResourceConfig*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
  }
}
