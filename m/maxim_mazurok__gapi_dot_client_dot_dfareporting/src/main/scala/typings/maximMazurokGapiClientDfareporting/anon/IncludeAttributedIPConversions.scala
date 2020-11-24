package typings.maximMazurokGapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeAttributedIPConversions extends js.Object {
  
  /** Include conversions that have no cookie, but do have an exposure path. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser within the Floodlight
    * group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the lookback window prior
    * to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
}
object IncludeAttributedIPConversions {
  
  @scala.inline
  def apply(): IncludeAttributedIPConversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeAttributedIPConversions]
  }
  
  @scala.inline
  implicit class IncludeAttributedIPConversionsOps[Self <: IncludeAttributedIPConversions] (val x: Self) extends AnyVal {
    
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
    def setIncludeAttributedIPConversions(value: Boolean): Self = this.set("includeAttributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAttributedIPConversions: Self = this.set("includeAttributedIPConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedCookieConversions(value: Boolean): Self = this.set("includeUnattributedCookieConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUnattributedCookieConversions: Self = this.set("includeUnattributedCookieConversions", js.undefined)
    
    @scala.inline
    def setIncludeUnattributedIPConversions(value: Boolean): Self = this.set("includeUnattributedIPConversions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUnattributedIPConversions: Self = this.set("includeUnattributedIPConversions", js.undefined)
  }
}
