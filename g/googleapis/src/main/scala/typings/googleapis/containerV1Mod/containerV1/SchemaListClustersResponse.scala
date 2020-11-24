package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListClustersResponse is the result of ListClustersRequest.
  */
@js.native
trait SchemaListClustersResponse extends js.Object {
  
  /**
    * A list of clusters in the project in the specified zone, or across all
    * ones.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  
  /**
    * If any zones are listed here, the list of clusters returned may be
    * missing those zones.
    */
  var missingZones: js.UndefOr[js.Array[String]] = js.native
}
object SchemaListClustersResponse {
  
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  
  @scala.inline
  implicit class SchemaListClustersResponseOps[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClustersVarargs(value: SchemaCluster*): Self = this.set("clusters", js.Array(value :_*))
    
    @scala.inline
    def setClusters(value: js.Array[SchemaCluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    
    @scala.inline
    def setMissingZonesVarargs(value: String*): Self = this.set("missingZones", js.Array(value :_*))
    
    @scala.inline
    def setMissingZones(value: js.Array[String]): Self = this.set("missingZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissingZones: Self = this.set("missingZones", js.undefined)
  }
}
