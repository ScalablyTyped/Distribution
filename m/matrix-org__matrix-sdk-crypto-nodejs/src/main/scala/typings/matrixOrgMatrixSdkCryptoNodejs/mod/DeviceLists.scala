package typings.matrixOrgMatrixSdkCryptoNodejs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@matrix-org/matrix-sdk-crypto-nodejs", "DeviceLists")
@js.native
/** Create an empty `DeviceLists`. */
open class DeviceLists () extends StObject {
  def this(changed: js.Array[UserId]) = this()
  def this(changed: js.Array[UserId], left: js.Array[UserId]) = this()
  def this(changed: Null, left: js.Array[UserId]) = this()
  def this(changed: Unit, left: js.Array[UserId]) = this()
  
  /**
    * List of users who have updated their device identity keys or
    * who now share an encrypted room with the client since the
    * previous sync.
    */
  def changed: js.Array[UserId] = js.native
  
  /** Returns true if there are no device list updates. */
  def isEmpty(): Boolean = js.native
  
  /**
    * List of users who no longer share encrypted rooms since the
    * previous sync response.
    */
  def left: js.Array[UserId] = js.native
}
