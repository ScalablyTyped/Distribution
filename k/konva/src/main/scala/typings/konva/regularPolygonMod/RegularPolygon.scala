package typings.konva.regularPolygonMod

import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/RegularPolygon", "RegularPolygon")
@js.native
class RegularPolygon () extends Shape[RegularPolygonConfig] {
  
  def _getPoints(): js.Array[_] = js.native
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def getHeight(): Double = js.native
  
  def getWidth(): Double = js.native
  
  def radius(): Double = js.native
  def radius(v: Double): this.type = js.native
  @JSName("radius")
  var radius_Original: GetSet[Double, this.type] = js.native
  
  def setHeight(height: js.Any): Unit = js.native
  
  def setWidth(width: js.Any): Unit = js.native
  
  def sides(): Double = js.native
  def sides(v: Double): this.type = js.native
  @JSName("sides")
  var sides_Original: GetSet[Double, this.type] = js.native
}
