package typings.jiti

import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsImportMetaEnvMod {
  
  @JSImport("jiti/dist/plugins/import-meta-env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jiti/dist/plugins/import-meta-env", "accessor")
  @js.native
  val accessor: /* "process.env" */ String = js.native
  
  inline def importMetaEnvPlugin(param0: Any): PluginObj[PluginPass] = ^.asInstanceOf[js.Dynamic].applyDynamic("importMetaEnvPlugin")(param0.asInstanceOf[js.Any]).asInstanceOf[PluginObj[PluginPass]]
}
