package typings.koaJoiRouter

import org.scalablytyped.runtime.StringDictionary
import typings.busboy.mod.BusboyConfig
import typings.coBody.mod.Options
import typings.joi.mod.Root
import typings.joi.mod.SchemaLike
import typings.joi.mod.ValidationOptions
import typings.koaJoiRouter.koaJoiRouterStrings.form
import typings.koaJoiRouter.koaJoiRouterStrings.json
import typings.koaJoiRouter.koaJoiRouterStrings.multipart
import typings.koaJoiRouter.mod.OutputValidation
import typings.koaRouter.mod.IMiddleware
import typings.koaRouter.mod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body
    extends StObject
       with OutputValidation {
    
    var body: SchemaLike
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal(body = null)
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: SchemaLike): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
    }
  }
  
  trait ContinueOnError extends StObject {
    
    var body: js.UndefOr[SchemaLike] = js.undefined
    
    var continueOnError: js.UndefOr[Boolean] = js.undefined
    
    var failure: js.UndefOr[Double] = js.undefined
    
    var formOptions: js.UndefOr[Options] = js.undefined
    
    var header: js.UndefOr[SchemaLike] = js.undefined
    
    var jsonOptions: js.UndefOr[Options] = js.undefined
    
    var maxBody: js.UndefOr[Double | String] = js.undefined
    
    var multipartOptions: js.UndefOr[BusboyConfig] = js.undefined
    
    var output: js.UndefOr[StringDictionary[OutputValidation]] = js.undefined
    
    var params: js.UndefOr[SchemaLike] = js.undefined
    
    var query: js.UndefOr[SchemaLike] = js.undefined
    
    var `type`: js.UndefOr[form | json | multipart] = js.undefined
    
    var validateOptions: js.UndefOr[ValidationOptions] = js.undefined
  }
  object ContinueOnError {
    
    inline def apply(): ContinueOnError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContinueOnError]
    }
    
    extension [Self <: ContinueOnError](x: Self) {
      
      inline def setBody(value: SchemaLike): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
      
      inline def setContinueOnErrorUndefined: Self = StObject.set(x, "continueOnError", js.undefined)
      
      inline def setFailure(value: Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      inline def setFormOptions(value: Options): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
      
      inline def setFormOptionsUndefined: Self = StObject.set(x, "formOptions", js.undefined)
      
      inline def setHeader(value: SchemaLike): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setJsonOptions(value: Options): Self = StObject.set(x, "jsonOptions", value.asInstanceOf[js.Any])
      
      inline def setJsonOptionsUndefined: Self = StObject.set(x, "jsonOptions", js.undefined)
      
      inline def setMaxBody(value: Double | String): Self = StObject.set(x, "maxBody", value.asInstanceOf[js.Any])
      
      inline def setMaxBodyUndefined: Self = StObject.set(x, "maxBody", js.undefined)
      
      inline def setMultipartOptions(value: BusboyConfig): Self = StObject.set(x, "multipartOptions", value.asInstanceOf[js.Any])
      
      inline def setMultipartOptionsUndefined: Self = StObject.set(x, "multipartOptions", js.undefined)
      
      inline def setOutput(value: StringDictionary[OutputValidation]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setParams(value: SchemaLike): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuery(value: SchemaLike): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setType(value: form | json | multipart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidateOptions(value: ValidationOptions): Self = StObject.set(x, "validateOptions", value.asInstanceOf[js.Any])
      
      inline def setValidateOptionsUndefined: Self = StObject.set(x, "validateOptions", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(middleware: (IMiddleware[Any, js.Object])*): Router[Any, js.Object] = js.native
    def apply(path: String, middleware: (IMiddleware[Any, js.Object])*): Router[Any, js.Object] = js.native
    def apply(path: js.Array[String], middleware: (IMiddleware[Any, js.Object])*): Router[Any, js.Object] = js.native
    def apply(path: js.RegExp, middleware: (IMiddleware[Any, js.Object])*): Router[Any, js.Object] = js.native
  }
  
  trait Headers
    extends StObject
       with OutputValidation {
    
    var headers: SchemaLike
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal(headers = null)
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: SchemaLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    }
  }
  
  @js.native
  trait TypeofJoi
    extends StObject
       with Root
}
