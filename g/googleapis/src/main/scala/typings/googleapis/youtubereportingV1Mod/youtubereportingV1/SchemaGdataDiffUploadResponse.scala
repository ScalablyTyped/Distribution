package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
trait SchemaGdataDiffUploadResponse extends StObject {
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var originalObject: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
}
object SchemaGdataDiffUploadResponse {
  
  @scala.inline
  def apply(): SchemaGdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadResponse]
  }
  
  @scala.inline
  implicit class SchemaGdataDiffUploadResponseMutableBuilder[Self <: SchemaGdataDiffUploadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
    
    @scala.inline
    def setOriginalObject(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
  }
}
