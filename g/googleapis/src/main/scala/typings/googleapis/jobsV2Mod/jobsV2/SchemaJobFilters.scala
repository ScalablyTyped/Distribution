package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Deprecated. Use JobQuery instead.  The filters required to
  * perform a search query or histogram.
  */
@js.native
trait SchemaJobFilters extends StObject {
  
  /**
    * Optional.  The category filter specifies the categories of jobs to search
    * against. See Category for more information.  If a value is not specified,
    * jobs from any category are searched against.  If multiple values are
    * specified, jobs from any of the specified categories are searched
    * against.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.   Allows filtering jobs by commute time with different travel
    * methods (e.g.  driving or public transit). Note: this only works with
    * COMMUTE  MODE. When specified, [JobFilters.location_filters] will be
    * ignored.   Currently we do not support sorting by commute time.
    */
  var commuteFilter: js.UndefOr[SchemaCommutePreference] = js.native
  
  /**
    * Optional.  The company names filter specifies the company entities to
    * search against.  If a value is not specified, jobs are searched for
    * against all companies.  If multiple values are specified, jobs are
    * searched against the specified companies.  At most 20 company filters are
    * allowed.
    */
  var companyNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  This filter specifies the exact company titles of jobs to
    * search against.  If a value is not specified, jobs within the search
    * results can be associated with any company.  If multiple values are
    * specified, jobs within the search results may be associated with any of
    * the specified companies.  At most 20 company title filters are allowed.
    */
  var companyTitles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  This search filter is applied only to Job.compensation_info.
    * For example, if the filter is specified as &quot;Hourly job with per-hour
    * compensation &gt; $15&quot;, only jobs that meet this criteria are
    * searched. If a filter is not defined, all open jobs are searched.
    */
  var compensationFilter: js.UndefOr[SchemaCompensationFilter] = js.native
  
  /**
    * Optional.  This filter specifies a structured syntax to match against the
    * Job.custom_attributes that are marked as `filterable`.  The syntax for
    * this expression is a subset of Google SQL syntax.  Supported operators
    * are: =, !=, &lt;, &lt;=, &gt;, &gt;= where the left of the operator is a
    * custom field key and the right of the operator is a number or string
    * (surrounded by quotes) value.  Supported functions are
    * LOWER(&lt;field_name&gt;) to perform case insensitive match and
    * EMPTY(&lt;field_name&gt;) to filter on the existence of a key.  Boolean
    * expressions (AND/OR/NOT) are supported up to 3 levels of nesting (For
    * example, &quot;((A AND B AND C) OR NOT D) AND E&quot;), and there can be
    * a maximum of 100 comparisons/functions in the expression. The expression
    * must be &lt; 3000 bytes in length.  Sample Query: (key1 =
    * &quot;TEST&quot; OR LOWER(key1)=&quot;test&quot; OR NOT EMPTY(key1)) AND
    * key2 &gt; 100
    */
  var customAttributeFilter: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Use custom_attribute_filter instead.  Optional.  This filter
    * specifies searching against custom field values. See
    * Job.filterable_custom_fields for information. The key value specifies a
    * number between 1-20 (the service supports 20 custom fields) corresponding
    * to the desired custom field map value. If an invalid key is provided or
    * specified together with custom_attribute_filter, an error is thrown.
    */
  var customFieldFilters: js.UndefOr[StringDictionary[SchemaCustomFieldFilter]] = js.native
  
  /**
    * Optional.  This flag controls the spell-check feature. If false, the
    * service attempts to correct a misspelled query, for example,
    * &quot;enginee&quot; is corrected to &quot;engineer&quot;.  Defaults to
    * false: a spell check is performed.
    */
  var disableSpellCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.  The employment type filter specifies the employment type of
    * jobs to search against, such as EmploymentType.FULL_TIME.  If a value is
    * not specified, jobs in the search results include any employment type. If
    * multiple values are specified, jobs in the search results include any of
    * the specified employment types.
    */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Deprecated. Always use compensation_filter.  Optional.  This search
    * filter is applied only to Job.extended_compensation_info. For example, if
    * the filter is specified as &quot;Hourly job with per-hour compensation
    * &gt; $15&quot;, only jobs that meet these criteria are searched. If a
    * filter is not defined, all open jobs are searched.
    */
  var extendedCompensationFilter: js.UndefOr[SchemaExtendedCompensationFilter] = js.native
  
  /**
    * Optional.  This filter specifies the locale of jobs to search against,
    * for example, &quot;en-US&quot;.  If a value is not specified, the search
    * results may contain jobs in any locale.   Language codes should be in
    * BCP-47 format, for example, &quot;en-US&quot; or &quot;sr-Latn&quot;. For
    * more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47).  At most 10 language code
    * filters are allowed.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  The location filter specifies geo-regions containing the jobs
    * to search against. See LocationFilter for more information.  If a
    * location value is not specified, jobs are retrieved from all locations.
    * If multiple values are specified, jobs are retrieved from any of the
    * specified locations. If different values are specified for the
    * LocationFilter.distance_in_miles parameter, the maximum provided distance
    * is used for all locations.  At most 5 location filters are allowed.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocationFilter]] = js.native
  
  /**
    * Optional.  Jobs published within a range specified by this filter are
    * searched against, for example, DateRange.PAST_MONTH. If a value is not
    * specified, all open jobs are searched against regardless of the date they
    * were published.
    */
  var publishDateRange: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The query filter contains the keywords that match against the
    * job title, description, and location fields.  The maximum query size is
    * 255 bytes/characters.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Do not use this field.  This flag controls whether the job
    * search should be restricted to jobs owned by the current user.  Defaults
    * to false where all jobs accessible to the user are searched against.
    */
  var tenantJobOnly: js.UndefOr[Boolean] = js.native
}
object SchemaJobFilters {
  
  @scala.inline
  def apply(): SchemaJobFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobFilters]
  }
  
  @scala.inline
  implicit class SchemaJobFiltersMutableBuilder[Self <: SchemaJobFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setCommuteFilter(value: SchemaCommutePreference): Self = StObject.set(x, "commuteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommuteFilterUndefined: Self = StObject.set(x, "commuteFilter", js.undefined)
    
    @scala.inline
    def setCompanyNames(value: js.Array[String]): Self = StObject.set(x, "companyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNamesUndefined: Self = StObject.set(x, "companyNames", js.undefined)
    
    @scala.inline
    def setCompanyNamesVarargs(value: String*): Self = StObject.set(x, "companyNames", js.Array(value :_*))
    
    @scala.inline
    def setCompanyTitles(value: js.Array[String]): Self = StObject.set(x, "companyTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyTitlesUndefined: Self = StObject.set(x, "companyTitles", js.undefined)
    
    @scala.inline
    def setCompanyTitlesVarargs(value: String*): Self = StObject.set(x, "companyTitles", js.Array(value :_*))
    
    @scala.inline
    def setCompensationFilter(value: SchemaCompensationFilter): Self = StObject.set(x, "compensationFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationFilterUndefined: Self = StObject.set(x, "compensationFilter", js.undefined)
    
    @scala.inline
    def setCustomAttributeFilter(value: String): Self = StObject.set(x, "customAttributeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributeFilterUndefined: Self = StObject.set(x, "customAttributeFilter", js.undefined)
    
    @scala.inline
    def setCustomFieldFilters(value: StringDictionary[SchemaCustomFieldFilter]): Self = StObject.set(x, "customFieldFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldFiltersUndefined: Self = StObject.set(x, "customFieldFilters", js.undefined)
    
    @scala.inline
    def setDisableSpellCheck(value: Boolean): Self = StObject.set(x, "disableSpellCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSpellCheckUndefined: Self = StObject.set(x, "disableSpellCheck", js.undefined)
    
    @scala.inline
    def setEmploymentTypes(value: js.Array[String]): Self = StObject.set(x, "employmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmploymentTypesUndefined: Self = StObject.set(x, "employmentTypes", js.undefined)
    
    @scala.inline
    def setEmploymentTypesVarargs(value: String*): Self = StObject.set(x, "employmentTypes", js.Array(value :_*))
    
    @scala.inline
    def setExtendedCompensationFilter(value: SchemaExtendedCompensationFilter): Self = StObject.set(x, "extendedCompensationFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedCompensationFilterUndefined: Self = StObject.set(x, "extendedCompensationFilter", js.undefined)
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    @scala.inline
    def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
    
    @scala.inline
    def setLocationFilters(value: js.Array[SchemaLocationFilter]): Self = StObject.set(x, "locationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationFiltersUndefined: Self = StObject.set(x, "locationFilters", js.undefined)
    
    @scala.inline
    def setLocationFiltersVarargs(value: SchemaLocationFilter*): Self = StObject.set(x, "locationFilters", js.Array(value :_*))
    
    @scala.inline
    def setPublishDateRange(value: String): Self = StObject.set(x, "publishDateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishDateRangeUndefined: Self = StObject.set(x, "publishDateRange", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setTenantJobOnly(value: Boolean): Self = StObject.set(x, "tenantJobOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantJobOnlyUndefined: Self = StObject.set(x, "tenantJobOnly", js.undefined)
  }
}
