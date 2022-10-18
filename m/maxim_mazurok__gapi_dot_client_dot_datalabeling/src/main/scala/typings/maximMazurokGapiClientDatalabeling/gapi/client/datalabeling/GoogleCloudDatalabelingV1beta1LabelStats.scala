package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1LabelStats extends StObject {
  
  /**
    * Map of each annotation spec's example count. Key is the annotation spec name and value is the number of examples for that annotation spec. If the annotated dataset does not have
    * annotation spec, the map will return a pair where the key is empty string and value is the total number of annotations.
    */
  var exampleCount: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object GoogleCloudDatalabelingV1beta1LabelStats {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1LabelStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1LabelStats]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1LabelStats](x: Self) {
    
    inline def setExampleCount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "exampleCount", value.asInstanceOf[js.Any])
    
    inline def setExampleCountUndefined: Self = StObject.set(x, "exampleCount", js.undefined)
  }
}
