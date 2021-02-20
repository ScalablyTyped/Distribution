package typings.koa2SessionRedis

import typings.koa2SessionRedis.koa2SessionRedisStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<koa-session.koa-session.Session> & {  _expire :number | undefined,   _maxAge :number | undefined} */
  @js.native
  trait PartialSessionexpirenumbe extends StObject {
    
    var _expire: js.UndefOr[Double] = js.native
    
    var _maxAge: js.UndefOr[Double] = js.native
    
    var inspect: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var maxAge: js.UndefOr[Double | session] = js.native
    
    var populated: js.UndefOr[Boolean] = js.native
    
    var save: js.UndefOr[js.Function0[Unit]] = js.native
    
    var toJSON: js.UndefOr[js.Function0[js.Object]] = js.native
  }
  object PartialSessionexpirenumbe {
    
    @scala.inline
    def apply(): PartialSessionexpirenumbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSessionexpirenumbe]
    }
    
    @scala.inline
    implicit class PartialSessionexpirenumbeMutableBuilder[Self <: PartialSessionexpirenumbe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInspect(value: () => js.Object): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopulatedUndefined: Self = StObject.set(x, "populated", js.undefined)
      
      @scala.inline
      def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      @scala.inline
      def set_expire(value: Double): Self = StObject.set(x, "_expire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_expireUndefined: Self = StObject.set(x, "_expire", js.undefined)
      
      @scala.inline
      def set_maxAge(value: Double): Self = StObject.set(x, "_maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_maxAgeUndefined: Self = StObject.set(x, "_maxAge", js.undefined)
    }
  }
}
