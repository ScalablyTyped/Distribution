package typings.localDashStorage.localDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accessor extends js.Object {
  def apply(key: String): js.Any = js.native
  /**
    * Invokes set if value is present and get otherwise
    * https://github.com/bevacqua/local-storage#lskey-value
    */
  def apply(key: String, value: js.Any): Boolean = js.native
  /** https://github.com/bevacqua/local-storage#lsclear */
  def clear(): Boolean = js.native
  /**
    * Internally uses JSON.parse to parse value from storage without try/catch
    * https://github.com/bevacqua/local-storage#lsgetkey
    */
  def get(key: String): js.Any = js.native
  /** https://github.com/bevacqua/local-storage#lsoffkey-fn */
  def off(key: String, callback: Listener): Unit = js.native
  /** https://github.com/bevacqua/local-storage#lsonkey-fn */
  def on(key: String, callback: Listener): Unit = js.native
  /** https://github.com/bevacqua/local-storage#lsremovekey */
  def remove(key: String): Boolean = js.native
  /**
    * Internally uses JSON.stringify before saving.
    * https://github.com/bevacqua/local-storage#lssetkey-value
    */
  def set(key: String, value: js.Any): Boolean = js.native
}

