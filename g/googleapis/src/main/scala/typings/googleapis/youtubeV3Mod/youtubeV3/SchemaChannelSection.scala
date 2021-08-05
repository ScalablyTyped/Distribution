package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelSection extends StObject {
  
  /**
    * The contentDetails object contains details about the channel section
    * content, such as a list of playlists or channels featured in the section.
    */
  var contentDetails: js.UndefOr[SchemaChannelSectionContentDetails] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the channel section.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelSection&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaChannelSectionLocalization]] = js.undefined
  
  /**
    * The snippet object contains basic details about the channel section, such
    * as its type, style and title.
    */
  var snippet: js.UndefOr[SchemaChannelSectionSnippet] = js.undefined
  
  /**
    * The targeting object contains basic targeting settings about the channel
    * section.
    */
  var targeting: js.UndefOr[SchemaChannelSectionTargeting] = js.undefined
}
object SchemaChannelSection {
  
  inline def apply(): SchemaChannelSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSection]
  }
  
  extension [Self <: SchemaChannelSection](x: Self) {
    
    inline def setContentDetails(value: SchemaChannelSectionContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalizations(value: StringDictionary[SchemaChannelSectionLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setSnippet(value: SchemaChannelSectionSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setTargeting(value: SchemaChannelSectionTargeting): Self = StObject.set(x, "targeting", value.asInstanceOf[js.Any])
    
    inline def setTargetingUndefined: Self = StObject.set(x, "targeting", js.undefined)
  }
}
