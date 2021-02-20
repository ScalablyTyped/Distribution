package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffUploadRequest extends StObject {
  
  /**
    * gdata
    */
  var checksumsInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  
  /**
    * gdata
    */
  var objectInfo: js.UndefOr[SchemaGdataCompositeMedia] = js.native
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.native
}
object SchemaGdataDiffUploadRequest {
  
  @scala.inline
  def apply(): SchemaGdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffUploadRequest]
  }
  
  @scala.inline
  implicit class SchemaGdataDiffUploadRequestMutableBuilder[Self <: SchemaGdataDiffUploadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksumsInfo(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "checksumsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumsInfoUndefined: Self = StObject.set(x, "checksumsInfo", js.undefined)
    
    @scala.inline
    def setObjectInfo(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "objectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectInfoUndefined: Self = StObject.set(x, "objectInfo", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
