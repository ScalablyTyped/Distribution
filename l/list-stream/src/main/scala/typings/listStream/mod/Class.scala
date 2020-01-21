package typings.listStream.mod

import typings.node.streamMod.DuplexOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("list-stream", JSImport.Namespace)
@js.native
class Class () extends ListStream {
  def this(callback: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]) = this()
  def this(options: DuplexOptions) = this()
  def this(options: DuplexOptions, callback: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]) = this()
}

