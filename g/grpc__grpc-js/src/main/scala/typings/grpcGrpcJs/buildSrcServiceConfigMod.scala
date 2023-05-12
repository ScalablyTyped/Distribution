package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcDurationMod.Duration
import typings.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcServiceConfigMod {
  
  @JSImport("@grpc/grpc-js/build/src/service-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAndSelectServiceConfig(txtRecord: js.Array[js.Array[String]], percentage: Double): ServiceConfig | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAndSelectServiceConfig")(txtRecord.asInstanceOf[js.Any], percentage.asInstanceOf[js.Any])).asInstanceOf[ServiceConfig | Null]
  
  inline def validateRetryThrottling(obj: Any): RetryThrottling = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRetryThrottling")(obj.asInstanceOf[js.Any]).asInstanceOf[RetryThrottling]
  
  inline def validateServiceConfig(obj: Any): ServiceConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("validateServiceConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[ServiceConfig]
  
  trait HedgingPolicy extends StObject {
    
    var hedgingDelay: js.UndefOr[String] = js.undefined
    
    var maxAttempts: Double
    
    var nonFatalStatusCodes: js.UndefOr[js.Array[Status | String]] = js.undefined
  }
  object HedgingPolicy {
    
    inline def apply(maxAttempts: Double): HedgingPolicy = {
      val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any])
      __obj.asInstanceOf[HedgingPolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HedgingPolicy] (val x: Self) extends AnyVal {
      
      inline def setHedgingDelay(value: String): Self = StObject.set(x, "hedgingDelay", value.asInstanceOf[js.Any])
      
      inline def setHedgingDelayUndefined: Self = StObject.set(x, "hedgingDelay", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setNonFatalStatusCodes(value: js.Array[Status | String]): Self = StObject.set(x, "nonFatalStatusCodes", value.asInstanceOf[js.Any])
      
      inline def setNonFatalStatusCodesUndefined: Self = StObject.set(x, "nonFatalStatusCodes", js.undefined)
      
      inline def setNonFatalStatusCodesVarargs(value: (Status | String)*): Self = StObject.set(x, "nonFatalStatusCodes", js.Array(value*))
    }
  }
  
  trait MethodConfig extends StObject {
    
    var hedgingPolicy: js.UndefOr[HedgingPolicy] = js.undefined
    
    var maxRequestBytes: js.UndefOr[Double] = js.undefined
    
    var maxResponseBytes: js.UndefOr[Double] = js.undefined
    
    var name: js.Array[MethodConfigName]
    
    var retryPolicy: js.UndefOr[RetryPolicy] = js.undefined
    
    var timeout: js.UndefOr[Duration] = js.undefined
    
    var waitForReady: js.UndefOr[Boolean] = js.undefined
  }
  object MethodConfig {
    
    inline def apply(name: js.Array[MethodConfigName]): MethodConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodConfig] (val x: Self) extends AnyVal {
      
      inline def setHedgingPolicy(value: HedgingPolicy): Self = StObject.set(x, "hedgingPolicy", value.asInstanceOf[js.Any])
      
      inline def setHedgingPolicyUndefined: Self = StObject.set(x, "hedgingPolicy", js.undefined)
      
      inline def setMaxRequestBytes(value: Double): Self = StObject.set(x, "maxRequestBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxRequestBytesUndefined: Self = StObject.set(x, "maxRequestBytes", js.undefined)
      
      inline def setMaxResponseBytes(value: Double): Self = StObject.set(x, "maxResponseBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxResponseBytesUndefined: Self = StObject.set(x, "maxResponseBytes", js.undefined)
      
      inline def setName(value: js.Array[MethodConfigName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: MethodConfigName*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setRetryPolicy(value: RetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
      
      inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
      
      inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodConfigName] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryPolicy extends StObject {
    
    var backoffMultiplier: Double
    
    var initialBackoff: String
    
    var maxAttempts: Double
    
    var maxBackoff: String
    
    var retryableStatusCodes: js.Array[Status | String]
  }
  object RetryPolicy {
    
    inline def apply(
      backoffMultiplier: Double,
      initialBackoff: String,
      maxAttempts: Double,
      maxBackoff: String,
      retryableStatusCodes: js.Array[Status | String]
    ): RetryPolicy = {
      val __obj = js.Dynamic.literal(backoffMultiplier = backoffMultiplier.asInstanceOf[js.Any], initialBackoff = initialBackoff.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxBackoff = maxBackoff.asInstanceOf[js.Any], retryableStatusCodes = retryableStatusCodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryPolicy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryPolicy] (val x: Self) extends AnyVal {
      
      inline def setBackoffMultiplier(value: Double): Self = StObject.set(x, "backoffMultiplier", value.asInstanceOf[js.Any])
      
      inline def setInitialBackoff(value: String): Self = StObject.set(x, "initialBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoff(value: String): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setRetryableStatusCodes(value: js.Array[Status | String]): Self = StObject.set(x, "retryableStatusCodes", value.asInstanceOf[js.Any])
      
      inline def setRetryableStatusCodesVarargs(value: (Status | String)*): Self = StObject.set(x, "retryableStatusCodes", js.Array(value*))
    }
  }
  
  trait RetryThrottling extends StObject {
    
    var maxTokens: Double
    
    var tokenRatio: Double
  }
  object RetryThrottling {
    
    inline def apply(maxTokens: Double, tokenRatio: Double): RetryThrottling = {
      val __obj = js.Dynamic.literal(maxTokens = maxTokens.asInstanceOf[js.Any], tokenRatio = tokenRatio.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryThrottling]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryThrottling] (val x: Self) extends AnyVal {
      
      inline def setMaxTokens(value: Double): Self = StObject.set(x, "maxTokens", value.asInstanceOf[js.Any])
      
      inline def setTokenRatio(value: Double): Self = StObject.set(x, "tokenRatio", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceConfig extends StObject {
    
    var loadBalancingConfig: js.Array[LoadBalancingConfig]
    
    var loadBalancingPolicy: js.UndefOr[String] = js.undefined
    
    var methodConfig: js.Array[MethodConfig]
    
    var retryThrottling: js.UndefOr[RetryThrottling] = js.undefined
  }
  object ServiceConfig {
    
    inline def apply(loadBalancingConfig: js.Array[LoadBalancingConfig], methodConfig: js.Array[MethodConfig]): ServiceConfig = {
      val __obj = js.Dynamic.literal(loadBalancingConfig = loadBalancingConfig.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceConfig] (val x: Self) extends AnyVal {
      
      inline def setLoadBalancingConfig(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "loadBalancingConfig", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancingConfigVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "loadBalancingConfig", js.Array(value*))
      
      inline def setLoadBalancingPolicy(value: String): Self = StObject.set(x, "loadBalancingPolicy", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancingPolicyUndefined: Self = StObject.set(x, "loadBalancingPolicy", js.undefined)
      
      inline def setMethodConfig(value: js.Array[MethodConfig]): Self = StObject.set(x, "methodConfig", value.asInstanceOf[js.Any])
      
      inline def setMethodConfigVarargs(value: MethodConfig*): Self = StObject.set(x, "methodConfig", js.Array(value*))
      
      inline def setRetryThrottling(value: RetryThrottling): Self = StObject.set(x, "retryThrottling", value.asInstanceOf[js.Any])
      
      inline def setRetryThrottlingUndefined: Self = StObject.set(x, "retryThrottling", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceConfigCanaryConfig] (val x: Self) extends AnyVal {
      
      inline def setClientHostname(value: js.Array[String]): Self = StObject.set(x, "clientHostname", value.asInstanceOf[js.Any])
      
      inline def setClientHostnameUndefined: Self = StObject.set(x, "clientHostname", js.undefined)
      
      inline def setClientHostnameVarargs(value: String*): Self = StObject.set(x, "clientHostname", js.Array(value*))
      
      inline def setClientLanguage(value: js.Array[String]): Self = StObject.set(x, "clientLanguage", value.asInstanceOf[js.Any])
      
      inline def setClientLanguageUndefined: Self = StObject.set(x, "clientLanguage", js.undefined)
      
      inline def setClientLanguageVarargs(value: String*): Self = StObject.set(x, "clientLanguage", js.Array(value*))
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setServiceConfig(value: ServiceConfig): Self = StObject.set(x, "serviceConfig", value.asInstanceOf[js.Any])
    }
  }
}
