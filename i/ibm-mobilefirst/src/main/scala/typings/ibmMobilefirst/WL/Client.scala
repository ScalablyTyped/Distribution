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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AbstractChallengeHandlerMutableBuilder[Self <: AbstractChallengeHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleChallenge(value: js.Any => Boolean): Self = StObject.set(x, "handleChallenge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsCustomResponse(value: js.Any => Boolean): Self = StObject.set(x, "isCustomResponse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmitAdapterAuthentication(value: (ChallengehandlerInvocationData, ChallengeHandlerAuthenticationOptions) => Unit): Self = StObject.set(x, "submitAdapterAuthentication", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmitFailure(value: String => Unit): Self = StObject.set(x, "submitFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubmitLoginForm(
        value: (String, ChallengeHandlerSubmitLoginFormOptions, js.Function1[/* transport */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "submitLoginForm", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSubmitSuccess(value: () => Unit): Self = StObject.set(x, "submitSuccess", js.Any.fromFunction0(value))
    }
  }
  
  trait ChallengeHandlerAuthenticationOptions extends StObject
  
  trait ChallengeHandlerSubmitLoginFormOptions extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ChallengeHandlerSubmitLoginFormOptions {
    
    @scala.inline
    def apply(): ChallengeHandlerSubmitLoginFormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChallengeHandlerSubmitLoginFormOptions]
    }
    
    @scala.inline
    implicit class ChallengeHandlerSubmitLoginFormOptionsMutableBuilder[Self <: ChallengeHandlerSubmitLoginFormOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ChallengehandlerInvocationData extends StObject {
    
    var adapter: String
    
    var parameters: js.Array[js.Any]
    
    var procedure: String
  }
  object ChallengehandlerInvocationData {
    
    @scala.inline
    def apply(adapter: String, parameters: js.Array[js.Any], procedure: String): ChallengehandlerInvocationData = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChallengehandlerInvocationData]
    }
    
    @scala.inline
    implicit class ChallengehandlerInvocationDataMutableBuilder[Self <: ChallengehandlerInvocationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectOptions extends StObject {
    
    def onFailure(response: FailureResponse): Unit
    
    def onSuccess(response: ResponseBase): Unit
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectOptions {
    
    @scala.inline
    def apply(onFailure: FailureResponse => Unit, onSuccess: ResponseBase => Unit): ConnectOptions = {
      val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFailure(value: FailureResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuccess(value: ResponseBase => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait EventTransmissionPolicy extends StObject {
    
    var eventStorageEnabled: js.UndefOr[Boolean] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
  }
  object EventTransmissionPolicy {
    
    @scala.inline
    def apply(): EventTransmissionPolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventTransmissionPolicy]
    }
    
    @scala.inline
    implicit class EventTransmissionPolicyMutableBuilder[Self <: EventTransmissionPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventStorageEnabled(value: Boolean): Self = StObject.set(x, "eventStorageEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventStorageEnabledUndefined: Self = StObject.set(x, "eventStorageEnabled", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
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
    
    @scala.inline
    def apply(onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, Unit] => Unit): InitOptions = {
      val __obj = js.Dynamic.literal(onGetCustomDeviceProvisioningProperties = js.Any.fromFunction1(onGetCustomDeviceProvisioningProperties))
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit class InitOptionsMutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticator(value: js.Object): Self = StObject.set(x, "authenticator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticatorUndefined: Self = StObject.set(x, "authenticator", js.undefined)
      
      @scala.inline
      def setAutoHideSplash(value: Boolean): Self = StObject.set(x, "autoHideSplash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideSplashUndefined: Self = StObject.set(x, "autoHideSplash", js.undefined)
      
      @scala.inline
      def setConnectOnStartup(value: Boolean): Self = StObject.set(x, "connectOnStartup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectOnStartupUndefined: Self = StObject.set(x, "connectOnStartup", js.undefined)
      
      @scala.inline
      def setEnableLogger(value: Boolean): Self = StObject.set(x, "enableLogger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLoggerUndefined: Self = StObject.set(x, "enableLogger", js.undefined)
      
      @scala.inline
      def setHeartBeatIntervalInSecs(value: Double): Self = StObject.set(x, "heartBeatIntervalInSecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartBeatIntervalInSecsUndefined: Self = StObject.set(x, "heartBeatIntervalInSecs", js.undefined)
      
      @scala.inline
      def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setOnConnectionFailure(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onConnectionFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConnectionFailureUndefined: Self = StObject.set(x, "onConnectionFailure", js.undefined)
      
      @scala.inline
      def setOnDisabledCookies(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onDisabledCookies", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDisabledCookiesUndefined: Self = StObject.set(x, "onDisabledCookies", js.undefined)
      
      @scala.inline
      def setOnErrorAppVersionAccessDenial(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onErrorAppVersionAccessDenial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorAppVersionAccessDenialUndefined: Self = StObject.set(x, "onErrorAppVersionAccessDenial", js.undefined)
      
      @scala.inline
      def setOnErrorRemoteDisableDenial(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onErrorRemoteDisableDenial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorRemoteDisableDenialUndefined: Self = StObject.set(x, "onErrorRemoteDisableDenial", js.undefined)
      
      @scala.inline
      def setOnGetCustomDeviceProvisioningProperties(value: js.Function1[/* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "onGetCustomDeviceProvisioningProperties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRequestTimeout(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onRequestTimeout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRequestTimeoutUndefined: Self = StObject.set(x, "onRequestTimeout", js.undefined)
      
      @scala.inline
      def setOnUnsupportedBrowser(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onUnsupportedBrowser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnsupportedBrowserUndefined: Self = StObject.set(x, "onUnsupportedBrowser", js.undefined)
      
      @scala.inline
      def setOnUnsupportedVersion(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onUnsupportedVersion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUnsupportedVersionUndefined: Self = StObject.set(x, "onUnsupportedVersion", js.undefined)
      
      @scala.inline
      def setOnUserInstanceAccessViolation(value: /* response */ FailureResponse => Unit): Self = StObject.set(x, "onUserInstanceAccessViolation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserInstanceAccessViolationUndefined: Self = StObject.set(x, "onUserInstanceAccessViolation", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setValidateArguments(value: Boolean): Self = StObject.set(x, "validateArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateArgumentsUndefined: Self = StObject.set(x, "validateArguments", js.undefined)
    }
  }
  
  trait ProcedureInvocationData extends StObject {
    
    var adapter: String
    
    var compressResponse: js.UndefOr[Boolean] = js.undefined
    
    var parameters: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var procedure: String
  }
  object ProcedureInvocationData {
    
    @scala.inline
    def apply(adapter: String, procedure: String): ProcedureInvocationData = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureInvocationData]
    }
    
    @scala.inline
    implicit class ProcedureInvocationDataMutableBuilder[Self <: ProcedureInvocationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressResponse(value: Boolean): Self = StObject.set(x, "compressResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressResponseUndefined: Self = StObject.set(x, "compressResponse", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
      
      @scala.inline
      def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(onSuccess: ProcedureResponse => Unit, timeout: Double): ProcedureInvocationOptions = {
      val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction1(onSuccess), timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureInvocationOptions]
    }
    
    @scala.inline
    implicit class ProcedureInvocationOptionsMutableBuilder[Self <: ProcedureInvocationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSuccess(value: ProcedureResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcedureInvocationResult extends StObject {
    
    var errors: js.UndefOr[js.Array[String]] = js.undefined
    
    var isSuccessful: Boolean
  }
  object ProcedureInvocationResult {
    
    @scala.inline
    def apply(isSuccessful: Boolean): ProcedureInvocationResult = {
      val __obj = js.Dynamic.literal(isSuccessful = isSuccessful.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcedureInvocationResult]
    }
    
    @scala.inline
    implicit class ProcedureInvocationResultMutableBuilder[Self <: ProcedureInvocationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcedureResponse
    extends StObject
       with ResponseBase {
    
    var invocationResult: js.UndefOr[ProcedureInvocationResult] = js.undefined
    
    var parameters: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object ProcedureResponse {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ProcedureResponseMutableBuilder[Self <: ProcedureResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvocationResult(value: ProcedureInvocationResult): Self = StObject.set(x, "invocationResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationResultUndefined: Self = StObject.set(x, "invocationResult", js.undefined)
      
      @scala.inline
      def setParameters(value: js.Array[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setParametersVarargs(value: js.Any*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
  
  trait SharedTokenObject extends StObject {
    
    var key: String
  }
  object SharedTokenObject {
    
    @scala.inline
    def apply(key: String): SharedTokenObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedTokenObject]
    }
    
    @scala.inline
    implicit class SharedTokenObjectMutableBuilder[Self <: SharedTokenObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type UserPreferences = StringDictionary[String]
}
