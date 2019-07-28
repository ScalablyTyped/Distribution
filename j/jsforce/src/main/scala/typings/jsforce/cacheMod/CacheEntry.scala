package typings.jsforce.cacheMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/cache", "CacheEntry")
@js.native
class CacheEntry[T] () extends EventEmitter {
  def clear(): Unit = js.native
  def get(): js.UndefOr[T] = js.native
  def get(callback: js.Function2[/* err */ Error, /* result */ T, Unit]): js.UndefOr[T] = js.native
  def set(value: T): Unit = js.native
}

