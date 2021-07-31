package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiNumbers.`200`
import typings.hapiHapi.hapiHapiNumbers.`204`
import typings.hapiHapi.mod.Lifecycle.FailAction
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.Util.Dictionary
import typings.joi.mod.ValidationOptions
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsResponse extends StObject {
  
  /**
    * The default HTTP status code used to set a response error when the request is closed or aborted before the
    * response is fully transmitted.
    * Value can be any integer greater or equal to 400.
    * The default value 499 is based on the non-standard nginx "CLIENT CLOSED REQUEST" error.
    * The value is only used for logging as the request has already ended.
    * @default 499
    */
  var disconnectStatusCode: js.UndefOr[Double] = js.undefined
  
  /**
    * @default 204.
    * The default HTTP status code when the payload is considered empty. Value can be 200 or 204. Note that a 200 status code is converted to a 204 only at the time of response transmission (the
    * response status code will remain 200 throughout the request lifecycle unless manually set).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseemptystatuscode)
    */
  var emptyStatusCode: js.UndefOr[`200` | `204`] = js.undefined
  
  /**
    * @default 'error' (return an Internal Server Error (500) error response).
    * A failAction value which defines what to do when a response fails payload validation.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsefailaction)
    */
  var failAction: js.UndefOr[FailAction] = js.undefined
  
  /**
    * @default false.
    * If true, applies the validation rule changes to the response payload.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsemodify)
    */
  var modify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default none.
    * [joi](http://github.com/hapijs/joi) options object pass to the validation function. Useful to set global options such as stripUnknown or abortEarly (the complete list is available here). If a
    * custom validation function is defined via schema or status then options can an arbitrary object that will be passed to this function as the second argument.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseoptions)
    */
  var options: js.UndefOr[ValidationOptions] = js.undefined
  
  // TODO needs validation
  /**
    * @default true.
    * If false, payload range support is disabled.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseranges)
    */
  var ranges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default 100 (all responses).
    * The percent of response payloads validated (0 - 100). Set to 0 to disable all validation.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsesample)
    */
  var sample: js.UndefOr[Double] = js.undefined
  
  /**
    * @default true (no validation).
    * The default response payload validation rules (for all non-error responses) expressed as one of:
    * * true - any payload allowed (no validation).
    * * false - no payload allowed.
    * * a joi validation object. The options along with the request context ({ headers, params, query, payload, app, auth }) are passed to the validation function.
    * * a validation function using the signature async function(value, options) where:
    * * * value - the pending response payload.
    * * * options - The options along with the request context ({ headers, params, query, payload, app, auth }).
    * * * if the function returns a value and modify is true, the value is used as the new response. If the original response is an error, the return value is used to override the original error
    * output.payload. If an error is thrown, the error is processed according to failAction.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseschema)
    */
  var schema: js.UndefOr[RouteOptionsResponseSchema] = js.undefined
  
  /**
    * @default none.
    * Validation schemas for specific HTTP status codes. Responses (excluding errors) not matching the listed status codes are validated using the default schema.
    * status is set to an object where each key is a 3 digit HTTP status code and the value has the same definition as schema.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsestatus)
    */
  var status: js.UndefOr[Dictionary[RouteOptionsResponseSchema]] = js.undefined
}
object RouteOptionsResponse {
  
  @scala.inline
  def apply(): RouteOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsResponse]
  }
  
  @scala.inline
  implicit class RouteOptionsResponseMutableBuilder[Self <: RouteOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisconnectStatusCode(value: Double): Self = StObject.set(x, "disconnectStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnectStatusCodeUndefined: Self = StObject.set(x, "disconnectStatusCode", js.undefined)
    
    @scala.inline
    def setEmptyStatusCode(value: `200` | `204`): Self = StObject.set(x, "emptyStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyStatusCodeUndefined: Self = StObject.set(x, "emptyStatusCode", js.undefined)
    
    @scala.inline
    def setFailAction(value: FailAction): Self = StObject.set(x, "failAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailActionFunction3(
      value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[Error]) => ReturnValue
    ): Self = StObject.set(x, "failAction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFailActionUndefined: Self = StObject.set(x, "failAction", js.undefined)
    
    @scala.inline
    def setModify(value: Boolean): Self = StObject.set(x, "modify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyUndefined: Self = StObject.set(x, "modify", js.undefined)
    
    @scala.inline
    def setOptions(value: ValidationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setSample(value: Double): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    
    @scala.inline
    def setSchema(value: RouteOptionsResponseSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaFunction2(
      value: (/* value */ js.Object | Buffer | String, /* options */ ValidationOptions) => js.Promise[js.Any]
    ): Self = StObject.set(x, "schema", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setStatus(value: Dictionary[RouteOptionsResponseSchema]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
