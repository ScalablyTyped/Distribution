package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("handsontable/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerAllCellTypes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllCellTypes")().asInstanceOf[Unit]
  
  inline def registerAllEditors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllEditors")().asInstanceOf[Unit]
  
  inline def registerAllModules(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllModules")().asInstanceOf[Unit]
  
  inline def registerAllPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllPlugins")().asInstanceOf[Unit]
  
  inline def registerAllRenderers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllRenderers")().asInstanceOf[Unit]
  
  inline def registerAllValidators(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllValidators")().asInstanceOf[Unit]
}
