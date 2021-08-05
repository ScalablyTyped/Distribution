package typings.history

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationUtilsMod {
  
  @JSImport("history/LocationUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLocation[S](path: LocationDescriptor[S]): Location[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any]).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: S): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: S, key: Unit, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: S, key: LocationKey, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: Unit, key: Unit, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: Unit, key: LocationKey): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  inline def createLocation[S](path: LocationDescriptor[S], state: Unit, key: LocationKey, currentLocation: Location[S]): Location[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(path.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any], currentLocation.asInstanceOf[js.Any])).asInstanceOf[Location[S]]
  
  inline def locationsAreEqual[S](lv: LocationDescriptor[S], rv: LocationDescriptor[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("locationsAreEqual")(lv.asInstanceOf[js.Any], rv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
