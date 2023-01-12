package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutMemoization extends StObject {
  
  def memoize(callback: js.Function0[String]): String
  
  def parseMemoText(memoText: String): String
  
  def unmemoize(memoId: String, callbackParams: js.Array[Any]): Boolean
  
  def unmemoizeDomNodeAndDescendants(domNode: Any, extraCallbackParamsArray: js.Array[Any]): Boolean
}
object KnockoutMemoization {
  
  inline def apply(
    memoize: js.Function0[String] => String,
    parseMemoText: String => String,
    unmemoize: (String, js.Array[Any]) => Boolean,
    unmemoizeDomNodeAndDescendants: (Any, js.Array[Any]) => Boolean
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal(memoize = js.Any.fromFunction1(memoize), parseMemoText = js.Any.fromFunction1(parseMemoText), unmemoize = js.Any.fromFunction2(unmemoize), unmemoizeDomNodeAndDescendants = js.Any.fromFunction2(unmemoizeDomNodeAndDescendants))
    __obj.asInstanceOf[KnockoutMemoization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutMemoization] (val x: Self) extends AnyVal {
    
    inline def setMemoize(value: js.Function0[String] => String): Self = StObject.set(x, "memoize", js.Any.fromFunction1(value))
    
    inline def setParseMemoText(value: String => String): Self = StObject.set(x, "parseMemoText", js.Any.fromFunction1(value))
    
    inline def setUnmemoize(value: (String, js.Array[Any]) => Boolean): Self = StObject.set(x, "unmemoize", js.Any.fromFunction2(value))
    
    inline def setUnmemoizeDomNodeAndDescendants(value: (Any, js.Array[Any]) => Boolean): Self = StObject.set(x, "unmemoizeDomNodeAndDescendants", js.Any.fromFunction2(value))
  }
}
