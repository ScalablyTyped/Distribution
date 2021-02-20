package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationService extends StObject {
  
  def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit = js.native
  
  def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]
  ): Unit = js.native
}
object ElevationService {
  
  @scala.inline
  def apply(
    getElevationAlongPath: (PathElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit,
    getElevationForLocations: (LocationElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
  ): ElevationService = {
    val __obj = js.Dynamic.literal(getElevationAlongPath = js.Any.fromFunction2(getElevationAlongPath), getElevationForLocations = js.Any.fromFunction2(getElevationForLocations))
    __obj.asInstanceOf[ElevationService]
  }
  
  @scala.inline
  implicit class ElevationServiceMutableBuilder[Self <: ElevationService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetElevationAlongPath(
      value: (PathElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
    ): Self = StObject.set(x, "getElevationAlongPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetElevationForLocations(
      value: (LocationElevationRequest, js.Function2[/* results */ js.Array[ElevationResult], /* status */ ElevationStatus, Unit]) => Unit
    ): Self = StObject.set(x, "getElevationForLocations", js.Any.fromFunction2(value))
  }
}
