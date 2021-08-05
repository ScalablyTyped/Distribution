package typings.konva

import typings.konva.layerMod.Layer
import typings.konva.typesMod.AnimationFn
import typings.konva.typesMod.IFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod {
  
  @JSImport("konva/types/Animation", "Animation")
  @js.native
  class Animation protected () extends StObject {
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
  object Animation {
    
    @JSImport("konva/types/Animation", "Animation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _addAnimation(anim: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_addAnimation")(anim.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def _animationLoop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_animationLoop")().asInstanceOf[Unit]
    
    inline def _handleAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_handleAnimation")().asInstanceOf[Unit]
    
    inline def _removeAnimation(anim: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeAnimation")(anim.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def _runFrames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_runFrames")().asInstanceOf[Unit]
    
    @JSImport("konva/types/Animation", "Animation.animIdCounter")
    @js.native
    def animIdCounter: Double = js.native
    inline def animIdCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animIdCounter")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/Animation", "Animation.animRunning")
    @js.native
    def animRunning: Boolean = js.native
    inline def animRunning_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animRunning")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/types/Animation", "Animation.animations")
    @js.native
    def animations: js.Array[js.Any] = js.native
    inline def animations_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animations")(x.asInstanceOf[js.Any])
  }
}
