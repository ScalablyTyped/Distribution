package typings.koaBetterBody

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Next
import typings.koa.mod.ParameterizedContext
import typings.koaBetterBody.anon.Custom
import typings.std.Generator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Body = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Body]
  inline def apply(options: Options): Body = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Body]
  
  @JSImport("koa-better-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Body = js.Function1[/* next */ Next, Generator[Any, Any, Any]]
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var bufferLimit: js.UndefOr[String] = js.undefined
    
    /**
      * @default require('querystring').unescape
      */
    var decodeURIComponent: js.UndefOr[js.Function1[/* query */ String, String]] = js.undefined
    
    /**
      * @default '&'
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * @default () => false
      */
    var detectJSON: js.UndefOr[
        js.Function1[/* ctx */ ParameterizedContext[DefaultState, DefaultContext, Any], Boolean]
      ] = js.undefined
    
    /**
      * {
      * <br />&nbsp;&nbsp;multipart: ['multipart/form-data'],
      * <br />&nbsp;&nbsp;text: ['text/ *'],
      * <br />&nbsp;&nbsp;form: ['application/x-www-form-urlencoded'],
      * <br />&nbsp;&nbsp;json: [
      * <br />&nbsp;&nbsp;&nbsp;&nbsp;'application/json',
      * <br />&nbsp;&nbsp;&nbsp;&nbsp;'application/json-patch+json',
      * <br />&nbsp;&nbsp;&nbsp;&nbsp;'application/vnd.api+json',
      * <br />&nbsp;&nbsp;&nbsp;&nbsp;'application/csp-report'
      * <br />&nbsp;&nbsp;],
      * <br />&nbsp;&nbsp;buffer: ['text/ *']
      * }
      */
    var extendTypes: js.UndefOr[(Record[String, String | js.Array[String]]) & Custom] = js.undefined
    
    /**
      * @default false
      */
    var fields: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * @default false
      */
    var files: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * @default false
      */
    var formLimit: js.UndefOr[String] = js.undefined
    
    /**
      * @default undefined
      */
    var handler: js.UndefOr[
        js.Function3[
          /* ctx */ ParameterizedContext[DefaultState, DefaultContext, Any], 
          /* options */ this.type, 
          /* next */ Next, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @default false
      */
    var jsonLimit: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var jsonStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 1000
      */
    var maxKeys: js.UndefOr[Double] = js.undefined
    
    /**
      * @default true
      */
    var multipart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default undefined
      */
    var onError: js.UndefOr[
        js.Function2[
          /* err */ Any, 
          /* ctx */ ParameterizedContext[DefaultState, DefaultContext, Any], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @deprecated use delimiter instead
      * @default config.delimiter
      */
    var sep: js.UndefOr[String] = js.undefined
    
    /**
      * @default true
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var textLimit: js.UndefOr[String] = js.undefined
    
    // default: 1000
    /**
      * @deprecated use formLimit instead
      * @default config.formLimit
      */
    var urlencodedLimit: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferLimit(value: String): Self = StObject.set(x, "bufferLimit", value.asInstanceOf[js.Any])
      
      inline def setBufferLimitUndefined: Self = StObject.set(x, "bufferLimit", js.undefined)
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDecodeURIComponent(value: /* query */ String => String): Self = StObject.set(x, "decodeURIComponent", js.Any.fromFunction1(value))
      
      inline def setDecodeURIComponentUndefined: Self = StObject.set(x, "decodeURIComponent", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDetectJSON(value: /* ctx */ ParameterizedContext[DefaultState, DefaultContext, Any] => Boolean): Self = StObject.set(x, "detectJSON", js.Any.fromFunction1(value))
      
      inline def setDetectJSONUndefined: Self = StObject.set(x, "detectJSON", js.undefined)
      
      inline def setExtendTypes(value: (Record[String, String | js.Array[String]]) & Custom): Self = StObject.set(x, "extendTypes", value.asInstanceOf[js.Any])
      
      inline def setExtendTypesUndefined: Self = StObject.set(x, "extendTypes", js.undefined)
      
      inline def setFields(value: Boolean | String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFiles(value: Boolean | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFormLimit(value: String): Self = StObject.set(x, "formLimit", value.asInstanceOf[js.Any])
      
      inline def setFormLimitUndefined: Self = StObject.set(x, "formLimit", js.undefined)
      
      inline def setHandler(
        value: (/* ctx */ ParameterizedContext[DefaultState, DefaultContext, Any], Options, /* next */ Next) => Unit
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setJsonLimit(value: String): Self = StObject.set(x, "jsonLimit", value.asInstanceOf[js.Any])
      
      inline def setJsonLimitUndefined: Self = StObject.set(x, "jsonLimit", js.undefined)
      
      inline def setJsonStrict(value: Boolean): Self = StObject.set(x, "jsonStrict", value.asInstanceOf[js.Any])
      
      inline def setJsonStrictUndefined: Self = StObject.set(x, "jsonStrict", js.undefined)
      
      inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
      
      inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
      
      inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
      
      inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
      
      inline def setOnError(value: (/* err */ Any, /* ctx */ ParameterizedContext[DefaultState, DefaultContext, Any]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTextLimit(value: String): Self = StObject.set(x, "textLimit", value.asInstanceOf[js.Any])
      
      inline def setTextLimitUndefined: Self = StObject.set(x, "textLimit", js.undefined)
      
      inline def setUrlencodedLimit(value: String): Self = StObject.set(x, "urlencodedLimit", value.asInstanceOf[js.Any])
      
      inline def setUrlencodedLimitUndefined: Self = StObject.set(x, "urlencodedLimit", js.undefined)
    }
  }
}
