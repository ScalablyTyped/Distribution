package typings.koaJoiRouter

import org.scalablytyped.runtime.StringDictionary
import typings.coBody.mod.Options
import typings.joi.mod.Root
import typings.joi.mod.SchemaLike
import typings.koaJoiRouter.koaJoiRouterStrings.form
import typings.koaJoiRouter.koaJoiRouterStrings.json
import typings.koaJoiRouter.koaJoiRouterStrings.multipart
import typings.koaJoiRouter.mod.OutputValidation
import typings.koaRouter.mod.IMiddleware
import typings.koaRouter.mod.Router
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends OutputValidation {
    
    var body: SchemaLike = js.native
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: SchemaLike): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
    }
  }
  
  @js.native
  trait ContinueOnError extends StObject {
    
    var body: js.UndefOr[SchemaLike] = js.native
    
    var continueOnError: js.UndefOr[Boolean] = js.native
    
    var failure: js.UndefOr[Double] = js.native
    
    var formOptions: js.UndefOr[Options] = js.native
    
    var header: js.UndefOr[SchemaLike] = js.native
    
    var jsonOptions: js.UndefOr[Options] = js.native
    
    var maxBody: js.UndefOr[Double] = js.native
    
    var multipartOptions: js.UndefOr[Options] = js.native
    
    var output: js.UndefOr[StringDictionary[OutputValidation]] = js.native
    
    var params: js.UndefOr[SchemaLike] = js.native
    
    var query: js.UndefOr[SchemaLike] = js.native
    
    var `type`: js.UndefOr[form | json | multipart] = js.native
  }
  object ContinueOnError {
    
    @scala.inline
    def apply(): ContinueOnError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContinueOnError]
    }
    
    @scala.inline
    implicit class ContinueOnErrorMutableBuilder[Self <: ContinueOnError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: SchemaLike): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueOnErrorUndefined: Self = StObject.set(x, "continueOnError", js.undefined)
      
      @scala.inline
      def setFailure(value: Double): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setFormOptions(value: Options): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormOptionsUndefined: Self = StObject.set(x, "formOptions", js.undefined)
      
      @scala.inline
      def setHeader(value: SchemaLike): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNull: Self = StObject.set(x, "header", null)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setJsonOptions(value: Options): Self = StObject.set(x, "jsonOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonOptionsUndefined: Self = StObject.set(x, "jsonOptions", js.undefined)
      
      @scala.inline
      def setMaxBody(value: Double): Self = StObject.set(x, "maxBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodyUndefined: Self = StObject.set(x, "maxBody", js.undefined)
      
      @scala.inline
      def setMultipartOptions(value: Options): Self = StObject.set(x, "multipartOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipartOptionsUndefined: Self = StObject.set(x, "multipartOptions", js.undefined)
      
      @scala.inline
      def setOutput(value: StringDictionary[OutputValidation]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setParams(value: SchemaLike): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsNull: Self = StObject.set(x, "params", null)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: SchemaLike): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setType(value: form | json | multipart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
    def apply(path: String, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
    def apply(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
    def apply(path: RegExp, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  }
  
  @js.native
  trait Headers extends OutputValidation {
    
    var headers: SchemaLike = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: SchemaLike): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersNull: Self = StObject.set(x, "headers", null)
    }
  }
  
  @js.native
  trait TypeofJoi extends Root
}
