package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phpXdiffMod {
  
  @JSImport("locutus/php/xdiff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xdiffStringDiff(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xdiff_string_diff")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def xdiffStringPatch(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("xdiff_string_patch")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
}
