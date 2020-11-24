package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1p2alpha1LabelStats extends js.Object {
  
  /**
    * Map of each annotation spec's example count. Key is the annotation spec name and value is the number of examples for that annotation spec. If the annotated dataset does not have
    * annotation spec, the map will return a pair where the key is empty string and value is the total number of annotations.
    */
  var exampleCount: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1p2alpha1LabelStats with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDatalabelingV1p2alpha1LabelStats {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1p2alpha1LabelStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p2alpha1LabelStats]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1p2alpha1LabelStatsOps[Self <: GoogleCloudDatalabelingV1p2alpha1LabelStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExampleCount(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.GoogleCloudDatalabelingV1p2alpha1LabelStats with TopLevel[js.Any]
    ): Self = this.set("exampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleCount: Self = this.set("exampleCount", js.undefined)
  }
}
