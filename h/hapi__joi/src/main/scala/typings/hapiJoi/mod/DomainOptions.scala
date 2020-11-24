package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainOptions extends js.Object {
  
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of segments required for the domain.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.native
  
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.native
}
object DomainOptions {
  
  @scala.inline
  def apply(): DomainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptions]
  }
  
  @scala.inline
  implicit class DomainOptionsOps[Self <: DomainOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUnicode(value: Boolean): Self = this.set("allowUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnicode: Self = this.set("allowUnicode", js.undefined)
    
    @scala.inline
    def setMinDomainSegments(value: Double): Self = this.set("minDomainSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDomainSegments: Self = this.set("minDomainSegments", js.undefined)
    
    @scala.inline
    def setTlds(value: TopLevelDomainOptions | `false`): Self = this.set("tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlds: Self = this.set("tlds", js.undefined)
  }
}
