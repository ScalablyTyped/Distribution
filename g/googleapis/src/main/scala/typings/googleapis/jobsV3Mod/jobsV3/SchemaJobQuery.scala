package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobQuery extends StObject {
  
  /**
    * Optional. Allows filtering jobs by commute time with different travel methods (for example, driving or public transit). Note: This only works with COMMUTE MODE. When specified, [JobQuery.location_filters] is ignored. Currently we don't support sorting by commute time.
    */
  var commuteFilter: js.UndefOr[SchemaCommuteFilter] = js.undefined
  
  /**
    * Optional. This filter specifies the company Company.display_name of the jobs to search against. The company name must match the value exactly. Alternatively, the value being searched for can be wrapped in different match operators. `SUBSTRING_MATCH([value])` The company name must contain a case insensitive substring match of the value. Using this function may increase latency. Sample Value: `SUBSTRING_MATCH(google)` `MULTI_WORD_TOKEN_MATCH([value])` The value will be treated as a multi word token and the company name must contain a case insensitive match of the value. Using this function may increase latency. Sample Value: `MULTI_WORD_TOKEN_MATCH(google)` If a value isn't specified, jobs within the search results are associated with any company. If multiple values are specified, jobs within the search results may be associated with any of the specified companies. At most 20 company display name filters are allowed.
    */
  var companyDisplayNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. This filter specifies the company entities to search against. If a value isn't specified, jobs are searched for against all companies. If multiple values are specified, jobs are searched against the companies specified. The format is "projects/{project_id\}/companies/{company_id\}", for example, "projects/api-test-project/companies/foo". At most 20 company filters are allowed.
    */
  var companyNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. This search filter is applied only to Job.compensation_info. For example, if the filter is specified as "Hourly job with per-hour compensation \> $15", only jobs meeting these criteria are searched. If a filter isn't defined, all open jobs are searched.
    */
  var compensationFilter: js.UndefOr[SchemaCompensationFilter] = js.undefined
  
  /**
    * Optional. This filter specifies a structured syntax to match against the Job.custom_attributes marked as `filterable`. The syntax for this expression is a subset of SQL syntax. Supported operators are: `=`, `!=`, `<`, `<=`, `\>`, and `\>=` where the left of the operator is a custom field key and the right of the operator is a number or a quoted string. You must escape backslash (\\) and quote (\") characters. Supported functions are `LOWER([field_name])` to perform a case insensitive match and `EMPTY([field_name])` to filter on the existence of a key. Boolean expressions (AND/OR/NOT) are supported up to 3 levels of nesting (for example, "((A AND B AND C) OR NOT D) AND E"), a maximum of 100 comparisons or functions are allowed in the expression. The expression must be < 10000 bytes in length. Sample Query: `(LOWER(driving_license)="class \"a\"" OR EMPTY(driving_license)) AND driving_years \> 10`
    */
  var customAttributeFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. This flag controls the spell-check feature. If false, the service attempts to correct a misspelled query, for example, "enginee" is corrected to "engineer". Defaults to false: a spell check is performed.
    */
  var disableSpellCheck: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The employment type filter specifies the employment type of jobs to search against, such as EmploymentType.FULL_TIME. If a value is not specified, jobs in the search results includes any employment type. If multiple values are specified, jobs in the search results include any of the specified employment types.
    */
  var employmentTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The category filter specifies the categories of jobs to search against. See Category for more information. If a value is not specified, jobs from any category are searched against. If multiple values are specified, jobs from any of the specified categories are searched against.
    */
  var jobCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. This filter specifies the locale of jobs to search against, for example, "en-US". If a value isn't specified, the search results can contain jobs in any locale. Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47). At most 10 language code filters are allowed.
    */
  var languageCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The location filter specifies geo-regions containing the jobs to search against. See LocationFilter for more information. If a location value isn't specified, jobs fitting the other search criteria are retrieved regardless of where they're located. If multiple values are specified, jobs are retrieved from any of the specified locations. If different values are specified for the LocationFilter.distance_in_miles parameter, the maximum provided distance is used for all locations. At most 5 location filters are allowed.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocationFilter]] = js.undefined
  
  /**
    * Optional. Jobs published within a range specified by this filter are searched against.
    */
  var publishTimeRange: js.UndefOr[SchemaTimestampRange] = js.undefined
  
  /**
    * Optional. The query string that matches against the job title, description, and location fields. The maximum number of allowed characters is 255.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language code of query. For example, "en-US". This field helps to better interpret the query. If a value isn't specified, the query language code is automatically detected, which may not be accurate. Language code should be in BCP-47 format, such as "en-US" or "sr-Latn". For more information, see [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
    */
  var queryLanguageCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobQuery {
  
  inline def apply(): SchemaJobQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobQuery]
  }
  
  extension [Self <: SchemaJobQuery](x: Self) {
    
    inline def setCommuteFilter(value: SchemaCommuteFilter): Self = StObject.set(x, "commuteFilter", value.asInstanceOf[js.Any])
    
    inline def setCommuteFilterUndefined: Self = StObject.set(x, "commuteFilter", js.undefined)
    
    inline def setCompanyDisplayNames(value: js.Array[String]): Self = StObject.set(x, "companyDisplayNames", value.asInstanceOf[js.Any])
    
    inline def setCompanyDisplayNamesNull: Self = StObject.set(x, "companyDisplayNames", null)
    
    inline def setCompanyDisplayNamesUndefined: Self = StObject.set(x, "companyDisplayNames", js.undefined)
    
    inline def setCompanyDisplayNamesVarargs(value: String*): Self = StObject.set(x, "companyDisplayNames", js.Array(value*))
    
    inline def setCompanyNames(value: js.Array[String]): Self = StObject.set(x, "companyNames", value.asInstanceOf[js.Any])
    
    inline def setCompanyNamesNull: Self = StObject.set(x, "companyNames", null)
    
    inline def setCompanyNamesUndefined: Self = StObject.set(x, "companyNames", js.undefined)
    
    inline def setCompanyNamesVarargs(value: String*): Self = StObject.set(x, "companyNames", js.Array(value*))
    
    inline def setCompensationFilter(value: SchemaCompensationFilter): Self = StObject.set(x, "compensationFilter", value.asInstanceOf[js.Any])
    
    inline def setCompensationFilterUndefined: Self = StObject.set(x, "compensationFilter", js.undefined)
    
    inline def setCustomAttributeFilter(value: String): Self = StObject.set(x, "customAttributeFilter", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributeFilterNull: Self = StObject.set(x, "customAttributeFilter", null)
    
    inline def setCustomAttributeFilterUndefined: Self = StObject.set(x, "customAttributeFilter", js.undefined)
    
    inline def setDisableSpellCheck(value: Boolean): Self = StObject.set(x, "disableSpellCheck", value.asInstanceOf[js.Any])
    
    inline def setDisableSpellCheckNull: Self = StObject.set(x, "disableSpellCheck", null)
    
    inline def setDisableSpellCheckUndefined: Self = StObject.set(x, "disableSpellCheck", js.undefined)
    
    inline def setEmploymentTypes(value: js.Array[String]): Self = StObject.set(x, "employmentTypes", value.asInstanceOf[js.Any])
    
    inline def setEmploymentTypesNull: Self = StObject.set(x, "employmentTypes", null)
    
    inline def setEmploymentTypesUndefined: Self = StObject.set(x, "employmentTypes", js.undefined)
    
    inline def setEmploymentTypesVarargs(value: String*): Self = StObject.set(x, "employmentTypes", js.Array(value*))
    
    inline def setJobCategories(value: js.Array[String]): Self = StObject.set(x, "jobCategories", value.asInstanceOf[js.Any])
    
    inline def setJobCategoriesNull: Self = StObject.set(x, "jobCategories", null)
    
    inline def setJobCategoriesUndefined: Self = StObject.set(x, "jobCategories", js.undefined)
    
    inline def setJobCategoriesVarargs(value: String*): Self = StObject.set(x, "jobCategories", js.Array(value*))
    
    inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesNull: Self = StObject.set(x, "languageCodes", null)
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
    
    inline def setLocationFilters(value: js.Array[SchemaLocationFilter]): Self = StObject.set(x, "locationFilters", value.asInstanceOf[js.Any])
    
    inline def setLocationFiltersUndefined: Self = StObject.set(x, "locationFilters", js.undefined)
    
    inline def setLocationFiltersVarargs(value: SchemaLocationFilter*): Self = StObject.set(x, "locationFilters", js.Array(value*))
    
    inline def setPublishTimeRange(value: SchemaTimestampRange): Self = StObject.set(x, "publishTimeRange", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeRangeUndefined: Self = StObject.set(x, "publishTimeRange", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguageCode(value: String): Self = StObject.set(x, "queryLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguageCodeNull: Self = StObject.set(x, "queryLanguageCode", null)
    
    inline def setQueryLanguageCodeUndefined: Self = StObject.set(x, "queryLanguageCode", js.undefined)
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
