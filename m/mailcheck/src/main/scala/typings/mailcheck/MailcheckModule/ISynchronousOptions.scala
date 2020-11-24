package typings.mailcheck.MailcheckModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISynchronousOptions extends js.Object {
  
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.native
  
  var domains: js.UndefOr[js.Array[String]] = js.native
  
  var email: String = js.native
  
  var secondLevelDomains: js.UndefOr[js.Array[String]] = js.native
  
  var topLevelDomains: js.UndefOr[js.Array[String]] = js.native
}
object ISynchronousOptions {
  
  @scala.inline
  def apply(email: String): ISynchronousOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISynchronousOptions]
  }
  
  @scala.inline
  implicit class ISynchronousOptionsOps[Self <: ISynchronousOptions] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceFunction(value: (/* s1 */ String, /* s2 */ String) => Double): Self = this.set("distanceFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDistanceFunction: Self = this.set("distanceFunction", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: String*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[String]): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setSecondLevelDomainsVarargs(value: String*): Self = this.set("secondLevelDomains", js.Array(value :_*))
    
    @scala.inline
    def setSecondLevelDomains(value: js.Array[String]): Self = this.set("secondLevelDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondLevelDomains: Self = this.set("secondLevelDomains", js.undefined)
    
    @scala.inline
    def setTopLevelDomainsVarargs(value: String*): Self = this.set("topLevelDomains", js.Array(value :_*))
    
    @scala.inline
    def setTopLevelDomains(value: js.Array[String]): Self = this.set("topLevelDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLevelDomains: Self = this.set("topLevelDomains", js.undefined)
  }
}
