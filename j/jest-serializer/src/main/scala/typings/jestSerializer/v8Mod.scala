package typings.jestSerializer

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", JSImport.Namespace)
@js.native
object v8Mod extends js.Object {
  def deserialize(value: Buffer): js.Any = js.native
  def serialize(value: js.Any): Buffer = js.native
}

