package typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod

import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`-1`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`0`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`1002`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`333`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`6002`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`6003`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`6004`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`6005`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`6006`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122030`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122031`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122032`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122034`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122035`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122036`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122037`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122038`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122041`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122042`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122043`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122044`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122045`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122046`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122047`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122048`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122049`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122050`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122051`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122052`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122053`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907122054`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135000`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135001`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135002`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135003`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135004`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135005`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135006`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135700`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135701`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135702`
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.`907135703`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmsPushResultCodeInterface extends StObject {
  
  // Error
  var ERROR: `-1`
  
  // An error occurred when invoking an unspecified API.
  var ERROR_API_NOT_SPECIFIED: `1002`
  
  /*The input parameter is incorrect. Check whether the related configuration information is correct.
    * Example =app_id in the agconnect - services.json file;
    * Check whether the build.gradle file is configured with the certificate signature.
    */
  var ERROR_ARGUMENTS_INVALID: `907135000`
  
  // The authentication information of the application does not exist.
  var ERROR_AUTH_INFO_NOT_EXIST: `6002`
  
  // The SDK is being automatically initialized. Try again later.
  var ERROR_AUTO_INITIALIZING: `907122054`
  
  // Failed to bind the service.
  var ERROR_BIND_SERVICE_SELF_MAPPING: `907122052`
  
  /* The certificate fingerprint is not configured on the AppGallery Connect.
    * 1. Check whether your phone can access the Internet.
    * 2. Check whether the correct certificate fingerprint is configured in AppGallery Connect. For details; see AppGallery Connect configuration in Development Preparations.
    * 3. If the check result is correct; contact Huawei technical support.
    */
  var ERROR_CERT_FINGERPRINT_EMPTY: `907135702`
  
  // An error occurred during certificate fingerprint verification.
  // Check whether the correct certificate fingerprint is configured in AppGallery Connect. For details; see AppGallery Connect configuration in Development Preparations.
  var ERROR_CERT_FINGERPRINT_ERROR: `6003`
  
  // The ApiClient object is invalid.
  var ERROR_CLIENT_API_INVALID: `907135003`
  
  // Invoking AIDL times out. Contact Huawei technical support.
  var ERROR_EXECUTE_TIMEOUT: `907135004`
  
  /* Failed to invoke the gateway to query the application scope.
    * Check whether the current app has been created and enabled in AppGallery Connect.
    * If yes; contact Huawei technical support.
    */
  var ERROR_GET_SCOPE_ERROR: `907135700`
  
  // Failed to apply for the token. Contact Huawei technical support.
  var ERROR_GET_TOKEN_ERR: `907122037`
  
  //  Huawei Mobile Services (APK) can't connect  Huawei Push  Kit.
  var ERROR_HMS_CLIENT_API: `907122048`
  
  // The device certificate authentication fails.
  var ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING: `907122051`
  
  // Internal Push error. Contact Huawei technical support engineers.
  var ERROR_INTERNAL_ERROR: `907135001`
  
  // The message contains invalid parameters.
  var ERROR_INVALID_PARAMETERS: `907122042`
  
  // The operation cannot be performed in the main thread.
  var ERROR_MAIN_THREAD: `907122050`
  
  // The service does not exist. The invoked interface does not exist.
  var ERROR_NAMING_INVALID: `907135002`
  
  // Failed to apply for a token. Cross-region token application is not allowed.
  var ERROR_NOT_ALLOW_CROSS_APPLY: `907122053`
  
  // The current area does not support this service.
  var ERROR_NOT_IN_SERVICE: `907135005`
  
  // The current network is unavailable. Check the network connection.
  var ERROR_NO_NETWORK: `907122031`
  
  // Push rights are not enabled. Enable the service and set push service parameters at AppGallery Connect.
  var ERROR_NO_RIGHT: `907122036`
  
  // You do not have a token. Apply for a token.
  var ERROR_NO_TOKEN: `907122030`
  
  // The current EMUI version is too early to use the capability.
  var ERROR_OPERATION_NOT_SUPPORTED: `907122049`
  
  // Interface authentication =The authorization expires.
  var ERROR_PERMISSION_EXPIRED: `6006`
  
  // Permission is not configured on the AppGallery Connect.
  var ERROR_PERMISSION_LIST_EMPTY: `907135703`
  
  // Interface authentication =unauthorized.
  var ERROR_PERMISSION_NOT_AUTHORIZED: `6005`
  
  // Interface authentication =The permission does not exist and is not applied for in AppGallery Connect.
  var ERROR_PERMISSION_NOT_EXIST: `6004`
  
  // If the Push server returns an error; contact Huawei technical support.
  var ERROR_PUSH_SERVER: `907122047`
  
  /* Scope is not configured on the AppGallery Connect.
    * Check whether the current app has been created and enabled in AppGallery Connect.
    * If yes; contact Huawei technical support.
    */
  var ERROR_SCOPE_LIST_EMPTY: `907135701`
  
  // If the Push service is unavailable; contact Huawei technical support.
  var ERROR_SERVICE_NOT_AVAILABLE: `907122046`
  
  // If the AIDL connection session is invalid; contact Huawei technical support.
  var ERROR_SESSION_INVALID: `907135006`
  
  // The message body size exceeds the maximum.
  var ERROR_SIZE: `907122041`
  
  // No storage location is selected for the application or the storage location is invalid.
  var ERROR_STORAGE_LOCATION_EMPTY: `907122038`
  
  // The token has expired. Delete the token and apply for a new one.
  var ERROR_TOKEN_INVALID: `907122032`
  
  // The number of sent messages reaches the upper limit. The messages will be discarded.
  var ERROR_TOO_MANY_MESSAGES: `907122043`
  
  // The number of subscribed topics exceeds 2000.
  var ERROR_TOPIC_EXCEED: `907122034`
  
  // Failed to send the subscription topic. Contact Huawei technical support.
  var ERROR_TOPIC_SEND: `907122035`
  
  // The message lifetime expires before the message is successfully sent to the APP server.
  var ERROR_TTL_EXCEEDED: `907122044`
  
  // Unknown error. Contact Huawei technical support.
  var ERROR_UNKNOWN: `907122045`
  
  // Bundle is null; exception
  var NULL_BUNDLE: `333`
  
  // Success
  var SUCCESS: `0`
}
object HmsPushResultCodeInterface {
  
  inline def apply(): HmsPushResultCodeInterface = {
    val __obj = js.Dynamic.literal(ERROR = "-1", ERROR_API_NOT_SPECIFIED = "1002", ERROR_ARGUMENTS_INVALID = "907135000", ERROR_AUTH_INFO_NOT_EXIST = "6002", ERROR_AUTO_INITIALIZING = "907122054", ERROR_BIND_SERVICE_SELF_MAPPING = "907122052", ERROR_CERT_FINGERPRINT_EMPTY = "907135702", ERROR_CERT_FINGERPRINT_ERROR = "6003", ERROR_CLIENT_API_INVALID = "907135003", ERROR_EXECUTE_TIMEOUT = "907135004", ERROR_GET_SCOPE_ERROR = "907135700", ERROR_GET_TOKEN_ERR = "907122037", ERROR_HMS_CLIENT_API = "907122048", ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING = "907122051", ERROR_INTERNAL_ERROR = "907135001", ERROR_INVALID_PARAMETERS = "907122042", ERROR_MAIN_THREAD = "907122050", ERROR_NAMING_INVALID = "907135002", ERROR_NOT_ALLOW_CROSS_APPLY = "907122053", ERROR_NOT_IN_SERVICE = "907135005", ERROR_NO_NETWORK = "907122031", ERROR_NO_RIGHT = "907122036", ERROR_NO_TOKEN = "907122030", ERROR_OPERATION_NOT_SUPPORTED = "907122049", ERROR_PERMISSION_EXPIRED = "6006", ERROR_PERMISSION_LIST_EMPTY = "907135703", ERROR_PERMISSION_NOT_AUTHORIZED = "6005", ERROR_PERMISSION_NOT_EXIST = "6004", ERROR_PUSH_SERVER = "907122047", ERROR_SCOPE_LIST_EMPTY = "907135701", ERROR_SERVICE_NOT_AVAILABLE = "907122046", ERROR_SESSION_INVALID = "907135006", ERROR_SIZE = "907122041", ERROR_STORAGE_LOCATION_EMPTY = "907122038", ERROR_TOKEN_INVALID = "907122032", ERROR_TOO_MANY_MESSAGES = "907122043", ERROR_TOPIC_EXCEED = "907122034", ERROR_TOPIC_SEND = "907122035", ERROR_TTL_EXCEEDED = "907122044", ERROR_UNKNOWN = "907122045", NULL_BUNDLE = "333", SUCCESS = "0")
    __obj.asInstanceOf[HmsPushResultCodeInterface]
  }
  
  extension [Self <: HmsPushResultCodeInterface](x: Self) {
    
    inline def setERROR(value: `-1`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setERROR_API_NOT_SPECIFIED(value: `1002`): Self = StObject.set(x, "ERROR_API_NOT_SPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setERROR_ARGUMENTS_INVALID(value: `907135000`): Self = StObject.set(x, "ERROR_ARGUMENTS_INVALID", value.asInstanceOf[js.Any])
    
    inline def setERROR_AUTH_INFO_NOT_EXIST(value: `6002`): Self = StObject.set(x, "ERROR_AUTH_INFO_NOT_EXIST", value.asInstanceOf[js.Any])
    
    inline def setERROR_AUTO_INITIALIZING(value: `907122054`): Self = StObject.set(x, "ERROR_AUTO_INITIALIZING", value.asInstanceOf[js.Any])
    
    inline def setERROR_BIND_SERVICE_SELF_MAPPING(value: `907122052`): Self = StObject.set(x, "ERROR_BIND_SERVICE_SELF_MAPPING", value.asInstanceOf[js.Any])
    
    inline def setERROR_CERT_FINGERPRINT_EMPTY(value: `907135702`): Self = StObject.set(x, "ERROR_CERT_FINGERPRINT_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setERROR_CERT_FINGERPRINT_ERROR(value: `6003`): Self = StObject.set(x, "ERROR_CERT_FINGERPRINT_ERROR", value.asInstanceOf[js.Any])
    
    inline def setERROR_CLIENT_API_INVALID(value: `907135003`): Self = StObject.set(x, "ERROR_CLIENT_API_INVALID", value.asInstanceOf[js.Any])
    
    inline def setERROR_EXECUTE_TIMEOUT(value: `907135004`): Self = StObject.set(x, "ERROR_EXECUTE_TIMEOUT", value.asInstanceOf[js.Any])
    
    inline def setERROR_GET_SCOPE_ERROR(value: `907135700`): Self = StObject.set(x, "ERROR_GET_SCOPE_ERROR", value.asInstanceOf[js.Any])
    
    inline def setERROR_GET_TOKEN_ERR(value: `907122037`): Self = StObject.set(x, "ERROR_GET_TOKEN_ERR", value.asInstanceOf[js.Any])
    
    inline def setERROR_HMS_CLIENT_API(value: `907122048`): Self = StObject.set(x, "ERROR_HMS_CLIENT_API", value.asInstanceOf[js.Any])
    
    inline def setERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING(value: `907122051`): Self = StObject.set(x, "ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING", value.asInstanceOf[js.Any])
    
    inline def setERROR_INTERNAL_ERROR(value: `907135001`): Self = StObject.set(x, "ERROR_INTERNAL_ERROR", value.asInstanceOf[js.Any])
    
    inline def setERROR_INVALID_PARAMETERS(value: `907122042`): Self = StObject.set(x, "ERROR_INVALID_PARAMETERS", value.asInstanceOf[js.Any])
    
    inline def setERROR_MAIN_THREAD(value: `907122050`): Self = StObject.set(x, "ERROR_MAIN_THREAD", value.asInstanceOf[js.Any])
    
    inline def setERROR_NAMING_INVALID(value: `907135002`): Self = StObject.set(x, "ERROR_NAMING_INVALID", value.asInstanceOf[js.Any])
    
    inline def setERROR_NOT_ALLOW_CROSS_APPLY(value: `907122053`): Self = StObject.set(x, "ERROR_NOT_ALLOW_CROSS_APPLY", value.asInstanceOf[js.Any])
    
    inline def setERROR_NOT_IN_SERVICE(value: `907135005`): Self = StObject.set(x, "ERROR_NOT_IN_SERVICE", value.asInstanceOf[js.Any])
    
    inline def setERROR_NO_NETWORK(value: `907122031`): Self = StObject.set(x, "ERROR_NO_NETWORK", value.asInstanceOf[js.Any])
    
    inline def setERROR_NO_RIGHT(value: `907122036`): Self = StObject.set(x, "ERROR_NO_RIGHT", value.asInstanceOf[js.Any])
    
    inline def setERROR_NO_TOKEN(value: `907122030`): Self = StObject.set(x, "ERROR_NO_TOKEN", value.asInstanceOf[js.Any])
    
    inline def setERROR_OPERATION_NOT_SUPPORTED(value: `907122049`): Self = StObject.set(x, "ERROR_OPERATION_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    inline def setERROR_PERMISSION_EXPIRED(value: `6006`): Self = StObject.set(x, "ERROR_PERMISSION_EXPIRED", value.asInstanceOf[js.Any])
    
    inline def setERROR_PERMISSION_LIST_EMPTY(value: `907135703`): Self = StObject.set(x, "ERROR_PERMISSION_LIST_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setERROR_PERMISSION_NOT_AUTHORIZED(value: `6005`): Self = StObject.set(x, "ERROR_PERMISSION_NOT_AUTHORIZED", value.asInstanceOf[js.Any])
    
    inline def setERROR_PERMISSION_NOT_EXIST(value: `6004`): Self = StObject.set(x, "ERROR_PERMISSION_NOT_EXIST", value.asInstanceOf[js.Any])
    
    inline def setERROR_PUSH_SERVER(value: `907122047`): Self = StObject.set(x, "ERROR_PUSH_SERVER", value.asInstanceOf[js.Any])
    
    inline def setERROR_SCOPE_LIST_EMPTY(value: `907135701`): Self = StObject.set(x, "ERROR_SCOPE_LIST_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setERROR_SERVICE_NOT_AVAILABLE(value: `907122046`): Self = StObject.set(x, "ERROR_SERVICE_NOT_AVAILABLE", value.asInstanceOf[js.Any])
    
    inline def setERROR_SESSION_INVALID(value: `907135006`): Self = StObject.set(x, "ERROR_SESSION_INVALID", value.asInstanceOf[js.Any])
    
    inline def setERROR_SIZE(value: `907122041`): Self = StObject.set(x, "ERROR_SIZE", value.asInstanceOf[js.Any])
    
    inline def setERROR_STORAGE_LOCATION_EMPTY(value: `907122038`): Self = StObject.set(x, "ERROR_STORAGE_LOCATION_EMPTY", value.asInstanceOf[js.Any])
    
    inline def setERROR_TOKEN_INVALID(value: `907122032`): Self = StObject.set(x, "ERROR_TOKEN_INVALID", value.asInstanceOf[js.Any])
    
    inline def setERROR_TOO_MANY_MESSAGES(value: `907122043`): Self = StObject.set(x, "ERROR_TOO_MANY_MESSAGES", value.asInstanceOf[js.Any])
    
    inline def setERROR_TOPIC_EXCEED(value: `907122034`): Self = StObject.set(x, "ERROR_TOPIC_EXCEED", value.asInstanceOf[js.Any])
    
    inline def setERROR_TOPIC_SEND(value: `907122035`): Self = StObject.set(x, "ERROR_TOPIC_SEND", value.asInstanceOf[js.Any])
    
    inline def setERROR_TTL_EXCEEDED(value: `907122044`): Self = StObject.set(x, "ERROR_TTL_EXCEEDED", value.asInstanceOf[js.Any])
    
    inline def setERROR_UNKNOWN(value: `907122045`): Self = StObject.set(x, "ERROR_UNKNOWN", value.asInstanceOf[js.Any])
    
    inline def setNULL_BUNDLE(value: `333`): Self = StObject.set(x, "NULL_BUNDLE", value.asInstanceOf[js.Any])
    
    inline def setSUCCESS(value: `0`): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
  }
}
