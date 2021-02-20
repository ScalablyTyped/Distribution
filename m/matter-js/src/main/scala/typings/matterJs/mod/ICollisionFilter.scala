package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollisionFilter extends StObject {
  
  var category: js.UndefOr[Double] = js.native
  
  var group: js.UndefOr[Double] = js.native
  
  var mask: js.UndefOr[Double] = js.native
}
object ICollisionFilter {
  
  @scala.inline
  def apply(): ICollisionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollisionFilter]
  }
  
  @scala.inline
  implicit class ICollisionFilterMutableBuilder[Self <: ICollisionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: Double): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
