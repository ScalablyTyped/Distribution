package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1alpha1LabelStats extends StObject {
  
  /**
    * Map of each annotation spec's example count. Key is the annotation spec name and value is the number of examples for that annotation spec. If the annotated dataset does not have annotation spec, the map will return a pair where the key is empty string and value is the total number of annotations.
    */
  var exampleCount: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1alpha1LabelStats {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1alpha1LabelStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1alpha1LabelStats]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1alpha1LabelStats](x: Self) {
    
    inline def setExampleCount(value: StringDictionary[String]): Self = StObject.set(x, "exampleCount", value.asInstanceOf[js.Any])
    
    inline def setExampleCountNull: Self = StObject.set(x, "exampleCount", null)
    
    inline def setExampleCountUndefined: Self = StObject.set(x, "exampleCount", js.undefined)
  }
}
