package typings.hapiShot

import typings.hapiShot.mod.SimulatedRequestObject
import typings.hapiShot.mod.SimulatedResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Close extends StObject {
    
    /** whether the request will emit a close event. Defaults to undefined, meaning no close event will be emitted. */
    var close: js.UndefOr[Boolean] = js.native
    
    /** indicates whether the request will fire an end event. Defaults to undefined, meaning an end event will fire. */
    var end: js.UndefOr[Boolean] = js.native
    
    /** whether the request will emit an error event. Defaults to undefined, meaning no error event will be emitted. If set to true, the emitted error will have a message of 'Simulated'. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** indicates whether the request payload will be split into chunks. Defaults to `undefined`, meaning payload will not be chunked. */
    var split: js.UndefOr[Boolean] = js.native
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
      def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  @js.native
  trait Req extends StObject {
    
    /** the simulated request object. */
    var req: SimulatedRequestObject = js.native
    
    /** the simulated response object. */
    var res: SimulatedResponseObject = js.native
  }
  object Req {
    
    @scala.inline
    def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: SimulatedRequestObject): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: SimulatedResponseObject): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
