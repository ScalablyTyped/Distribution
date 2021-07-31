package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var next: js.UndefOr[js.Any] = js.undefined
  
  var previous: js.UndefOr[js.Any] = js.undefined
}
object Next {
  
  @scala.inline
  def apply(): Next = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: js.Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrevious(value: js.Any): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
