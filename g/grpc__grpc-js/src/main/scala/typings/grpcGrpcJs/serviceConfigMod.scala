package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConfigMod {
  
  @JSImport("@grpc/grpc-js/build/src/service-config", "extractAndSelectServiceConfig")
  @js.native
  def extractAndSelectServiceConfig(txtRecord: js.Array[js.Array[String]], percentage: Double): ServiceConfig | Null = js.native
  
  @JSImport("@grpc/grpc-js/build/src/service-config", "validateServiceConfig")
  @js.native
  def validateServiceConfig(obj: js.Any): ServiceConfig = js.native
  
  @js.native
  trait MethodConfig extends StObject {
    
    var maxRequestBytes: js.UndefOr[Double] = js.native
    
    var maxResponseBytes: js.UndefOr[Double] = js.native
    
    var name: js.Array[MethodConfigName] = js.native
    
    var timeout: js.UndefOr[String] = js.native
    
    var waitForReady: js.UndefOr[Boolean] = js.native
  }
  object MethodConfig {
    
    @scala.inline
    def apply(name: js.Array[MethodConfigName]): MethodConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodConfig]
    }
    
    @scala.inline
    implicit class MethodConfigMutableBuilder[Self <: MethodConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxRequestBytes(value: Double): Self = StObject.set(x, "maxRequestBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRequestBytesUndefined: Self = StObject.set(x, "maxRequestBytes", js.undefined)
      
      @scala.inline
      def setMaxResponseBytes(value: Double): Self = StObject.set(x, "maxResponseBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResponseBytesUndefined: Self = StObject.set(x, "maxResponseBytes", js.undefined)
      
      @scala.inline
      def setName(value: js.Array[MethodConfigName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameVarargs(value: MethodConfigName*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWaitForReady(value: Boolean): Self = StObject.set(x, "waitForReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForReadyUndefined: Self = StObject.set(x, "waitForReady", js.undefined)
    }
  }
  
  @js.native
  trait MethodConfigName extends StObject {
    
    var method: js.UndefOr[String] = js.native
    
    var service: String = js.native
  }
  object MethodConfigName {
    
    @scala.inline
    def apply(service: String): MethodConfigName = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodConfigName]
    }
    
    @scala.inline
    implicit class MethodConfigNameMutableBuilder[Self <: MethodConfigName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceConfig extends StObject {
    
    var loadBalancingConfig: js.Array[LoadBalancingConfig] = js.native
    
    var loadBalancingPolicy: js.UndefOr[String] = js.native
    
    var methodConfig: js.Array[MethodConfig] = js.native
  }
  object ServiceConfig {
    
    @scala.inline
    def apply(loadBalancingConfig: js.Array[LoadBalancingConfig], methodConfig: js.Array[MethodConfig]): ServiceConfig = {
      val __obj = js.Dynamic.literal(loadBalancingConfig = loadBalancingConfig.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    @scala.inline
    implicit class ServiceConfigMutableBuilder[Self <: ServiceConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBalancingConfig(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "loadBalancingConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancingConfigVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "loadBalancingConfig", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancingPolicy(value: String): Self = StObject.set(x, "loadBalancingPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancingPolicyUndefined: Self = StObject.set(x, "loadBalancingPolicy", js.undefined)
      
      @scala.inline
      def setMethodConfig(value: js.Array[MethodConfig]): Self = StObject.set(x, "methodConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodConfigVarargs(value: MethodConfig*): Self = StObject.set(x, "methodConfig", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ServiceConfigCanaryConfig extends StObject {
    
    var clientHostname: js.UndefOr[js.Array[String]] = js.native
    
    var clientLanguage: js.UndefOr[js.Array[String]] = js.native
    
    var percentage: js.UndefOr[Double] = js.native
    
    var serviceConfig: ServiceConfig = js.native
  }
  object ServiceConfigCanaryConfig {
    
    @scala.inline
    def apply(serviceConfig: ServiceConfig): ServiceConfigCanaryConfig = {
      val __obj = js.Dynamic.literal(serviceConfig = serviceConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfigCanaryConfig]
    }
    
    @scala.inline
    implicit class ServiceConfigCanaryConfigMutableBuilder[Self <: ServiceConfigCanaryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHostname(value: js.Array[String]): Self = StObject.set(x, "clientHostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientHostnameUndefined: Self = StObject.set(x, "clientHostname", js.undefined)
      
      @scala.inline
      def setClientHostnameVarargs(value: String*): Self = StObject.set(x, "clientHostname", js.Array(value :_*))
      
      @scala.inline
      def setClientLanguage(value: js.Array[String]): Self = StObject.set(x, "clientLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientLanguageUndefined: Self = StObject.set(x, "clientLanguage", js.undefined)
      
      @scala.inline
      def setClientLanguageVarargs(value: String*): Self = StObject.set(x, "clientLanguage", js.Array(value :_*))
      
      @scala.inline
      def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      @scala.inline
      def setServiceConfig(value: ServiceConfig): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    }
  }
}
