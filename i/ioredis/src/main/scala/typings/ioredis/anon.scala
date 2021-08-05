package typings.ioredis

import typings.ioredis.ioredisBooleans.`false`
import typings.ioredis.mod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Host extends StObject {
    
    var host: String
    
    var port: Double
  }
  object Host {
    
    inline def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ip extends StObject {
    
    var ip: String
    
    var port: String
    
    var prio: js.UndefOr[Double] = js.undefined
  }
  object Ip {
    
    inline def apply(ip: String, port: String): Ip = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ip]
    }
    
    extension [Self <: Ip](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPrio(value: Double): Self = StObject.set(x, "prio", value.asInstanceOf[js.Any])
      
      inline def setPrioUndefined: Self = StObject.set(x, "prio", js.undefined)
    }
  }
  
  trait Lua extends StObject {
    
    var lua: js.UndefOr[String] = js.undefined
    
    var numberOfKeys: js.UndefOr[Double] = js.undefined
  }
  object Lua {
    
    inline def apply(): Lua = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lua]
    }
    
    extension [Self <: Lua](x: Self) {
      
      inline def setLua(value: String): Self = StObject.set(x, "lua", value.asInstanceOf[js.Any])
      
      inline def setLuaUndefined: Self = StObject.set(x, "lua", js.undefined)
      
      inline def setNumberOfKeys(value: Double): Self = StObject.set(x, "numberOfKeys", value.asInstanceOf[js.Any])
      
      inline def setNumberOfKeysUndefined: Self = StObject.set(x, "numberOfKeys", js.undefined)
    }
  }
  
  trait Pipeline extends StObject {
    
    var pipeline: `false`
  }
  object Pipeline {
    
    inline def apply(): Pipeline = {
      val __obj = js.Dynamic.literal(pipeline = false)
      __obj.asInstanceOf[Pipeline]
    }
    
    extension [Self <: Pipeline](x: Self) {
      
      inline def setPipeline(value: `false`): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofCommand extends StObject {
    
    /* static member */
    def setArgumentTransformer(name: String, fn: js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]): Unit
    
    /* static member */
    def setReplyTransformer(name: String, fn: js.Function1[/* result */ js.Any, js.Any]): Unit
  }
  object TypeofCommand {
    
    inline def apply(
      setArgumentTransformer: (String, js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]) => Unit,
      setReplyTransformer: (String, js.Function1[/* result */ js.Any, js.Any]) => Unit
    ): TypeofCommand = {
      val __obj = js.Dynamic.literal(setArgumentTransformer = js.Any.fromFunction2(setArgumentTransformer), setReplyTransformer = js.Any.fromFunction2(setReplyTransformer))
      __obj.asInstanceOf[TypeofCommand]
    }
    
    extension [Self <: TypeofCommand](x: Self) {
      
      inline def setSetArgumentTransformer(value: (String, js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]) => Unit): Self = StObject.set(x, "setArgumentTransformer", js.Any.fromFunction2(value))
      
      inline def setSetReplyTransformer(value: (String, js.Function1[/* result */ js.Any, js.Any]) => Unit): Self = StObject.set(x, "setReplyTransformer", js.Any.fromFunction2(value))
    }
  }
}
