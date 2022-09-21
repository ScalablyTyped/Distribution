package typings.ltx

import typings.ltx.srcElementMod.default
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof tagString> is not an array type */ args: Parameters[js.Function2[/* literals */ js.Array[String], /* repeated */ String, String]]
  ): default = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[default]
  
  @JSImport("ltx/lib/tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
