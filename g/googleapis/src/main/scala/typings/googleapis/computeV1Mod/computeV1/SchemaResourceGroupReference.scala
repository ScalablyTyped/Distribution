package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceGroupReference extends StObject {
  
  /**
    * A URI referencing one of the instance groups or network endpoint groups listed in the backend service.
    */
  var group: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceGroupReference {
  
  inline def apply(): SchemaResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceGroupReference]
  }
  
  extension [Self <: SchemaResourceGroupReference](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
  }
}
