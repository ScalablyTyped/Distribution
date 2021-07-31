package typings.ionicReact

import typings.ionicReact.anon.Instantiable
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionLifeCycleHOCMod {
  
  @JSImport("@ionic/react/dist/types/lifecycle/IonLifeCycleHOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withIonLifeCycle(WrappedComponent: ComponentType[js.Any]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("withIonLifeCycle")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
}
