package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlTargeting extends js.Object {
  
  /** A list of URLs to be excluded. */
  var excludedUrls: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of URLs to be included. */
  var targetedUrls: js.UndefOr[js.Array[String]] = js.native
}
object UrlTargeting {
  
  @scala.inline
  def apply(): UrlTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlTargeting]
  }
  
  @scala.inline
  implicit class UrlTargetingOps[Self <: UrlTargeting] (val x: Self) extends AnyVal {
    
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
    def setExcludedUrlsVarargs(value: String*): Self = this.set("excludedUrls", js.Array(value :_*))
    
    @scala.inline
    def setExcludedUrls(value: js.Array[String]): Self = this.set("excludedUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedUrls: Self = this.set("excludedUrls", js.undefined)
    
    @scala.inline
    def setTargetedUrlsVarargs(value: String*): Self = this.set("targetedUrls", js.Array(value :_*))
    
    @scala.inline
    def setTargetedUrls(value: js.Array[String]): Self = this.set("targetedUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedUrls: Self = this.set("targetedUrls", js.undefined)
  }
}
