package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConfigMod {
  
  @JSImport("@grpc/grpc-js/build/src/service-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAndSelectServiceConfig(txtRecord: js.Array[js.Array[String]], percentage: Double): ServiceConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAndSelectServiceConfig")(txtRecord.asInstanceOf[js.Any], percentage.asInstanceOf[js.Any])).asInstanceOf[ServiceConfig | Null]
  
  inline def validateServiceConfig(obj: js.Any): ServiceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateServiceConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[ServiceConfig]
  
  trait MethodConfig extends StObject {
    
    var maxRequestBytes: js.UndefOr[Double] = js.undefined
    
    var maxResponseBytes: js.UndefOr[Double] = js.undefined
    
    var name: js.Array[MethodConfigName]
    
    var timeout: js.UndefOr[String] = js.undefined
    
    var waitForReady: js.UndefOr[Boolean] = js.undefined
  }
  object MethodConfig {
    
    inline def apply(name: js.Array[MethodConfigName]): MethodConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodConfig]
    }
    
    extension [Self <: MethodConfig](x: Self) {
      
      inline def setMaxRequestBytes(value: Double): Self = StObject.set(x, "maxRequestBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxRequestBytesUndefined: Self = StObject.set(x, "maxRequestBytes", js.undefined)
      
      inline def setMaxResponseBytes(value: Double): Self = StObject.set(x, "maxResponseBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseBytesUndefined: Self = StObject.set(x, "maxResponseBytes", js.undefined)
      
      inline def setName(value: js.Array[MethodConfigName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: MethodConfigName*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitForReady(value: Boolean): Self = StObject.set(x, "waitForReady", value.asInstanceOf[js.Any])
      
      inline def setWaitForReadyUndefined: Self = StObject.set(x, "waitForReady", js.undefined)
    }
  }
  
  trait MethodConfigName extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var service: String
  }
  object MethodConfigName {
    
    inline def apply(service: String): MethodConfigName = {
      val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodConfigName]
    }
    
    extension [Self <: MethodConfigName](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceConfig extends StObject {
    
    var loadBalancingConfig: js.Array[LoadBalancingConfig]
    
    var loadBalancingPolicy: js.UndefOr[String] = js.undefined
    
    var methodConfig: js.Array[MethodConfig]
  }
  object ServiceConfig {
    
    inline def apply(loadBalancingConfig: js.Array[LoadBalancingConfig], methodConfig: js.Array[MethodConfig]): ServiceConfig = {
      val __obj = js.Dynamic.literal(loadBalancingConfig = loadBalancingConfig.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    extension [Self <: ServiceConfig](x: Self) {
      
      inline def setLoadBalancingConfig(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "loadBalancingConfig", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancingConfigVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "loadBalancingConfig", js.Array(value :_*))
      
      inline def setLoadBalancingPolicy(value: String): Self = StObject.set(x, "loadBalancingPolicy", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancingPolicyUndefined: Self = StObject.set(x, "loadBalancingPolicy", js.undefined)
      
      inline def setMethodConfig(value: js.Array[MethodConfig]): Self = StObject.set(x, "methodConfig", value.asInstanceOf[js.Any])
      
      inline def setMethodConfigVarargs(value: MethodConfig*): Self = StObject.set(x, "methodConfig", js.Array(value :_*))
    }
  }
  
  trait ServiceConfigCanaryConfig extends StObject {
    
    var clientHostname: js.UndefOr[js.Array[String]] = js.undefined
    
    var clientLanguage: js.UndefOr[js.Array[String]] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var serviceConfig: ServiceConfig
  }
  object ServiceConfigCanaryConfig {
    
    inline def apply(serviceConfig: ServiceConfig): ServiceConfigCanaryConfig = {
      val __obj = js.Dynamic.literal(serviceConfig = serviceConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfigCanaryConfig]
    }
    
    extension [Self <: ServiceConfigCanaryConfig](x: Self) {
      
      inline def setClientHostname(value: js.Array[String]): Self = StObject.set(x, "clientHostname", value.asInstanceOf[js.Any])
      
      inline def setClientHostnameUndefined: Self = StObject.set(x, "clientHostname", js.undefined)
      
      inline def setClientHostnameVarargs(value: String*): Self = StObject.set(x, "clientHostname", js.Array(value :_*))
      
      inline def setClientLanguage(value: js.Array[String]): Self = StObject.set(x, "clientLanguage", value.asInstanceOf[js.Any])
      
      inline def setClientLanguageUndefined: Self = StObject.set(x, "clientLanguage", js.undefined)
      
      inline def setClientLanguageVarargs(value: String*): Self = StObject.set(x, "clientLanguage", js.Array(value :_*))
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setServiceConfig(value: ServiceConfig): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    }
  }
}
