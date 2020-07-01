package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Deprecated. Use JobQuery instead.  The filters required to
  * perform a search query or histogram.
  */
@js.native
trait SchemaJobFilters extends js.Object {
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
  def apply(
    categories: js.Array[String] = null,
    commuteFilter: SchemaCommutePreference = null,
    companyNames: js.Array[String] = null,
    companyTitles: js.Array[String] = null,
    compensationFilter: SchemaCompensationFilter = null,
    customAttributeFilter: String = null,
    customFieldFilters: StringDictionary[SchemaCustomFieldFilter] = null,
    disableSpellCheck: js.UndefOr[Boolean] = js.undefined,
    employmentTypes: js.Array[String] = null,
    extendedCompensationFilter: SchemaExtendedCompensationFilter = null,
    languageCodes: js.Array[String] = null,
    locationFilters: js.Array[SchemaLocationFilter] = null,
    publishDateRange: String = null,
    query: String = null,
    tenantJobOnly: js.UndefOr[Boolean] = js.undefined
  ): SchemaJobFilters = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (commuteFilter != null) __obj.updateDynamic("commuteFilter")(commuteFilter.asInstanceOf[js.Any])
    if (companyNames != null) __obj.updateDynamic("companyNames")(companyNames.asInstanceOf[js.Any])
    if (companyTitles != null) __obj.updateDynamic("companyTitles")(companyTitles.asInstanceOf[js.Any])
    if (compensationFilter != null) __obj.updateDynamic("compensationFilter")(compensationFilter.asInstanceOf[js.Any])
    if (customAttributeFilter != null) __obj.updateDynamic("customAttributeFilter")(customAttributeFilter.asInstanceOf[js.Any])
    if (customFieldFilters != null) __obj.updateDynamic("customFieldFilters")(customFieldFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSpellCheck)) __obj.updateDynamic("disableSpellCheck")(disableSpellCheck.get.asInstanceOf[js.Any])
    if (employmentTypes != null) __obj.updateDynamic("employmentTypes")(employmentTypes.asInstanceOf[js.Any])
    if (extendedCompensationFilter != null) __obj.updateDynamic("extendedCompensationFilter")(extendedCompensationFilter.asInstanceOf[js.Any])
    if (languageCodes != null) __obj.updateDynamic("languageCodes")(languageCodes.asInstanceOf[js.Any])
    if (locationFilters != null) __obj.updateDynamic("locationFilters")(locationFilters.asInstanceOf[js.Any])
    if (publishDateRange != null) __obj.updateDynamic("publishDateRange")(publishDateRange.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(tenantJobOnly)) __obj.updateDynamic("tenantJobOnly")(tenantJobOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobFilters]
  }
}

