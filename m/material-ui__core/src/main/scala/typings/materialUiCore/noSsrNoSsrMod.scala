package typings.materialUiCore

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrNoSsrMod {
  
  @JSImport("@material-ui/core/NoSsr/NoSsr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: NoSsrProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NoSsrProps extends StObject {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If `true`, the component will not only prevent server-side rendering.
      * It will also defer the rendering of the children into a different screen frame.
      */
    var defer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fallback content to display.
      */
    var fallback: js.UndefOr[ReactNode] = js.undefined
  }
  object NoSsrProps {
    
    inline def apply(): NoSsrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoSsrProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoSsrProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
