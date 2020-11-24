package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`fill-extrusion`
import typings.mapboxGl.mapboxGlStrings.background
import typings.mapboxGl.mapboxGlStrings.circle
import typings.mapboxGl.mapboxGlStrings.fill
import typings.mapboxGl.mapboxGlStrings.heatmap
import typings.mapboxGl.mapboxGlStrings.hillshade
import typings.mapboxGl.mapboxGlStrings.line
import typings.mapboxGl.mapboxGlStrings.raster
import typings.mapboxGl.mapboxGlStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mapboxGl.mod.BackgroundLayer
  - typings.mapboxGl.mod.CircleLayer
  - typings.mapboxGl.mod.FillExtrusionLayer
  - typings.mapboxGl.mod.FillLayer
  - typings.mapboxGl.mod.HeatmapLayer
  - typings.mapboxGl.mod.HillshadeLayer
  - typings.mapboxGl.mod.LineLayer
  - typings.mapboxGl.mod.RasterLayer
  - typings.mapboxGl.mod.SymbolLayer
*/
trait Layer extends js.Object
object Layer {
  
  @scala.inline
  def HillshadeLayer(id: String, `type`: hillshade): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def RasterLayer(id: String, `type`: raster): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def BackgroundLayer(id: String, `type`: background): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def SymbolLayer(id: String, `type`: symbol): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def FillLayer(id: String, `type`: fill): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def FillExtrusionLayer(id: String, `type`: `fill-extrusion`): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def CircleLayer(id: String, `type`: circle): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def HeatmapLayer(id: String, `type`: heatmap): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  def LineLayer(id: String, `type`: line): Layer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}
