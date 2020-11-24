package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends js.Object {
  
  /** Output only. Immutable. The CSS domain ID. */
  var cssDomainId: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. The ID of the CSS group this CSS domain is affiliated with. Only populated for CSS group users. */
  var cssGroupId: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. The CSS domain's display name, used when space is constrained. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. The CSS domain's full name. */
  var fullName: js.UndefOr[String] = js.native
  
  /** Output only. Immutable. The CSS domain's homepage. */
  var homepageUri: js.UndefOr[String] = js.native
  
  /** A list of label IDs that are assigned to this CSS domain by its CSS group. Only populated for CSS group users. */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
}
object Css {
  
  @scala.inline
  def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssOps[Self <: Css] (val x: Self) extends AnyVal {
    
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
    def setCssDomainId(value: String): Self = this.set("cssDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssDomainId: Self = this.set("cssDomainId", js.undefined)
    
    @scala.inline
    def setCssGroupId(value: String): Self = this.set("cssGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssGroupId: Self = this.set("cssGroupId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    
    @scala.inline
    def setHomepageUri(value: String): Self = this.set("homepageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepageUri: Self = this.set("homepageUri", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
  }
}
