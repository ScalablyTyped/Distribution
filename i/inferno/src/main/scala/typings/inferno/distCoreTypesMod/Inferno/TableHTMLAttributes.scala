package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.all
import typings.inferno.infernoStrings.center
import typings.inferno.infernoStrings.columns
import typings.inferno.infernoStrings.groups
import typings.inferno.infernoStrings.left
import typings.inferno.infernoStrings.none
import typings.inferno.infernoStrings.right
import typings.inferno.infernoStrings.rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var align: js.UndefOr[left | center | right | Null] = js.undefined
  
  var bgcolor: js.UndefOr[String | Null] = js.undefined
  
  var border: js.UndefOr[Double | Null] = js.undefined
  
  var cellPadding: js.UndefOr[Double | String | Null] = js.undefined
  
  var cellSpacing: js.UndefOr[Double | String | Null] = js.undefined
  
  var frame: js.UndefOr[Boolean | Null] = js.undefined
  
  var rules: js.UndefOr[none | groups | rows | columns | all | Null] = js.undefined
  
  var summary: js.UndefOr[String | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object TableHTMLAttributes {
  
  inline def apply[T](): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
  
  extension [Self <: TableHTMLAttributes[?], T](x: Self & TableHTMLAttributes[T]) {
    
    inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignNull: Self = StObject.set(x, "align", null)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorNull: Self = StObject.set(x, "bgcolor", null)
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderNull: Self = StObject.set(x, "border", null)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    inline def setCellPaddingNull: Self = StObject.set(x, "cellPadding", null)
    
    inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
    
    inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCellSpacingNull: Self = StObject.set(x, "cellSpacing", null)
    
    inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
    
    inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setRules(value: none | groups | rows | columns | all): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesNull: Self = StObject.set(x, "rules", null)
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
