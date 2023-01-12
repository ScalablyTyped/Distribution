package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  /** Formatting to be applied when rendering the Segment. For all segment types, this is the standard way of representing that the Segment should be rendered in bold, italics, etc. */
  var formatting: js.UndefOr[Formatting] = js.undefined
  
  /** For HASHTAG type: */
  var hashtagData: js.UndefOr[HashtagData] = js.undefined
  
  /** Type-specific metadata. At most one of these should be populated, and the one that is populated should correspond to the type of the Segment. For LINK type: */
  var linkData: js.UndefOr[LinkData] = js.undefined
  
  /**
    * Text content of the Segment. As a general rule, this field should contain the actual text that should be rendered in the UI. Thus, for a hashtag, it should be "#Foo", and for a
    * link, it should be the display text. Clients that do not understand a particular segment type may use this text, along with the Formatting info below, as a fallback for display. The
    * field is not required -- if all relevant information is carried in other metadata fields and there is no need for a fallback, or it is not practical for a fallback to be provided
    * for any other reason, the field may be left blank. A standard example would be a user reference being transmitted between server layers, where a gaia-ID representation may be
    * sufficient and there is no need for a textual fallback. In such a case, it would be valid and useful - though not required - for servers to compute and populate a fallback on the
    * serving path.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /** Type of Segment. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** For USER_MENTION type: */
  var userMentionData: js.UndefOr[UserMentionData] = js.undefined
}
object Segment {
  
  inline def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    inline def setFormatting(value: Formatting): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    inline def setFormattingUndefined: Self = StObject.set(x, "formatting", js.undefined)
    
    inline def setHashtagData(value: HashtagData): Self = StObject.set(x, "hashtagData", value.asInstanceOf[js.Any])
    
    inline def setHashtagDataUndefined: Self = StObject.set(x, "hashtagData", js.undefined)
    
    inline def setLinkData(value: LinkData): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    inline def setLinkDataUndefined: Self = StObject.set(x, "linkData", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserMentionData(value: UserMentionData): Self = StObject.set(x, "userMentionData", value.asInstanceOf[js.Any])
    
    inline def setUserMentionDataUndefined: Self = StObject.set(x, "userMentionData", js.undefined)
  }
}
