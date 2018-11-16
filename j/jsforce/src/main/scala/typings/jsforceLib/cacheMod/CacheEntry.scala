package typings
package jsforceLib.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/cache", "CacheEntry")
@js.native
class CacheEntry[T] ()
  extends nodeLib.eventsMod.EventEmitter {
  def clear(): scala.Unit = js.native
  def get(): js.UndefOr[T] = js.native
  def get(callback: js.Function2[/* err */ nodeLib.Error, /* result */ T, scala.Unit]): js.UndefOr[T] = js.native
  def set(value: T): scala.Unit = js.native
}

