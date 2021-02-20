package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffChecksumsResponse extends StObject {
  
  /**
    * gdata
    */
  var checksumsLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  
  /**
    * gdata
    */
  var chunkSizeBytes: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}
object SchemaGdataDiffChecksumsResponse {
  
  @scala.inline
  def apply(): SchemaGdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffChecksumsResponse]
  }
  
  @scala.inline
  implicit class SchemaGdataDiffChecksumsResponseMutableBuilder[Self <: SchemaGdataDiffChecksumsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksumsLocation(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "checksumsLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumsLocationUndefined: Self = StObject.set(x, "checksumsLocation", js.undefined)
    
    @scala.inline
    def setChunkSizeBytes(value: String): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectLocation(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
    
    @scala.inline
    def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
