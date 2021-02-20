package typings.jupyterlabPropertyInspector

import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Widget
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @js.native
  trait IPropertyInspectorProvider extends StObject {
    
    /**
      * Register a widget in the property inspector provider.
      *
      * @param widget The owner widget whose properties will be inspected.
      *
      * ## Notes
      * Only one property inspector can be provided for each widget.
      * Registering the same widget twice will result in an error.
      * A widget can be unregistered by disposing of its property
      * inspector.
      */
    def register(widget: Widget): IPropertyInspector = js.native
  }
  object IPropertyInspectorProvider {
    
    @JSImport("@jupyterlab/property-inspector/lib/token", "IPropertyInspectorProvider")
    @js.native
    val ^ : Token[IPropertyInspectorProvider] = js.native
    
    @scala.inline
    implicit class IPropertyInspectorProviderMutableBuilder[Self <: IPropertyInspectorProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegister(value: Widget => IPropertyInspector): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IPropertyInspector extends IDisposable {
    
    def render(content: Widget): Unit = js.native
    def render(content: ReactElement): Unit = js.native
    
    /**
      * Show the property inspector panel.
      *
      * If the owner widget is not the most recently focused,
      * this is a no-op.  It should be triggered by a user
      * action.
      */
    def showPanel(): Unit = js.native
  }
}
