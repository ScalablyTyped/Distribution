package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Client {
  
  trait AbstractChallengeHandler extends StObject {
    
    def handleChallenge(challenge: js.Any): Boolean
    
    def isCustomResponse(transport: js.Any): Boolean
    
    def submitAdapterAuthentication(invocationData: ChallengehandlerInvocationData, options: ChallengeHandlerAuthenticationOptions): Unit
    
    def submitFailure(error: String): Unit
    
    def submitLoginForm(
      reqURL: String,
      options: ChallengeHandlerSubmitLoginFormOptions,
      submitLoginFormCallback: js.Function1[/* transport */ js.Any, Unit]
    ): Unit
    
    def submitSuccess(): Unit
  }
  object AbstractChallengeHandler {
    
    inline def apply(
      handleChallenge: js.Any => Boolean,
      isCustomResponse: js.Any => Boolean,
      submitAdapterAuthentication: (ChallengehandlerInvocationData, ChallengeHandlerAuthenticationOptions) => Unit,
      submitFailure: String => Unit,
      submitLoginForm: (String, ChallengeHandlerSubmitLoginFormOptions, js.Function1[/* transport */ js.Any, Unit]) => Unit,
      submitSuccess: () => Unit
    ): AbstractChallengeHandler = {
      val __obj = js.Dynamic.literal(handleChallenge = js.Any.fromFunction1(handleChallenge), isCustomResponse = js.Any.fromFunction1(isCustomResponse), submitAdapterAuthentication = js.Any.fromFunction2(submitAdapterAuthentication), submitFailure = js.Any.fromFunction1(submitFailure), submitLoginForm = js.Any.fromFunction3(submitLoginForm), submitSuccess = js.Any.fromFunction0(submitSuccess))
      __obj.asInstanceOf[AbstractChallengeHandler]
    }
    
    extension [Self <: AbstractChallengeHandler](x: Self) {
      
      inline def setHandleChallenge(value: js.Any => Boolean): Self = StObject.set(x, "handleChallenge", js.Any.fromFunction1(value))
      
      inline def setIsCustomResponse(value: js.Any => Boolean): Self = StObject.set(x, "isCustomResponse", js.Any.fromFunction1(value))
      
      inline def setSubmitAdapterAuthentication(value: (ChallengehandlerInvocationData, ChallengeHandlerAuthenticationOptions) => Unit): Self = StObject.set(x, "submitAdapterAuthentication", js.Any.fromFunction2(value))
      
      inline def setSubmitFailure(value: String => Unit): Self = StObject.set(x, "submitFailure", js.Any.fromFunction1(value))
      
      inline def setSubmitLoginForm(
        value: (String, ChallengeHandlerSubmitLoginFormOptions, js.Function1[/* transport */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "submitLoginForm", js.Any.fromFunction3(value))
      
      inline def setSubmitSuccess(value: () => Unit): Self = StObject.set(x, "submitSuccess", js.Any.fromFunction0(value))
    }
  }
  
  trait ChallengeHandlerAuthenticationOptions extends StObject
  
  trait ChallengeHandlerSubmitLoginFormOptions extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ChallengeHandlerSubmitLoginFormOptions {
    
    inline def apply(): ChallengeHandlerSubmitLoginFormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeHandlerSubmitLoginFormOptions]
    }
    
    extension [Self <: ChallengeHandlerSubmitLoginFormOptions](x: Self) {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ChallengehandlerInvocationData extends StObject {
    
    var adapter: String
    
    var parameters: js.Array[js.Any]
    
    var procedure: String
  }
  object ChallengehandlerInvocationData {
    
    inline def apply(adapter: String, parameters: js.Array[js.Any], procedure: String): ChallengehandlerInvocationData = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengehandlerInvocationData]
    }
    
    extension [Self <: ChallengehandlerInvocationData](x: Self) {
      
      inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOptions extends StObject {
    
    def onFailure(response: FailureResponse): Unit
    
    def onSuccess(response: ResponseBase): Unit
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(onFailure: FailureResponse => Unit, onSuccess: ResponseBase => Unit): ConnectOptions = {
      val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
      __obj.asInstanceOf[ConnectOptions]
    }
    
    extension [Self <: ConnectOptions](x: Self) {
      
      inline def setOnFailure(value: FailureResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: ResponseBase => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait EventTransmissionPolicy extends StObject {
    
    var eventStorageEnabled: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
  }
  object EventTransmissionPolicy {
    
    inline def apply(): EventTransmissionPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTransmissionPolicy]
    }
    
    extension [Self <: EventTransmissionPolicy](x: Self) {
      
      inline def setEventStorageEnabled(value: Boolean): Self = StObject.set(x, "eventStorageEnabled", value.asInstanceOf[js.Any])
      
      inline def setEventStorageEnabledUndefined: Self = StObject.set(x, "eventStorageEnabled", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait InitOptions
    extends StObject
       with Options {
    
    var authenticator: js.UndefOr[js.Object] = js.undefined
    
    var autoHideSplash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated. If you would like your application to connect to the Worklight Server, use WL.Client.connect().
      */
    var connectOnStartup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated since version 6.2. Use WL.Logger.config function with an object specifying the level instead.
      */
    var enableLogger: js.UndefOr[Boolean] = js.undefined
    
    var heartBeatIntervalInSecs: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[String] = js.undefined
    
    var onConnectionFailure: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    var onDisabledCookies: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    /**
      * @deprecated since version 5.0.6. Instead, use onErrorRemoteDisableDenial.
      */
    var onErrorAppVersionAccessDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    var onErrorRemoteDisableDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    def onGetCustomDeviceProvisioningProperties(resumeDeviceProvisioningProcess: js.Function1[/* data */ js.Any, Unit]): Unit
    
    var onRequestTimeout: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    var onUnsupportedBrowser: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    var onUnsupportedVersion: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    var onUserInstanceAccessViolation: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var validateArguments: js.UndefOr[Boolean] = js.undefined
  }
  object InitOptions {
    
    inline def apply(onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, Unit] => Unit): InitOptions = {
      val __obj = js.Dynamic.literal(onGetCustomDeviceProvisioningProperties = js.Any.fromFunction1(onGetCustomDeviceProvisioningProperties))
      __obj.asInstanceOf[InitOptions]
    }
    
    extension [Self <: InitOptions](x: Self) {
      
      inline def setAuthenticator(value: js.Object): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
      
      inline def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
      
      inline def setAutoHideSplash(value: Boolean): Self = StObject.set(x, "autoHideSplash", value.asInstanceOf[js.Any])
      
      inline def setAutoHideSplashUndefined: Self = StObject.set(x, "autoHideSplash", js.undefined)
      
      inline def setConnectOnStartup(value: Boolean): Self = StObject.set(x, "connectOnStartup", value.asInstanceOf[js.Any])
      
      inline def setConnectOnStartupUndefined: Self = StObject.set(x, "connectOnStartup", js.undefined)
      
      inline def setEnableLogger(value: Boolean): Self = StObject.set(x, "enableLogger", value.asInstanceOf[js.Any])
      
      inline def setEnableLoggerUndefined: Self = StObject.set(x, "enableLogger", js.undefined)
      
      inline def setHeartBeatIntervalInSecs(value: Double): Self = StObject.set(x, "heartBeatIntervalInSecs", value.asInstanceOf[js.Any])
      
      inline def setHeartBeatIntervalInSecsUndefined: Self = StObject.set(x, "heartBeatIntervalInSecs", js.undefined)
      
      inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOnConnectionFailure(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onConnectionFailure", js.Any.fromFunction1(value))
      
      inline def setOnConnectionFailureUndefined: Self = StObject.set(x, "onConnectionFailure", js.undefined)
      
      inline def setOnDisabledCookies(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onDisabledCookies", js.Any.fromFunction1(value))
      
      inline def setOnDisabledCookiesUndefined: Self = StObject.set(x, "onDisabledCookies", js.undefined)
      
      inline def setOnErrorAppVersionAccessDenial(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onErrorAppVersionAccessDenial", js.Any.fromFunction1(value))
      
      inline def setOnErrorAppVersionAccessDenialUndefined: Self = StObject.set(x, "onErrorAppVersionAccessDenial", js.undefined)
      
      inline def setOnErrorRemoteDisableDenial(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onErrorRemoteDisableDenial", js.Any.fromFunction1(value))
      
      inline def setOnErrorRemoteDisableDenialUndefined: Self = StObject.set(x, "onErrorRemoteDisableDenial", js.undefined)
      
      inline def setOnGetCustomDeviceProvisioningProperties(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "onGetCustomDeviceProvisioningProperties", js.Any.fromFunction1(value))
      
      inline def setOnRequestTimeout(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onRequestTimeout", js.Any.fromFunction1(value))
      
      inline def setOnRequestTimeoutUndefined: Self = StObject.set(x, "onRequestTimeout", js.undefined)
      
      inline def setOnUnsupportedBrowser(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onUnsupportedBrowser", js.Any.fromFunction1(value))
      
      inline def setOnUnsupportedBrowserUndefined: Self = StObject.set(x, "onUnsupportedBrowser", js.undefined)
      
      inline def setOnUnsupportedVersion(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onUnsupportedVersion", js.Any.fromFunction1(value))
      
      inline def setOnUnsupportedVersionUndefined: Self = StObject.set(x, "onUnsupportedVersion", js.undefined)
      
      inline def setOnUserInstanceAccessViolation(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onUserInstanceAccessViolation", js.Any.fromFunction1(value))
      
      inline def setOnUserInstanceAccessViolationUndefined: Self = StObject.set(x, "onUserInstanceAccessViolation", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setValidateArguments(value: Boolean): Self = StObject.set(x, "validateArguments", value.asInstanceOf[js.Any])
      
      inline def setValidateArgumentsUndefined: Self = StObject.set(x, "validateArguments", js.undefined)
    }
  }
  
  trait ProcedureInvocationData extends StObject {
    
    var adapter: String
    
    var compressResponse: js.UndefOr[Boolean] = js.undefined
    
    var parameters: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var procedure: String
  }
  object ProcedureInvocationData {
    
    inline def apply(adapter: String, procedure: String): ProcedureInvocationData = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureInvocationData]
    }
    
    extension [Self <: ProcedureInvocationData](x: Self) {
      
      inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setCompressResponse(value: Boolean): Self = StObject.set(x, "compressResponse", value.asInstanceOf[js.Any])
      
      inline def setCompressResponseUndefined: Self = StObject.set(x, "compressResponse", js.undefined)
      
      inline def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcedureInvocationOptions
    extends StObject
       with Options {
    
    @JSName("onSuccess")
    def onSuccess_MProcedureInvocationOptions(response: ProcedureResponse): Unit
    
    var timeout: Double
  }
  object ProcedureInvocationOptions {
    
    inline def apply(onSuccess: ProcedureResponse => Unit, timeout: Double): ProcedureInvocationOptions = {
      val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess), timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureInvocationOptions]
    }
    
    extension [Self <: ProcedureInvocationOptions](x: Self) {
      
      inline def setOnSuccess(value: ProcedureResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcedureInvocationResult extends StObject {
    
    var errors: js.UndefOr[js.Array[String]] = js.undefined
    
    var isSuccessful: Boolean
  }
  object ProcedureInvocationResult {
    
    inline def apply(isSuccessful: Boolean): ProcedureInvocationResult = {
      val __obj = js.Dynamic.literal(isSuccessful = isSuccessful.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureInvocationResult]
    }
    
    extension [Self <: ProcedureInvocationResult](x: Self) {
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcedureResponse
    extends StObject
       with ResponseBase {
    
    var invocationResult: js.UndefOr[ProcedureInvocationResult] = js.undefined
    
    var parameters: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object ProcedureResponse {
    
    inline def apply(
      errorCode: Double,
      errorMsg: String,
      headerJSON: StringDictionary[js.Any],
      invocationContext: js.Any,
      readyState: Double,
      request: js.Any,
      responseJSON: StringDictionary[js.Any],
      responseText: String,
      responseXML: String,
      status: Double,
      statusText: String
    ): ProcedureResponse = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], headerJSON = headerJSON.asInstanceOf[js.Any], invocationContext = invocationContext.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], responseJSON = responseJSON.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], responseXML = responseXML.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureResponse]
    }
    
    extension [Self <: ProcedureResponse](x: Self) {
      
      inline def setInvocationResult(value: ProcedureInvocationResult): Self = StObject.set(x, "invocationResult", value.asInstanceOf[js.Any])
      
      inline def setInvocationResultUndefined: Self = StObject.set(x, "invocationResult", js.undefined)
      
      inline def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
  
  trait SharedTokenObject extends StObject {
    
    var key: String
  }
  object SharedTokenObject {
    
    inline def apply(key: String): SharedTokenObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedTokenObject]
    }
    
    extension [Self <: SharedTokenObject](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type UserPreferences = StringDictionary[String]
}
