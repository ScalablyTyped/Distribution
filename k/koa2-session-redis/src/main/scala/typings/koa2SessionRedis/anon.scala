package typings.koa2SessionRedis

import typings.koa2SessionRedis.koa2SessionRedisStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<koa-session.koa-session.Session> & {  _expire :number | undefined,   _maxAge :number | undefined} */
  trait PartialSessionexpirenumbe extends StObject {
    
    var _expire: js.UndefOr[Double] = js.undefined
    
    var _maxAge: js.UndefOr[Double] = js.undefined
    
    var inspect: js.UndefOr[js.Function0[js.Object]] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var manuallyCommit: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
    
    var maxAge: js.UndefOr[Double | session] = js.undefined
    
    var populated: js.UndefOr[Boolean] = js.undefined
    
    var save: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[js.Object]] = js.undefined
  }
  object PartialSessionexpirenumbe {
    
    inline def apply(): PartialSessionexpirenumbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSessionexpirenumbe]
    }
    
    extension [Self <: PartialSessionexpirenumbe](x: Self) {
      
      inline def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setManuallyCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "manuallyCommit", js.Any.fromFunction0(value))
      
      inline def setManuallyCommitUndefined: Self = StObject.set(x, "manuallyCommit", js.undefined)
      
      inline def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      inline def setPopulatedUndefined: Self = StObject.set(x, "populated", js.undefined)
      
      inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def set_expire(value: Double): Self = StObject.set(x, "_expire", value.asInstanceOf[js.Any])
      
      inline def set_expireUndefined: Self = StObject.set(x, "_expire", js.undefined)
      
      inline def set_maxAge(value: Double): Self = StObject.set(x, "_maxAge", value.asInstanceOf[js.Any])
      
      inline def set_maxAgeUndefined: Self = StObject.set(x, "_maxAge", js.undefined)
    }
  }
}
