package typings.history

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallLocation extends js.Object {
  def apply[S](location: LocationDescriptorObject[S]): Path = js.native
}

