package typings.hapi.hapiMod

import typings.hapi.hapiMod.LifecycleNs.FailAction
import typings.hapi.hapiMod.UtilNs.Dictionary
import typings.hapi.hapiNumbers.`200`
import typings.hapi.hapiNumbers.`204`
import typings.joi.joiMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsResponse extends js.Object {
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
    * Default value: 200.
    * The default HTTP status code when the payload is considered empty. Value can be 200 or 204. Note that a 200 status code is converted to a 204 only at the time of response transmission (the
    * response status code will remain 200 throughout the request lifecycle unless manually set).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseemptystatuscode)
    */
  var emptyStatusCode: js.UndefOr[`200` | `204`] = js.undefined
  /**
    * Default value: 'error' (return an Internal Server Error (500) error response).
    * A failAction value which defines what to do when a response fails payload validation.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsefailaction)
    */
  var failAction: js.UndefOr[FailAction] = js.undefined
  /**
    * Default value: false.
    * If true, applies the validation rule changes to the response payload.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsemodify)
    */
  var modify: js.UndefOr[Boolean] = js.undefined
  /**
    * Default value: none.
    * [joi](http://github.com/hapijs/joi) options object pass to the validation function. Useful to set global options such as stripUnknown or abortEarly (the complete list is available here). If a
    * custom validation function is defined via schema or status then options can an arbitrary object that will be passed to this function as the second argument.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseoptions)
    */
  var options: js.UndefOr[ValidationOptions] = js.undefined
   // TODO needs validation
  /**
    * Default value: true.
    * If false, payload range support is disabled.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponseranges)
    */
  var ranges: js.UndefOr[Boolean] = js.undefined
  /**
    * Default value: 100 (all responses).
    * The percent of response payloads validated (0 - 100). Set to 0 to disable all validation.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsesample)
    */
  var sample: js.UndefOr[Double] = js.undefined
  /**
    * Default value: true (no validation).
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
    * Default value: none.
    * Validation schemas for specific HTTP status codes. Responses (excluding errors) not matching the listed status codes are validated using the default schema.
    * status is set to an object where each key is a 3 digit HTTP status code and the value has the same definition as schema.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsresponsestatus)
    */
  var status: js.UndefOr[Dictionary[RouteOptionsResponseSchema]] = js.undefined
}

object RouteOptionsResponse {
  @scala.inline
  def apply(
    disconnectStatusCode: Int | Double = null,
    emptyStatusCode: `200` | `204` = null,
    failAction: FailAction = null,
    modify: js.UndefOr[Boolean] = js.undefined,
    options: ValidationOptions = null,
    ranges: js.UndefOr[Boolean] = js.undefined,
    sample: Int | Double = null,
    schema: RouteOptionsResponseSchema = null,
    status: Dictionary[RouteOptionsResponseSchema] = null
  ): RouteOptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (disconnectStatusCode != null) __obj.updateDynamic("disconnectStatusCode")(disconnectStatusCode.asInstanceOf[js.Any])
    if (emptyStatusCode != null) __obj.updateDynamic("emptyStatusCode")(emptyStatusCode.asInstanceOf[js.Any])
    if (failAction != null) __obj.updateDynamic("failAction")(failAction.asInstanceOf[js.Any])
    if (!js.isUndefined(modify)) __obj.updateDynamic("modify")(modify)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges)
    if (sample != null) __obj.updateDynamic("sample")(sample.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[RouteOptionsResponse]
  }
}

