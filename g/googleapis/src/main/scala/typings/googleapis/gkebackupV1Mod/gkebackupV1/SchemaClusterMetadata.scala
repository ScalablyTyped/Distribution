package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterMetadata extends StObject {
  
  /**
    * Anthos version
    */
  var anthosVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of the Backup for GKE CRD versions found in the cluster.
    */
  var backupCrdVersions: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The source cluster from which this Backup was created. Valid formats: - `projects/x/locations/x/clusters/x` - `projects/x/zones/x/clusters/x` This is inherited from the parent BackupPlan's cluster field.
    */
  var cluster: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GKE version
    */
  var gkeVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Kubernetes server version of the source cluster.
    */
  var k8sVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaClusterMetadata {
  
  inline def apply(): SchemaClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterMetadata]
  }
  
  extension [Self <: SchemaClusterMetadata](x: Self) {
    
    inline def setAnthosVersion(value: String): Self = StObject.set(x, "anthosVersion", value.asInstanceOf[js.Any])
    
    inline def setAnthosVersionNull: Self = StObject.set(x, "anthosVersion", null)
    
    inline def setAnthosVersionUndefined: Self = StObject.set(x, "anthosVersion", js.undefined)
    
    inline def setBackupCrdVersions(value: StringDictionary[String]): Self = StObject.set(x, "backupCrdVersions", value.asInstanceOf[js.Any])
    
    inline def setBackupCrdVersionsNull: Self = StObject.set(x, "backupCrdVersions", null)
    
    inline def setBackupCrdVersionsUndefined: Self = StObject.set(x, "backupCrdVersions", js.undefined)
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setGkeVersion(value: String): Self = StObject.set(x, "gkeVersion", value.asInstanceOf[js.Any])
    
    inline def setGkeVersionNull: Self = StObject.set(x, "gkeVersion", null)
    
    inline def setGkeVersionUndefined: Self = StObject.set(x, "gkeVersion", js.undefined)
    
    inline def setK8sVersion(value: String): Self = StObject.set(x, "k8sVersion", value.asInstanceOf[js.Any])
    
    inline def setK8sVersionNull: Self = StObject.set(x, "k8sVersion", null)
    
    inline def setK8sVersionUndefined: Self = StObject.set(x, "k8sVersion", js.undefined)
  }
}
