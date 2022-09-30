package typings.inkTextAnimation

import typings.inkTextAnimation.inkTextAnimationStrings.glitch
import typings.inkTextAnimation.inkTextAnimationStrings.neon
import typings.inkTextAnimation.inkTextAnimationStrings.pulse
import typings.inkTextAnimation.inkTextAnimationStrings.radar
import typings.inkTextAnimation.inkTextAnimationStrings.rainbow
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-text-animation", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InkTextAnimationProps, js.Object, Any]
  
  type InkTextAnimation = Component[InkTextAnimationProps, js.Object, Any]
  
  trait InkTextAnimationProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var name: js.UndefOr[rainbow | pulse | glitch | radar | neon] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object InkTextAnimationProps {
    
    inline def apply(): InkTextAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InkTextAnimationProps]
    }
    
    extension [Self <: InkTextAnimationProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setName(value: rainbow | pulse | glitch | radar | neon): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
}
