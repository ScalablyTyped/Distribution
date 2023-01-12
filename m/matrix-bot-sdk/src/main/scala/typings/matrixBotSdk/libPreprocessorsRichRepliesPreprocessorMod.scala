package typings.matrixBotSdk

import typings.matrixBotSdk.libPreprocessorsIpreprocessorMod.IPreprocessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPreprocessorsRichRepliesPreprocessorMod {
  
  @JSImport("matrix-bot-sdk/lib/preprocessors/RichRepliesPreprocessor", "RichRepliesPreprocessor")
  @js.native
  /**
    * Creates a new rich replies preprocessor.
    * @param fetchRealEventContents If enabled, this preprocessor will
    * attempt to get the real event contents and append them to the event
    * information.
    */
  open class RichRepliesPreprocessor ()
    extends StObject
       with IPreprocessor {
    def this(fetchRealEventContents: Boolean) = this()
    
    /* private */ var fetchRealEventContents: Any = js.native
  }
  
  trait IRichReplyMetadata extends StObject {
    
    /**
      * The fallback HTML the processor found. May be an empty string if
      * wasLenient is true. The fallback structure will have already been
      * removed, leaving just the original assumed HTML.
      */
    var fallbackHtmlBody: String
    
    /**
      * The fallback plain text the preprocessor found. May be an empty
      * string if wasLenient is true. The prefix characters to indicate
      * this is a fallback will have already been removed.
      */
    var fallbackPlainBody: String
    
    /**
      * The user ID that sent the parent event, as determined by the fallback
      * text. This should not be relied upon for anything serious, and instead
      * the preprocessor should be configured to fetch the real event to
      * populate the realEvent property. May be an empty string if wasLenient
      * is true.
      */
    var fallbackSender: String
    
    /**
      * The event ID the event references. May be an empty string if
      * wasLenient is true.
      */
    var parentEventId: String
    
    /**
      * If the preprocessor is configured to fetch event content, this field
      * will contain the event as reported by the homeserver. May be null if
      * wasLenient is true.
      */
    var realEvent: Any
    
    /**
      * If true, the preprocessor found some inconsistencies in the reply
      * information that does not match the specification. For example,
      * this may indicate that a reply was sent without an HTML component.
      */
    var wasLenient: Boolean
  }
  object IRichReplyMetadata {
    
    inline def apply(
      fallbackHtmlBody: String,
      fallbackPlainBody: String,
      fallbackSender: String,
      parentEventId: String,
      realEvent: Any,
      wasLenient: Boolean
    ): IRichReplyMetadata = {
      val __obj = js.Dynamic.literal(fallbackHtmlBody = fallbackHtmlBody.asInstanceOf[js.Any], fallbackPlainBody = fallbackPlainBody.asInstanceOf[js.Any], fallbackSender = fallbackSender.asInstanceOf[js.Any], parentEventId = parentEventId.asInstanceOf[js.Any], realEvent = realEvent.asInstanceOf[js.Any], wasLenient = wasLenient.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRichReplyMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRichReplyMetadata] (val x: Self) extends AnyVal {
      
      inline def setFallbackHtmlBody(value: String): Self = StObject.set(x, "fallbackHtmlBody", value.asInstanceOf[js.Any])
      
      inline def setFallbackPlainBody(value: String): Self = StObject.set(x, "fallbackPlainBody", value.asInstanceOf[js.Any])
      
      inline def setFallbackSender(value: String): Self = StObject.set(x, "fallbackSender", value.asInstanceOf[js.Any])
      
      inline def setParentEventId(value: String): Self = StObject.set(x, "parentEventId", value.asInstanceOf[js.Any])
      
      inline def setRealEvent(value: Any): Self = StObject.set(x, "realEvent", value.asInstanceOf[js.Any])
      
      inline def setWasLenient(value: Boolean): Self = StObject.set(x, "wasLenient", value.asInstanceOf[js.Any])
    }
  }
}
