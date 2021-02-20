package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPageLangItems extends StObject {
  
  var en: js.UndefOr[IPageLabels] = js.native
  
  var hu: js.UndefOr[IPageLabels] = js.native
}
object IPageLangItems {
  
  @scala.inline
  def apply(): IPageLangItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageLangItems]
  }
  
  @scala.inline
  implicit class IPageLangItemsMutableBuilder[Self <: IPageLangItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEn(value: IPageLabels): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnUndefined: Self = StObject.set(x, "en", js.undefined)
    
    @scala.inline
    def setHu(value: IPageLabels): Self = StObject.set(x, "hu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHuUndefined: Self = StObject.set(x, "hu", js.undefined)
  }
}
