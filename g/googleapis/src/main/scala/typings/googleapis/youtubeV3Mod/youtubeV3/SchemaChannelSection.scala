package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaChannelSection extends StObject {
  
  /**
    * The contentDetails object contains details about the channel section
    * content, such as a list of playlists or channels featured in the section.
    */
  var contentDetails: js.UndefOr[SchemaChannelSectionContentDetails] = js.native
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the channel section.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelSection&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaChannelSectionLocalization]] = js.native
  
  /**
    * The snippet object contains basic details about the channel section, such
    * as its type, style and title.
    */
  var snippet: js.UndefOr[SchemaChannelSectionSnippet] = js.native
  
  /**
    * The targeting object contains basic targeting settings about the channel
    * section.
    */
  var targeting: js.UndefOr[SchemaChannelSectionTargeting] = js.native
}
object SchemaChannelSection {
  
  @scala.inline
  def apply(): SchemaChannelSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSection]
  }
  
  @scala.inline
  implicit class SchemaChannelSectionMutableBuilder[Self <: SchemaChannelSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: SchemaChannelSectionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalizations(value: StringDictionary[SchemaChannelSectionLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaChannelSectionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setTargeting(value: SchemaChannelSectionTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
  }
}
