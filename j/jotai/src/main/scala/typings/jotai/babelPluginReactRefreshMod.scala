package typings.jotai

import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import typings.jotai.anon.Typeofbabel
import typings.jotai.babelUtilsMod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelPluginReactRefreshMod {
  
  @JSImport("jotai/babel/plugin-react-refresh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Typeofbabel): PluginObj[PluginPass] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[PluginObj[PluginPass]]
  inline def default(param0: Typeofbabel, options: PluginOptions): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
}
