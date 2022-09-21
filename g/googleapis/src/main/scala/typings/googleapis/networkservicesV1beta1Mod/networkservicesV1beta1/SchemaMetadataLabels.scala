package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMetadataLabels extends StObject {
  
  /**
    * Required. Label name presented as key in xDS Node Metadata.
    */
  var labelName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Label value presented as value corresponding to the above key, in xDS Node Metadata.
    */
  var labelValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaMetadataLabels {
  
  inline def apply(): SchemaMetadataLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataLabels]
  }
  
  extension [Self <: SchemaMetadataLabels](x: Self) {
    
    inline def setLabelName(value: String): Self = StObject.set(x, "labelName", value.asInstanceOf[js.Any])
    
    inline def setLabelNameNull: Self = StObject.set(x, "labelName", null)
    
    inline def setLabelNameUndefined: Self = StObject.set(x, "labelName", js.undefined)
    
    inline def setLabelValue(value: String): Self = StObject.set(x, "labelValue", value.asInstanceOf[js.Any])
    
    inline def setLabelValueNull: Self = StObject.set(x, "labelValue", null)
    
    inline def setLabelValueUndefined: Self = StObject.set(x, "labelValue", js.undefined)
  }
}
