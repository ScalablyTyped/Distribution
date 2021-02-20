package typings.keymaster

import typings.keymaster.anon.TagName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterEvent extends StObject {
  
  var srcElement: js.UndefOr[TagName] = js.native
  
  var target: js.UndefOr[TagName] = js.native
}
object FilterEvent {
  
  @scala.inline
  def apply(): FilterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterEvent]
  }
  
  @scala.inline
  implicit class FilterEventMutableBuilder[Self <: FilterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrcElement(value: TagName): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    @scala.inline
    def setTarget(value: TagName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
