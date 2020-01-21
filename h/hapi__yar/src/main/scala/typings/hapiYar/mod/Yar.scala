package typings.hapiYar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yar extends js.Object {
  /**
    * Session id, see `customSessionIDGenerator`.
    */
  val id: String = js.native
  /**
    * clears key.
    */
  def clear(key: String): Unit = js.native
  /**
    * stores volatile data - data that should be deleted once read.
    * When given no arguments, it will return all of the flash messages and delete the originals.
    * When given only a type, it will return all of the flash messages of that type and delete the originals.
    * When given a type and a message, it will set or append that message to the given type.
    * 'isOverride' used to indicate that the message provided should replace
    * any existing value instead of being appended to it (defaults to false).
    */
  def flash(`type`: String): js.Array[_] = js.native
  def flash(`type`: String, message: js.Any): js.Array[_] = js.native
  def flash(`type`: String, message: js.Any, isOverride: Boolean): js.Array[_] = js.native
  /**
    * retrieve value using a key. If 'clear' is 'true', key is cleared on return.
    */
  def get(key: String): js.Any = js.native
  def get(key: String, clear: Boolean): js.Any = js.native
  /**
    * if set to 'true', enables lazy mode.
    * In lazy mode, request.yar can be modified directly (e.g. setting request.yar.myKey to an object value),
    * and those keys will be stored and loaded back.
    * Lazy mode isn't as fast as the normal get/set because
    * it has to store the session state on every responses regardless of any changes being made.
    */
  def `lazy`(enabled: Boolean): Unit = js.native
  /**
    * clears the session and assigns a new session id.
    */
  def reset(): Unit = js.native
  /**
    * - assigns a value (string, object, etc) to a given key which will persist across requests. Returns the value.
    */
  def set[T](key: String, value: T): T = js.native
  /**
    *  assigns values to multiple keys using each 'keysObject' top-level property. Returns the keysObject.
    */
  def set[T /* <: StringDictionary[js.Any] */](keysObject: T): T = js.native
  /**
    * Manually notify the session of changes (when using get()
    * and changing the content of the returned reference directly without calling set()).
    */
  def touch(): Unit = js.native
}

