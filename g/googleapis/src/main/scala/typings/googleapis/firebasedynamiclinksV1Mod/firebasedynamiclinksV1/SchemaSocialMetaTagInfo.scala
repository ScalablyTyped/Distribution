package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for social meta tag params. Used to set meta tag data for link
  * previews on social sites.
  */
@js.native
trait SchemaSocialMetaTagInfo extends StObject {
  
  /**
    * A short description of the link. Optional.
    */
  var socialDescription: js.UndefOr[String] = js.native
  
  /**
    * An image url string. Optional.
    */
  var socialImageLink: js.UndefOr[String] = js.native
  
  /**
    * Title to be displayed. Optional.
    */
  var socialTitle: js.UndefOr[String] = js.native
}
object SchemaSocialMetaTagInfo {
  
  @scala.inline
  def apply(): SchemaSocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSocialMetaTagInfo]
  }
  
  @scala.inline
  implicit class SchemaSocialMetaTagInfoMutableBuilder[Self <: SchemaSocialMetaTagInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSocialDescription(value: String): Self = StObject.set(x, "socialDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialDescriptionUndefined: Self = StObject.set(x, "socialDescription", js.undefined)
    
    @scala.inline
    def setSocialImageLink(value: String): Self = StObject.set(x, "socialImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialImageLinkUndefined: Self = StObject.set(x, "socialImageLink", js.undefined)
    
    @scala.inline
    def setSocialTitle(value: String): Self = StObject.set(x, "socialTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialTitleUndefined: Self = StObject.set(x, "socialTitle", js.undefined)
  }
}
