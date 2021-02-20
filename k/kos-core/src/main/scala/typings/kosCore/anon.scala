package typings.kosCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dispatch extends StObject {
    
    var dispatch: js.Any = js.native
    
    var getState: js.Any = js.native
  }
  object Dispatch {
    
    @scala.inline
    def apply(dispatch: js.Any, getState: js.Any): Dispatch = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch]
    }
    
    @scala.inline
    implicit class DispatchMutableBuilder[Self <: Dispatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: js.Any): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetState(value: js.Any): Self = StObject.set(x, "getState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Namespace extends StObject {
    
    var namespace: String | Null = js.native
    
    var `type`: String = js.native
  }
  object Namespace {
    
    @scala.inline
    def apply(`type`: String): Namespace = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    @scala.inline
    implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Param extends StObject {
    
    var param: js.Any = js.native
  }
  object Param {
    
    @scala.inline
    def apply(param: js.Any): Param = {
      val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[Param]
    }
    
    @scala.inline
    implicit class ParamMutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParam(value: js.Any): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payload[T] extends StObject {
    
    var payload: T = js.native
  }
  object Payload {
    
    @scala.inline
    def apply[T](payload: T): Payload[T] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload[T]]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload[_], T] (val x: Self with Payload[T]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PayloadParam extends StObject {
    
    var payload: Param = js.native
  }
  object PayloadParam {
    
    @scala.inline
    def apply(payload: Param): PayloadParam = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadParam]
    }
    
    @scala.inline
    implicit class PayloadParamMutableBuilder[Self <: PayloadParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Param): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
