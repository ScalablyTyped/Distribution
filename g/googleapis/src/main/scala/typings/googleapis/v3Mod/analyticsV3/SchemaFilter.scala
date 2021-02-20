package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.CaseSensitive
import typings.googleapis.anon.Field
import typings.googleapis.anon.FieldIndex
import typings.googleapis.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics account filter.
  */
@js.native
trait SchemaFilter extends StObject {
  
  /**
    * Account ID to which this filter belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Details for the filter of the type ADVANCED.
    */
  var advancedDetails: js.UndefOr[CaseSensitive] = js.native
  
  /**
    * Time this filter was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Details for the filter of the type EXCLUDE.
    */
  var excludeDetails: js.UndefOr[SchemaFilterExpression] = js.native
  
  /**
    * Filter ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Details for the filter of the type INCLUDE.
    */
  var includeDetails: js.UndefOr[SchemaFilterExpression] = js.native
  
  /**
    * Resource type for Analytics filter.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Details for the filter of the type LOWER.
    */
  var lowercaseDetails: js.UndefOr[Field] = js.native
  
  /**
    * Name of this filter.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent link for this filter. Points to the account to which this filter
    * belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * Details for the filter of the type SEARCH_AND_REPLACE.
    */
  var searchAndReplaceDetails: js.UndefOr[FieldIndex] = js.native
  
  /**
    * Link for this filter.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE,
    * UPPERCASE, SEARCH_AND_REPLACE and ADVANCED.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Time this filter was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Details for the filter of the type UPPER.
    */
  var uppercaseDetails: js.UndefOr[Field] = js.native
}
object SchemaFilter {
  
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  
  @scala.inline
  implicit class SchemaFilterMutableBuilder[Self <: SchemaFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdvancedDetails(value: CaseSensitive): Self = StObject.set(x, "advancedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedDetailsUndefined: Self = StObject.set(x, "advancedDetails", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExcludeDetails(value: SchemaFilterExpression): Self = StObject.set(x, "excludeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeDetailsUndefined: Self = StObject.set(x, "excludeDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIncludeDetails(value: SchemaFilterExpression): Self = StObject.set(x, "includeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDetailsUndefined: Self = StObject.set(x, "includeDetails", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLowercaseDetails(value: Field): Self = StObject.set(x, "lowercaseDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowercaseDetailsUndefined: Self = StObject.set(x, "lowercaseDetails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    @scala.inline
    def setSearchAndReplaceDetails(value: FieldIndex): Self = StObject.set(x, "searchAndReplaceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchAndReplaceDetailsUndefined: Self = StObject.set(x, "searchAndReplaceDetails", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUppercaseDetails(value: Field): Self = StObject.set(x, "uppercaseDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseDetailsUndefined: Self = StObject.set(x, "uppercaseDetails", js.undefined)
  }
}
