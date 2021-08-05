package typings.jestUtil

import typings.node.NodeJS.Global
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setGlobalMod {
  
  @JSImport("jest-util/build/setGlobal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(globalToMutate: Global, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(globalToMutate.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(globalToMutate: Window, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(globalToMutate.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
