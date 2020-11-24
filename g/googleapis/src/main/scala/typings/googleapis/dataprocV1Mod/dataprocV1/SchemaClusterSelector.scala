package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A selector that chooses target cluster for jobs based on metadata.
  */
@js.native
trait SchemaClusterSelector extends js.Object {
  
  /**
    * Required. The cluster labels. Cluster must have all labels to match.
    */
  var clusterLabels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Optional. The zone where workflow process executes. This parameter does
    * not affect the selection of the cluster.If unspecified, the zone of the
    * first cluster matching the selector is used.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaClusterSelector {
  
  @scala.inline
  def apply(): SchemaClusterSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterSelector]
  }
  
  @scala.inline
  implicit class SchemaClusterSelectorOps[Self <: SchemaClusterSelector] (val x: Self) extends AnyVal {
    
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
    def setClusterLabels(value: StringDictionary[String]): Self = this.set("clusterLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterLabels: Self = this.set("clusterLabels", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
