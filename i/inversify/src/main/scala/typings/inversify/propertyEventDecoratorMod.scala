package typings.inversify

import typings.inversify.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyEventDecoratorMod {
  
  @JSImport("inversify/lib/annotation/property_event_decorator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def propertyEventDecorator(eventKey: String, errorMessage: String): js.Function0[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyEventDecorator")(eventKey.asInstanceOf[js.Any], errorMessage.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]]
}
