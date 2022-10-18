package typings.inversifyLoggerMiddleware

import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsInterfacesInterfacesMod {
  
  object interfaces {
    
    trait BindingLoggerSettings extends StObject {
      
      var activated: js.UndefOr[Boolean] = js.undefined
      
      var cache: js.UndefOr[Boolean] = js.undefined
      
      var constraint: js.UndefOr[Boolean] = js.undefined
      
      var dynamicValue: js.UndefOr[Boolean] = js.undefined
      
      var factory: js.UndefOr[Boolean] = js.undefined
      
      var implementationType: js.UndefOr[Boolean] = js.undefined
      
      var onActivation: js.UndefOr[Boolean] = js.undefined
      
      var provider: js.UndefOr[Boolean] = js.undefined
      
      var scope: js.UndefOr[Boolean] = js.undefined
      
      var serviceIdentifier: js.UndefOr[Boolean] = js.undefined
      
      var `type`: js.UndefOr[Boolean] = js.undefined
    }
    object BindingLoggerSettings {
      
      inline def apply(): BindingLoggerSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BindingLoggerSettings]
      }
      
      extension [Self <: BindingLoggerSettings](x: Self) {
        
        inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
        
        inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
        
        inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
        
        inline def setConstraint(value: Boolean): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
        
        inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
        
        inline def setDynamicValue(value: Boolean): Self = StObject.set(x, "dynamicValue", value.asInstanceOf[js.Any])
        
        inline def setDynamicValueUndefined: Self = StObject.set(x, "dynamicValue", js.undefined)
        
        inline def setFactory(value: Boolean): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
        
        inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
        
        inline def setImplementationType(value: Boolean): Self = StObject.set(x, "implementationType", value.asInstanceOf[js.Any])
        
        inline def setImplementationTypeUndefined: Self = StObject.set(x, "implementationType", js.undefined)
        
        inline def setOnActivation(value: Boolean): Self = StObject.set(x, "onActivation", value.asInstanceOf[js.Any])
        
        inline def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
        
        inline def setProvider(value: Boolean): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
        
        inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
        
        inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
        
        inline def setServiceIdentifier(value: Boolean): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
        
        inline def setServiceIdentifierUndefined: Self = StObject.set(x, "serviceIdentifier", js.undefined)
        
        inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait LogEntry extends StObject {
      
      var error: Boolean
      
      var exception: Any
      
      var guid: String
      
      var multiInject: Boolean
      
      var results: js.Array[Any]
      
      var rootRequest: Request
      
      var serviceIdentifier: Any
      
      var time: String
    }
    object LogEntry {
      
      inline def apply(
        error: Boolean,
        exception: Any,
        guid: String,
        multiInject: Boolean,
        results: js.Array[Any],
        rootRequest: Request,
        serviceIdentifier: Any,
        time: String
      ): LogEntry = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], multiInject = multiInject.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], rootRequest = rootRequest.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
        __obj.asInstanceOf[LogEntry]
      }
      
      extension [Self <: LogEntry](x: Self) {
        
        inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setException(value: Any): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
        
        inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
        
        inline def setMultiInject(value: Boolean): Self = StObject.set(x, "multiInject", value.asInstanceOf[js.Any])
        
        inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        
        inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
        
        inline def setRootRequest(value: Request): Self = StObject.set(x, "rootRequest", value.asInstanceOf[js.Any])
        
        inline def setServiceIdentifier(value: Any): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
        
        inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      }
    }
    
    trait LoggerSettings extends StObject {
      
      var request: js.UndefOr[RequestLoggerSettings] = js.undefined
      
      var time: js.UndefOr[Boolean] = js.undefined
    }
    object LoggerSettings {
      
      inline def apply(): LoggerSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoggerSettings]
      }
      
      extension [Self <: LoggerSettings](x: Self) {
        
        inline def setRequest(value: RequestLoggerSettings): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      }
    }
    
    trait RequestLoggerSettings extends StObject {
      
      var bindings: js.UndefOr[BindingLoggerSettings] = js.undefined
      
      var serviceIdentifier: js.UndefOr[Boolean] = js.undefined
      
      var target: js.UndefOr[TargetLoggerSettings] = js.undefined
    }
    object RequestLoggerSettings {
      
      inline def apply(): RequestLoggerSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RequestLoggerSettings]
      }
      
      extension [Self <: RequestLoggerSettings](x: Self) {
        
        inline def setBindings(value: BindingLoggerSettings): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
        
        inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
        
        inline def setServiceIdentifier(value: Boolean): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
        
        inline def setServiceIdentifierUndefined: Self = StObject.set(x, "serviceIdentifier", js.undefined)
        
        inline def setTarget(value: TargetLoggerSettings): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      }
    }
    
    trait TargetLoggerSettings extends StObject {
      
      var metadata: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[Boolean] = js.undefined
      
      var serviceIdentifier: js.UndefOr[Boolean] = js.undefined
    }
    object TargetLoggerSettings {
      
      inline def apply(): TargetLoggerSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TargetLoggerSettings]
      }
      
      extension [Self <: TargetLoggerSettings](x: Self) {
        
        inline def setMetadata(value: Boolean): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setServiceIdentifier(value: Boolean): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
        
        inline def setServiceIdentifierUndefined: Self = StObject.set(x, "serviceIdentifier", js.undefined)
      }
    }
  }
}
