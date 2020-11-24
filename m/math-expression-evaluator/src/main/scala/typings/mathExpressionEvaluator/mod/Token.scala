package typings.mathExpressionEvaluator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  var preced: js.UndefOr[Double] = js.native
  
  var show: String = js.native
  
  var token: String = js.native
  
  var `type`: Double = js.native
  
  var value: js.UndefOr[String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])] = js.native
}
object Token {
  
  @scala.inline
  def apply(show: String, token: String, `type`: Double): Token = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreced(value: Double): Self = this.set("preced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreced: Self = this.set("preced", js.undefined)
    
    @scala.inline
    def setValueFunction2(value: (/* a */ Double, /* b */ js.UndefOr[Double]) => Double): Self = this.set("value", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValue(value: String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
