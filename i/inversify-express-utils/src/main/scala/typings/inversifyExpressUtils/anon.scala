package typings.inversifyExpressUtils

import org.scalablytyped.runtime.Instantiable0
import typings.inversifyExpressUtils.interfacesMod.interfaces.AuthProvider
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var route: String = js.native
  }
  object Args {
    
    @scala.inline
    def apply(route: String): Args = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Controller extends StObject {
    
    var controller: js.Any = js.native
    
    var endpoints: js.Array[Args] = js.native
  }
  object Controller {
    
    @scala.inline
    def apply(controller: js.Any, endpoints: js.Array[Args]): Controller = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controller]
    }
    
    @scala.inline
    implicit class ControllerMutableBuilder[Self <: Controller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoints(value: js.Array[Args]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsVarargs(value: Args*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ControllerMetadata extends StObject {
    
    var controllerMetadata: typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata = js.native
    
    var methodMetadata: js.Array[ControllerMethodMetadata] = js.native
    
    var parameterMetadata: ControllerParameterMetadata = js.native
  }
  object ControllerMetadata {
    
    @scala.inline
    def apply(
      controllerMetadata: typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata,
      methodMetadata: js.Array[ControllerMethodMetadata],
      parameterMetadata: ControllerParameterMetadata
    ): ControllerMetadata = {
      val __obj = js.Dynamic.literal(controllerMetadata = controllerMetadata.asInstanceOf[js.Any], methodMetadata = methodMetadata.asInstanceOf[js.Any], parameterMetadata = parameterMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControllerMetadata]
    }
    
    @scala.inline
    implicit class ControllerMetadataMutableBuilder[Self <: ControllerMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControllerMetadata(value: typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata): Self = StObject.set(x, "controllerMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodMetadata(value: js.Array[ControllerMethodMetadata]): Self = StObject.set(x, "methodMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodMetadataVarargs(value: ControllerMethodMetadata*): Self = StObject.set(x, "methodMetadata", js.Array(value :_*))
      
      @scala.inline
      def setParameterMetadata(value: ControllerParameterMetadata): Self = StObject.set(x, "parameterMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable extends Instantiable0[AuthProvider]
}
