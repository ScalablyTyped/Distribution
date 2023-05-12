package typings.jiti

import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import typings.jiti.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsBabelPluginTransformImportMetaMod {
  
  @JSImport("jiti/dist/plugins/babel-plugin-transform-import-meta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TransformImportMetaPlugin(_ctx: Any, opts: Filename): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformImportMetaPlugin")(_ctx.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
}
