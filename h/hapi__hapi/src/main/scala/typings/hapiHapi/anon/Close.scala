package typings.hapiHapi.anon

import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  var close: js.UndefOr[js.Function1[/* response */ ResponseObject, Unit]] = js.undefined
  
  var marshal: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseValue]]] = js.undefined
  
  var prepare: js.UndefOr[js.Function1[/* response */ ResponseObject, js.Promise[ResponseObject]]] = js.undefined
  
  var variety: js.UndefOr[String] = js.undefined
}
object Close {
  
  @scala.inline
  def apply(): Close = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: /* response */ ResponseObject => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setMarshal(value: /* response */ ResponseObject => js.Promise[ResponseValue]): Self = StObject.set(x, "marshal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarshalUndefined: Self = StObject.set(x, "marshal", js.undefined)
    
    @scala.inline
    def setPrepare(value: /* response */ ResponseObject => js.Promise[ResponseObject]): Self = StObject.set(x, "prepare", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    @scala.inline
    def setVariety(value: String): Self = StObject.set(x, "variety", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarietyUndefined: Self = StObject.set(x, "variety", js.undefined)
  }
}
