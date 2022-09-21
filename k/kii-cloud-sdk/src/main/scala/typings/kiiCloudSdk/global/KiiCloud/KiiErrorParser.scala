package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.KiiCloud.KiiError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Parser for error string or error object returned by SDK.
  */
@JSGlobal("KiiCloud.KiiErrorParser")
@js.native
open class KiiErrorParser ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiErrorParser
object KiiErrorParser {
  
  @JSGlobal("KiiCloud.KiiErrorParser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse an error string or error object returned by SDK.
    *
    * @param error An error string or error object
    *
    * @return return parsed error object.
    *
    * @example
    *     var err = KiiErrorParser.parse(errorString);
    *     var httpStatus = err.status;
    *     if (httpStatus == 0) {
    *         // NetworkError
    *     } else if (httpStatus == -1) {
    *         // Error is not related the http error. eg. argument error, illegal state error, etc.
    *     } else if (httpStatus == -2) {
    *         // Unknown error is detected.
    *         // Please confirm that you are using the latest version of SDK.
    *     } else if (httpStatus >= 400 && httpStatus < 600) {
    *         // Http error
    *     }
    *     var errorCode = err.code;
    *     var errorMessage = err.message;
    */
  /* static member */
  inline def parse(error: String): KiiError = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(error.asInstanceOf[js.Any]).asInstanceOf[KiiError]
  inline def parse(error: js.Error): KiiError = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(error.asInstanceOf[js.Any]).asInstanceOf[KiiError]
}
