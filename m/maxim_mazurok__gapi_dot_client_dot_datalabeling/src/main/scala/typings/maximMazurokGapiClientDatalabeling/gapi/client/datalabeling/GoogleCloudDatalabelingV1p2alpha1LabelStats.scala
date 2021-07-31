package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p2alpha1LabelStats extends StObject {
  
  /**
    * Map of each annotation spec's example count. Key is the annotation spec name and value is the number of examples for that annotation spec. If the annotated dataset does not have
    * annotation spec, the map will return a pair where the key is empty string and value is the total number of annotations.
    */
  var exampleCount: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1p2alpha1LabelStats & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudDatalabelingV1p2alpha1LabelStats {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1LabelStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelStats]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1LabelStatsMutableBuilder[Self <: GoogleCloudDatalabelingV1p2alpha1LabelStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExampleCount(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1p2alpha1LabelStats & TopLevel[js.Any]
    ): Self = StObject.set(x, "exampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleCountUndefined: Self = StObject.set(x, "exampleCount", js.undefined)
  }
}
