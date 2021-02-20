package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntervalObject extends StObject {
  
  var end: js.UndefOr[DateTime] = js.native
  
  var start: js.UndefOr[DateTime] = js.native
}
object IntervalObject {
  
  @scala.inline
  def apply(): IntervalObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntervalObject]
  }
  
  @scala.inline
  implicit class IntervalObjectMutableBuilder[Self <: IntervalObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: DateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: DateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
