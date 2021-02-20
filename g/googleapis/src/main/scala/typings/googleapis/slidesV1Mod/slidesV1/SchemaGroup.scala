package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing a joined collection of PageElements.
  */
@js.native
trait SchemaGroup extends StObject {
  
  /**
    * The collection of elements in the group. The minimum size of a group
    * is 2.
    */
  var children: js.UndefOr[js.Array[SchemaPageElement]] = js.native
}
object SchemaGroup {
  
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  @scala.inline
  implicit class SchemaGroupMutableBuilder[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[SchemaPageElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: SchemaPageElement*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
