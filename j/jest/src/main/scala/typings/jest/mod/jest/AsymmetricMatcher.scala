package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricMatcher extends js.Object {
  
  def asymmetricMatch(other: js.Any): Boolean = js.native
}
object AsymmetricMatcher {
  
  @scala.inline
  def apply(asymmetricMatch: js.Any => Boolean): AsymmetricMatcher = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
    __obj.asInstanceOf[AsymmetricMatcher]
  }
  
  @scala.inline
  implicit class AsymmetricMatcherOps[Self <: AsymmetricMatcher] (val x: Self) extends AnyVal {
    
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
    def setAsymmetricMatch(value: js.Any => Boolean): Self = this.set("asymmetricMatch", js.Any.fromFunction1(value))
  }
}
