package typings.ionicAngular

import typings.ionicAngular.anon.Inputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxiesUtilsMod {
  
  @JSImport("@ionic/angular/directives/proxies-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ProxyCmp(opts: Inputs): js.Function1[/* cls */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ProxyCmp")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cls */ js.Any, js.Any]]
  
  inline def proxyInputs(Cmp: js.Any, inputs: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyInputs")(Cmp.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def proxyMethods(Cmp: js.Any, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyMethods")(Cmp.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def proxyOutputs(instance: js.Any, el: js.Any, events: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyOutputs")(instance.asInstanceOf[js.Any], el.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
