package typings.markdownIt

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.anon.Mdurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonUtilsMod extends Shortcut {
  
  @JSImport("markdown-it/lib/common/utils", JSImport.Namespace)
  @js.native
  val ^ : Utils = js.native
  
  // import ucmicro from 'uc.micro';
  trait Utils extends StObject {
    
    /**
      * Remove element from array and put another array at those position.
      * Useful for some operations with tokens.
      * Return a new array.
      */
    def arrayReplaceAt[T](src: js.Array[T], pos: Double, newElements: js.Array[T]): js.Array[T]
    
    /**
      * Merge objects
      */
    def assign(target: Any, sources: Any*): Any
    
    def escapeHtml(str: String): String
    
    def escapeRE(str: String): String
    
    def fromCodePoint(code: Double): String
    
    /**
      * has own property
      */
    def has(obj: Any, key: /* keyof any */ String): Boolean
    
    /**
      * Markdown ASCII punctuation characters.
      *
      * !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, :, ;, <, =, >, ?, @, [, \, ], ^, _, `, {, |, }, or ~
      * http://spec.commonmark.org/0.15/#ascii-punctuation-character
      *
      * Don't confuse with unicode punctuation !!! It lacks some chars in ascii range.
      */
    def isMdAsciiPunct(code: Double): Boolean
    
    /**
      * Currently without astral characters support.
      */
    def isPunctChar(ch: String): Boolean
    
    def isSpace(code: Double): Boolean
    
    /**
      * Check if the type is string or not
      */
    def isString(obj: Any): /* is string */ Boolean
    
    def isValidEntityCode(code: Double): Boolean
    
    /**
      * Zs (unicode class) || [\t\f\v\r\n]
      */
    def isWhiteSpace(code: Double): Boolean
    
    var lib: Mdurl
    
    /**
      * Hepler to unify [reference labels].
      */
    def normalizeReference(str: String): String
    
    def unescapeAll(str: String): String
    
    def unescapeMd(str: String): String
  }
  object Utils {
    
    inline def apply(
      arrayReplaceAt: (js.Array[Any], Double, js.Array[Any]) => js.Array[Any],
      assign: (Any, /* repeated */ Any) => Any,
      escapeHtml: String => String,
      escapeRE: String => String,
      fromCodePoint: Double => String,
      has: (Any, /* keyof any */ String) => Boolean,
      isMdAsciiPunct: Double => Boolean,
      isPunctChar: String => Boolean,
      isSpace: Double => Boolean,
      isString: Any => /* is string */ Boolean,
      isValidEntityCode: Double => Boolean,
      isWhiteSpace: Double => Boolean,
      lib: Mdurl,
      normalizeReference: String => String,
      unescapeAll: String => String,
      unescapeMd: String => String
    ): Utils = {
      val __obj = js.Dynamic.literal(arrayReplaceAt = js.Any.fromFunction3(arrayReplaceAt), assign = js.Any.fromFunction2(assign), escapeHtml = js.Any.fromFunction1(escapeHtml), escapeRE = js.Any.fromFunction1(escapeRE), fromCodePoint = js.Any.fromFunction1(fromCodePoint), has = js.Any.fromFunction2(has), isMdAsciiPunct = js.Any.fromFunction1(isMdAsciiPunct), isPunctChar = js.Any.fromFunction1(isPunctChar), isSpace = js.Any.fromFunction1(isSpace), isString = js.Any.fromFunction1(isString), isValidEntityCode = js.Any.fromFunction1(isValidEntityCode), isWhiteSpace = js.Any.fromFunction1(isWhiteSpace), lib = lib.asInstanceOf[js.Any], normalizeReference = js.Any.fromFunction1(normalizeReference), unescapeAll = js.Any.fromFunction1(unescapeAll), unescapeMd = js.Any.fromFunction1(unescapeMd))
      __obj.asInstanceOf[Utils]
    }
    
    extension [Self <: Utils](x: Self) {
      
      inline def setArrayReplaceAt(value: (js.Array[Any], Double, js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "arrayReplaceAt", js.Any.fromFunction3(value))
      
      inline def setAssign(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "assign", js.Any.fromFunction2(value))
      
      inline def setEscapeHtml(value: String => String): Self = StObject.set(x, "escapeHtml", js.Any.fromFunction1(value))
      
      inline def setEscapeRE(value: String => String): Self = StObject.set(x, "escapeRE", js.Any.fromFunction1(value))
      
      inline def setFromCodePoint(value: Double => String): Self = StObject.set(x, "fromCodePoint", js.Any.fromFunction1(value))
      
      inline def setHas(value: (Any, /* keyof any */ String) => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
      
      inline def setIsMdAsciiPunct(value: Double => Boolean): Self = StObject.set(x, "isMdAsciiPunct", js.Any.fromFunction1(value))
      
      inline def setIsPunctChar(value: String => Boolean): Self = StObject.set(x, "isPunctChar", js.Any.fromFunction1(value))
      
      inline def setIsSpace(value: Double => Boolean): Self = StObject.set(x, "isSpace", js.Any.fromFunction1(value))
      
      inline def setIsString(value: Any => /* is string */ Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction1(value))
      
      inline def setIsValidEntityCode(value: Double => Boolean): Self = StObject.set(x, "isValidEntityCode", js.Any.fromFunction1(value))
      
      inline def setIsWhiteSpace(value: Double => Boolean): Self = StObject.set(x, "isWhiteSpace", js.Any.fromFunction1(value))
      
      inline def setLib(value: Mdurl): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setNormalizeReference(value: String => String): Self = StObject.set(x, "normalizeReference", js.Any.fromFunction1(value))
      
      inline def setUnescapeAll(value: String => String): Self = StObject.set(x, "unescapeAll", js.Any.fromFunction1(value))
      
      inline def setUnescapeMd(value: String => String): Self = StObject.set(x, "unescapeMd", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Utils
  
  /* This means you don't have to write `^`, but can instead just say `libCommonUtilsMod.foo` */
  override def _to: Utils = ^
}
