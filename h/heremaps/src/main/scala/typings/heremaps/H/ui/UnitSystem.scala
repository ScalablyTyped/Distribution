package typings.heremaps.H.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnitSystem extends StObject
/**
  * This enumeration holds the possible unit systems for the UI to display distances.
  */
@JSGlobal("H.ui.UnitSystem")
@js.native
object UnitSystem extends StObject {
  
  /** This value represents the imperial unit system using miles and feet (value: 'imperial'). */
  @js.native
  sealed trait IMPERIAL
    extends StObject
       with UnitSystem
  
  /** This value represents the metric unit system using meters and kilometers, etc (value: 'metric'). */
  @js.native
  sealed trait METRIC
    extends StObject
       with UnitSystem
}
