package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "RemoteConnection")
@js.native
class RemoteConnection protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def close(): js.Promise[scala.Unit] = js.native
  def open(): js.Promise[scala.Unit] = js.native
  def submit(bytecode: Bytecode): js.Promise[_] = js.native
}

