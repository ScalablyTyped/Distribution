package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosequenceGet
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The filter expression. For example: `published_status=PUBLISHED`. The filters supported are: `published_status`. See https://google.aip.dev/160 for more information.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the photo sequence.
    */
  var sequenceId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if a download URL for the photo sequence should be returned in `download_url` of individual photos in the PhotoSequence response. \> Note: Currently not implemented.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotosequenceGet {
  
  inline def apply(): ParamsResourcePhotosequenceGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosequenceGet]
  }
  
  extension [Self <: ParamsResourcePhotosequenceGet](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setSequenceId(value: String): Self = StObject.set(x, "sequenceId", value.asInstanceOf[js.Any])
    
    inline def setSequenceIdUndefined: Self = StObject.set(x, "sequenceId", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
