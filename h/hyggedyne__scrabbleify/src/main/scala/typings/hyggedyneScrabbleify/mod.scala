package typings.hyggedyneScrabbleify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hyggedyne/scrabbleify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hyggedyne/scrabbleify", "numbers")
  @js.native
  val numbers: js.Array[String] = js.native
  
  @JSImport("@hyggedyne/scrabbleify", "punctuation")
  @js.native
  val punctuation: js.Array[String] = js.native
  
  inline def scrabbleify(inputString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: String, inviolates: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], inviolates.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: String, inviolates: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], inviolates.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: js.Array[String], inviolates: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], inviolates.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: js.Array[String], inviolates: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], inviolates.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: Unit, inviolates: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], inviolates.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def scrabbleify(inputString: String, separator: Unit, inviolates: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("scrabbleify")(inputString.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], inviolates.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@hyggedyne/scrabbleify", "symbols")
  @js.native
  val symbols: js.Array[String] = js.native
}
