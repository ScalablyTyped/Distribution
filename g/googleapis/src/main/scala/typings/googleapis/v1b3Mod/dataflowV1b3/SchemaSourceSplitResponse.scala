package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response to a SourceSplitRequest.
  */
@js.native
trait SchemaSourceSplitResponse extends StObject {
  
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles into
    * which the source was split. Otherwise this field is ignored. This list
    * can be empty, which means the source represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[SchemaDerivedSource]] = js.native
  
  /**
    * Indicates whether splitting happened and produced a list of bundles. If
    * this is USE_CURRENT_SOURCE_AS_IS, the current source should be processed
    * &quot;as is&quot; without splitting. &quot;bundles&quot; is ignored in
    * this case. If this is SPLITTING_HAPPENED, then &quot;bundles&quot;
    * contains a list of bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.native
  
  /**
    * DEPRECATED in favor of bundles.
    */
  var shards: js.UndefOr[js.Array[SchemaSourceSplitShard]] = js.native
}
object SchemaSourceSplitResponse {
  
  @scala.inline
  def apply(): SchemaSourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceSplitResponse]
  }
  
  @scala.inline
  implicit class SchemaSourceSplitResponseMutableBuilder[Self <: SchemaSourceSplitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundles(value: js.Array[SchemaDerivedSource]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: SchemaDerivedSource*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setShards(value: js.Array[SchemaSourceSplitShard]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    @scala.inline
    def setShardsVarargs(value: SchemaSourceSplitShard*): Self = StObject.set(x, "shards", js.Array(value :_*))
  }
}
