package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnitSystem extends StObject
@JSGlobal("google.maps.UnitSystem")
@js.native
object UnitSystem extends StObject {
  
  @js.native
  sealed trait IMPERIAL
    extends StObject
       with UnitSystem
  
  @js.native
  sealed trait METRIC
    extends StObject
       with UnitSystem
}
