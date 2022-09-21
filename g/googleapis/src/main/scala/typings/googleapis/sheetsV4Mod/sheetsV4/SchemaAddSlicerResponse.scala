package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddSlicerResponse extends StObject {
  
  /**
    * The newly added slicer.
    */
  var slicer: js.UndefOr[SchemaSlicer] = js.undefined
}
object SchemaAddSlicerResponse {
  
  inline def apply(): SchemaAddSlicerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSlicerResponse]
  }
  
  extension [Self <: SchemaAddSlicerResponse](x: Self) {
    
    inline def setSlicer(value: SchemaSlicer): Self = StObject.set(x, "slicer", value.asInstanceOf[js.Any])
    
    inline def setSlicerUndefined: Self = StObject.set(x, "slicer", js.undefined)
  }
}
