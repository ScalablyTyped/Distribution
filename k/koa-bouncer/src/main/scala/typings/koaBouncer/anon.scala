package typings.koaBouncer

import typings.koa.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ctx extends StObject {
    
    var ctx: Context = js.native
    
    var key: String = js.native
    
    var vals: js.Any = js.native
  }
  object Ctx {
    
    @scala.inline
    def apply(ctx: Context, key: String, vals: js.Any): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    @scala.inline
    implicit class CtxMutableBuilder[Self <: Ctx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVals(value: js.Any): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
    
    var message: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String, message: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
