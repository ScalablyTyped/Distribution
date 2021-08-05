package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.managed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedStarterTemplate
  extends StObject
     with BaseStarterTemplate
     with StarterTemplate {
  
  var id: String
  
  var `type`: managed
}
object ManagedStarterTemplate {
  
  inline def apply(id: String, name: String, projectType: ProjectType): ManagedStarterTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("managed")
    __obj.asInstanceOf[ManagedStarterTemplate]
  }
  
  extension [Self <: ManagedStarterTemplate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: managed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
