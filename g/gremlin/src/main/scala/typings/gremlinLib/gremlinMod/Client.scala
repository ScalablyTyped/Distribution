package typings
package gremlinLib.gremlinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gremlin", "Client")
@js.native
class Client protected () extends js.Object {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, options: js.Any) = this()
  def close(): js.Promise[scala.Unit] = js.native
  def open(): js.Promise[scala.Unit] = js.native
  def submit(message: Bytecode): js.Promise[_] = js.native
  def submit(message: Bytecode, bindings: js.Any): js.Promise[_] = js.native
  def submit(message: java.lang.String): js.Promise[_] = js.native
  def submit(message: java.lang.String, bindings: js.Any): js.Promise[_] = js.native
}

