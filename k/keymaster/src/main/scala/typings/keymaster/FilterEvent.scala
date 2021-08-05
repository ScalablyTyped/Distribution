package typings.keymaster

import typings.keymaster.anon.TagName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterEvent extends StObject {
  
  var srcElement: js.UndefOr[TagName] = js.undefined
  
  var target: js.UndefOr[TagName] = js.undefined
}
object FilterEvent {
  
  inline def apply(): FilterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterEvent]
  }
  
  extension [Self <: FilterEvent](x: Self) {
    
    inline def setSrcElement(value: TagName): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setTarget(value: TagName): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
