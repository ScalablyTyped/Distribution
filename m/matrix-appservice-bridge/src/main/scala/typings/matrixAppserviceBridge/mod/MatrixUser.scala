package typings.matrixAppserviceBridge.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "MatrixUser")
@js.native
class MatrixUser protected ()
  extends typings.matrixAppserviceBridge.usersMatrixMod.MatrixUser {
  /**
    * Construct a Matrix user.
    * @param userId The userId of the user.
    * @param data Serialized data values
    * @param escape Escape the user's localpart. Modify {@link MatrixUser~ESCAPE_DEFAULT}
    *               to change the default value.
    */
  def this(userId: String) = this()
  def this(userId: String, _data: Record[String, js.Any]) = this()
  def this(userId: String, _data: Unit, escape: Boolean) = this()
  def this(userId: String, _data: Record[String, js.Any], escape: Boolean) = this()
}
/* static members */
object MatrixUser {
  
  @JSImport("matrix-appservice-bridge", "MatrixUser")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @static
    * This is a global variable to modify the default escaping behaviour of MatrixUser.
    */
  @JSImport("matrix-appservice-bridge", "MatrixUser.ESCAPE_DEFAULT")
  @js.native
  def ESCAPE_DEFAULT: Boolean = js.native
  @scala.inline
  def ESCAPE_DEFAULT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE_DEFAULT")(x.asInstanceOf[js.Any])
}
