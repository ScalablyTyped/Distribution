package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seed extends js.Object {
  var data: stdLib.Uint8Array
}

object Seed {
  @scala.inline
  def apply(data: stdLib.Uint8Array): Seed = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[Seed]
  }
}

