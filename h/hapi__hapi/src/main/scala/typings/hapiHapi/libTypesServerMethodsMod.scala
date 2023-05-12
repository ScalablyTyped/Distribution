package typings.hapiHapi

import typings.hapiCatbox.mod.PolicyOptions
import typings.hapiHapi.hapiHapiBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesServerMethodsMod {
  
  @js.native
  trait ServerMethod extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait ServerMethodCache
    extends StObject
       with PolicyOptions[Any] {
    
    @JSName("generateTimeout")
    var generateTimeout_ServerMethodCache: Double | `false`
  }
  object ServerMethodCache {
    
    inline def apply(generateTimeout: Double | `false`): ServerMethodCache = {
      val __obj = js.Dynamic.literal(generateTimeout = generateTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerMethodCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerMethodCache] (val x: Self) extends AnyVal {
      
      inline def setGenerateTimeout(value: Double | `false`): Self = StObject.set(x, "generateTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerMethodConfigurationObject extends StObject {
    
    /**
      * the method function.
      */
    def method(args: Any*): Any
    /**
      * the method function.
      */
    @JSName("method")
    var method_Original: ServerMethod
    
    /**
      * the method name.
      */
    var name: String
    
    /**
      * (optional) settings.
      */
    var options: js.UndefOr[ServerMethodOptions] = js.undefined
  }
  object ServerMethodConfigurationObject {
    
    inline def apply(method: ServerMethod, name: String): ServerMethodConfigurationObject = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerMethodConfigurationObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerMethodConfigurationObject] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: ServerMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ServerMethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait ServerMethodOptions extends StObject {
    
    /**
      * a context object passed back to the method function (via this) when called. Defaults to active context (set via server.bind() when the method is registered. Ignored if the method is an arrow
      * function.
      */
    var bind: js.UndefOr[js.Object] = js.undefined
    
    /**
      * the same cache configuration used in server.cache(). The generateTimeout option is required.
      */
    var cache: js.UndefOr[ServerMethodCache] = js.undefined
    
    /**
      * a function used to generate a unique key (for caching) from the arguments passed to the method function (the flags argument is not passed as input). The server will automatically generate a
      * unique key if the function's arguments are all of types 'string', 'number', or 'boolean'. However if the method uses other types of arguments, a key generation function must be provided which
      * takes the same arguments as the function and returns a unique string (or null if no key can be generated).
      */
    var generateKey: js.UndefOr[js.Function1[/* repeated */ Any, String | Null]] = js.undefined
  }
  object ServerMethodOptions {
    
    inline def apply(): ServerMethodOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerMethodOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerMethodOptions] (val x: Self) extends AnyVal {
      
      inline def setBind(value: js.Object): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setCache(value: ServerMethodCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setGenerateKey(value: /* repeated */ Any => String | Null): Self = StObject.set(x, "generateKey", js.Any.fromFunction1(value))
      
      inline def setGenerateKeyUndefined: Self = StObject.set(x, "generateKey", js.undefined)
    }
  }
  
  type ServerMethods = Record[String, ServerMethod]
}
