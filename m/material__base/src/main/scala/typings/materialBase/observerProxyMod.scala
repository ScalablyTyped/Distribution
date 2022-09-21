package typings.materialBase

import typings.materialBase.observerMod.MDCObserver_
import typings.materialBase.observerMod.Observer
import typings.materialBase.typesMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerProxyMod {
  
  @JSImport("@material/base/observer-proxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mdcObserver(): Constructor[MDCObserver_] = ^.asInstanceOf[js.Dynamic].applyDynamic("mdcObserver")().asInstanceOf[Constructor[MDCObserver_]]
  inline def mdcObserver[T, C /* <: Constructor[T] */](baseClass: C): Constructor[MDCObserver_] & Constructor[T] & C = ^.asInstanceOf[js.Dynamic].applyDynamic("mdcObserver")(baseClass.asInstanceOf[js.Any]).asInstanceOf[Constructor[MDCObserver_] & Constructor[T] & C]
  
  inline def observeProperty[T /* <: js.Object */, K /* <: /* keyof T */ String */](target: T, property: K, observer: Observer[T, K, Any]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def setObserversEnabled[T /* <: js.Object */](target: T, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setObserversEnabled")(target.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
