package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates the borders of a range. If a field is not set in the request, that
  * means the border remains as-is. For example, with two subsequent
  * UpdateBordersRequest:   1. range: A1:A5 `{ top: RED, bottom: WHITE }`  2.
  * range: A1:A5 `{ left: BLUE }`  That would result in A1:A5 having a borders
  * of `{ top: RED, bottom: WHITE, left: BLUE }`. If you want to clear a
  * border, explicitly set the style to NONE.
  */
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
  
  @scala.inline
  def apply(): SchemaUpdateBordersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBordersRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateBordersRequestMutableBuilder[Self <: SchemaUpdateBordersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: SchemaBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setInnerHorizontal(value: SchemaBorder): Self = StObject.set(x, "innerHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHorizontalUndefined: Self = StObject.set(x, "innerHorizontal", js.undefined)
    
    @scala.inline
    def setInnerVertical(value: SchemaBorder): Self = StObject.set(x, "innerVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerVerticalUndefined: Self = StObject.set(x, "innerVertical", js.undefined)
    
    @scala.inline
    def setLeft(value: SchemaBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRight(value: SchemaBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: SchemaBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
