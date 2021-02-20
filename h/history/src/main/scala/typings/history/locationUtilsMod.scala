package typings.history

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationUtilsMod {
  
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S]): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: S,
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    currentLocation: Location[S]
  ): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](path: LocationDescriptor[S], state: js.UndefOr[scala.Nothing], key: LocationKey): Location[S] = js.native
  @JSImport("history/LocationUtils", "createLocation")
  @js.native
  def createLocation[S](
    path: LocationDescriptor[S],
    state: js.UndefOr[scala.Nothing],
    key: LocationKey,
    currentLocation: Location[S]
  ): Location[S] = js.native
  
  @JSImport("history/LocationUtils", "locationsAreEqual")
  @js.native
  def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = js.native
}
