package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobConfig extends StObject {
  
  /**
    * List of ad breaks. Specifies where to insert ad break tags in the output manifests.
    */
  var adBreaks: js.UndefOr[js.Array[SchemaAdBreak]] = js.undefined
  
  /**
    * List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
    */
  var editList: js.UndefOr[js.Array[SchemaEditAtom]] = js.undefined
  
  /**
    * List of elementary streams.
    */
  var elementaryStreams: js.UndefOr[js.Array[SchemaElementaryStream]] = js.undefined
  
  /**
    * List of input assets stored in Cloud Storage.
    */
  var inputs: js.UndefOr[js.Array[SchemaInput]] = js.undefined
  
  /**
    * List of output manifests.
    */
  var manifests: js.UndefOr[js.Array[SchemaManifest]] = js.undefined
  
  /**
    * List of multiplexing settings for output streams.
    */
  var muxStreams: js.UndefOr[js.Array[SchemaMuxStream]] = js.undefined
  
  /**
    * Output configuration.
    */
  var output: js.UndefOr[SchemaOutput] = js.undefined
  
  /**
    * List of overlays on the output video, in descending Z-order.
    */
  var overlays: js.UndefOr[js.Array[SchemaOverlay]] = js.undefined
  
  /**
    * Destination on Pub/Sub.
    */
  var pubsubDestination: js.UndefOr[SchemaPubsubDestination] = js.undefined
  
  /**
    * List of output sprite sheets. Spritesheets require at least one VideoStream in the Jobconfig.
    */
  var spriteSheets: js.UndefOr[js.Array[SchemaSpriteSheet]] = js.undefined
}
object SchemaJobConfig {
  
  inline def apply(): SchemaJobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobConfig]
  }
  
  extension [Self <: SchemaJobConfig](x: Self) {
    
    inline def setAdBreaks(value: js.Array[SchemaAdBreak]): Self = StObject.set(x, "adBreaks", value.asInstanceOf[js.Any])
    
    inline def setAdBreaksUndefined: Self = StObject.set(x, "adBreaks", js.undefined)
    
    inline def setAdBreaksVarargs(value: SchemaAdBreak*): Self = StObject.set(x, "adBreaks", js.Array(value*))
    
    inline def setEditList(value: js.Array[SchemaEditAtom]): Self = StObject.set(x, "editList", value.asInstanceOf[js.Any])
    
    inline def setEditListUndefined: Self = StObject.set(x, "editList", js.undefined)
    
    inline def setEditListVarargs(value: SchemaEditAtom*): Self = StObject.set(x, "editList", js.Array(value*))
    
    inline def setElementaryStreams(value: js.Array[SchemaElementaryStream]): Self = StObject.set(x, "elementaryStreams", value.asInstanceOf[js.Any])
    
    inline def setElementaryStreamsUndefined: Self = StObject.set(x, "elementaryStreams", js.undefined)
    
    inline def setElementaryStreamsVarargs(value: SchemaElementaryStream*): Self = StObject.set(x, "elementaryStreams", js.Array(value*))
    
    inline def setInputs(value: js.Array[SchemaInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: SchemaInput*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setManifests(value: js.Array[SchemaManifest]): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    inline def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    inline def setManifestsVarargs(value: SchemaManifest*): Self = StObject.set(x, "manifests", js.Array(value*))
    
    inline def setMuxStreams(value: js.Array[SchemaMuxStream]): Self = StObject.set(x, "muxStreams", value.asInstanceOf[js.Any])
    
    inline def setMuxStreamsUndefined: Self = StObject.set(x, "muxStreams", js.undefined)
    
    inline def setMuxStreamsVarargs(value: SchemaMuxStream*): Self = StObject.set(x, "muxStreams", js.Array(value*))
    
    inline def setOutput(value: SchemaOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOverlays(value: js.Array[SchemaOverlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    inline def setOverlaysVarargs(value: SchemaOverlay*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setPubsubDestination(value: SchemaPubsubDestination): Self = StObject.set(x, "pubsubDestination", value.asInstanceOf[js.Any])
    
    inline def setPubsubDestinationUndefined: Self = StObject.set(x, "pubsubDestination", js.undefined)
    
    inline def setSpriteSheets(value: js.Array[SchemaSpriteSheet]): Self = StObject.set(x, "spriteSheets", value.asInstanceOf[js.Any])
    
    inline def setSpriteSheetsUndefined: Self = StObject.set(x, "spriteSheets", js.undefined)
    
    inline def setSpriteSheetsVarargs(value: SchemaSpriteSheet*): Self = StObject.set(x, "spriteSheets", js.Array(value*))
  }
}
