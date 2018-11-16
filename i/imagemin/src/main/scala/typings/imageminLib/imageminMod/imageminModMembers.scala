package typings
package imageminLib.imageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemin", JSImport.Namespace)
@js.native
object imageminModMembers extends js.Object {
  def apply(input: js.Array[java.lang.String]): stdLib.Promise[js.Array[imageminLib.imageminMod.imageminNs.Result]] = js.native
  def apply(
    input: js.Array[java.lang.String],
    outputOrOptions: java.lang.String | imageminLib.imageminMod.imageminNs.Options
  ): stdLib.Promise[js.Array[imageminLib.imageminMod.imageminNs.Result]] = js.native
  def apply(input: js.Array[java.lang.String], output: java.lang.String): stdLib.Promise[js.Array[imageminLib.imageminMod.imageminNs.Result]] = js.native
  def apply(
    input: js.Array[java.lang.String],
    output: java.lang.String,
    options: imageminLib.imageminMod.imageminNs.Options
  ): stdLib.Promise[js.Array[imageminLib.imageminMod.imageminNs.Result]] = js.native
  def buffer(buffer: nodeLib.Buffer): stdLib.Promise[nodeLib.Buffer] = js.native
  def buffer(buffer: nodeLib.Buffer, options: imageminLib.imageminMod.imageminNs.Options): stdLib.Promise[nodeLib.Buffer] = js.native
}

