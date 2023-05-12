package typings.jotai

import typings.jotai.anon.Plugins
import typings.jotai.anon.Typeofbabel
import typings.jotai.babelUtilsMod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelPresetMod {
  
  @JSImport("jotai/babel/preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(_underscore: Typeofbabel): Plugins = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Plugins]
  inline def default(_underscore: Typeofbabel, options: PluginOptions): Plugins = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Plugins]
}
