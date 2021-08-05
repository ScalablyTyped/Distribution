package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSelector extends StObject {
  
  /** Required. The cluster labels. Cluster must have all labels to match. */
  var clusterLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterSelector & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector
    * is used.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ClusterSelector {
  
  inline def apply(): ClusterSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSelector]
  }
  
  extension [Self <: ClusterSelector](x: Self) {
    
    inline def setClusterLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterSelector & TopLevel[js.Any]
    ): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    inline def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
