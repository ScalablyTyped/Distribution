package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrNoSsrMod extends Shortcut {
  
  @JSImport("@material-ui/core/NoSsr/NoSsr", JSImport.Default)
  @js.native
  val default: ComponentType[NoSsrProps] = js.native
  
  @js.native
  trait NoSsrProps extends StObject {
    
    var children: ReactNode = js.native
    
    var fallback: js.UndefOr[ReactNode] = js.native
  }
  object NoSsrProps {
    
    @scala.inline
    def apply(): NoSsrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoSsrProps]
    }
    
    @scala.inline
    implicit class NoSsrPropsMutableBuilder[Self <: NoSsrProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  type _To = ComponentType[NoSsrProps]
  
  /* This means you don't have to write `default`, but can instead just say `noSsrNoSsrMod.foo` */
  override def _to: ComponentType[NoSsrProps] = default
}
