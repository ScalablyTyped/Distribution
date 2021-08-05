package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListScreenshotClustersResponse extends StObject {
  
  /**
    * The set of clusters associated with an execution Always set
    */
  var clusters: js.UndefOr[js.Array[SchemaScreenshotCluster]] = js.undefined
}
object SchemaListScreenshotClustersResponse {
  
  inline def apply(): SchemaListScreenshotClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScreenshotClustersResponse]
  }
  
  extension [Self <: SchemaListScreenshotClustersResponse](x: Self) {
    
    inline def setClusters(value: js.Array[SchemaScreenshotCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: SchemaScreenshotCluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
  }
}
