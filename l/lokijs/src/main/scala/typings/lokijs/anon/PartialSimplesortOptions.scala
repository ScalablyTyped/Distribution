package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.SimplesortOptions> */
@js.native
trait PartialSimplesortOptions extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.native
  
  var disableIndexIntersect: js.UndefOr[Boolean] = js.native
  
  var forceIndexIntersect: js.UndefOr[Boolean] = js.native
  
  var useJavascriptSorting: js.UndefOr[Boolean] = js.native
}
object PartialSimplesortOptions {
  
  @scala.inline
  def apply(): PartialSimplesortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSimplesortOptions]
  }
  
  @scala.inline
  implicit class PartialSimplesortOptionsMutableBuilder[Self <: PartialSimplesortOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setDisableIndexIntersect(value: Boolean): Self = StObject.set(x, "disableIndexIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIndexIntersectUndefined: Self = StObject.set(x, "disableIndexIntersect", js.undefined)
    
    @scala.inline
    def setForceIndexIntersect(value: Boolean): Self = StObject.set(x, "forceIndexIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIndexIntersectUndefined: Self = StObject.set(x, "forceIndexIntersect", js.undefined)
    
    @scala.inline
    def setUseJavascriptSorting(value: Boolean): Self = StObject.set(x, "useJavascriptSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJavascriptSortingUndefined: Self = StObject.set(x, "useJavascriptSorting", js.undefined)
  }
}
