package typings.konva.mod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.konva.typesMod.AnimationFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva", "Animation")
@js.native
object Animation
  extends Instantiable1[/* func */ AnimationFn, typings.konva.animationMod.Animation]
     with Instantiable2[/* func */ AnimationFn, /* layers */ js.Any, typings.konva.animationMod.Animation] {
  
  def _addAnimation(anim: js.Any): Unit = js.native
  
  def _animationLoop(): Unit = js.native
  
  def _handleAnimation(): Unit = js.native
  
  def _removeAnimation(anim: js.Any): Unit = js.native
  
  def _runFrames(): Unit = js.native
  
  var animIdCounter: Double = js.native
  
  var animRunning: Boolean = js.native
  
  var animations: js.Array[_] = js.native
}
