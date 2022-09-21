package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLine extends StObject {
  
  /**
    * The z-order of this geometry when rendered on a flat basemap. Geometry with a lower z-order should be rendered beneath geometry with a higher z-order. This z-ordering does not imply anything about the altitude of the area relative to the ground, but it can be used to prevent z-fighting. Unlike Line.z_order this can be used to compare with Area.basemap_z_order, and in fact may yield more accurate rendering (where a line may be rendered beneath an area).
    */
  var basemapZOrder: js.UndefOr[SchemaBasemapZOrder] = js.undefined
  
  /**
    * The vertices present in the polyline.
    */
  var vertexOffsets: js.UndefOr[SchemaVertex2DList] = js.undefined
  
  /**
    * The z-order of the line. Lines with a lower z-order should be rendered beneath lines with a higher z-order. This z-ordering does not imply anything about the altitude of the area relative to the ground, but it can be used to prevent z-fighting during rendering on the client. In general, larger and more important road features will have a higher z-order line associated with them. This z-ordering can only be used to compare lines, and cannot be compared with the z_order field in the Area message. The z-order may be negative or zero. Prefer Line.basemap_z_order.
    */
  var zOrder: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLine {
  
  inline def apply(): SchemaLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLine]
  }
  
  extension [Self <: SchemaLine](x: Self) {
    
    inline def setBasemapZOrder(value: SchemaBasemapZOrder): Self = StObject.set(x, "basemapZOrder", value.asInstanceOf[js.Any])
    
    inline def setBasemapZOrderUndefined: Self = StObject.set(x, "basemapZOrder", js.undefined)
    
    inline def setVertexOffsets(value: SchemaVertex2DList): Self = StObject.set(x, "vertexOffsets", value.asInstanceOf[js.Any])
    
    inline def setVertexOffsetsUndefined: Self = StObject.set(x, "vertexOffsets", js.undefined)
    
    inline def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
    
    inline def setZOrderNull: Self = StObject.set(x, "zOrder", null)
    
    inline def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
  }
}
