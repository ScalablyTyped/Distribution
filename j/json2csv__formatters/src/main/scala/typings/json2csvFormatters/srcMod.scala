package typings.json2csvFormatters

import typings.json2csvFormatters.srcNumberMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@json2csv/formatters/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def number(): js.Function1[/* value */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[js.Function1[/* value */ Double, String]]
  inline def number(opts: Options): js.Function1[/* value */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, String]]
  
  inline def `object`(): js.Function1[/* value */ Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[js.Function1[/* value */ Any, String]]
  inline def `object`(opts: typings.json2csvFormatters.srcObjectMod.Options): js.Function1[/* value */ Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Any, String]]
  
  inline def string(): js.Function1[/* value */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[js.Function1[/* value */ String, String]]
  inline def string(opts: typings.json2csvFormatters.srcStringMod.Options): js.Function1[/* value */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ String, String]]
  
  inline def stringExcel(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringExcel")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringQuoteOnlyIfNecessary(): js.Function1[/* value */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringQuoteOnlyIfNecessary")().asInstanceOf[js.Function1[/* value */ String, String]]
  inline def stringQuoteOnlyIfNecessary(opts: typings.json2csvFormatters.srcStringQuoteOnlyIfNecessaryMod.Options): js.Function1[/* value */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringQuoteOnlyIfNecessary")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ String, String]]
  
  inline def symbol(): js.Function1[/* value */ js.Symbol, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")().asInstanceOf[js.Function1[/* value */ js.Symbol, String]]
  inline def symbol(opts: typings.json2csvFormatters.srcSymbolMod.Options): js.Function1[/* value */ js.Symbol, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("symbol")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ js.Symbol, String]]
}
