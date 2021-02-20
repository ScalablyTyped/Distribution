package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
@js.native
trait SchemaResponseMetadata extends StObject {
  
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
  implicit class SchemaResponseMetadataMutableBuilder[Self <: SchemaResponseMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimentIdList(value: js.Array[Double]): Self = StObject.set(x, "experimentIdList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentIdListUndefined: Self = StObject.set(x, "experimentIdList", js.undefined)
    
    @scala.inline
    def setExperimentIdListVarargs(value: Double*): Self = StObject.set(x, "experimentIdList", js.Array(value :_*))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
