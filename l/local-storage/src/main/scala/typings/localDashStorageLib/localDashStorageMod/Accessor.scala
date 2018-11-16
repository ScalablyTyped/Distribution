package typings
package localDashStorageLib.localDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accessor extends js.Object {
  def apply(key: java.lang.String): js.Any = js.native
  /**
       * Invokes set if value is present and get otherwise
       * https://github.com/bevacqua/local-storage#lskey-value
       */
  def apply(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /** https://github.com/bevacqua/local-storage#lsclear */
  def clear(): scala.Boolean = js.native
  /**
       * Internally uses JSON.parse to parse value from storage without try/catch
       * https://github.com/bevacqua/local-storage#lsgetkey
       */
  def get(key: java.lang.String): js.Any = js.native
  /** https://github.com/bevacqua/local-storage#lsoffkey-fn */
  def off(key: java.lang.String, callback: localDashStorageLib.Listener): scala.Unit = js.native
  /** https://github.com/bevacqua/local-storage#lsonkey-fn */
  def on(key: java.lang.String, callback: localDashStorageLib.Listener): scala.Unit = js.native
  /** https://github.com/bevacqua/local-storage#lsremovekey */
  def remove(key: java.lang.String): scala.Boolean = js.native
  /**
       * Internally uses JSON.stringify before saving.
       * https://github.com/bevacqua/local-storage#lssetkey-value
       */
  def set(key: java.lang.String, value: js.Any): scala.Boolean = js.native
}

