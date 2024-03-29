package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjection extends StObject {
  
  /**
    * The property to project.
    */
  var property: js.UndefOr[SchemaPropertyReference] = js.undefined
}
object SchemaProjection {
  
  inline def apply(): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjection]
  }
  
  extension [Self <: SchemaProjection](x: Self) {
    
    inline def setProperty(value: SchemaPropertyReference): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
