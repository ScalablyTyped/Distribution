package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSelector extends StObject {
  
  /** Required. The cluster labels. Cluster must have all labels to match. */
  var clusterLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterSelector] (val x: Self) extends AnyVal {
    
    inline def setClusterLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    inline def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
