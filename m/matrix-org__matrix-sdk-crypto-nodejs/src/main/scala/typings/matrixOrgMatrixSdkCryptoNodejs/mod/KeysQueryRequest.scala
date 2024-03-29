package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "KeysQueryRequest")
@js.native
open class KeysQueryRequest () extends StObject {
  
  /**
    * A JSON-encoded object of form:
    *
    * ```json
    * {"timeout": …, "one_time_keys": …}
    * ```
    */
  val body: String = js.native
  
  /** The request ID. */
  val id: String = js.native
  
  /** Get its request type. */
  def `type`: RequestType = js.native
}
