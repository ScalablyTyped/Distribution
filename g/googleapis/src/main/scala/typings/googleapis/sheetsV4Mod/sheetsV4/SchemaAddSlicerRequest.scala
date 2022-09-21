package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddSlicerRequest extends StObject {
  
  /**
    * The slicer that should be added to the spreadsheet, including the position where it should be placed. The slicerId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a slicer that already exists.)
    */
  var slicer: js.UndefOr[SchemaSlicer] = js.undefined
}
object SchemaAddSlicerRequest {
  
  inline def apply(): SchemaAddSlicerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSlicerRequest]
  }
  
  extension [Self <: SchemaAddSlicerRequest](x: Self) {
    
    inline def setSlicer(value: SchemaSlicer): Self = StObject.set(x, "slicer", value.asInstanceOf[js.Any])
    
    inline def setSlicerUndefined: Self = StObject.set(x, "slicer", js.undefined)
  }
}
