package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seed extends js.Object {
  var data: Uint8Array
}

object Seed {
  @scala.inline
  def apply(data: Uint8Array): Seed = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[Seed]
  }
}

