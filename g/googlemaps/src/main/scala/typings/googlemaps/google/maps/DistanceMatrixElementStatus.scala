package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DistanceMatrixElementStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends js.Object {
  @js.native
  sealed trait NOT_FOUND extends DistanceMatrixElementStatus
  
  @js.native
  sealed trait OK extends DistanceMatrixElementStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends DistanceMatrixElementStatus
  
}

