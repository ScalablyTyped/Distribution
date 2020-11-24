package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DistanceMatrixElementStatus extends js.Object
/**
  * The element-level status about a particular origin-destination pairing returned by the
  * {@link DistanceMatrixService} upon completion of a distance matrix request.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixElementStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends js.Object {
  
  /**
    * The origin and/or destination of this pairing could not be geocoded.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixElementStatus.NOT_FOUND Maps JavaScript API}
    */
  @js.native
  sealed trait NOT_FOUND extends DistanceMatrixElementStatus
  
  /**
    * The response contains a valid result.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixElementStatus.OK Maps JavaScript API}
    */
  @js.native
  sealed trait OK extends DistanceMatrixElementStatus
  
  /**
    * No route could be found between the origin and destination.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixElementStatus.ZERO_RESULTS Maps JavaScript API}
    */
  @js.native
  sealed trait ZERO_RESULTS extends DistanceMatrixElementStatus
}
