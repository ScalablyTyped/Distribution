package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1StorageFormatJsonOptions extends StObject {
  
  /**
    * Optional. The character encoding of the data. Accepts "US-ASCII", "UTF-8" and "ISO-8859-1". Defaults to UTF-8 if not specified.
    */
  var encoding: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1StorageFormatJsonOptions {
  
  inline def apply(): SchemaGoogleCloudDataplexV1StorageFormatJsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1StorageFormatJsonOptions]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1StorageFormatJsonOptions](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
