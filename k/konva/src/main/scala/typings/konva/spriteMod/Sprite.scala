package typings.konva.spriteMod

import typings.konva.animationMod.Animation
import typings.konva.shapeMod.Shape
import typings.konva.typesMod.GetSet
import typings.std.CanvasImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/shapes/Sprite", "Sprite")
@js.native
class Sprite protected () extends Shape[SpriteConfig] {
  def this(config: js.Any) = this()
  
  def _hitFunc(context: js.Any): Unit = js.native
  
  def _sceneFunc(context: js.Any): Unit = js.native
  
  def _setInterval(): Unit = js.native
  
  def _updateIndex(): Unit = js.native
  
  var _updated: Boolean = js.native
  
  var anim: Animation = js.native
  
  def animation(): String = js.native
  def animation(v: String): this.type = js.native
  @JSName("animation")
  var animation_Original: GetSet[String, this.type] = js.native
  
  def animations(): js.Any = js.native
  def animations(v: js.Any): this.type = js.native
  @JSName("animations")
  var animations_Original: GetSet[_, this.type] = js.native
  
  def frameIndex(): Double = js.native
  def frameIndex(v: Double): this.type = js.native
  @JSName("frameIndex")
  var frameIndex_Original: GetSet[Double, this.type] = js.native
  
  def frameOffsets(): js.Any = js.native
  def frameOffsets(v: js.Any): this.type = js.native
  @JSName("frameOffsets")
  var frameOffsets_Original: GetSet[_, this.type] = js.native
  
  def frameRate(): Double = js.native
  def frameRate(v: Double): this.type = js.native
  @JSName("frameRate")
  var frameRate_Original: GetSet[Double, this.type] = js.native
  
  def image(): CanvasImageSource = js.native
  def image(v: CanvasImageSource): this.type = js.native
  @JSName("image")
  var image_Original: GetSet[CanvasImageSource, this.type] = js.native
  
  var interval: js.Any = js.native
  
  def isRunning(): Boolean = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
