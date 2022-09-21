package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Localpart
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usersMatrixMod {
  
  @JSImport("matrix-appservice-bridge/lib/models/users/matrix", "MatrixUser")
  @js.native
  open class MatrixUser protected () extends StObject {
    /**
      * Construct a Matrix user.
      * @param userId The userId of the user.
      * @param data Serialized data values
      * @param escape Escape the user's localpart. Modify {@link MatrixUser~ESCAPE_DEFAULT}
      *               to change the default value.
      */
    def this(userId: String) = this()
    def this(userId: String, _data: Record[String, Any]) = this()
    def this(userId: String, _data: Unit, escape: Boolean) = this()
    def this(userId: String, _data: Record[String, Any], escape: Boolean) = this()
    
    /* private */ val _data: Any = js.native
    
    /* private */ var _localpart: Any = js.native
    
    /**
      * Make a userId conform to the matrix spec using QP escaping.
      * Grammar taken from: https://matrix.org/docs/spec/appendices.html#identifier-grammar
      */
    def escapeUserId(): Unit = js.native
    
    /**
      * Get the data value for the given key.
      * @param key An arbitrary bridge-specific key.
      * @return Stored data for this key. May be undefined.
      */
    def get[T](key: String): T = js.native
    
    /**
      * Get the display name for this Matrix user.
      * @return The display name.
      */
    def getDisplayName(): String | Null = js.native
    
    /**
      * Get the matrix user's ID.
      * @return The user ID
      */
    def getId(): String = js.native
    
    val host: String = js.native
    
    def localpart: String = js.native
    
    /**
      * Serialize all the data about this user, excluding the user ID.
      * @return The serialised data
      */
    def serialize(): Localpart = js.native
    
    /**
      * Set an arbitrary bridge-specific data value for this room.
      * @param key The key to store the data value under.
      * @param val The data value. This value should be serializable via
      * <code>JSON.stringify(data)</code>.
      */
    def set(key: String, `val`: Any): Unit = js.native
    
    /**
      * Set the display name for this Matrix user.
      * @param name The Matrix display name.
      */
    def setDisplayName(name: String): Unit = js.native
    
    var userId: String = js.native
  }
  /* static members */
  object MatrixUser {
    
    @JSImport("matrix-appservice-bridge/lib/models/users/matrix", "MatrixUser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @static
      * This is a global variable to modify the default escaping behaviour of MatrixUser.
      */
    @JSImport("matrix-appservice-bridge/lib/models/users/matrix", "MatrixUser.ESCAPE_DEFAULT")
    @js.native
    def ESCAPE_DEFAULT: Boolean = js.native
    inline def ESCAPE_DEFAULT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE_DEFAULT")(x.asInstanceOf[js.Any])
  }
}
