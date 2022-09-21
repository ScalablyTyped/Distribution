package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterSelector extends StObject {
  
  /**
    * Required. The cluster labels. Cluster must have all labels to match.
    */
  var clusterLabels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector is used.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaClusterSelector {
  
  inline def apply(): SchemaClusterSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterSelector]
  }
  
  extension [Self <: SchemaClusterSelector](x: Self) {
    
    inline def setClusterLabels(value: StringDictionary[String]): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    inline def setClusterLabelsNull: Self = StObject.set(x, "clusterLabels", null)
    
    inline def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
