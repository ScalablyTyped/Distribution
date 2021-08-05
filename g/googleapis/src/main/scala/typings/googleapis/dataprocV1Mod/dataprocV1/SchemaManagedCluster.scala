package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cluster that is managed by the workflow.
  */
trait SchemaManagedCluster extends StObject {
  
  /**
    * Required. The cluster name prefix. A unique cluster name will be formed
    * by appending a random suffix.The name must contain only lower-case
    * letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter.
    * Cannot begin or end with hyphen. Must consist of between 2 and 35
    * characters.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The cluster configuration.
    */
  var config: js.UndefOr[SchemaClusterConfig] = js.undefined
  
  /**
    * Optional. The labels to associate with this cluster.Label keys must be
    * between 1 and 63 characters long, and must conform to the following PCRE
    * regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and
    * 63 characters long, and must conform to the following PCRE regular
    * expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be
    * associated with a given cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaManagedCluster {
  
  inline def apply(): SchemaManagedCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCluster]
  }
  
  extension [Self <: SchemaManagedCluster](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setConfig(value: SchemaClusterConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
