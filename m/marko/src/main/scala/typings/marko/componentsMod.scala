package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("marko/src/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRenderedComponents(out: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderedComponents")(out.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def writeInitComponentsCode(fromOut: Any, targetOut: Any, shouldIncludeAll: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInitComponentsCode")(fromOut.asInstanceOf[js.Any], targetOut.asInstanceOf[js.Any], shouldIncludeAll.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Component = typings.marko.componentMod.Component
}
