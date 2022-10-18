package typings.matrixBotSdk.mod

import typings.matrixBotSdk.matrixBotSdkBooleans.`true`
import typings.matrixBotSdk.matrixBotSdkStrings.DELETE
import typings.matrixBotSdk.matrixBotSdkStrings.GET
import typings.matrixBotSdk.matrixBotSdkStrings.POST
import typings.matrixBotSdk.matrixBotSdkStrings.PUT
import typings.matrixBotSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def METRIC_IDENTITY_CLIENT_FAILED_FUNCTION_CALL: /* "identity_client_failed_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_IDENTITY_CLIENT_FAILED_FUNCTION_CALL").asInstanceOf[/* "identity_client_failed_function_call" */ String]

inline def METRIC_IDENTITY_CLIENT_FUNCTION_CALL: /* "identity_client_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_IDENTITY_CLIENT_FUNCTION_CALL").asInstanceOf[/* "identity_client_function_call" */ String]

inline def METRIC_IDENTITY_CLIENT_SUCCESSFUL_FUNCTION_CALL: /* "identity_client_successful_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_IDENTITY_CLIENT_SUCCESSFUL_FUNCTION_CALL").asInstanceOf[/* "identity_client_successful_function_call" */ String]

inline def METRIC_INTENT_FAILED_FUNCTION_CALL: /* "intent_failed_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_INTENT_FAILED_FUNCTION_CALL").asInstanceOf[/* "intent_failed_function_call" */ String]

inline def METRIC_INTENT_FUNCTION_CALL: /* "intent_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_INTENT_FUNCTION_CALL").asInstanceOf[/* "intent_function_call" */ String]

inline def METRIC_INTENT_SUCCESSFUL_FUNCTION_CALL: /* "intent_successful_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_INTENT_SUCCESSFUL_FUNCTION_CALL").asInstanceOf[/* "intent_successful_function_call" */ String]

inline def METRIC_MATRIX_CLIENT_FAILED_FUNCTION_CALL: /* "matrix_client_failed_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_MATRIX_CLIENT_FAILED_FUNCTION_CALL").asInstanceOf[/* "matrix_client_failed_function_call" */ String]

inline def METRIC_MATRIX_CLIENT_FUNCTION_CALL: /* "matrix_client_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_MATRIX_CLIENT_FUNCTION_CALL").asInstanceOf[/* "matrix_client_function_call" */ String]

inline def METRIC_MATRIX_CLIENT_SUCCESSFUL_FUNCTION_CALL: /* "matrix_client_successful_function_call" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("METRIC_MATRIX_CLIENT_SUCCESSFUL_FUNCTION_CALL").asInstanceOf[/* "matrix_client_successful_function_call" */ String]

inline def REMOTE_ROOM_INFO_ACCOUNT_DATA_EVENT_TYPE: /* "io.t2bot.sdk.bot.remote_room_info" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REMOTE_ROOM_INFO_ACCOUNT_DATA_EVENT_TYPE").asInstanceOf[/* "io.t2bot.sdk.bot.remote_room_info" */ String]

inline def REMOTE_ROOM_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX: /* "io.t2bot.sdk.bot.remote_room_map" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REMOTE_ROOM_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX").asInstanceOf[/* "io.t2bot.sdk.bot.remote_room_map" */ String]

inline def REMOTE_USER_INFO_ACCOUNT_DATA_EVENT_TYPE: /* "io.t2bot.sdk.bot.remote_user_info" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REMOTE_USER_INFO_ACCOUNT_DATA_EVENT_TYPE").asInstanceOf[/* "io.t2bot.sdk.bot.remote_user_info" */ String]

inline def REMOTE_USER_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX: /* "io.t2bot.sdk.bot.remote_user_map" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("REMOTE_USER_MAP_ACCOUNT_DATA_EVENT_TYPE_PREFIX").asInstanceOf[/* "io.t2bot.sdk.bot.remote_user_map" */ String]

inline def decodeBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def decodeUnpaddedBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnpaddedBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def decodeUnpaddedUrlSafeBase64(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnpaddedUrlSafeBase64")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]

inline def doHttpRequest(
  baseUrl: String,
  method: GET | POST | PUT | DELETE,
  endpoint: String,
  qs: js.UndefOr[Any],
  body: js.UndefOr[Any],
  headers: js.UndefOr[js.Object],
  timeout: js.UndefOr[Double],
  raw: js.UndefOr[Boolean],
  contentType: js.UndefOr[String],
  noEncoding: js.UndefOr[Boolean]
): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("doHttpRequest")(baseUrl.asInstanceOf[js.Any], method.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], body.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], raw.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any], noEncoding.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]

inline def encodeBase64(b: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
inline def encodeBase64(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encodeUnpaddedBase64(b: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
inline def encodeUnpaddedBase64(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]

inline def encodeUnpaddedUrlSafeBase64(b: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedUrlSafeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]
inline def encodeUnpaddedUrlSafeBase64(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeUnpaddedUrlSafeBase64")(b.asInstanceOf[js.Any]).asInstanceOf[String]

inline def extractRequestError(err: js.Error): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestError")(err.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def extractRequestError(err: typings.matrixBotSdk.libModelsMatrixErrorMod.MatrixError): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestError")(err.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def getRequestFn(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequestFn")().asInstanceOf[Any]

inline def redactObjectForLogging(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("redactObjectForLogging")(input.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def requiresCrypto(): js.Function3[
/* target */ Any, 
/* propertyKey */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("requiresCrypto")().asInstanceOf[js.Function3[
/* target */ Any, 
/* propertyKey */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit]]

inline def requiresReady(): js.Function3[
/* target */ Any, 
/* propertyKey */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("requiresReady")().asInstanceOf[js.Function3[
/* target */ Any, 
/* propertyKey */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit]]

inline def setRequestFn(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRequestFn")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def timedIdentityClientFunctionCall(): js.Function3[
/* _target */ Any, 
/* functionName */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("timedIdentityClientFunctionCall")().asInstanceOf[js.Function3[
/* _target */ Any, 
/* functionName */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit]]

inline def timedIntentFunctionCall(): js.Function3[
/* _target */ Any, 
/* functionName */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("timedIntentFunctionCall")().asInstanceOf[js.Function3[
/* _target */ Any, 
/* functionName */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit]]

inline def timedMatrixClientFunctionCall(): js.Function3[
/* _target */ Any, 
/* functionName */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("timedMatrixClientFunctionCall")().asInstanceOf[js.Function3[
/* _target */ Any, 
/* functionName */ String, 
/* descriptor */ js.PropertyDescriptor, 
Unit]]

inline def validateSpaceOrderString(order: String): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSpaceOrderString")(order.asInstanceOf[js.Any]).asInstanceOf[`true`]

inline def wrapRoomEvent(event: Any): typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRoomEvent")(event.asInstanceOf[js.Any]).asInstanceOf[typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent[Any]]
