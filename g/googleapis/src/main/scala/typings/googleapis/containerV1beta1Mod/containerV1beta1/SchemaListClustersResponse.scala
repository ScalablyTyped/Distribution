package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListClustersResponse is the result of ListClustersRequest.
  */
trait SchemaListClustersResponse extends StObject {
  
  /**
    * A list of clusters in the project in the specified zone, or across all
    * ones.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.undefined
  
  /**
    * If any zones are listed here, the list of clusters returned may be
    * missing those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaListClustersResponse {
  
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  
  @scala.inline
  implicit class SchemaListClustersResponseMutableBuilder[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[SchemaCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: SchemaCluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setMissingZones(value: js.Array[String]): Self = StObject.set(x, "missingZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingZonesUndefined: Self = StObject.set(x, "missingZones", js.undefined)
    
    @scala.inline
    def setMissingZonesVarargs(value: String*): Self = StObject.set(x, "missingZones", js.Array(value :_*))
  }
}
