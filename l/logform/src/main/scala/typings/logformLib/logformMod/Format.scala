package typings
package logformLib.logformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logform", "Format")
@js.native
class Format () extends js.Object {
  def this(opts: js.Object) = this()
  var options: js.UndefOr[js.Object] = js.native
  @JSName("transform")
  var transform_Original: TransformFunction = js.native
  def transform(info: TransformableInfo): TransformableInfo | scala.Boolean = js.native
  def transform(info: TransformableInfo, opts: js.Any): TransformableInfo | scala.Boolean = js.native
}

