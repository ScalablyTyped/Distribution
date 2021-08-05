package typings.koaBouncer

import typings.koa.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ctx extends StObject {
    
    var ctx: Context
    
    var key: String
    
    var vals: js.Any
  }
  object Ctx {
    
    inline def apply(ctx: Context, key: String, vals: js.Any): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    extension [Self <: Ctx](x: Self) {
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setVals(value: js.Any): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var message: String
  }
  object Key {
    
    inline def apply(key: String, message: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
