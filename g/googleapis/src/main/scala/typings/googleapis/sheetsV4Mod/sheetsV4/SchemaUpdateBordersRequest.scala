package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateBordersRequest extends StObject {
  
  /**
    * The border to put at the bottom of the range.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The horizontal border to put within the range.
    */
  var innerHorizontal: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The vertical border to put within the range.
    */
  var innerVertical: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The border to put at the left of the range.
    */
  var left: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The range whose borders should be updated.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The border to put at the right of the range.
    */
  var right: js.UndefOr[SchemaBorder] = js.undefined
  
  /**
    * The border to put at the top of the range.
    */
  var top: js.UndefOr[SchemaBorder] = js.undefined
}
object SchemaUpdateBordersRequest {
  
  inline def apply(): SchemaUpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBordersRequest]
  }
  
  extension [Self <: SchemaUpdateBordersRequest](x: Self) {
    
    inline def setBottom(value: SchemaBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setInnerHorizontal(value: SchemaBorder): Self = StObject.set(x, "innerHorizontal", value.asInstanceOf[js.Any])
    
    inline def setInnerHorizontalUndefined: Self = StObject.set(x, "innerHorizontal", js.undefined)
    
    inline def setInnerVertical(value: SchemaBorder): Self = StObject.set(x, "innerVertical", value.asInstanceOf[js.Any])
    
    inline def setInnerVerticalUndefined: Self = StObject.set(x, "innerVertical", js.undefined)
    
    inline def setLeft(value: SchemaBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRight(value: SchemaBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: SchemaBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
