package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppRestrictionsSchemaRestriction extends StObject {
  
  /** The default value of the restriction. bundle and bundleArray restrictions never have a default value. */
  var defaultValue: js.UndefOr[AppRestrictionsSchemaRestrictionRestrictionValue] = js.undefined
  
  /** A longer description of the restriction, giving more detail of what it affects. */
  var description: js.UndefOr[String] = js.undefined
  
  /** For choice or multiselect restrictions, the list of possible entries' human-readable names. */
  var entry: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * For choice or multiselect restrictions, the list of possible entries' machine-readable values. These values should be used in the configuration, either as a single string value for
    * a choice restriction or in a stringArray for a multiselect restriction.
    */
  var entryValue: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The unique key that the product uses to identify the restriction, e.g. "com.google.android.gm.fieldname". */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * For bundle or bundleArray restrictions, the list of nested restrictions. A bundle restriction is always nested within a bundleArray restriction, and a bundleArray restriction is at
    * most two levels deep.
    */
  var nestedRestriction: js.UndefOr[js.Array[AppRestrictionsSchemaRestriction]] = js.undefined
  
  /** The type of the restriction. */
  var restrictionType: js.UndefOr[String] = js.undefined
  
  /** The name of the restriction. */
  var title: js.UndefOr[String] = js.undefined
}
object AppRestrictionsSchemaRestriction {
  
  @scala.inline
  def apply(): AppRestrictionsSchemaRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppRestrictionsSchemaRestriction]
  }
  
  @scala.inline
  implicit class AppRestrictionsSchemaRestrictionMutableBuilder[Self <: AppRestrictionsSchemaRestriction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: AppRestrictionsSchemaRestrictionRestrictionValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntry(value: js.Array[String]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryValue(value: js.Array[String]): Self = StObject.set(x, "entryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryValueUndefined: Self = StObject.set(x, "entryValue", js.undefined)
    
    @scala.inline
    def setEntryValueVarargs(value: String*): Self = StObject.set(x, "entryValue", js.Array(value :_*))
    
    @scala.inline
    def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNestedRestriction(value: js.Array[AppRestrictionsSchemaRestriction]): Self = StObject.set(x, "nestedRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedRestrictionUndefined: Self = StObject.set(x, "nestedRestriction", js.undefined)
    
    @scala.inline
    def setNestedRestrictionVarargs(value: AppRestrictionsSchemaRestriction*): Self = StObject.set(x, "nestedRestriction", js.Array(value :_*))
    
    @scala.inline
    def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
