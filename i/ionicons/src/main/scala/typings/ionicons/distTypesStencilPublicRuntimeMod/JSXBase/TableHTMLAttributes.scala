package typings.ionicons.distTypesStencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var cellPadding: js.UndefOr[Double | String] = js.undefined
  
  var cellSpacing: js.UndefOr[Double | String] = js.undefined
  
  var cellpadding: js.UndefOr[Double | String] = js.undefined
  
  var cellspacing: js.UndefOr[Double | String] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
}
object TableHTMLAttributes {
  
  inline def apply[T](): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
  
  extension [Self <: TableHTMLAttributes[?], T](x: Self & TableHTMLAttributes[T]) {
    
    inline def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    inline def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
    
    inline def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
