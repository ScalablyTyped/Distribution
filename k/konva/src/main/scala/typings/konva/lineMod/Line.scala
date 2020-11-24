package typings.konva.lineMod

import typings.konva.contextMod.Context
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Line", "Line")
@js.native
class Line[Config /* <: LineConfig */] () extends Shape[Config] {
  def this(config: Config) = this()
  
  def _getTensionPoints(): js.Array[_] = js.native
  
  def _getTensionPointsClosed(): js.Array[_] = js.native
  
  def _sceneFunc(context: Context): Unit = js.native
  
  def bezier(): Boolean = js.native
  def bezier(v: Boolean): this.type = js.native
  @JSName("bezier")
  var bezier_Original: GetSet[Boolean, this.type] = js.native
  
  def closed(): Boolean = js.native
  def closed(v: Boolean): this.type = js.native
  @JSName("closed")
  var closed_Original: GetSet[Boolean, this.type] = js.native
  
  def getHeight(): Double = js.native
  
  def getTensionPoints(): js.Any = js.native
  
  def getWidth(): Double = js.native
  
  def points(): js.Array[Double] = js.native
  def points(v: js.Array[Double]): this.type = js.native
  @JSName("points")
  var points_Original: GetSet[js.Array[Double], this.type] = js.native
  
  def tension(): Double = js.native
  def tension(v: Double): this.type = js.native
  @JSName("tension")
  var tension_Original: GetSet[Double, this.type] = js.native
}
