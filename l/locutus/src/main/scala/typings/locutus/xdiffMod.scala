package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xdiffMod {
  
  @JSImport("locutus/php/xdiff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xdiffStringDiff(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xdiff_string_diff")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def xdiffStringPatch(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xdiff_string_patch")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
