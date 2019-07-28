package typings.atHapiPodium.atHapiPodiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/podium", JSImport.Namespace)
@js.native
/**
  * Creates a new podium emitter
  * @param events  if present, the value is passed to podium.registerEvent().
  */
class Class () extends Podium {
  def this(events: js.Array[Events]) = this()
  def this(events: Events) = this()
}

