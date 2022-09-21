package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CMCD
  */
trait CMCD extends StObject {
  
  /**
    * Buffer length
    *
    * The buffer length associated with the media object being requested. This value MUST be rounded to the nearest 100 ms. This key SHOULD only be
    * sent with an object type of ‘a’, ‘v’ or ‘av’.
    *
    * Integer milliseconds
    */
  var bl: js.UndefOr[Double] = js.undefined
  
  /**
    * Encoded bitrate
    *
    * The encoded bitrate of the audio or video object being requested. This may not be known precisely by the player; however,
    * it MAY be estimated based upon playlist/manifest declarations. If the playlist declares both peak and average bitrate values,
    * the peak value should be transmitted.
    *
    * Integer kbps
    */
  var br: js.UndefOr[Double] = js.undefined
  
  /**
    * Buffer starvation
    *
    * Key is included without a value if the buffer was starved at some point between the prior request and this object request,
    * resulting in the player being in a rebuffering state and the video or audio playback being stalled. This key MUST NOT be
    * sent if the buffer was not starved since the prior request.
    *
    * If the object type `ot` key is sent along with this key, then the `bs` key refers to the buffer associated with the particular
    * object type. If no object type is communicated, then the buffer state applies to the current session.
    *
    * Boolean
    */
  var bs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Content ID
    *
    * A unique string identifying the current content. Maximum length is 64 characters. This value is consistent across multiple different
    * sessions and devices and is defined and updated at the discretion of the service provider.
    *
    * String
    */
  var cid: js.UndefOr[String] = js.undefined
  
  /**
    * Object duration
    *
    * The playback duration in milliseconds of the object being requested. If a partial segment is being requested, then this value
    * MUST indicate the playback duration of that part and not that of its parent segment. This value can be an approximation of the
    * estimated duration if the explicit value is not known.
    *
    * Integer milliseconds
    */
  var d: js.UndefOr[Double] = js.undefined
  
  /**
    * Deadline
    *
    * Deadline from the request time until the first sample of this Segment/Object needs to be available in order to not create a buffer underrun or
    * any other playback problems. This value MUST be rounded to the nearest 100ms. For a playback rate of 1, this may be equivalent to the player’s
    * remaining buffer length.
    *
    * Integer milliseconds
    */
  var dl: js.UndefOr[Double] = js.undefined
  
  /**
    * Measured mtp CMCD throughput
    *
    * The throughput between client and server, as measured by the client and MUST be rounded to the nearest 100 kbps. This value, however derived,
    * SHOULD be the value that the client is using to make its next Adaptive Bitrate switching decision. If the client is connected to multiple
    * servers concurrently, it must take care to report only the throughput measured against the receiving server. If the client has multiple concurrent
    * connections to the server, then the intent is that this value communicates the aggregate throughput the client sees across all those connections.
    *
    * Integer kbps
    */
  var mtp: js.UndefOr[Double] = js.undefined
  
  /**
    * Next object request
    *
    * Relative path of the next object to be requested. This can be used to trigger pre-fetching by the CDN. This MUST be a path relative to the current
    * request. This string MUST be URLEncoded. The client SHOULD NOT depend upon any pre-fetch action being taken - it is merely a request for such a
    * pre-fetch to take place.
    *
    * String
    */
  var nor: js.UndefOr[String] = js.undefined
  
  /**
    * Next range request
    *
    * If the next request will be a partial object request, then this string denotes the byte range to be requested. If the ‘nor’ field is not set, then the
    * object is assumed to match the object currently being requested. The client SHOULD NOT depend upon any pre-fetch action being taken – it is merely a
    * request for such a pre-fetch to take place. Formatting is similar to the HTTP Range header, except that the unit MUST be ‘byte’, the ‘Range:’ prefix is
    * NOT required and specifying multiple ranges is NOT allowed. Valid combinations are:
    *
    * - `"\<range-start\>-"`
    * - `"\<range-start\>-\<range-end\>"`
    * - `"-\<suffix-length\>"`
    *
    * String
    */
  var nrr: js.UndefOr[String] = js.undefined
  
  /**
    * Object type
    *
    * The media type of the current object being requested:
    * - `m` = text file, such as a manifest or playlist
    * - `a` = audio only
    * - `v` = video only
    * - `av` = muxed audio and video
    * - `i` = init segment
    * - `c` = caption or subtitle
    * - `tt` = ISOBMFF timed text track
    * - `k` = cryptographic key, license or certificate.
    * - `o` = other
    *
    * If the object type being requested is unknown, then this key MUST NOT be used.
    */
  var ot: js.UndefOr[CMCDObjectType] = js.undefined
  
  /**
    * Playback rate
    *
    * `1` if real-time, `2` if double speed, `0` if not playing. SHOULD only be sent if not equal to `1`.
    *
    * Decimal
    */
  var pr: js.UndefOr[Double] = js.undefined
  
  /**
    * Requested maximum throughput
    *
    * The requested maximum throughput that the client considers sufficient for delivery of the asset. Values MUST be rounded to the
    * nearest 100kbps. For example, a client would indicate that the current segment, encoded at 2Mbps, is to be delivered at no more
    * than 10Mbps, by using rtp=10000.
    *
    * Note: This can benefit clients by preventing buffer saturation through over-delivery and can also deliver a community benefit
    * through fair-share delivery. The concept is that each client receives the throughput necessary for great performance, but no more.
    * The CDN may not support the rtp feature.
    *
    * Integer kbps
    */
  var rtp: js.UndefOr[Double] = js.undefined
  
  /**
    * Streaming format
    *
    * The streaming format that defines the current request.
    *
    * - `d` = MPEG DASH
    * - `h` = HTTP Live Streaming (HLS)
    * - `s` = Smooth Streaming
    * - `o` = other
    *
    * If the streaming format being requested is unknown, then this key MUST NOT be used.
    */
  var sf: js.UndefOr[CMCDStreamingFormat] = js.undefined
  
  /**
    * Session ID
    *
    * A GUID identifying the current playback session. A playback session typically ties together segments belonging to a single media asset.
    * Maximum length is 64 characters. It is RECOMMENDED to conform to the UUID specification.
    *
    * String
    */
  var sid: js.UndefOr[String] = js.undefined
  
  /**
    * Stream type
    * - `v` = all segments are available – e.g., VOD
    * - `l` = segments become available over time – e.g., LIVE
    */
  var st: js.UndefOr[CMCDStreamType] = js.undefined
  
  /**
    * Startup
    *
    * Key is included without a value if the object is needed urgently due to startup, seeking or recovery after a buffer-empty event. The media SHOULD not be
    * rendering when this request is made. This key MUST not be sent if it is FALSE.
    *
    * Boolean
    */
  var su: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Top bitrate
    *
    * The highest bitrate rendition in the manifest or playlist that the client is allowed to play, given current codec, licensing and
    * sizing constraints.
    *
    * Integer Kbps
    */
  var tb: js.UndefOr[Double] = js.undefined
  
  /**
    * CMCD version
    *
    * The version of this specification used for interpreting the defined key names and values. If this key is omitted, the client and server MUST
    * interpret the values as being defined by version 1. Client SHOULD omit this field if the version is 1.
    *
    * Integer
    */
  var v: js.UndefOr[Double] = js.undefined
}
object CMCD {
  
  inline def apply(): CMCD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CMCD]
  }
  
  extension [Self <: CMCD](x: Self) {
    
    inline def setBl(value: Double): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
    
    inline def setBr(value: Double): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
    
    inline def setBs(value: Boolean): Self = StObject.set(x, "bs", value.asInstanceOf[js.Any])
    
    inline def setBsUndefined: Self = StObject.set(x, "bs", js.undefined)
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDl(value: Double): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
    
    inline def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
    
    inline def setMtp(value: Double): Self = StObject.set(x, "mtp", value.asInstanceOf[js.Any])
    
    inline def setMtpUndefined: Self = StObject.set(x, "mtp", js.undefined)
    
    inline def setNor(value: String): Self = StObject.set(x, "nor", value.asInstanceOf[js.Any])
    
    inline def setNorUndefined: Self = StObject.set(x, "nor", js.undefined)
    
    inline def setNrr(value: String): Self = StObject.set(x, "nrr", value.asInstanceOf[js.Any])
    
    inline def setNrrUndefined: Self = StObject.set(x, "nrr", js.undefined)
    
    inline def setOt(value: CMCDObjectType): Self = StObject.set(x, "ot", value.asInstanceOf[js.Any])
    
    inline def setOtUndefined: Self = StObject.set(x, "ot", js.undefined)
    
    inline def setPr(value: Double): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setRtp(value: Double): Self = StObject.set(x, "rtp", value.asInstanceOf[js.Any])
    
    inline def setRtpUndefined: Self = StObject.set(x, "rtp", js.undefined)
    
    inline def setSf(value: CMCDStreamingFormat): Self = StObject.set(x, "sf", value.asInstanceOf[js.Any])
    
    inline def setSfUndefined: Self = StObject.set(x, "sf", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setSt(value: CMCDStreamType): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
    
    inline def setStUndefined: Self = StObject.set(x, "st", js.undefined)
    
    inline def setSu(value: Boolean): Self = StObject.set(x, "su", value.asInstanceOf[js.Any])
    
    inline def setSuUndefined: Self = StObject.set(x, "su", js.undefined)
    
    inline def setTb(value: Double): Self = StObject.set(x, "tb", value.asInstanceOf[js.Any])
    
    inline def setTbUndefined: Self = StObject.set(x, "tb", js.undefined)
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
