package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeature extends StObject {
  
  /**
    * Output only. When the Feature resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. When the Feature resource was deleted.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GCP labels for this Feature.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional. Membership-specific configuration for this Feature. If this Feature does not support any per-Membership configuration, this field may be unused. The keys indicate which Membership the configuration is for, in the form: `projects/{p\}/locations/{l\}/memberships/{m\}` Where {p\} is the project, {l\} is a valid location and {m\} is a valid Membership in this project at that location. {p\} WILL match the Feature's project. {p\} will always be returned as the project number, but the project ID is also accepted during input. If the same Membership is specified in the map twice (using the project ID form, and the project number form), exactly ONE of the entries will be saved, with no guarantees as to which. For this reason, it is recommended the same format be used for all entries when mutating a Feature.
    */
  var membershipSpecs: js.UndefOr[StringDictionary[SchemaMembershipFeatureSpec] | Null] = js.undefined
  
  /**
    * Output only. Membership-specific Feature status. If this Feature does report any per-Membership status, this field may be unused. The keys indicate which Membership the state is for, in the form: `projects/{p\}/locations/{l\}/memberships/{m\}` Where {p\} is the project number, {l\} is a valid location and {m\} is a valid Membership in this project at that location. {p\} MUST match the Feature's project number.
    */
  var membershipStates: js.UndefOr[StringDictionary[SchemaMembershipFeatureState] | Null] = js.undefined
  
  /**
    * Output only. The full, unique name of this Feature resource in the format `projects/x/locations/x/features/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the Feature resource itself.
    */
  var resourceState: js.UndefOr[SchemaFeatureResourceState] = js.undefined
  
  /**
    * Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
    */
  var spec: js.UndefOr[SchemaCommonFeatureSpec] = js.undefined
  
  /**
    * Output only. The Hub-wide Feature state.
    */
  var state: js.UndefOr[SchemaCommonFeatureState] = js.undefined
  
  /**
    * Output only. When the Feature resource was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeature {
  
  inline def apply(): SchemaFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeature]
  }
  
  extension [Self <: SchemaFeature](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMembershipSpecs(value: StringDictionary[SchemaMembershipFeatureSpec]): Self = StObject.set(x, "membershipSpecs", value.asInstanceOf[js.Any])
    
    inline def setMembershipSpecsNull: Self = StObject.set(x, "membershipSpecs", null)
    
    inline def setMembershipSpecsUndefined: Self = StObject.set(x, "membershipSpecs", js.undefined)
    
    inline def setMembershipStates(value: StringDictionary[SchemaMembershipFeatureState]): Self = StObject.set(x, "membershipStates", value.asInstanceOf[js.Any])
    
    inline def setMembershipStatesNull: Self = StObject.set(x, "membershipStates", null)
    
    inline def setMembershipStatesUndefined: Self = StObject.set(x, "membershipStates", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceState(value: SchemaFeatureResourceState): Self = StObject.set(x, "resourceState", value.asInstanceOf[js.Any])
    
    inline def setResourceStateUndefined: Self = StObject.set(x, "resourceState", js.undefined)
    
    inline def setSpec(value: SchemaCommonFeatureSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    inline def setState(value: SchemaCommonFeatureState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
