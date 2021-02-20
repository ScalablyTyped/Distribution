package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the operation to split a high-level Source specification into
  * bundles (parts for parallel processing).  At a high level, splitting of a
  * source into bundles happens as follows: SourceSplitRequest is applied to
  * the source. If it returns SOURCE_SPLIT_OUTCOME_USE_CURRENT, no further
  * splitting happens and the source is used &quot;as is&quot;. Otherwise,
  * splitting is applied recursively to each produced DerivedSource.  As an
  * optimization, for any Source, if its does_not_need_splitting is true, the
  * framework assumes that splitting this source would return
  * SOURCE_SPLIT_OUTCOME_USE_CURRENT, and doesn&#39;t initiate a
  * SourceSplitRequest. This applies both to the initial source being split and
  * to bundles produced from it.
  */
@js.native
trait SchemaSourceSplitRequest extends StObject {
  
  /**
    * Hints for tuning the splitting process.
    */
  var options: js.UndefOr[SchemaSourceSplitOptions] = js.native
  
  /**
    * Specification of the source to be split.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}
object SchemaSourceSplitRequest {
  
  @scala.inline
  def apply(): SchemaSourceSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitRequest]
  }
  
  @scala.inline
  implicit class SchemaSourceSplitRequestMutableBuilder[Self <: SchemaSourceSplitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: SchemaSourceSplitOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
