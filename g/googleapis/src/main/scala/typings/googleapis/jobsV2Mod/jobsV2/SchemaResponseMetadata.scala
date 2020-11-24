package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
@js.native
trait SchemaResponseMetadata extends js.Object {
  
  /**
    * Identifiers for the versions of the search algorithm used during this API
    * invocation if multiple algorithms are used. The default value is empty.
    * For search response only.
    */
  var experimentIdList: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * For search response only. Indicates the mode of a performed search.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.native
}
object SchemaResponseMetadata {
  
  @scala.inline
  def apply(): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
  
  @scala.inline
  implicit class SchemaResponseMetadataOps[Self <: SchemaResponseMetadata] (val x: Self) extends AnyVal {
    
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
    def setExperimentIdListVarargs(value: Double*): Self = this.set("experimentIdList", js.Array(value :_*))
    
    @scala.inline
    def setExperimentIdList(value: js.Array[Double]): Self = this.set("experimentIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentIdList: Self = this.set("experimentIdList", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
