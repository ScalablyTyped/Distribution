package typings.history.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", "createLocation")
@js.native
object createLocation extends js.Object {
  def apply[S](path: LocationDescriptor[S]): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  def apply[S](
    path: LocationDescriptor[S],
    state: S,
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  def apply[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  def apply[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
  def apply[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: LocationKey,
    currentLocation: Location[S]
  ): Location[S] = js.native
}

