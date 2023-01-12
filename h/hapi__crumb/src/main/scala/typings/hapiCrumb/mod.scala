package typings.hapiCrumb

import org.scalablytyped.runtime.Shortcut
import typings.hapiCrumb.anon.Key
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import typings.hapiHapi.mod.ServerStateCookieOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hapi/crumb", JSImport.Namespace)
  @js.native
  val ^ : Plugin[RegisterOptions] = js.native
  
  trait RegisterOptions extends StObject {
    
    /**
      * Whether to automatically add the crumb to view contexts as the given key.
      *
      * @default true
      */
    var addToViewContext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to automatically generate a new crumb for requests.
      *
      * @default true
      */
    var autoGenerate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Storage options for the cookie containing the crumb
      *
      * @default { path: '/' }
      */
    var cookieOptions: js.UndefOr[ServerStateCookieOptions] = js.undefined
    
    /**
      * Using enforce with false will set the CSRF header cookie but won't execute the validation.
      *
      * @default true
      */
    var enforce: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the name of the custom CSRF header.
      *
      * @default 'X-CSRF-Token'
      */
    var headerName: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the cookie to store the CSRF crumb into.
      *
      * @default 'crumb'
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to add to the request log with tag 'crumb' and data 'validation failed'.
      *
      * @default false
      */
    var logUnauthorized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * RESTful mode that validates crumb tokens from 'X-CSRF-Token' request header for POST, PUT, PATCH and DELETE server routes.
      * Disables payload/query crumb validation.
      *
      * @default false
      */
    var restful: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The length of the crumb to generate.
      * See {@link https://github.com/hapijs/cryptiles cryptiles} for more information.
      *
      * @default 43
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * A function which when provided, is called for every request.
      * If the provided function returns true, validation and generation of crumb is skipped.
      *
      * @default false
      */
    var skip: js.UndefOr[Boolean | SkipFunction] = js.undefined
  }
  object RegisterOptions {
    
    inline def apply(): RegisterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterOptions] (val x: Self) extends AnyVal {
      
      inline def setAddToViewContext(value: Boolean): Self = StObject.set(x, "addToViewContext", value.asInstanceOf[js.Any])
      
      inline def setAddToViewContextUndefined: Self = StObject.set(x, "addToViewContext", js.undefined)
      
      inline def setAutoGenerate(value: Boolean): Self = StObject.set(x, "autoGenerate", value.asInstanceOf[js.Any])
      
      inline def setAutoGenerateUndefined: Self = StObject.set(x, "autoGenerate", js.undefined)
      
      inline def setCookieOptions(value: ServerStateCookieOptions): Self = StObject.set(x, "cookieOptions", value.asInstanceOf[js.Any])
      
      inline def setCookieOptionsUndefined: Self = StObject.set(x, "cookieOptions", js.undefined)
      
      inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
      
      inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
      
      inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogUnauthorized(value: Boolean): Self = StObject.set(x, "logUnauthorized", value.asInstanceOf[js.Any])
      
      inline def setLogUnauthorizedUndefined: Self = StObject.set(x, "logUnauthorized", js.undefined)
      
      inline def setRestful(value: Boolean): Self = StObject.set(x, "restful", value.asInstanceOf[js.Any])
      
      inline def setRestfulUndefined: Self = StObject.set(x, "restful", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkip(value: Boolean | SkipFunction): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipFunction2(
        value: (/* request */ js.UndefOr[Request[ReqRefDefaults]], /* h */ js.UndefOr[ResponseToolkit[ReqRefDefaults]]) => Boolean
      ): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[Request[ReqRefDefaults]], 
    /* h */ js.UndefOr[ResponseToolkit[ReqRefDefaults]], 
    Boolean
  ]
  
  type _To = Plugin[RegisterOptions]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[RegisterOptions] = ^
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait PluginSpecificConfiguration extends StObject {
      
      var crumb: js.UndefOr[Boolean | Key] = js.undefined
    }
    object PluginSpecificConfiguration {
      
      inline def apply(): PluginSpecificConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PluginSpecificConfiguration]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PluginSpecificConfiguration] (val x: Self) extends AnyVal {
        
        inline def setCrumb(value: Boolean | Key): Self = StObject.set(x, "crumb", value.asInstanceOf[js.Any])
        
        inline def setCrumbUndefined: Self = StObject.set(x, "crumb", js.undefined)
      }
    }
  }
}
