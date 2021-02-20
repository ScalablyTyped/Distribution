package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataDiffDownloadResponse extends StObject {
  
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.native
}
object SchemaGdataDiffDownloadResponse {
  
  @scala.inline
  def apply(): SchemaGdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffDownloadResponse]
  }
  
  @scala.inline
  implicit class SchemaGdataDiffDownloadResponseMutableBuilder[Self <: SchemaGdataDiffDownloadResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectLocation(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
  }
}
