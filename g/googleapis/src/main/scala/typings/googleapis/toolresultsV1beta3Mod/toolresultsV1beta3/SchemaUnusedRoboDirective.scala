package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnusedRoboDirective extends StObject {
  
  /**
    * The name of the resource that was unused.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaUnusedRoboDirective {
  
  inline def apply(): SchemaUnusedRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnusedRoboDirective]
  }
  
  extension [Self <: SchemaUnusedRoboDirective](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
