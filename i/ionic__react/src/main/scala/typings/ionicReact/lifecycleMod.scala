package typings.ionicReact

import typings.ionicReact.anon.Instantiable
import typings.ionicReact.ionLifeCycleContextMod.LifeCycleCallback
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecycleMod {
  
  @JSImport("@ionic/react/dist/types/lifecycle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useIonViewDidEnter(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidEnter")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useIonViewDidEnter(callback: LifeCycleCallback, deps: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidEnter")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useIonViewDidLeave(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidLeave")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useIonViewDidLeave(callback: LifeCycleCallback, deps: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewDidLeave")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useIonViewWillEnter(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillEnter")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useIonViewWillEnter(callback: LifeCycleCallback, deps: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillEnter")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useIonViewWillLeave(callback: LifeCycleCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillLeave")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def useIonViewWillLeave(callback: LifeCycleCallback, deps: js.Array[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIonViewWillLeave")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def withIonLifeCycle(WrappedComponent: ComponentType[js.Any]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("withIonLifeCycle")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
}
