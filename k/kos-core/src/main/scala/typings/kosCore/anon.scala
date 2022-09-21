package typings.kosCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispatch extends StObject {
    
    var dispatch: Any
    
    var getState: Any
  }
  object Dispatch {
    
    inline def apply(dispatch: Any, getState: Any): Dispatch = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch]
    }
    
    extension [Self <: Dispatch](x: Self) {
      
      inline def setDispatch(value: Any): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: Any): Self = StObject.set(x, "getState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Namespace extends StObject {
    
    var namespace: String | Null
    
    var `type`: String
  }
  object Namespace {
    
    inline def apply(`type`: String): Namespace = {
      val __obj = js.Dynamic.literal(namespace = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Param extends StObject {
    
    var param: Any
  }
  object Param {
    
    inline def apply(param: Any): Param = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[Param]
    }
    
    extension [Self <: Param](x: Self) {
      
      inline def setParam(value: Any): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload[T] extends StObject {
    
    var payload: T
  }
  object Payload {
    
    inline def apply[T](payload: T): Payload[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload[T]]
    }
    
    extension [Self <: Payload[?], T](x: Self & Payload[T]) {
      
      inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayloadParam extends StObject {
    
    var payload: Param
  }
  object PayloadParam {
    
    inline def apply(payload: Param): PayloadParam = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadParam]
    }
    
    extension [Self <: PayloadParam](x: Self) {
      
      inline def setPayload(value: Param): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
