package typings.koaBodyparser

import typings.koa.mod.Context
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaBodyparser.anon.Form
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(opts: Options): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-bodyparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * custom json request detect function. Default is null
      */
    var detectJSON: js.UndefOr[js.Function1[/* ctx */ Context, Boolean]] = js.undefined
    
    /**
      *  parser will only parse when request type hits enableTypes, default is ['json', 'form'].
      */
    var enableTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * requested encoding. Default is utf-8 by co-body
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * support extend types
      */
    var extendTypes: js.UndefOr[Form] = js.undefined
    
    /**
      * limit of the urlencoded body. If the body ends up being larger than this limit
      * a 413 error code is returned. Default is 56kb
      */
    var formLimit: js.UndefOr[String] = js.undefined
    
    /**
      * limit of the json body. Default is 1mb
      */
    var jsonLimit: js.UndefOr[String] = js.undefined
    
    /**
      * support custom error handle
      */
    var onerror: js.UndefOr[js.Function2[/* err */ js.Error, /* ctx */ Context, Unit]] = js.undefined
    
    /**
      * when set to true, JSON parser will only accept arrays and objects. Default is true
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * limit of the text body. Default is 1mb.
      */
    var textLimit: js.UndefOr[String] = js.undefined
    
    /**
      * limit of the xml body. Default is 1mb.
      */
    var xmlLimit: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDetectJSON(value: /* ctx */ Context => Boolean): Self = StObject.set(x, "detectJSON", js.Any.fromFunction1(value))
      
      inline def setDetectJSONUndefined: Self = StObject.set(x, "detectJSON", js.undefined)
      
      inline def setEnableTypes(value: js.Array[String]): Self = StObject.set(x, "enableTypes", value.asInstanceOf[js.Any])
      
      inline def setEnableTypesUndefined: Self = StObject.set(x, "enableTypes", js.undefined)
      
      inline def setEnableTypesVarargs(value: String*): Self = StObject.set(x, "enableTypes", js.Array(value*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExtendTypes(value: Form): Self = StObject.set(x, "extendTypes", value.asInstanceOf[js.Any])
      
      inline def setExtendTypesUndefined: Self = StObject.set(x, "extendTypes", js.undefined)
      
      inline def setFormLimit(value: String): Self = StObject.set(x, "formLimit", value.asInstanceOf[js.Any])
      
      inline def setFormLimitUndefined: Self = StObject.set(x, "formLimit", js.undefined)
      
      inline def setJsonLimit(value: String): Self = StObject.set(x, "jsonLimit", value.asInstanceOf[js.Any])
      
      inline def setJsonLimitUndefined: Self = StObject.set(x, "jsonLimit", js.undefined)
      
      inline def setOnerror(value: (/* err */ js.Error, /* ctx */ Context) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction2(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTextLimit(value: String): Self = StObject.set(x, "textLimit", value.asInstanceOf[js.Any])
      
      inline def setTextLimitUndefined: Self = StObject.set(x, "textLimit", js.undefined)
      
      inline def setXmlLimit(value: String): Self = StObject.set(x, "xmlLimit", value.asInstanceOf[js.Any])
      
      inline def setXmlLimitUndefined: Self = StObject.set(x, "xmlLimit", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait Request extends StObject {
      
      // any declaration breaks types intellisense and type safety, keep it at least Record<string, unknown>
      var body: js.UndefOr[Record[String, Any]] = js.undefined
      
      var rawBody: String
    }
    object Request {
      
      inline def apply(rawBody: String): Request = {
        val __obj = js.Dynamic.literal(rawBody = rawBody.asInstanceOf[js.Any])
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setBody(value: Record[String, Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
        
        inline def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      }
    }
  }
}
