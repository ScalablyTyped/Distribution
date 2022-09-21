package typings.materialUiCore

import typings.materialUiCore.materialUiCoreStrings.down
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.up
import typings.materialUiCore.transitionMod.TransitionProps
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideSlideMod {
  
  @JSImport("@material-ui/core/Slide/Slide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SlideProps
    extends StObject
       with TransitionProps {
    
    /**
      * A single child content element.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Direction the child node will enter from.
      */
    var direction: js.UndefOr[left | right | up | down] = js.undefined
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object SlideProps {
    
    inline def apply(): SlideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideProps]
    }
    
    extension [Self <: SlideProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: left | right | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
