package typings.kbar

import typings.kbar.libTypesMod.Action
import typings.react.mod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseRegisterActionsMod {
  
  @JSImport("kbar/lib/useRegisterActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRegisterActions(actions: js.Array[Action]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRegisterActions")(actions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRegisterActions(actions: js.Array[Action], dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRegisterActions")(actions.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
