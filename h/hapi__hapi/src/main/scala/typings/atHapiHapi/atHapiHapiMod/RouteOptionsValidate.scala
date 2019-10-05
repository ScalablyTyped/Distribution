package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.atHapiHapiMod.Lifecycle.FailAction
import typings.atHapiJoi.atHapiJoiMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsValidate extends js.Object {
  /**
    * Default value: none.
    * An optional object with error fields copied into every validation error response.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidateerrorfields)
    */
  var errorFields: js.UndefOr[js.Object] = js.undefined
  /**
    * Default value: 'error' (return a Bad Request (400) error response).
    * A failAction value which determines how to handle failed validations. When set to a function, the err argument includes the type of validation error under err.output.payload.validation.source.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidatefailaction)
    */
  var failAction: js.UndefOr[FailAction] = js.undefined
  /**
    * Validation rules for incoming request headers:
    * * If a value is returned, the value is used as the new request.headers value and the original value is stored in request.orig.headers. Otherwise, the headers are left unchanged. If an error
    * is thrown, the error is handled according to failAction. Note that all header field names must be in lowercase to match the headers normalized by node.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidateheaders)
    * @default true
    */
  var headers: js.UndefOr[RouteOptionsResponseSchema] = js.undefined
  /**
    * An options object passed to the joi rules or the custom validation methods. Used for setting global options such as stripUnknown or abortEarly (the complete list is available here).
    * If a custom validation function (see headers, params, query, or payload above) is defined then options can an arbitrary object that will be passed to this function as the second parameter.
    * The values of the other inputs (i.e. headers, query, params, payload, app, and auth) are added to the options object under the validation context (accessible in rules as
    * Joi.ref('$query.key')).
    * Note that validation is performed in order (i.e. headers, params, query, and payload) and if type casting is used (e.g. converting a string to a number), the value of inputs not yet validated
    * will reflect the raw, unvalidated and unmodified values. If the validation rules for headers, params, query, and payload are defined at both the server routes level and at the route level, the
    * individual route settings override the routes defaults (the rules are not merged).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidateparams)
    * @default true
    */
  var options: js.UndefOr[ValidationOptions | js.Object] = js.undefined
  /**
    * Validation rules for incoming request path parameters, after matching the path against the route, extracting any parameters, and storing them in request.params, where:
    * * true - any path parameter value allowed (no validation performed).
    * * a joi validation object.
    * * a validation function using the signature async function(value, options) where:
    * * * value - the request.params object containing the request path parameters.
    * * * options - options.
    * if a value is returned, the value is used as the new request.params value and the original value is stored in request.orig.params. Otherwise, the path parameters are left unchanged. If an
    * error is thrown, the error is handled according to failAction. Note that failing to match the validation rules to the route path parameters definition will cause all requests to fail.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidateparams)
    * @default true
    */
  var params: js.UndefOr[RouteOptionsResponseSchema] = js.undefined
  /**
    * Validation rules for incoming request payload (request body), where:
    * * If a value is returned, the value is used as the new request.payload value and the original value is stored in request.orig.payload. Otherwise, the payload is left unchanged. If an error is
    * thrown, the error is handled according to failAction. Note that validating large payloads and modifying them will cause memory duplication of the payload (since the original is kept), as well
    * as the significant performance cost of validating large amounts of data.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidatepayload)
    * @default true
    */
  var payload: js.UndefOr[RouteOptionsResponseSchema] = js.undefined
  /**
    * Validation rules for incoming request URI query component (the key-value part of the URI between '?' and '#'). The query is parsed into its individual key-value pairs, decoded, and stored in
    * request.query prior to validation. Where:
    * * If a value is returned, the value is used as the new request.query value and the original value is stored in request.orig.query. Otherwise, the query parameters are left unchanged.
    * If an error
    * is thrown, the error is handled according to failAction. Note that changes to the query parameters will not be reflected in request.url.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsvalidatequery)
    * @default true
    */
  var query: js.UndefOr[RouteOptionsResponseSchema] = js.undefined
  /**
    * Validation rules for incoming cookies.
    * The cookie header is parsed and decoded into the request.state prior to validation.
    * @default true
    */
  var state: js.UndefOr[RouteOptionsResponseSchema] = js.undefined
}

object RouteOptionsValidate {
  @scala.inline
  def apply(
    errorFields: js.Object = null,
    failAction: FailAction = null,
    headers: RouteOptionsResponseSchema = null,
    options: ValidationOptions | js.Object = null,
    params: RouteOptionsResponseSchema = null,
    payload: RouteOptionsResponseSchema = null,
    query: RouteOptionsResponseSchema = null,
    state: RouteOptionsResponseSchema = null
  ): RouteOptionsValidate = {
    val __obj = js.Dynamic.literal()
    if (errorFields != null) __obj.updateDynamic("errorFields")(errorFields)
    if (failAction != null) __obj.updateDynamic("failAction")(failAction.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsValidate]
  }
}

