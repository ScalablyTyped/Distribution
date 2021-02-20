package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var cellPadding: js.UndefOr[Double | String] = js.native
  
  var cellSpacing: js.UndefOr[Double | String] = js.native
  
  var cellpadding: js.UndefOr[Double | String] = js.native
  
  var cellspacing: js.UndefOr[Double | String] = js.native
  
  var summary: js.UndefOr[String] = js.native
}
object TableHTMLAttributes {
  
  @scala.inline
  def apply[T](): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TableHTMLAttributesMutableBuilder[Self <: TableHTMLAttributes[_], T] (val x: Self with TableHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
    
    @scala.inline
    def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
