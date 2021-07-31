package typings.jestUtil

import typings.jestTypes.configMod.ConfigGlobals
import typings.node.NodeJS.Global
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installCommonGlobalsMod {
  
  @JSImport("jest-util/build/installCommonGlobals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(globalObject: Global, globals: ConfigGlobals): Global & ConfigGlobals = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(globalObject.asInstanceOf[js.Any], globals.asInstanceOf[js.Any])).asInstanceOf[Global & ConfigGlobals]
}
