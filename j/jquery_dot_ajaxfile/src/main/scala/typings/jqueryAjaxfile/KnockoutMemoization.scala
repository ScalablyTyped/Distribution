package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutMemoization extends StObject {
  
  def memoize(callback: js.Function0[String]): String
  
  def parseMemoText(memoText: String): String
  
  def unmemoize(memoId: String, callbackParams: js.Array[js.Any]): Boolean
  
  def unmemoizeDomNodeAndDescendants(domNode: js.Any, extraCallbackParamsArray: js.Array[js.Any]): Boolean
}
object KnockoutMemoization {
  
  @scala.inline
  def apply(
    memoize: js.Function0[String] => String,
    parseMemoText: String => String,
    unmemoize: (String, js.Array[js.Any]) => Boolean,
    unmemoizeDomNodeAndDescendants: (js.Any, js.Array[js.Any]) => Boolean
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal(memoize = js.Any.fromFunction1(memoize), parseMemoText = js.Any.fromFunction1(parseMemoText), unmemoize = js.Any.fromFunction2(unmemoize), unmemoizeDomNodeAndDescendants = js.Any.fromFunction2(unmemoizeDomNodeAndDescendants))
    __obj.asInstanceOf[KnockoutMemoization]
  }
  
  @scala.inline
  implicit class KnockoutMemoizationMutableBuilder[Self <: KnockoutMemoization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemoize(value: js.Function0[String] => String): Self = StObject.set(x, "memoize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseMemoText(value: String => String): Self = StObject.set(x, "parseMemoText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmemoize(value: (String, js.Array[js.Any]) => Boolean): Self = StObject.set(x, "unmemoize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnmemoizeDomNodeAndDescendants(value: (js.Any, js.Array[js.Any]) => Boolean): Self = StObject.set(x, "unmemoizeDomNodeAndDescendants", js.Any.fromFunction2(value))
  }
}
