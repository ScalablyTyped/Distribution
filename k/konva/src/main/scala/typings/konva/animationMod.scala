package typings.konva

import typings.konva.layerMod.Layer
import typings.konva.typesMod.AnimationFn
import typings.konva.typesMod.IFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Animation", JSImport.Namespace)
@js.native
object animationMod extends js.Object {
  
  @js.native
  class Animation protected () extends js.Object {
    def this(func: AnimationFn) = this()
    def this(func: AnimationFn, layers: js.Any) = this()
    
    def _updateFrameObject(time: js.Any): Unit = js.native
    
    def addLayer(layer: js.Any): Boolean = js.native
    
    var frame: IFrame = js.native
    
    def func(): Boolean | Unit = js.native
    def func(frame: IFrame): Boolean | Unit = js.native
    @JSName("func")
    var func_Original: AnimationFn = js.native
    
    def getLayers(): js.Array[Layer] = js.native
    
    var id: Double = js.native
    
    def isRunning(): Boolean = js.native
    
    var layers: js.Array[Layer] = js.native
    
    def setLayers(layers: js.Any): this.type = js.native
    
    def start(): this.type = js.native
    
    def stop(): this.type = js.native
  }
  /* static members */
  @js.native
  object Animation extends js.Object {
    
    def _addAnimation(anim: js.Any): Unit = js.native
    
    def _animationLoop(): Unit = js.native
    
    def _handleAnimation(): Unit = js.native
    
    def _removeAnimation(anim: js.Any): Unit = js.native
    
    def _runFrames(): Unit = js.native
    
    var animIdCounter: Double = js.native
    
    var animRunning: Boolean = js.native
    
    var animations: js.Array[_] = js.native
  }
}
