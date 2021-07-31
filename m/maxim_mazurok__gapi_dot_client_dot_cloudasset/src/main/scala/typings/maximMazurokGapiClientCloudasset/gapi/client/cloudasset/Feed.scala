package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feed extends StObject {
  
  /**
    * A list of the full names of the assets to receive updates. You must specify either or both of asset_names and asset_types. Only asset updates matching specified asset_names or
    * asset_types are exported to the feed. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more info.
    */
  var assetNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of types of the assets to receive updates. You must specify either or both of asset_names and asset_types. Only asset updates matching specified asset_names or asset_types
    * are exported to the feed. Example: `"compute.googleapis.com/Disk"` See [this topic](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for a list of all supported
    * asset types.
    */
  var assetTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A condition which determines whether an asset update should be published. If specified, an asset will be returned only when the expression evaluates to true. When set, `expression`
    * field in the `Expr` must be a valid [CEL expression] (https://github.com/google/cel-spec) on a TemporalAsset with name `temporal_asset`. Example: a Feed with expression
    * ("temporal_asset.deleted == true") will only publish Asset deletions. Other fields of `Expr` are optional. See our [user
    * guide](https://cloud.google.com/asset-inventory/docs/monitoring-asset-changes#feed_with_condition) for detailed instructions.
    */
  var condition: js.UndefOr[Expr] = js.undefined
  
  /** Asset content type. If not specified, no content but the asset name and type will be returned. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Required. Feed output configuration defining where the asset updates are published to. */
  var feedOutputConfig: js.UndefOr[FeedOutputConfig] = js.undefined
  
  /**
    * Required. The format will be projects/{project_number}/feeds/{client-assigned_feed_identifier} or folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
    * organizations/{organization_number}/feeds/{client-assigned_feed_identifier} The client-assigned feed identifier must be unique within the parent project/folder/organization.
    */
  var name: js.UndefOr[String] = js.undefined
}
object Feed {
  
  @scala.inline
  def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  
  @scala.inline
  implicit class FeedMutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetNames(value: js.Array[String]): Self = StObject.set(x, "assetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetNamesUndefined: Self = StObject.set(x, "assetNames", js.undefined)
    
    @scala.inline
    def setAssetNamesVarargs(value: String*): Self = StObject.set(x, "assetNames", js.Array(value :_*))
    
    @scala.inline
    def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypesUndefined: Self = StObject.set(x, "assetTypes", js.undefined)
    
    @scala.inline
    def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: Expr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setFeedOutputConfig(value: FeedOutputConfig): Self = StObject.set(x, "feedOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedOutputConfigUndefined: Self = StObject.set(x, "feedOutputConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
