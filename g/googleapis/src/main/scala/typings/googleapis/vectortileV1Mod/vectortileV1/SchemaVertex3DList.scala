package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVertex3DList extends StObject {
  
  /**
    * List of x-offsets in local tile coordinates.
    */
  var xOffsets: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * List of y-offsets in local tile coordinates.
    */
  var yOffsets: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * List of z-offsets in local tile coordinates.
    */
  var zOffsets: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaVertex3DList {
  
  inline def apply(): SchemaVertex3DList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVertex3DList]
  }
  
  extension [Self <: SchemaVertex3DList](x: Self) {
    
    inline def setXOffsets(value: js.Array[Double]): Self = StObject.set(x, "xOffsets", value.asInstanceOf[js.Any])
    
    inline def setXOffsetsNull: Self = StObject.set(x, "xOffsets", null)
    
    inline def setXOffsetsUndefined: Self = StObject.set(x, "xOffsets", js.undefined)
    
    inline def setXOffsetsVarargs(value: Double*): Self = StObject.set(x, "xOffsets", js.Array(value*))
    
    inline def setYOffsets(value: js.Array[Double]): Self = StObject.set(x, "yOffsets", value.asInstanceOf[js.Any])
    
    inline def setYOffsetsNull: Self = StObject.set(x, "yOffsets", null)
    
    inline def setYOffsetsUndefined: Self = StObject.set(x, "yOffsets", js.undefined)
    
    inline def setYOffsetsVarargs(value: Double*): Self = StObject.set(x, "yOffsets", js.Array(value*))
    
    inline def setZOffsets(value: js.Array[Double]): Self = StObject.set(x, "zOffsets", value.asInstanceOf[js.Any])
    
    inline def setZOffsetsNull: Self = StObject.set(x, "zOffsets", null)
    
    inline def setZOffsetsUndefined: Self = StObject.set(x, "zOffsets", js.undefined)
    
    inline def setZOffsetsVarargs(value: Double*): Self = StObject.set(x, "zOffsets", js.Array(value*))
  }
}
