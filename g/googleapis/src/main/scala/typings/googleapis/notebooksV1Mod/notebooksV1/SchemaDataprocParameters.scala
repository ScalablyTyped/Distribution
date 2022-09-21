package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataprocParameters extends StObject {
  
  /**
    * URI for cluster used to run Dataproc execution. Format: `projects/{PROJECT_ID\}/regions/{REGION\}/clusters/{CLUSTER_NAME\}`
    */
  var cluster: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataprocParameters {
  
  inline def apply(): SchemaDataprocParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataprocParameters]
  }
  
  extension [Self <: SchemaDataprocParameters](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterNull: Self = StObject.set(x, "cluster", null)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
  }
}
