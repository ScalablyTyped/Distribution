package typings.lambdaPhi.lambdaModelMod

import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaModel extends js.Object {
  var _anyMethod: js.Any
  var _basePath: js.Any
  var _bodyProperty: js.Any
  var _callbackProperty: js.Any
  var _config: js.Any
  var _contextProperty: js.Any
  var _eventContextProperty: js.Any
  /**
    * Lambda Properties
    */
  var _eventProperty: js.Any
  var _handlerMethod: js.Any
  var _headersProperty: js.Any
  var _httpVerbs: js.Any
  var _instance: js.Any
  var _methodProperty: js.Any
  var _name: js.Any
  var _pathParams: js.Any
  var _pathParamsProperty: js.Any
  var _paths: js.Any
  /**
    * API Properties
    */
  var _postConstructorMethod: js.Any
  var _preLambdaCallbackMethod: js.Any
  var _preLambdaTimeoutMethod: js.Any
  var _preLambdaTimeoutTime: js.Any
  /**
    * Api Gateway Properties
    */
  var _queryParamsProperty: js.Any
  var _stageVariablesProperty: js.Any
  var anyMethod: js.Any
  var basePath: String
  var bodyProperty: js.Any
  var callbackProperty: js.Any
  var config: LambdaConfig
  var contextProperty: js.Any
  var eventContextProperty: js.Any
  var eventProperty: js.Any
  var handlerMethod: js.Any
  var headersProperty: js.Any
  var httpVerbs: js.Array[typings.lambdaPhi.httpVerbModelMod.default]
  var instance: js.Any
  var methodProperty: js.Any
  var name: js.Any
  var pathParams: js.Array[typings.lambdaPhi.pathParamModelMod.default]
  var pathParamsProperty: js.Any
  var paths: js.Array[typings.lambdaPhi.pathModelMod.default]
  var postConstructorMethod: js.Any
  var preLambdaCallbackMethod: String
  var preLambdaTimeoutMethod: String
  var preLambdaTimeoutTime: Double
  var queryParamsProperty: js.Any
  var stageVariablesProperty: js.Any
}

object LambdaModel {
  @scala.inline
  def apply(
    _anyMethod: js.Any,
    _basePath: js.Any,
    _bodyProperty: js.Any,
    _callbackProperty: js.Any,
    _config: js.Any,
    _contextProperty: js.Any,
    _eventContextProperty: js.Any,
    _eventProperty: js.Any,
    _handlerMethod: js.Any,
    _headersProperty: js.Any,
    _httpVerbs: js.Any,
    _instance: js.Any,
    _methodProperty: js.Any,
    _name: js.Any,
    _pathParams: js.Any,
    _pathParamsProperty: js.Any,
    _paths: js.Any,
    _postConstructorMethod: js.Any,
    _preLambdaCallbackMethod: js.Any,
    _preLambdaTimeoutMethod: js.Any,
    _preLambdaTimeoutTime: js.Any,
    _queryParamsProperty: js.Any,
    _stageVariablesProperty: js.Any,
    anyMethod: js.Any,
    basePath: String,
    bodyProperty: js.Any,
    callbackProperty: js.Any,
    config: LambdaConfig,
    contextProperty: js.Any,
    eventContextProperty: js.Any,
    eventProperty: js.Any,
    handlerMethod: js.Any,
    headersProperty: js.Any,
    httpVerbs: js.Array[typings.lambdaPhi.httpVerbModelMod.default],
    instance: js.Any,
    methodProperty: js.Any,
    name: js.Any,
    pathParams: js.Array[typings.lambdaPhi.pathParamModelMod.default],
    pathParamsProperty: js.Any,
    paths: js.Array[typings.lambdaPhi.pathModelMod.default],
    postConstructorMethod: js.Any,
    preLambdaCallbackMethod: String,
    preLambdaTimeoutMethod: String,
    preLambdaTimeoutTime: Double,
    queryParamsProperty: js.Any,
    stageVariablesProperty: js.Any
  ): LambdaModel = {
    val __obj = js.Dynamic.literal(_anyMethod = _anyMethod.asInstanceOf[js.Any], _basePath = _basePath.asInstanceOf[js.Any], _bodyProperty = _bodyProperty.asInstanceOf[js.Any], _callbackProperty = _callbackProperty.asInstanceOf[js.Any], _config = _config.asInstanceOf[js.Any], _contextProperty = _contextProperty.asInstanceOf[js.Any], _eventContextProperty = _eventContextProperty.asInstanceOf[js.Any], _eventProperty = _eventProperty.asInstanceOf[js.Any], _handlerMethod = _handlerMethod.asInstanceOf[js.Any], _headersProperty = _headersProperty.asInstanceOf[js.Any], _httpVerbs = _httpVerbs.asInstanceOf[js.Any], _instance = _instance.asInstanceOf[js.Any], _methodProperty = _methodProperty.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], _pathParams = _pathParams.asInstanceOf[js.Any], _pathParamsProperty = _pathParamsProperty.asInstanceOf[js.Any], _paths = _paths.asInstanceOf[js.Any], _postConstructorMethod = _postConstructorMethod.asInstanceOf[js.Any], _preLambdaCallbackMethod = _preLambdaCallbackMethod.asInstanceOf[js.Any], _preLambdaTimeoutMethod = _preLambdaTimeoutMethod.asInstanceOf[js.Any], _preLambdaTimeoutTime = _preLambdaTimeoutTime.asInstanceOf[js.Any], _queryParamsProperty = _queryParamsProperty.asInstanceOf[js.Any], _stageVariablesProperty = _stageVariablesProperty.asInstanceOf[js.Any], anyMethod = anyMethod.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], bodyProperty = bodyProperty.asInstanceOf[js.Any], callbackProperty = callbackProperty.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], contextProperty = contextProperty.asInstanceOf[js.Any], eventContextProperty = eventContextProperty.asInstanceOf[js.Any], eventProperty = eventProperty.asInstanceOf[js.Any], handlerMethod = handlerMethod.asInstanceOf[js.Any], headersProperty = headersProperty.asInstanceOf[js.Any], httpVerbs = httpVerbs.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], methodProperty = methodProperty.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pathParams = pathParams.asInstanceOf[js.Any], pathParamsProperty = pathParamsProperty.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], postConstructorMethod = postConstructorMethod.asInstanceOf[js.Any], preLambdaCallbackMethod = preLambdaCallbackMethod.asInstanceOf[js.Any], preLambdaTimeoutMethod = preLambdaTimeoutMethod.asInstanceOf[js.Any], preLambdaTimeoutTime = preLambdaTimeoutTime.asInstanceOf[js.Any], queryParamsProperty = queryParamsProperty.asInstanceOf[js.Any], stageVariablesProperty = stageVariablesProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaModel]
  }
}

