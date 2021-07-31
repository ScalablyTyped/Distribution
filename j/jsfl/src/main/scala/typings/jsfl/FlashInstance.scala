package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// if FlashElement.elementType == 'instance'
trait FlashInstance extends StObject {
  
  var instanceType: js.UndefOr[String] = js.undefined
  
  var libraryItem: js.UndefOr[FlashItem] = js.undefined
}
object FlashInstance {
  
  @scala.inline
  def apply(): FlashInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlashInstance]
  }
  
  @scala.inline
  implicit class FlashInstanceMutableBuilder[Self <: FlashInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setLibraryItem(value: FlashItem): Self = StObject.set(x, "libraryItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryItemUndefined: Self = StObject.set(x, "libraryItem", js.undefined)
  }
}
