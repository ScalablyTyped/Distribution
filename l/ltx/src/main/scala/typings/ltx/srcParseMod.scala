package typings.ltx

import typings.ltx.anon.TypeofParserInstantiable
import typings.ltx.srcParserMod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcParseMod {
  
  @JSImport("ltx/src/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String): typings.ltx.srcElementMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[typings.ltx.srcElementMod.default]
  inline def default(data: String, options: TypeofParserInstantiable): typings.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.srcElementMod.default]
  inline def default(data: String, options: ParserOptions): typings.ltx.srcElementMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ltx.srcElementMod.default]
}
