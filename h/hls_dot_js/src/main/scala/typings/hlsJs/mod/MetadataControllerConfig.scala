package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataControllerConfig extends StObject {
  
  var enableDateRangeMetadataCues: Boolean
  
  var enableEmsgMetadataCues: Boolean
  
  var enableID3MetadataCues: Boolean
}
object MetadataControllerConfig {
  
  inline def apply(
    enableDateRangeMetadataCues: Boolean,
    enableEmsgMetadataCues: Boolean,
    enableID3MetadataCues: Boolean
  ): MetadataControllerConfig = {
    val __obj = js.Dynamic.literal(enableDateRangeMetadataCues = enableDateRangeMetadataCues.asInstanceOf[js.Any], enableEmsgMetadataCues = enableEmsgMetadataCues.asInstanceOf[js.Any], enableID3MetadataCues = enableID3MetadataCues.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataControllerConfig]
  }
  
  extension [Self <: MetadataControllerConfig](x: Self) {
    
    inline def setEnableDateRangeMetadataCues(value: Boolean): Self = StObject.set(x, "enableDateRangeMetadataCues", value.asInstanceOf[js.Any])
    
    inline def setEnableEmsgMetadataCues(value: Boolean): Self = StObject.set(x, "enableEmsgMetadataCues", value.asInstanceOf[js.Any])
    
    inline def setEnableID3MetadataCues(value: Boolean): Self = StObject.set(x, "enableID3MetadataCues", value.asInstanceOf[js.Any])
  }
}
