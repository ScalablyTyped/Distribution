package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedCluster extends StObject {
  
  /**
    * Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix.The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens
    * (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** Required. The cluster configuration. */
  var config: js.UndefOr[ClusterConfig] = js.undefined
  
  /**
    * Optional. The labels to associate with this cluster.Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression:
    * \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels
    * can be associated with a given cluster.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object ManagedCluster {
  
  inline def apply(): ManagedCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedCluster]
  }
  
  extension [Self <: ManagedCluster](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setConfig(value: ClusterConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
