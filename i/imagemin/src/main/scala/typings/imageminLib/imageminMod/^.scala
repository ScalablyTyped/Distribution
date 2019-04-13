package typings
package imageminLib.imageminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: js.Array[java.lang.String]): js.Promise[js.Array[Result]] = js.native
  def apply(input: js.Array[java.lang.String], outputOrOptions: java.lang.String | Options): js.Promise[js.Array[Result]] = js.native
  def apply(input: js.Array[java.lang.String], output: java.lang.String): js.Promise[js.Array[Result]] = js.native
  def apply(input: js.Array[java.lang.String], output: java.lang.String, options: Options): js.Promise[js.Array[Result]] = js.native
  def buffer(buffer: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def buffer(buffer: nodeLib.Buffer, options: Options): js.Promise[nodeLib.Buffer] = js.native
}

