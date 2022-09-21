package typings.ltx

import typings.ltx.srcElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalMod {
  
  @JSImport("ltx/lib/equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: typings.ltx.srcElementMod.default, b: typings.ltx.srcElementMod.default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def attrsEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("attrsEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def childrenEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("childrenEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def nameEqual(a: default, b: default): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("nameEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
