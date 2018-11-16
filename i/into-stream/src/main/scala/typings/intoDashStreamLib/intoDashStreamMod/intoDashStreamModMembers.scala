package typings
package intoDashStreamLib.intoDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("into-stream", JSImport.Namespace)
@js.native
object intoDashStreamModMembers extends js.Object {
  def apply(
    input: intoDashStreamLib.intoDashStreamMod.intoStreamNs.Input | stdLib.Promise[intoDashStreamLib.intoDashStreamMod.intoStreamNs.Input]
  ): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(input: js.Object): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(input: nodeLib.Iterable[js.Object]): nodeLib.NodeJSNs.ReadableStream = js.native
  def obj(input: stdLib.Promise[js.Object | nodeLib.Iterable[js.Object]]): nodeLib.NodeJSNs.ReadableStream = js.native
}

