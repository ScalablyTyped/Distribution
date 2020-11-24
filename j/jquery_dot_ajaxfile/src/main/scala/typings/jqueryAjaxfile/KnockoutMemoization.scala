package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutMemoization extends js.Object {
  
  def memoize(callback: js.Function0[String]): String = js.native
  
  def parseMemoText(memoText: String): String = js.native
  
  def unmemoize(memoId: String, callbackParams: js.Array[_]): Boolean = js.native
  
  def unmemoizeDomNodeAndDescendants(domNode: js.Any, extraCallbackParamsArray: js.Array[_]): Boolean = js.native
}
object KnockoutMemoization {
  
  @scala.inline
  def apply(
    memoize: js.Function0[String] => String,
    parseMemoText: String => String,
    unmemoize: (String, js.Array[_]) => Boolean,
    unmemoizeDomNodeAndDescendants: (js.Any, js.Array[_]) => Boolean
  ): KnockoutMemoization = {
    val __obj = js.Dynamic.literal(memoize = js.Any.fromFunction1(memoize), parseMemoText = js.Any.fromFunction1(parseMemoText), unmemoize = js.Any.fromFunction2(unmemoize), unmemoizeDomNodeAndDescendants = js.Any.fromFunction2(unmemoizeDomNodeAndDescendants))
    __obj.asInstanceOf[KnockoutMemoization]
  }
  
  @scala.inline
  implicit class KnockoutMemoizationOps[Self <: KnockoutMemoization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMemoize(value: js.Function0[String] => String): Self = this.set("memoize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParseMemoText(value: String => String): Self = this.set("parseMemoText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmemoize(value: (String, js.Array[_]) => Boolean): Self = this.set("unmemoize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnmemoizeDomNodeAndDescendants(value: (js.Any, js.Array[_]) => Boolean): Self = this.set("unmemoizeDomNodeAndDescendants", js.Any.fromFunction2(value))
  }
}
