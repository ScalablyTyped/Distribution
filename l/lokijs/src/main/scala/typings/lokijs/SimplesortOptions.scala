package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimplesortOptions extends StObject {
  
  var desc: Boolean = js.native
  
  var disableIndexIntersect: Boolean = js.native
  
  var forceIndexIntersect: Boolean = js.native
  
  var useJavascriptSorting: Boolean = js.native
}
object SimplesortOptions {
  
  @scala.inline
  def apply(
    desc: Boolean,
    disableIndexIntersect: Boolean,
    forceIndexIntersect: Boolean,
    useJavascriptSorting: Boolean
  ): SimplesortOptions = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], disableIndexIntersect = disableIndexIntersect.asInstanceOf[js.Any], forceIndexIntersect = forceIndexIntersect.asInstanceOf[js.Any], useJavascriptSorting = useJavascriptSorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplesortOptions]
  }
  
  @scala.inline
  implicit class SimplesortOptionsMutableBuilder[Self <: SimplesortOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableIndexIntersect(value: Boolean): Self = StObject.set(x, "disableIndexIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceIndexIntersect(value: Boolean): Self = StObject.set(x, "forceIndexIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseJavascriptSorting(value: Boolean): Self = StObject.set(x, "useJavascriptSorting", value.asInstanceOf[js.Any])
  }
}
