package typings.hlsJs.mod

import typings.hlsJs.anon.PartialCMCDHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "CMCDController")
@js.native
open class CMCDController protected ()
  extends StObject
     with ComponentAPI {
  def this(hls: Hls) = this()
  
  /**
    * Apply CMCD data to a request.
    */
  /* private */ @JSName("apply")
  var apply: Any = js.native
  
  /**
    * Apply CMCD data to a segment request
    */
  /* private */ var applyFragmentData: Any = js.native
  
  /**
    * Apply CMCD data to a manifest request.
    */
  /* private */ var applyPlaylistData: Any = js.native
  
  /* private */ var audioBuffer: Any = js.native
  
  /* private */ var buffering: Any = js.native
  
  /* private */ var cid: Any = js.native
  
  /* private */ var config: Any = js.native
  
  /**
    * Create baseline CMCD data
    */
  /* private */ var createData: Any = js.native
  
  /**
    * Create a playlist loader
    */
  /* private */ var createFragmentLoader: Any = js.native
  
  /**
    * Create a playlist loader
    */
  /* private */ var createPlaylistLoader: Any = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * Get the buffer length for a media type in milliseconds
    */
  /* private */ var getBufferLength: Any = js.native
  
  /**
    * The CMCD object type.
    */
  /* private */ var getObjectType: Any = js.native
  
  /**
    * Get the highest bitrate.
    */
  /* private */ var getTopBandwidth: Any = js.native
  
  /* private */ var hls: Any = js.native
  
  /* private */ var initialized: Any = js.native
  
  /* private */ var media: Any = js.native
  
  /* private */ var onBufferCreated: Any = js.native
  
  /* private */ var onMediaAttached: Any = js.native
  
  /* private */ var onMediaDetached: Any = js.native
  
  /* private */ var onPlaying: Any = js.native
  
  /* private */ var onWaiting: Any = js.native
  
  /* private */ var registerListeners: Any = js.native
  
  /* private */ var sid: Any = js.native
  
  /* private */ var starved: Any = js.native
  
  /* private */ var unregisterListeners: Any = js.native
  
  /* private */ var useHeaders: Any = js.native
  
  /* private */ var videoBuffer: Any = js.native
}
/* static members */
object CMCDController {
  
  @JSImport("hls.js", "CMCDController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Append query args to a uri.
    */
  inline def appendQueryToUri(uri: Any, query: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("appendQueryToUri")(uri.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Serialize a CMCD data object according to the rules defined in the
    * section 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  inline def serialize(data: CMCD): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Convert a CMCD data object to request headers according to the rules
    * defined in the section 2.1 and 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  inline def toHeaders(data: CMCD): PartialCMCDHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("toHeaders")(data.asInstanceOf[js.Any]).asInstanceOf[PartialCMCDHeaders]
  
  /**
    * Convert a CMCD data object to query args according to the rules
    * defined in the section 2.2 and 3.2 of
    * [CTA-5004](https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf).
    */
  inline def toQuery(data: CMCD): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQuery")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generate a random v4 UUI
    *
    * @returns {string}
    */
  inline def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
}
