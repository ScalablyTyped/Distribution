package typings.history

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathStateKeyCurrentLocation extends js.Object {
  def apply[S](path: LocationDescriptor[S]): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
}

