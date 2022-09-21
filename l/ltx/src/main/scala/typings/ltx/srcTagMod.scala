package typings.ltx

import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTagMod {
  
  @JSImport("ltx/src/tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof tagString> is not an array type */ args: Parameters[js.Function2[/* literals */ js.Array[String], /* repeated */ String, String]]
  ): typings.ltx.srcElementMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[typings.ltx.srcElementMod.default]
}
