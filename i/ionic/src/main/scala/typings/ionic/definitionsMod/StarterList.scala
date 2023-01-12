package typings.ionic.definitionsMod

import typings.ionic.anon.IdName
import typings.ionic.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StarterList extends StObject {
  
  var integrations: js.Array[IdName]
  
  var starters: js.Array[Type]
}
object StarterList {
  
  inline def apply(integrations: js.Array[IdName], starters: js.Array[Type]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StarterList] (val x: Self) extends AnyVal {
    
    inline def setIntegrations(value: js.Array[IdName]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsVarargs(value: IdName*): Self = StObject.set(x, "integrations", js.Array(value*))
    
    inline def setStarters(value: js.Array[Type]): Self = StObject.set(x, "starters", value.asInstanceOf[js.Any])
    
    inline def setStartersVarargs(value: Type*): Self = StObject.set(x, "starters", js.Array(value*))
  }
}
