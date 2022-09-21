package typings.html2canvas

import typings.html2canvas.html2canvasNumbers.`0`
import typings.html2canvas.html2canvasNumbers.`1`
import typings.html2canvas.html2canvasNumbers.`2`
import typings.html2canvas.html2canvasNumbers.`4`
import typings.html2canvas.pathMod.Path
import typings.html2canvas.transformMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectsMod {
  
  @JSImport("html2canvas/dist/types/render/effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/effects", "ClipEffect")
  @js.native
  open class ClipEffect protected ()
    extends StObject
       with IElementEffect {
    def this(path: js.Array[Path], target: EffectTarget) = this()
    
    val path: js.Array[Path] = js.native
    
    /* CompleteClass */
    override val target: Double = js.native
    @JSName("target")
    val target_ClipEffect: EffectTarget = js.native
    
    /* CompleteClass */
    override val `type`: EffectType = js.native
  }
  
  @JSImport("html2canvas/dist/types/render/effects", "OpacityEffect")
  @js.native
  open class OpacityEffect protected ()
    extends StObject
       with IElementEffect {
    def this(opacity: Double) = this()
    
    val opacity: Double = js.native
    
    /* CompleteClass */
    override val target: Double = js.native
    
    /* CompleteClass */
    override val `type`: EffectType = js.native
  }
  
  @JSImport("html2canvas/dist/types/render/effects", "TransformEffect")
  @js.native
  open class TransformEffect protected ()
    extends StObject
       with IElementEffect {
    def this(offsetX: Double, offsetY: Double, matrix: Matrix) = this()
    
    val matrix: Matrix = js.native
    
    val offsetX: Double = js.native
    
    val offsetY: Double = js.native
    
    /* CompleteClass */
    override val target: Double = js.native
    
    /* CompleteClass */
    override val `type`: EffectType = js.native
  }
  
  inline def isClipEffect(effect: IElementEffect): /* is html2canvas.html2canvas/dist/types/render/effects.ClipEffect */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClipEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/render/effects.ClipEffect */ Boolean]
  
  inline def isOpacityEffect(effect: IElementEffect): /* is html2canvas.html2canvas/dist/types/render/effects.OpacityEffect */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpacityEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/render/effects.OpacityEffect */ Boolean]
  
  inline def isTransformEffect(effect: IElementEffect): /* is html2canvas.html2canvas/dist/types/render/effects.TransformEffect */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTransformEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/render/effects.TransformEffect */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasNumbers.`2`
    - typings.html2canvas.html2canvasNumbers.`4`
  */
  trait EffectTarget extends StObject
  object EffectTarget {
    
    inline def BACKGROUND_BORDERS: `2` = 2.asInstanceOf[`2`]
    
    inline def CONTENT: `4` = 4.asInstanceOf[`4`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasNumbers.`0`
    - typings.html2canvas.html2canvasNumbers.`1`
    - typings.html2canvas.html2canvasNumbers.`2`
  */
  trait EffectType extends StObject
  object EffectType {
    
    inline def CLIP: `1` = 1.asInstanceOf[`1`]
    
    inline def OPACITY: `2` = 2.asInstanceOf[`2`]
    
    inline def TRANSFORM: `0` = 0.asInstanceOf[`0`]
  }
  
  trait IElementEffect extends StObject {
    
    val target: Double
    
    val `type`: EffectType
  }
  object IElementEffect {
    
    inline def apply(target: Double, `type`: EffectType): IElementEffect = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IElementEffect]
    }
    
    extension [Self <: IElementEffect](x: Self) {
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: EffectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
