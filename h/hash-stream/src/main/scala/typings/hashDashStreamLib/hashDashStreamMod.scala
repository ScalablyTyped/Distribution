package typings
package hashDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hash-stream", JSImport.Namespace)
@js.native
object hashDashStreamMod extends js.Object {
  def apply(filename: java.lang.String, algorithm: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def apply(
    filename: java.lang.String,
    algorithm: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* hash */ nodeLib.Buffer, scala.Unit]
  ): js.Promise[nodeLib.Buffer] = js.native
  def apply(stream: nodeLib.streamMod.Readable, algorithm: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    algorithm: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* hash */ nodeLib.Buffer, scala.Unit]
  ): js.Promise[nodeLib.Buffer] = js.native
}

