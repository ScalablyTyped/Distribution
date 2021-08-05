package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.SimplesortOptions> */
trait PartialSimplesortOptions extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var disableIndexIntersect: js.UndefOr[Boolean] = js.undefined
  
  var forceIndexIntersect: js.UndefOr[Boolean] = js.undefined
  
  var useJavascriptSorting: js.UndefOr[Boolean] = js.undefined
}
object PartialSimplesortOptions {
  
  inline def apply(): PartialSimplesortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSimplesortOptions]
  }
  
  extension [Self <: PartialSimplesortOptions](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDisableIndexIntersect(value: Boolean): Self = StObject.set(x, "disableIndexIntersect", value.asInstanceOf[js.Any])
    
    inline def setDisableIndexIntersectUndefined: Self = StObject.set(x, "disableIndexIntersect", js.undefined)
    
    inline def setForceIndexIntersect(value: Boolean): Self = StObject.set(x, "forceIndexIntersect", value.asInstanceOf[js.Any])
    
    inline def setForceIndexIntersectUndefined: Self = StObject.set(x, "forceIndexIntersect", js.undefined)
    
    inline def setUseJavascriptSorting(value: Boolean): Self = StObject.set(x, "useJavascriptSorting", value.asInstanceOf[js.Any])
    
    inline def setUseJavascriptSortingUndefined: Self = StObject.set(x, "useJavascriptSorting", js.undefined)
  }
}
