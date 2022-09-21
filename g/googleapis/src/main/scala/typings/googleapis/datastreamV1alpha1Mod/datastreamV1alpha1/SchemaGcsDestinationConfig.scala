package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGcsDestinationConfig extends StObject {
  
  /**
    * AVRO file format configuration.
    */
  var avroFileFormat: js.UndefOr[SchemaAvroFileFormat] = js.undefined
  
  /**
    * The maximum duration for which new events are added before a file is closed and a new file is created.
    */
  var fileRotationInterval: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum file size to be saved in the bucket.
    */
  var fileRotationMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * File format that data should be written in. Deprecated field (b/169501737) - use file_format instead.
    */
  var gcsFileFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * JSON file format configuration.
    */
  var jsonFileFormat: js.UndefOr[SchemaJsonFileFormat] = js.undefined
  
  /**
    * Path inside the Cloud Storage bucket to write data to.
    */
  var path: js.UndefOr[String | Null] = js.undefined
}
object SchemaGcsDestinationConfig {
  
  inline def apply(): SchemaGcsDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGcsDestinationConfig]
  }
  
  extension [Self <: SchemaGcsDestinationConfig](x: Self) {
    
    inline def setAvroFileFormat(value: SchemaAvroFileFormat): Self = StObject.set(x, "avroFileFormat", value.asInstanceOf[js.Any])
    
    inline def setAvroFileFormatUndefined: Self = StObject.set(x, "avroFileFormat", js.undefined)
    
    inline def setFileRotationInterval(value: String): Self = StObject.set(x, "fileRotationInterval", value.asInstanceOf[js.Any])
    
    inline def setFileRotationIntervalNull: Self = StObject.set(x, "fileRotationInterval", null)
    
    inline def setFileRotationIntervalUndefined: Self = StObject.set(x, "fileRotationInterval", js.undefined)
    
    inline def setFileRotationMb(value: Double): Self = StObject.set(x, "fileRotationMb", value.asInstanceOf[js.Any])
    
    inline def setFileRotationMbNull: Self = StObject.set(x, "fileRotationMb", null)
    
    inline def setFileRotationMbUndefined: Self = StObject.set(x, "fileRotationMb", js.undefined)
    
    inline def setGcsFileFormat(value: String): Self = StObject.set(x, "gcsFileFormat", value.asInstanceOf[js.Any])
    
    inline def setGcsFileFormatNull: Self = StObject.set(x, "gcsFileFormat", null)
    
    inline def setGcsFileFormatUndefined: Self = StObject.set(x, "gcsFileFormat", js.undefined)
    
    inline def setJsonFileFormat(value: SchemaJsonFileFormat): Self = StObject.set(x, "jsonFileFormat", value.asInstanceOf[js.Any])
    
    inline def setJsonFileFormatUndefined: Self = StObject.set(x, "jsonFileFormat", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
