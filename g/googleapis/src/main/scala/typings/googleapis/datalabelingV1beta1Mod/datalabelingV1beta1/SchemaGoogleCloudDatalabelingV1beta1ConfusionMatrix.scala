package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrix extends StObject {
  
  var row: js.UndefOr[js.Array[SchemaGoogleCloudDatalabelingV1beta1Row]] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrix {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrix]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ConfusionMatrix](x: Self) {
    
    inline def setRow(value: js.Array[SchemaGoogleCloudDatalabelingV1beta1Row]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setRowVarargs(value: SchemaGoogleCloudDatalabelingV1beta1Row*): Self = StObject.set(x, "row", js.Array(value*))
  }
}
