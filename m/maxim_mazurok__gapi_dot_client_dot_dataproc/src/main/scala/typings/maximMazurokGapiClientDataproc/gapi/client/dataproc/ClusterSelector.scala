package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSelector extends StObject {
  
  /** Required. The cluster labels. Cluster must have all labels to match. */
  var clusterLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterSelector with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Optional. The zone where workflow process executes. This parameter does not affect the selection of the cluster.If unspecified, the zone of the first cluster matching the selector
    * is used.
    */
  var zone: js.UndefOr[String] = js.native
}
object ClusterSelector {
  
  @scala.inline
  def apply(): ClusterSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSelector]
  }
  
  @scala.inline
  implicit class ClusterSelectorMutableBuilder[Self <: ClusterSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.ClusterSelector with TopLevel[js.Any]
    ): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
