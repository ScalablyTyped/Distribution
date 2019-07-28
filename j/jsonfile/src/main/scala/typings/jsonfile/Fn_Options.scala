package typings.jsonfile

import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(path: Double): Buffer = js.native
  def apply(path: Double, options: String): String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlag): Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagString): String = js.native
  def apply(path: PathLike): Buffer = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def apply(path: PathLike, options: Anon_EncodingFlagString): String = js.native
}

