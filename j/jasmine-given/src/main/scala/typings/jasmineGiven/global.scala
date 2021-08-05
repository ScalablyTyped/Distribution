package typings.jasmineGiven

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def And(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("And")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Given(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("Given")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Invariant(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("Invariant")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Then(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("Then")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def Then(label: String, func: js.Function1[/* done */ DoneFn, Unit]): Unit = (js.Dynamic.global.applyDynamic("Then")(label.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def When(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.Dynamic.global.applyDynamic("When")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
