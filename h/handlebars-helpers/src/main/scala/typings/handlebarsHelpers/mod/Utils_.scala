package typings.handlebarsHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils_ extends js.Object {
  
  /**
    * Change casing on the given `string`, optionally
    * passing a delimiter to use between words in the
    * returned string.
    *
    * ```handlebars
    * utils.changecase('fooBarBaz');
    * //=> 'foo bar baz'
    *
    * utils.changecase('fooBarBaz' '-');
    * //=> 'foo-bar-baz'
    * ```
    */
  def changecase(str: String, fn: js.Function1[/* str */ String, String]): String = js.native
  
  /**
    * Remove leading and trailing whitespace and non-word
    * characters from the given string.
    */
  def chop(str: String): String = js.native
  
  /**
    * Returns true if the given value contains the given
    * `object`, optionally passing a starting index.
    */
  def contains[T](`val`: js.Array[T], obj: T, start: Double): Boolean = js.native
}
object Utils_ {
  
  @scala.inline
  def apply(
    changecase: (String, js.Function1[/* str */ String, String]) => String,
    chop: String => String,
    contains: (js.Array[js.Any], js.Any, Double) => Boolean
  ): Utils_ = {
    val __obj = js.Dynamic.literal(changecase = js.Any.fromFunction2(changecase), chop = js.Any.fromFunction1(chop), contains = js.Any.fromFunction3(contains))
    __obj.asInstanceOf[Utils_]
  }
  
  @scala.inline
  implicit class Utils_Ops[Self <: Utils_] (val x: Self) extends AnyVal {
    
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
    def setChangecase(value: (String, js.Function1[/* str */ String, String]) => String): Self = this.set("changecase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChop(value: String => String): Self = this.set("chop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: (js.Array[js.Any], js.Any, Double) => Boolean): Self = this.set("contains", js.Any.fromFunction3(value))
  }
}
