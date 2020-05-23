package typings.jsonfile.anon

import typings.node.NodeJS.ArrayBufferView
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathDataOptions extends js.Object {
  def apply(path: Double, data: String): Unit = js.native
  def apply(path: Double, data: String, options: WriteFileOptions): Unit = js.native
  def apply(path: Double, data: ArrayBufferView): Unit = js.native
  def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  def apply(path: PathLike, data: String): Unit = js.native
  def apply(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView): Unit = js.native
  def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
}

