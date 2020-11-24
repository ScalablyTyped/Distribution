package typings.konva.tweenMod

import typings.konva.animationMod.Animation
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Tween", "Tween")
@js.native
class Tween protected () extends js.Object {
  def this(config: TweenConfig) = this()
  
  def _addAttr(key: js.Any, end: js.Any): Unit = js.native
  
  def _addListeners(): Unit = js.native
  
  var _id: Double = js.native
  
  def _tweenFunc(i: js.Any): Unit = js.native
  
  var anim: Animation = js.native
  
  def destroy(): Unit = js.native
  
  def finish(): this.type = js.native
  
  var node: Node[NodeConfig] = js.native
  
  var onFinish: js.Function = js.native
  
  var onReset: js.Function = js.native
  
  var onUpdate: js.Function = js.native
  
  def pause(): this.type = js.native
  
  def play(): this.type = js.native
  
  def reset(): this.type = js.native
  
  def reverse(): this.type = js.native
  
  def seek(t: js.Any): this.type = js.native
  
  var tween: TweenEngine = js.native
}
