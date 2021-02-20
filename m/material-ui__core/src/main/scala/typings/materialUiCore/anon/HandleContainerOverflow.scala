package typings.materialUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleContainerOverflow extends StObject {
  
  var handleContainerOverflow: js.UndefOr[Boolean] = js.native
  
  var hideSiblingNodes: js.UndefOr[Boolean] = js.native
}
object HandleContainerOverflow {
  
  @scala.inline
  def apply(): HandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleContainerOverflow]
  }
  
  @scala.inline
  implicit class HandleContainerOverflowMutableBuilder[Self <: HandleContainerOverflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleContainerOverflow(value: Boolean): Self = StObject.set(x, "handleContainerOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleContainerOverflowUndefined: Self = StObject.set(x, "handleContainerOverflow", js.undefined)
    
    @scala.inline
    def setHideSiblingNodes(value: Boolean): Self = StObject.set(x, "hideSiblingNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSiblingNodesUndefined: Self = StObject.set(x, "hideSiblingNodes", js.undefined)
  }
}
