package typings.hashids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUtilMod {
  
  @JSImport("hashids/cjs/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromAlphabet(inputChars: js.Array[String], alphabetChars: js.Array[String]): NumberLike = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAlphabet")(inputChars.asInstanceOf[js.Any], alphabetChars.asInstanceOf[js.Any])).asInstanceOf[NumberLike]
  
  inline def isIntegerNumber(n: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIntegerNumber(n: NumberLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntegerNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPositiveAndFinite(n: NumberLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositiveAndFinite")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keepUnique[T](content: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("keepUnique")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def makeAnyOfCharsRegExp(chars: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAnyOfCharsRegExp")(chars.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def makeAtLeastSomeCharRegExp(chars: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAtLeastSomeCharRegExp")(chars.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def onlyChars(chars: js.Array[String], keepChars: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("onlyChars")(chars.asInstanceOf[js.Any], keepChars.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def safeParseInt10(str: String): Double | js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParseInt10")(str.asInstanceOf[js.Any]).asInstanceOf[Double | js.BigInt]
  
  inline def shuffle(alphabetChars: js.Array[String], saltChars: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(alphabetChars.asInstanceOf[js.Any], saltChars.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def splitAtIntervalAndMap[T](str: String, nth: Double, map: js.Function1[/* n */ String, T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtIntervalAndMap")(str.asInstanceOf[js.Any], nth.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def toAlphabet(input: NumberLike, alphabetChars: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("toAlphabet")(input.asInstanceOf[js.Any], alphabetChars.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def withoutChars(chars: js.Array[String], charsToExclude: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("withoutChars")(chars.asInstanceOf[js.Any], charsToExclude.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  type NumberLike = js.BigInt | Double
}
