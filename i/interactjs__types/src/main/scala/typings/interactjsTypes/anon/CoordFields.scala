package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.bottom
import typings.interactjsTypes.interactjsTypesStrings.height
import typings.interactjsTypes.interactjsTypesStrings.left
import typings.interactjsTypes.interactjsTypesStrings.right
import typings.interactjsTypes.interactjsTypesStrings.top
import typings.interactjsTypes.interactjsTypesStrings.width
import typings.interactjsTypes.interactjsTypesStrings.x
import typings.interactjsTypes.interactjsTypesStrings.y
import typings.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordFields extends StObject {
  
  var coordFields: js.Array[js.Tuple2[x | left | right | width, y | top | bottom | height]]
  
  var grid: GridOptions
}
object CoordFields {
  
  inline def apply(
    coordFields: js.Array[js.Tuple2[x | left | right | width, y | top | bottom | height]],
    grid: GridOptions
  ): CoordFields = {
    val __obj = js.Dynamic.literal(coordFields = coordFields.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordFields]
  }
  
  extension [Self <: CoordFields](x: Self) {
    
    inline def setCoordFields(
      value: js.Array[
          js.Tuple2[
            typings.interactjsTypes.interactjsTypesStrings.x | left | right | width, 
            y | top | bottom | height
          ]
        ]
    ): Self = StObject.set(x, "coordFields", value.asInstanceOf[js.Any])
    
    inline def setCoordFieldsVarargs(
      value: (js.Tuple2[
          typings.interactjsTypes.interactjsTypesStrings.x | left | right | width, 
          y | top | bottom | height
        ])*
    ): Self = StObject.set(x, "coordFields", js.Array(value*))
    
    inline def setGrid(value: GridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
