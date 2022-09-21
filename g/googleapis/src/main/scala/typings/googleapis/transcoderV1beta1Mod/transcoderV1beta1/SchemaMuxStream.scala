package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMuxStream extends StObject {
  
  /**
    * The container format. The default is `"mp4"` Supported container formats: - 'ts' - 'fmp4'- the corresponding file extension is `".m4s"` - 'mp4' - 'vtt'
    */
  var container: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of `ElementaryStream.key`s multiplexed in this stream.
    */
  var elementaryStreams: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Encryption settings.
    */
  var encryption: js.UndefOr[SchemaEncryption] = js.undefined
  
  /**
    * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `"mux_stream0000000123.ts"`.
    */
  var fileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `".m3u8"` extension suffix.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Segment settings for `"ts"`, `"fmp4"` and `"vtt"`.
    */
  var segmentSettings: js.UndefOr[SchemaSegmentSettings] = js.undefined
}
object SchemaMuxStream {
  
  inline def apply(): SchemaMuxStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMuxStream]
  }
  
  extension [Self <: SchemaMuxStream](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setElementaryStreams(value: js.Array[String]): Self = StObject.set(x, "elementaryStreams", value.asInstanceOf[js.Any])
    
    inline def setElementaryStreamsNull: Self = StObject.set(x, "elementaryStreams", null)
    
    inline def setElementaryStreamsUndefined: Self = StObject.set(x, "elementaryStreams", js.undefined)
    
    inline def setElementaryStreamsVarargs(value: String*): Self = StObject.set(x, "elementaryStreams", js.Array(value*))
    
    inline def setEncryption(value: SchemaEncryption): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSegmentSettings(value: SchemaSegmentSettings): Self = StObject.set(x, "segmentSettings", value.asInstanceOf[js.Any])
    
    inline def setSegmentSettingsUndefined: Self = StObject.set(x, "segmentSettings", js.undefined)
  }
}
