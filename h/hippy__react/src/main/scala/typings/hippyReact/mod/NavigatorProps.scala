package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorProps extends StObject {
  
  /**
    * Initial page option, the option object should contains.
    *
    * * {string} routeName - Router name
    * * {React.Component} component - Initial react component
    * * {Object} initProps - Initial props for initial react component
    * * {boolean} animated - Use animation effect to switch to new page
    */
  var initialRoute: Route
}
object NavigatorProps {
  
  inline def apply(initialRoute: Route): NavigatorProps = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorProps] (val x: Self) extends AnyVal {
    
    inline def setInitialRoute(value: Route): Self = StObject.set(x, "initialRoute", value.asInstanceOf[js.Any])
  }
}
