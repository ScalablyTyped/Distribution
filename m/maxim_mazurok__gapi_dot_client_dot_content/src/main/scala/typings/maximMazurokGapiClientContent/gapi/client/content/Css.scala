package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  /** Output only. Immutable. The CSS domain ID. */
  var cssDomainId: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The ID of the CSS group this CSS domain is affiliated with. Only populated for CSS group users. */
  var cssGroupId: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The CSS domain's display name, used when space is constrained. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The CSS domain's full name. */
  var fullName: js.UndefOr[String] = js.undefined
  
  /** Output only. Immutable. The CSS domain's homepage. */
  var homepageUri: js.UndefOr[String] = js.undefined
  
  /** A list of label IDs that are assigned to this CSS domain by its CSS group. Only populated for CSS group users. */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
}
object Css {
  
  @scala.inline
  def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssDomainId(value: String): Self = StObject.set(x, "cssDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssDomainIdUndefined: Self = StObject.set(x, "cssDomainId", js.undefined)
    
    @scala.inline
    def setCssGroupId(value: String): Self = StObject.set(x, "cssGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssGroupIdUndefined: Self = StObject.set(x, "cssGroupId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setHomepageUri(value: String): Self = StObject.set(x, "homepageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepageUriUndefined: Self = StObject.set(x, "homepageUri", js.undefined)
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
  }
}
