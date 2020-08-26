package typings.lambdaPhi.lambdaModelMod

import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaModel extends js.Object {
  var _anyMethod: js.Any = js.native
  var _basePath: js.Any = js.native
  var _bodyProperty: js.Any = js.native
  var _callbackProperty: js.Any = js.native
  var _config: js.Any = js.native
  var _contextProperty: js.Any = js.native
  var _eventContextProperty: js.Any = js.native
  /**
    * Lambda Properties
    */
  var _eventProperty: js.Any = js.native
  var _handlerMethod: js.Any = js.native
  var _headersProperty: js.Any = js.native
  var _httpVerbs: js.Any = js.native
  var _instance: js.Any = js.native
  var _methodProperty: js.Any = js.native
  var _name: js.Any = js.native
  var _pathParams: js.Any = js.native
  var _pathParamsProperty: js.Any = js.native
  var _paths: js.Any = js.native
  /**
    * API Properties
    */
  var _postConstructorMethod: js.Any = js.native
  var _preLambdaCallbackMethod: js.Any = js.native
  var _preLambdaTimeoutMethod: js.Any = js.native
  var _preLambdaTimeoutTime: js.Any = js.native
  /**
    * Api Gateway Properties
    */
  var _queryParamsProperty: js.Any = js.native
  var _stageVariablesProperty: js.Any = js.native
  var anyMethod: js.Any = js.native
  var basePath: String = js.native
  var bodyProperty: js.Any = js.native
  var callbackProperty: js.Any = js.native
  var config: LambdaConfig = js.native
  var contextProperty: js.Any = js.native
  var eventContextProperty: js.Any = js.native
  var eventProperty: js.Any = js.native
  var handlerMethod: js.Any = js.native
  var headersProperty: js.Any = js.native
  var httpVerbs: js.Array[typings.lambdaPhi.httpVerbModelMod.default] = js.native
  var instance: js.Any = js.native
  var methodProperty: js.Any = js.native
  var name: js.Any = js.native
  var pathParams: js.Array[typings.lambdaPhi.pathParamModelMod.default] = js.native
  var pathParamsProperty: js.Any = js.native
  var paths: js.Array[typings.lambdaPhi.pathModelMod.default] = js.native
  var postConstructorMethod: js.Any = js.native
  var preLambdaCallbackMethod: String = js.native
  var preLambdaTimeoutMethod: String = js.native
  var preLambdaTimeoutTime: Double = js.native
  var queryParamsProperty: js.Any = js.native
  var stageVariablesProperty: js.Any = js.native
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
  @scala.inline
  implicit class LambdaModelOps[Self <: LambdaModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_anyMethod(value: js.Any): Self = this.set("_anyMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def set_basePath(value: js.Any): Self = this.set("_basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def set_bodyProperty(value: js.Any): Self = this.set("_bodyProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_callbackProperty(value: js.Any): Self = this.set("_callbackProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_config(value: js.Any): Self = this.set("_config", value.asInstanceOf[js.Any])
    @scala.inline
    def set_contextProperty(value: js.Any): Self = this.set("_contextProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_eventContextProperty(value: js.Any): Self = this.set("_eventContextProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_eventProperty(value: js.Any): Self = this.set("_eventProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_handlerMethod(value: js.Any): Self = this.set("_handlerMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def set_headersProperty(value: js.Any): Self = this.set("_headersProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_httpVerbs(value: js.Any): Self = this.set("_httpVerbs", value.asInstanceOf[js.Any])
    @scala.inline
    def set_instance(value: js.Any): Self = this.set("_instance", value.asInstanceOf[js.Any])
    @scala.inline
    def set_methodProperty(value: js.Any): Self = this.set("_methodProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_name(value: js.Any): Self = this.set("_name", value.asInstanceOf[js.Any])
    @scala.inline
    def set_pathParams(value: js.Any): Self = this.set("_pathParams", value.asInstanceOf[js.Any])
    @scala.inline
    def set_pathParamsProperty(value: js.Any): Self = this.set("_pathParamsProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_paths(value: js.Any): Self = this.set("_paths", value.asInstanceOf[js.Any])
    @scala.inline
    def set_postConstructorMethod(value: js.Any): Self = this.set("_postConstructorMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def set_preLambdaCallbackMethod(value: js.Any): Self = this.set("_preLambdaCallbackMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def set_preLambdaTimeoutMethod(value: js.Any): Self = this.set("_preLambdaTimeoutMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def set_preLambdaTimeoutTime(value: js.Any): Self = this.set("_preLambdaTimeoutTime", value.asInstanceOf[js.Any])
    @scala.inline
    def set_queryParamsProperty(value: js.Any): Self = this.set("_queryParamsProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def set_stageVariablesProperty(value: js.Any): Self = this.set("_stageVariablesProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnyMethod(value: js.Any): Self = this.set("anyMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyProperty(value: js.Any): Self = this.set("bodyProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackProperty(value: js.Any): Self = this.set("callbackProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: LambdaConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextProperty(value: js.Any): Self = this.set("contextProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventContextProperty(value: js.Any): Self = this.set("eventContextProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventProperty(value: js.Any): Self = this.set("eventProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandlerMethod(value: js.Any): Self = this.set("handlerMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersProperty(value: js.Any): Self = this.set("headersProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVerbsVarargs(value: typings.lambdaPhi.httpVerbModelMod.default*): Self = this.set("httpVerbs", js.Array(value :_*))
    @scala.inline
    def setHttpVerbs(value: js.Array[typings.lambdaPhi.httpVerbModelMod.default]): Self = this.set("httpVerbs", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: js.Any): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodProperty(value: js.Any): Self = this.set("methodProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathParamsVarargs(value: typings.lambdaPhi.pathParamModelMod.default*): Self = this.set("pathParams", js.Array(value :_*))
    @scala.inline
    def setPathParams(value: js.Array[typings.lambdaPhi.pathParamModelMod.default]): Self = this.set("pathParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathParamsProperty(value: js.Any): Self = this.set("pathParamsProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathsVarargs(value: typings.lambdaPhi.pathModelMod.default*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[typings.lambdaPhi.pathModelMod.default]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostConstructorMethod(value: js.Any): Self = this.set("postConstructorMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreLambdaCallbackMethod(value: String): Self = this.set("preLambdaCallbackMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreLambdaTimeoutMethod(value: String): Self = this.set("preLambdaTimeoutMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreLambdaTimeoutTime(value: Double): Self = this.set("preLambdaTimeoutTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParamsProperty(value: js.Any): Self = this.set("queryParamsProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageVariablesProperty(value: js.Any): Self = this.set("stageVariablesProperty", value.asInstanceOf[js.Any])
  }
  
}

