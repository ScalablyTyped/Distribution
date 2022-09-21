package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpriteSheet extends StObject {
  
  /**
    * The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
    */
  var columnCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
    */
  var endTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `"sprite_sheet0000000123.jpeg"`.
    */
  var filePrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format type. The default is `"jpeg"`. Supported formats: - 'jpeg'
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
    */
  var interval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
    */
  var quality: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
    */
  var rowCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
    */
  var spriteHeightPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
    */
  var spriteWidthPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
    */
  var startTimeOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
    */
  var totalCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSpriteSheet {
  
  inline def apply(): SchemaSpriteSheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpriteSheet]
  }
  
  extension [Self <: SchemaSpriteSheet](x: Self) {
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountNull: Self = StObject.set(x, "columnCount", null)
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetNull: Self = StObject.set(x, "endTimeOffset", null)
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setFilePrefix(value: String): Self = StObject.set(x, "filePrefix", value.asInstanceOf[js.Any])
    
    inline def setFilePrefixNull: Self = StObject.set(x, "filePrefix", null)
    
    inline def setFilePrefixUndefined: Self = StObject.set(x, "filePrefix", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalNull: Self = StObject.set(x, "interval", null)
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityNull: Self = StObject.set(x, "quality", null)
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountNull: Self = StObject.set(x, "rowCount", null)
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setSpriteHeightPixels(value: Double): Self = StObject.set(x, "spriteHeightPixels", value.asInstanceOf[js.Any])
    
    inline def setSpriteHeightPixelsNull: Self = StObject.set(x, "spriteHeightPixels", null)
    
    inline def setSpriteHeightPixelsUndefined: Self = StObject.set(x, "spriteHeightPixels", js.undefined)
    
    inline def setSpriteWidthPixels(value: Double): Self = StObject.set(x, "spriteWidthPixels", value.asInstanceOf[js.Any])
    
    inline def setSpriteWidthPixelsNull: Self = StObject.set(x, "spriteWidthPixels", null)
    
    inline def setSpriteWidthPixelsUndefined: Self = StObject.set(x, "spriteWidthPixels", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetNull: Self = StObject.set(x, "startTimeOffset", null)
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
