package typings.kafkajs.anon

import typings.kafkajs.mod.ResourceConfigQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeSynonyms extends StObject {
  
  var includeSynonyms: Boolean
  
  var resources: js.Array[ResourceConfigQuery]
}
object IncludeSynonyms {
  
  inline def apply(includeSynonyms: Boolean, resources: js.Array[ResourceConfigQuery]): IncludeSynonyms = {
    val __obj = js.Dynamic.literal(includeSynonyms = includeSynonyms.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeSynonyms]
  }
  
  extension [Self <: IncludeSynonyms](x: Self) {
    
    inline def setIncludeSynonyms(value: Boolean): Self = StObject.set(x, "includeSynonyms", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[ResourceConfigQuery]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: ResourceConfigQuery*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
