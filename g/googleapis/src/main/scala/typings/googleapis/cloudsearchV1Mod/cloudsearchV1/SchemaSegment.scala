package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegment extends StObject {
  
  /**
    * Formatting to be applied when rendering the Segment. For all segment types, this is the standard way of representing that the Segment should be rendered in bold, italics, etc.
    */
  var formatting: js.UndefOr[SchemaFormatting] = js.undefined
  
  /**
    * For HASHTAG type:
    */
  var hashtagData: js.UndefOr[SchemaHashtagData] = js.undefined
  
  /**
    * Type-specific metadata. At most one of these should be populated, and the one that is populated should correspond to the type of the Segment. For LINK type:
    */
  var linkData: js.UndefOr[SchemaLinkData] = js.undefined
  
  /**
    * Text content of the Segment. As a general rule, this field should contain the actual text that should be rendered in the UI. Thus, for a hashtag, it should be "#Foo", and for a link, it should be the display text. Clients that do not understand a particular segment type may use this text, along with the Formatting info below, as a fallback for display. The field is not required -- if all relevant information is carried in other metadata fields and there is no need for a fallback, or it is not practical for a fallback to be provided for any other reason, the field may be left blank. A standard example would be a user reference being transmitted between server layers, where a gaia-ID representation may be sufficient and there is no need for a textual fallback. In such a case, it would be valid and useful - though not required - for servers to compute and populate a fallback on the serving path.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of Segment.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For USER_MENTION type:
    */
  var userMentionData: js.UndefOr[SchemaUserMentionData] = js.undefined
}
object SchemaSegment {
  
  inline def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  extension [Self <: SchemaSegment](x: Self) {
    
    inline def setFormatting(value: SchemaFormatting): Self = StObject.set(x, "formatting", value.asInstanceOf[js.Any])
    
    inline def setFormattingUndefined: Self = StObject.set(x, "formatting", js.undefined)
    
    inline def setHashtagData(value: SchemaHashtagData): Self = StObject.set(x, "hashtagData", value.asInstanceOf[js.Any])
    
    inline def setHashtagDataUndefined: Self = StObject.set(x, "hashtagData", js.undefined)
    
    inline def setLinkData(value: SchemaLinkData): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    inline def setLinkDataUndefined: Self = StObject.set(x, "linkData", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserMentionData(value: SchemaUserMentionData): Self = StObject.set(x, "userMentionData", value.asInstanceOf[js.Any])
    
    inline def setUserMentionDataUndefined: Self = StObject.set(x, "userMentionData", js.undefined)
  }
}
