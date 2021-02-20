package typings.ionicReact

import typings.ionicReact.navContextMod.NavContextState
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionRedirectMod {
  
  @JSImport("@ionic/react/dist/types/components/IonRedirect", "IonRedirect")
  @js.native
  class IonRedirect protected ()
    extends PureComponent[IonRedirectProps, IonRedirectState, js.Any] {
    def this(props: IonRedirectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IonRedirectProps, context: js.Any) = this()
    
    @JSName("context")
    var context_IonRedirect: ContextType[Context[NavContextState]] = js.native
  }
  
  @js.native
  trait IonRedirectProps extends StObject {
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var routerOptions: js.UndefOr[js.Any] = js.native
    
    var to: String = js.native
  }
  object IonRedirectProps {
    
    @scala.inline
    def apply(to: String): IonRedirectProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonRedirectProps]
    }
    
    @scala.inline
    implicit class IonRedirectPropsMutableBuilder[Self <: IonRedirectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRouterOptions(value: js.Any): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IonRedirectState extends StObject
}
