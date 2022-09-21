package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ColorRampProperty")
@js.native
open class ColorRampProperty protected ()
  extends StObject
     with Property[Color, Boolean] {
  def this(specification: StylePropertySpecification) = this()
  
  def interpolate(): Boolean = js.native
}
