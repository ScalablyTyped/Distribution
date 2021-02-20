package typings.mapboxGl.mod

import typings.mapboxGl.anon.MaxWidth
import typings.mapboxGl.mapboxGlStrings.imperial
import typings.mapboxGl.mapboxGlStrings.metric
import typings.mapboxGl.mapboxGlStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "ScaleControl")
@js.native
class ScaleControl () extends Control {
  def this(options: MaxWidth) = this()
  
  @JSName("setUnit")
  def setUnit_imperial(unit: imperial): Unit = js.native
  @JSName("setUnit")
  def setUnit_metric(unit: metric): Unit = js.native
  @JSName("setUnit")
  def setUnit_nautical(unit: nautical): Unit = js.native
}
