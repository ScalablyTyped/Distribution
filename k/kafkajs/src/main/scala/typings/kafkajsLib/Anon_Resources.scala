package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resources extends js.Object {
  var resources: js.Array[kafkajsLib.kafkajsMod.IResourceConfig]
  var validateOnly: scala.Boolean
}

object Anon_Resources {
  @scala.inline
  def apply(resources: js.Array[kafkajsLib.kafkajsMod.IResourceConfig], validateOnly: scala.Boolean): Anon_Resources = {
    val __obj = js.Dynamic.literal(resources = resources, validateOnly = validateOnly)
  
    __obj.asInstanceOf[Anon_Resources]
  }
}

