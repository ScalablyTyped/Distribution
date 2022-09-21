package typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HmsPushResultCodeEnum extends StObject
@JSImport("@hmscore/react-native-hms-push/src/HmsPushResultCode", "HmsPushResultCodeEnum")
@js.native
object HmsPushResultCodeEnum extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HmsPushResultCodeEnum & String] = js.native
  
  // Error
  @js.native
  sealed trait ERROR
    extends StObject
       with HmsPushResultCodeEnum
  /* "-1" */ val ERROR: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR & String = js.native
  
  // An error occurred when invoking an unspecified API.
  @js.native
  sealed trait ERROR_API_NOT_SPECIFIED
    extends StObject
       with HmsPushResultCodeEnum
  /* "1002" */ val ERROR_API_NOT_SPECIFIED: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_API_NOT_SPECIFIED & String = js.native
  
  /*The input parameter is incorrect. Check whether the related configuration information is correct.
    * Example =app_id in the agconnect - services.json file,
    * Check whether the build.gradle file is configured with the certificate signature.
    */
  @js.native
  sealed trait ERROR_ARGUMENTS_INVALID
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135000" */ val ERROR_ARGUMENTS_INVALID: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_ARGUMENTS_INVALID & String = js.native
  
  // The authentication information of the application does not exist.
  @js.native
  sealed trait ERROR_AUTH_INFO_NOT_EXIST
    extends StObject
       with HmsPushResultCodeEnum
  /* "6002" */ val ERROR_AUTH_INFO_NOT_EXIST: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_AUTH_INFO_NOT_EXIST & String = js.native
  
  // The SDK is being automatically initialized. Try again later.
  @js.native
  sealed trait ERROR_AUTO_INITIALIZING
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122054" */ val ERROR_AUTO_INITIALIZING: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_AUTO_INITIALIZING & String = js.native
  
  // Failed to bind the service.
  @js.native
  sealed trait ERROR_BIND_SERVICE_SELF_MAPPING
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122052" */ val ERROR_BIND_SERVICE_SELF_MAPPING: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_BIND_SERVICE_SELF_MAPPING & String = js.native
  
  /* The certificate fingerprint is not configured on the AppGallery Connect.
    * 1. Check whether your phone can access the Internet.
    * 2. Check whether the correct certificate fingerprint is configured in AppGallery Connect. For details, see AppGallery Connect configuration in Development Preparations.
    * 3. If the check result is correct, contact Huawei technical support.
    */
  @js.native
  sealed trait ERROR_CERT_FINGERPRINT_EMPTY
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135702" */ val ERROR_CERT_FINGERPRINT_EMPTY: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_CERT_FINGERPRINT_EMPTY & String = js.native
  
  // An error occurred during certificate fingerprint verification.
  // Check whether the correct certificate fingerprint is configured in AppGallery Connect. For details, see AppGallery Connect configuration in Development Preparations.
  @js.native
  sealed trait ERROR_CERT_FINGERPRINT_ERROR
    extends StObject
       with HmsPushResultCodeEnum
  /* "6003" */ val ERROR_CERT_FINGERPRINT_ERROR: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_CERT_FINGERPRINT_ERROR & String = js.native
  
  // The ApiClient object is invalid.
  @js.native
  sealed trait ERROR_CLIENT_API_INVALID
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135003" */ val ERROR_CLIENT_API_INVALID: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_CLIENT_API_INVALID & String = js.native
  
  // Invoking AIDL times out. Contact Huawei technical support.
  @js.native
  sealed trait ERROR_EXECUTE_TIMEOUT
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135004" */ val ERROR_EXECUTE_TIMEOUT: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_EXECUTE_TIMEOUT & String = js.native
  
  /* Failed to invoke the gateway to query the application scope.
    * Check whether the current app has been created and enabled in AppGallery Connect.
    * If yes, contact Huawei technical support.
    */
  @js.native
  sealed trait ERROR_GET_SCOPE_ERROR
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135700" */ val ERROR_GET_SCOPE_ERROR: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_GET_SCOPE_ERROR & String = js.native
  
  // Failed to apply for the token. Contact Huawei technical support.
  @js.native
  sealed trait ERROR_GET_TOKEN_ERR
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122037" */ val ERROR_GET_TOKEN_ERR: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_GET_TOKEN_ERR & String = js.native
  
  //  Huawei Mobile Services (APK) can't connect  Huawei Push  Kit.
  @js.native
  sealed trait ERROR_HMS_CLIENT_API
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122048" */ val ERROR_HMS_CLIENT_API: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_HMS_CLIENT_API & String = js.native
  
  // The device certificate authentication fails.
  @js.native
  sealed trait ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122051" */ val ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING & String = js.native
  
  // Internal Push error. Contact Huawei technical support engineers.
  @js.native
  sealed trait ERROR_INTERNAL_ERROR
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135001" */ val ERROR_INTERNAL_ERROR: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_INTERNAL_ERROR & String = js.native
  
  // The message contains invalid parameters.
  @js.native
  sealed trait ERROR_INVALID_PARAMETERS
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122042" */ val ERROR_INVALID_PARAMETERS: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_INVALID_PARAMETERS & String = js.native
  
  // The operation cannot be performed in the main thread.
  @js.native
  sealed trait ERROR_MAIN_THREAD
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122050" */ val ERROR_MAIN_THREAD: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_MAIN_THREAD & String = js.native
  
  // The service does not exist. The invoked interface does not exist.
  @js.native
  sealed trait ERROR_NAMING_INVALID
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135002" */ val ERROR_NAMING_INVALID: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_NAMING_INVALID & String = js.native
  
  // Failed to apply for a token. Cross-region token application is not allowed.
  @js.native
  sealed trait ERROR_NOT_ALLOW_CROSS_APPLY
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122053" */ val ERROR_NOT_ALLOW_CROSS_APPLY: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_NOT_ALLOW_CROSS_APPLY & String = js.native
  
  // The current area does not support this service.
  @js.native
  sealed trait ERROR_NOT_IN_SERVICE
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135005" */ val ERROR_NOT_IN_SERVICE: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_NOT_IN_SERVICE & String = js.native
  
  // The current network is unavailable. Check the network connection.
  @js.native
  sealed trait ERROR_NO_NETWORK
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122031" */ val ERROR_NO_NETWORK: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_NO_NETWORK & String = js.native
  
  // Push rights are not enabled. Enable the service and set push service parameters at AppGallery Connect.
  @js.native
  sealed trait ERROR_NO_RIGHT
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122036" */ val ERROR_NO_RIGHT: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_NO_RIGHT & String = js.native
  
  // You do not have a token. Apply for a token.
  @js.native
  sealed trait ERROR_NO_TOKEN
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122030" */ val ERROR_NO_TOKEN: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_NO_TOKEN & String = js.native
  
  // The current EMUI version is too early to use the capability.
  @js.native
  sealed trait ERROR_OPERATION_NOT_SUPPORTED
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122049" */ val ERROR_OPERATION_NOT_SUPPORTED: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_OPERATION_NOT_SUPPORTED & String = js.native
  
  // Interface authentication =The authorization expires.
  @js.native
  sealed trait ERROR_PERMISSION_EXPIRED
    extends StObject
       with HmsPushResultCodeEnum
  /* "6006" */ val ERROR_PERMISSION_EXPIRED: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_PERMISSION_EXPIRED & String = js.native
  
  // Permission is not configured on the AppGallery Connect.
  @js.native
  sealed trait ERROR_PERMISSION_LIST_EMPTY
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135703" */ val ERROR_PERMISSION_LIST_EMPTY: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_PERMISSION_LIST_EMPTY & String = js.native
  
  // Interface authentication =unauthorized.
  @js.native
  sealed trait ERROR_PERMISSION_NOT_AUTHORIZED
    extends StObject
       with HmsPushResultCodeEnum
  /* "6005" */ val ERROR_PERMISSION_NOT_AUTHORIZED: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_PERMISSION_NOT_AUTHORIZED & String = js.native
  
  // Interface authentication =The permission does not exist and is not applied for in AppGallery Connect.
  @js.native
  sealed trait ERROR_PERMISSION_NOT_EXIST
    extends StObject
       with HmsPushResultCodeEnum
  /* "6004" */ val ERROR_PERMISSION_NOT_EXIST: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_PERMISSION_NOT_EXIST & String = js.native
  
  // If the Push server returns an error, contact Huawei technical support.
  @js.native
  sealed trait ERROR_PUSH_SERVER
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122047" */ val ERROR_PUSH_SERVER: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_PUSH_SERVER & String = js.native
  
  /* Scope is not configured on the AppGallery Connect.
    * Check whether the current app has been created and enabled in AppGallery Connect.
    * If yes, contact Huawei technical support.
    */
  @js.native
  sealed trait ERROR_SCOPE_LIST_EMPTY
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135701" */ val ERROR_SCOPE_LIST_EMPTY: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_SCOPE_LIST_EMPTY & String = js.native
  
  // If the Push service is unavailable, contact Huawei technical support.
  @js.native
  sealed trait ERROR_SERVICE_NOT_AVAILABLE
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122046" */ val ERROR_SERVICE_NOT_AVAILABLE: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_SERVICE_NOT_AVAILABLE & String = js.native
  
  // If the AIDL connection session is invalid, contact Huawei technical support.
  @js.native
  sealed trait ERROR_SESSION_INVALID
    extends StObject
       with HmsPushResultCodeEnum
  /* "907135006" */ val ERROR_SESSION_INVALID: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_SESSION_INVALID & String = js.native
  
  // The message body size exceeds the maximum.
  @js.native
  sealed trait ERROR_SIZE
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122041" */ val ERROR_SIZE: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_SIZE & String = js.native
  
  // No storage location is selected for the application or the storage location is invalid.
  @js.native
  sealed trait ERROR_STORAGE_LOCATION_EMPTY
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122038" */ val ERROR_STORAGE_LOCATION_EMPTY: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_STORAGE_LOCATION_EMPTY & String = js.native
  
  // The token has expired. Delete the token and apply for a new one.
  @js.native
  sealed trait ERROR_TOKEN_INVALID
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122032" */ val ERROR_TOKEN_INVALID: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_TOKEN_INVALID & String = js.native
  
  // The number of sent messages reaches the upper limit. The messages will be discarded.
  @js.native
  sealed trait ERROR_TOO_MANY_MESSAGES
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122043" */ val ERROR_TOO_MANY_MESSAGES: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_TOO_MANY_MESSAGES & String = js.native
  
  // The number of subscribed topics exceeds 2000.
  @js.native
  sealed trait ERROR_TOPIC_EXCEED
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122034" */ val ERROR_TOPIC_EXCEED: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_TOPIC_EXCEED & String = js.native
  
  // Failed to send the subscription topic. Contact Huawei technical support.
  @js.native
  sealed trait ERROR_TOPIC_SEND
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122035" */ val ERROR_TOPIC_SEND: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_TOPIC_SEND & String = js.native
  
  // The message lifetime expires before the message is successfully sent to the APP server.
  @js.native
  sealed trait ERROR_TTL_EXCEEDED
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122044" */ val ERROR_TTL_EXCEEDED: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_TTL_EXCEEDED & String = js.native
  
  // Unknown error. Contact Huawei technical support.
  @js.native
  sealed trait ERROR_UNKNOWN
    extends StObject
       with HmsPushResultCodeEnum
  /* "907122045" */ val ERROR_UNKNOWN: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.ERROR_UNKNOWN & String = js.native
  
  // Bundle is null, exception
  @js.native
  sealed trait NULL_BUNDLE
    extends StObject
       with HmsPushResultCodeEnum
  /* "333" */ val NULL_BUNDLE: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.NULL_BUNDLE & String = js.native
  
  // Success
  @js.native
  sealed trait SUCCESS
    extends StObject
       with HmsPushResultCodeEnum
  /* "0" */ val SUCCESS: typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum.SUCCESS & String = js.native
}
