package typings.mapboxGl.mod

import typings.mapboxGl.anon.MaxWidth
import typings.mapboxGl.mapboxGlStrings.imperial
import typings.mapboxGl.mapboxGlStrings.metric
import typings.mapboxGl.mapboxGlStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ScaleControl")
@js.native
open class ScaleControl () extends Control {
  def this(options: MaxWidth) = this()
  
  def setUnit(unit: imperial | metric | nautical): Unit = js.native
}
