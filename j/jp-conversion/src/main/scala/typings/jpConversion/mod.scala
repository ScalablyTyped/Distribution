package typings.jpConversion

import typings.jpConversion.anon.Hiragana
import typings.jpConversion.jpConversionBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jp-conversion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(input: String): `false` | Hiragana = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[`false` | Hiragana]
  
  inline def romanise(kana: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("romanise")(kana.asInstanceOf[js.Any]).asInstanceOf[String]
}
