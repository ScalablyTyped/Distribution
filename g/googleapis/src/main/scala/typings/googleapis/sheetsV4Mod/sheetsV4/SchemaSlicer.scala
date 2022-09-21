package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlicer extends StObject {
  
  /**
    * The position of the slicer. Note that slicer can be positioned only on existing sheet. Also, width and height of slicer can be automatically adjusted to keep it within permitted limits.
    */
  var position: js.UndefOr[SchemaEmbeddedObjectPosition] = js.undefined
  
  /**
    * The ID of the slicer.
    */
  var slicerId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The specification of the slicer.
    */
  var spec: js.UndefOr[SchemaSlicerSpec] = js.undefined
}
object SchemaSlicer {
  
  inline def apply(): SchemaSlicer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlicer]
  }
  
  extension [Self <: SchemaSlicer](x: Self) {
    
    inline def setPosition(value: SchemaEmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSlicerId(value: Double): Self = StObject.set(x, "slicerId", value.asInstanceOf[js.Any])
    
    inline def setSlicerIdNull: Self = StObject.set(x, "slicerId", null)
    
    inline def setSlicerIdUndefined: Self = StObject.set(x, "slicerId", js.undefined)
    
    inline def setSpec(value: SchemaSlicerSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
