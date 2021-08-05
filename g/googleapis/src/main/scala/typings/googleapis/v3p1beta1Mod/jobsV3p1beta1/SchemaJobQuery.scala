package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  The query required to perform a search query.
  */
trait SchemaJobQuery extends StObject {
  
  /**
    * Optional.   Allows filtering jobs by commute time with different travel
    * methods (for  example, driving or public transit). Note: This only works
    * with COMMUTE  MODE. When specified, [JobQuery.location_filters] is
    * ignored.   Currently we don&#39;t support sorting by commute time.
    */
  var commuteFilter: js.UndefOr[SchemaCommuteFilter] = js.undefined
  
  /**
    * Optional.  This filter specifies the exact company display name of the
    * jobs to search against.  If a value isn&#39;t specified, jobs within the
    * search results are associated with any company.  If multiple values are
    * specified, jobs within the search results may be associated with any of
    * the specified companies.  At most 20 company display name filters are
    * allowed.
    */
  var companyDisplayNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  This filter specifies the company entities to search against.
    * If a value isn&#39;t specified, jobs are searched for against all
    * companies.  If multiple values are specified, jobs are searched against
    * the companies specified.  The format is
    * &quot;projects/{project_id}/companies/{company_id}&quot;, for example,
    * &quot;projects/api-test-project/companies/foo&quot;.  At most 20 company
    * filters are allowed.
    */
  var companyNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  This search filter is applied only to Job.compensation_info.
    * For example, if the filter is specified as &quot;Hourly job with per-hour
    * compensation &gt; $15&quot;, only jobs meeting these criteria are
    * searched. If a filter isn&#39;t defined, all open jobs are searched.
    */
  var compensationFilter: js.UndefOr[SchemaCompensationFilter] = js.undefined
  
  /**
    * Optional.  This filter specifies a structured syntax to match against the
    * Job.custom_attributes marked as `filterable`.  The syntax for this
    * expression is a subset of SQL syntax.  Supported operators are: `=`,
    * `!=`, `&lt;`, `&lt;=`, `&gt;`, and `&gt;=` where the left of the operator
    * is a custom field key and the right of the operator is a number or a
    * quoted string. You must escape backslash (\\) and quote (\&quot;)
    * characters.  Supported functions are `LOWER([field_name])` to perform a
    * case insensitive match and `EMPTY([field_name])` to filter on the
    * existence of a key.  Boolean expressions (AND/OR/NOT) are supported up to
    * 3 levels of nesting (for example, &quot;((A AND B AND C) OR NOT D) AND
    * E&quot;), a maximum of 100 comparisons or functions are allowed in the
    * expression. The expression must be &lt; 3000 bytes in length.  Sample
    * Query: `(LOWER(driving_license)=&quot;class \&quot;a\&quot;&quot; OR
    * EMPTY(driving_license)) AND driving_years &gt; 10`
    */
  var customAttributeFilter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  This flag controls the spell-check feature. If false, the
    * service attempts to correct a misspelled query, for example,
    * &quot;enginee&quot; is corrected to &quot;engineer&quot;.  Defaults to
    * false: a spell check is performed.
    */
  var disableSpellCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  The employment type filter specifies the employment type of
    * jobs to search against, such as EmploymentType.FULL_TIME.  If a value is
    * not specified, jobs in the search results includes any employment type.
    * If multiple values are specified, jobs in the search results include any
    * of the specified employment types.
    */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  This filter specifies a list of job names to be excluded
    * during search.  At most 200 excluded job names are allowed.
    */
  var excludedJobs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  The category filter specifies the categories of jobs to search
    * against. See Category for more information.  If a value is not specified,
    * jobs from any category are searched against.  If multiple values are
    * specified, jobs from any of the specified categories are searched
    * against.
    */
  var jobCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  This filter specifies the locale of jobs to search against,
    * for example, &quot;en-US&quot;.  If a value isn&#39;t specified, the
    * search results can contain jobs in any locale.   Language codes should be
    * in BCP-47 format, such as &quot;en-US&quot; or &quot;sr-Latn&quot;. For
    * more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47).  At most 10 language code
    * filters are allowed.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional.  The location filter specifies geo-regions containing the jobs
    * to search against. See LocationFilter for more information.  If a
    * location value isn&#39;t specified, jobs fitting the other search
    * criteria are retrieved regardless of where they&#39;re located.  If
    * multiple values are specified, jobs are retrieved from any of the
    * specified locations. If different values are specified for the
    * LocationFilter.distance_in_miles parameter, the maximum provided distance
    * is used for all locations.  At most 5 location filters are allowed.
    */
  var locationFilters: js.UndefOr[js.Array[SchemaLocationFilter]] = js.undefined
  
  /**
    * Optional.  Jobs published within a range specified by this filter are
    * searched against.
    */
  var publishTimeRange: js.UndefOr[SchemaTimestampRange] = js.undefined
  
  /**
    * Optional.  The query string that matches against the job title,
    * description, and location fields.  The maximum number of allowed
    * characters is 255.
    */
  var query: js.UndefOr[String] = js.undefined
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
    
    inline def setCompanyDisplayNamesUndefined: Self = StObject.set(x, "companyDisplayNames", js.undefined)
    
    inline def setCompanyDisplayNamesVarargs(value: String*): Self = StObject.set(x, "companyDisplayNames", js.Array(value :_*))
    
    inline def setCompanyNames(value: js.Array[String]): Self = StObject.set(x, "companyNames", value.asInstanceOf[js.Any])
    
    inline def setCompanyNamesUndefined: Self = StObject.set(x, "companyNames", js.undefined)
    
    inline def setCompanyNamesVarargs(value: String*): Self = StObject.set(x, "companyNames", js.Array(value :_*))
    
    inline def setCompensationFilter(value: SchemaCompensationFilter): Self = StObject.set(x, "compensationFilter", value.asInstanceOf[js.Any])
    
    inline def setCompensationFilterUndefined: Self = StObject.set(x, "compensationFilter", js.undefined)
    
    inline def setCustomAttributeFilter(value: String): Self = StObject.set(x, "customAttributeFilter", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributeFilterUndefined: Self = StObject.set(x, "customAttributeFilter", js.undefined)
    
    inline def setDisableSpellCheck(value: Boolean): Self = StObject.set(x, "disableSpellCheck", value.asInstanceOf[js.Any])
    
    inline def setDisableSpellCheckUndefined: Self = StObject.set(x, "disableSpellCheck", js.undefined)
    
    inline def setEmploymentTypes(value: js.Array[String]): Self = StObject.set(x, "employmentTypes", value.asInstanceOf[js.Any])
    
    inline def setEmploymentTypesUndefined: Self = StObject.set(x, "employmentTypes", js.undefined)
    
    inline def setEmploymentTypesVarargs(value: String*): Self = StObject.set(x, "employmentTypes", js.Array(value :_*))
    
    inline def setExcludedJobs(value: js.Array[String]): Self = StObject.set(x, "excludedJobs", value.asInstanceOf[js.Any])
    
    inline def setExcludedJobsUndefined: Self = StObject.set(x, "excludedJobs", js.undefined)
    
    inline def setExcludedJobsVarargs(value: String*): Self = StObject.set(x, "excludedJobs", js.Array(value :_*))
    
    inline def setJobCategories(value: js.Array[String]): Self = StObject.set(x, "jobCategories", value.asInstanceOf[js.Any])
    
    inline def setJobCategoriesUndefined: Self = StObject.set(x, "jobCategories", js.undefined)
    
    inline def setJobCategoriesVarargs(value: String*): Self = StObject.set(x, "jobCategories", js.Array(value :_*))
    
    inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
    
    inline def setLocationFilters(value: js.Array[SchemaLocationFilter]): Self = StObject.set(x, "locationFilters", value.asInstanceOf[js.Any])
    
    inline def setLocationFiltersUndefined: Self = StObject.set(x, "locationFilters", js.undefined)
    
    inline def setLocationFiltersVarargs(value: SchemaLocationFilter*): Self = StObject.set(x, "locationFilters", js.Array(value :_*))
    
    inline def setPublishTimeRange(value: SchemaTimestampRange): Self = StObject.set(x, "publishTimeRange", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeRangeUndefined: Self = StObject.set(x, "publishTimeRange", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
