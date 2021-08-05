package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSplitResponse extends StObject {
  
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles into which the source was split. Otherwise this field is ignored. This list can be empty, which means the source
    * represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[DerivedSource]] = js.undefined
  
  /**
    * Indicates whether splitting happened and produced a list of bundles. If this is USE_CURRENT_SOURCE_AS_IS, the current source should be processed "as is" without splitting. "bundles"
    * is ignored in this case. If this is SPLITTING_HAPPENED, then "bundles" contains a list of bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.undefined
  
  /** DEPRECATED in favor of bundles. */
  var shards: js.UndefOr[js.Array[SourceSplitShard]] = js.undefined
}
object SourceSplitResponse {
  
  inline def apply(): SourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitResponse]
  }
  
  extension [Self <: SourceSplitResponse](x: Self) {
    
    inline def setBundles(value: js.Array[DerivedSource]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: DerivedSource*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setShards(value: js.Array[SourceSplitShard]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    inline def setShardsVarargs(value: SourceSplitShard*): Self = StObject.set(x, "shards", js.Array(value :_*))
  }
}
