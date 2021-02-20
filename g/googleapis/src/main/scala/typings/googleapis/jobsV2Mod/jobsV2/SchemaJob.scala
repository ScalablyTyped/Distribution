package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Job resource represents a job posting (also referred to as a &quot;job
  * listing&quot; or &quot;job requisition&quot;). A job belongs to a Company,
  * which is the hiring entity responsible for the job.
  */
@js.native
trait SchemaJob extends StObject {
  
  /**
    * Optional but at least one of application_urls, application_email_list or
    * application_instruction must be specified.  Use this field to specify
    * email address(es) to which resumes or applications can be sent.  The
    * maximum number of allowed characters is 255.
    */
  var applicationEmailList: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional but at least one of application_urls, application_email_list or
    * application_instruction must be specified.  Use this field to provide
    * instructions, such as &quot;Mail your application to ...&quot;, that a
    * candidate can follow to apply for the job.  This field accepts and
    * sanitizes HTML input, and also accepts bold, italic, ordered list, and
    * unordered list markup tags.  The maximum number of allowed characters is
    * 3,000.
    */
  var applicationInstruction: js.UndefOr[String] = js.native
  
  /**
    * Optional but at least one of application_urls, application_email_list or
    * application_instruction must be specified.  Use this URL field to direct
    * an applicant to a website, for example to link to an online application
    * form.  The maximum number of allowed characters is 2,000.
    */
  var applicationUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  The benefits included with the job.
    */
  var benefits: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only.  The name of the company listing the job.
    */
  var companyDisplayName: js.UndefOr[String] = js.native
  
  /**
    * Optional but one of company_name or distributor_company_id must be
    * provided.  The resource name of the company listing the job, such as
    * /companies/foo. This field takes precedence over the distributor-assigned
    * company identifier, distributor_company_id.
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Use company_display_name instead.  Output only.  The name of
    * the company listing the job.
    */
  var companyTitle: js.UndefOr[String] = js.native
  
  /**
    * Optional.  Job compensation information.
    */
  var compensationInfo: js.UndefOr[SchemaCompensationInfo] = js.native
  
  /**
    * Output only.  The timestamp when this job was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A map of fields to hold both filterable and non-filterable
    * custom job attributes that are not covered by the provided structured
    * fields.  This field is a more general combination of the deprecated
    * id-based filterable_custom_fields and string-based
    * non_filterable_custom_fields.  The keys of the map are strings up to 64
    * bytes and must match the pattern: a-zA-Z*.  At most 100 filterable and at
    * most 100 unfilterable keys are supported. For filterable `string_values`,
    * across all keys at most 200 values are allowed, with each string no more
    * than 255 characters. For unfilterable `string_values`, the maximum total
    * size of `string_values` across all keys is 50KB.
    */
  var customAttributes: js.UndefOr[StringDictionary[SchemaCustomAttribute]] = js.native
  
  /**
    * Optional.  The department or functional area within the company with the
    * open position.  The maximum number of allowed characters is 255.
    */
  var department: js.UndefOr[String] = js.native
  
  /**
    * Required.  The description of the job, which typically includes a
    * multi-paragraph description of the company and related information.
    * Separate fields are provided on the job object for responsibilities,
    * qualifications, and other job characteristics. Use of these separate job
    * fields is recommended.  This field accepts and sanitizes HTML input, and
    * also accepts bold, italic, ordered list, and unordered list markup tags.
    * The maximum number of allowed characters is 100,000.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Optional but one of company_name or distributor_company_id must be
    * provided.  A unique company identifier used by job distributors to
    * identify an employer&#39;s company entity. company_name takes precedence
    * over this field, and is the recommended field to use to identify
    * companies.  The maximum number of allowed characters is 255.
    */
  var distributorCompanyId: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The desired education level for the job, such as
    * &quot;Bachelors&quot;, &quot;Masters&quot;, &quot;Doctorate&quot;.
    */
  var educationLevels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  The employment type(s) of a job, for example, full time or
    * part time.
    */
  var employmentTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional.  The end date of the job in UTC time zone. Typically this field
    * is used for contracting engagements. Dates prior to 1970/1/1 and invalid
    * date formats are ignored.
    */
  var endDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * Optional but strongly recommended for the best service experience.  The
    * expiration timestamp of the job. After this timestamp, the job is marked
    * as expired, and it no longer appears in search results. The expired job
    * can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it
    * can be retrieved with the GetJob API or updated with the UpdateJob API.
    * An expired job can be updated and opened again by using a future
    * expiration timestamp. Updating an expired job fails if there is another
    * existing open job with same requisition_id, company_name and
    * language_code.  The expired jobs are retained in our system for 90 days.
    * However, the overall expired job count cannot exceed 3 times the maximum
    * of open jobs count over the past week, otherwise jobs with earlier expire
    * time are cleaned first. Expired jobs are no longer accessible after they
    * are cleaned out. The format of this field is RFC 3339 date strings.
    * Example: 2000-01-01T00:00:00.999999999Z See
    * [https://www.ietf.org/rfc/rfc3339.txt](https://www.ietf.org/rfc/rfc3339.txt).
    * A valid date range is between 1970-01-01T00:00:00.0Z and
    * 2100-12-31T23:59:59.999Z. Invalid dates are ignored and treated as expire
    * time not provided.  If this value is not provided at the time of job
    * creation or is invalid, the job posting expires after 30 days from the
    * job&#39;s creation time. For example, if the job was created on
    * 2017/01/01 13:00AM UTC with an unspecified expiration date, the job
    * expires after 2017/01/31 13:00AM UTC.  If this value is not provided but
    * expiry_date is, expiry_date is used.  If this value is not provided on
    * job update, it depends on the field masks set by
    * UpdateJobRequest.update_job_fields. If the field masks include
    * expiry_time, or the masks are empty meaning that every field is updated,
    * the job posting expires after 30 days from the job&#39;s last update
    * time. Otherwise the expiration date isn&#39;t updated.
    */
  var expireTime: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Use expire_time instead.  Optional but strongly recommended
    * to be provided for the best service experience.  The expiration date of
    * the job in UTC time. After 12 am on this date, the job is marked as
    * expired, and it no longer appears in search results. The expired job
    * can&#39;t be deleted or listed by the DeleteJob and ListJobs APIs, but it
    * can be retrieved with the GetJob API or updated with the UpdateJob API.
    * An expired job can be updated and opened again by using a future
    * expiration date. It can also remain expired. Updating an expired job to
    * be open fails if there is another existing open job with same
    * requisition_id, company_name and language_code.  The expired jobs are
    * retained in our system for 90 days. However, the overall expired job
    * count cannot exceed 3 times the maximum of open jobs count over the past
    * week, otherwise jobs with earlier expire time are removed first. Expired
    * jobs are no longer accessible after they are cleaned out.  A valid date
    * range is between 1970/1/1 and 2100/12/31. Invalid dates are ignored and
    * treated as expiry date not provided.  If this value is not provided on
    * job creation or is invalid, the job posting expires after 30 days from
    * the job&#39;s creation time. For example, if the job was created on
    * 2017/01/01 13:00AM UTC with an unspecified expiration date, the job
    * expires after 2017/01/31 13:00AM UTC.  If this value is not provided on
    * job update, it depends on the field masks set by
    * UpdateJobRequest.update_job_fields. If the field masks include
    * expiry_date, or the masks are empty meaning that every field is updated,
    * the job expires after 30 days from the job&#39;s last update time.
    * Otherwise the expiration date isn&#39;t updated.
    */
  var expiryDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * Deprecated. Always use compensation_info.  Optional.  Job compensation
    * information.  This field replaces compensation_info. Only
    * CompensationInfo.entries or extended_compensation_info can be set,
    * otherwise an exception is thrown.
    */
  var extendedCompensationInfo: js.UndefOr[SchemaExtendedCompensationInfo] = js.native
  
  /**
    * Deprecated. Use custom_attributes instead.  Optional.  A map of fields to
    * hold filterable custom job attributes not captured by the standard fields
    * such as job_title, company_name, or level. These custom fields store
    * arbitrary string values, and can be used for purposes not covered by the
    * structured fields. For the best search experience, use of the structured
    * rather than custom fields is recommended.  Data stored in these custom
    * fields fields are indexed and searched against by keyword searches (see
    * SearchJobsRequest.custom_field_filters][]).  The map key must be a number
    * between 1-20. If an invalid key is provided on job create or update, an
    * error is returned.
    */
  var filterableCustomFields: js.UndefOr[StringDictionary[SchemaCustomField]] = js.native
  
  /**
    * Optional.  A description of bonus, commission, and other compensation
    * incentives associated with the job not including salary or pay.  The
    * maximum number of allowed characters is 10,000.
    */
  var incentives: js.UndefOr[String] = js.native
  
  /**
    * Output only.  Structured locations of the job, resolved from locations.
    */
  var jobLocations: js.UndefOr[js.Array[SchemaJobLocation]] = js.native
  
  /**
    * Required.  The title of the job, such as &quot;Software Engineer&quot;
    * The maximum number of allowed characters is 500.
    */
  var jobTitle: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The language of the posting. This field is distinct from any
    * requirements for fluency that are associated with the job.  Language
    * codes must be in BCP-47 format, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see [Tags for Identifying
    * Languages](https://tools.ietf.org/html/bcp47){:
    * class=&quot;external&quot; target=&quot;_blank&quot; }.  If this field is
    * unspecified and Job.description is present, detected language code based
    * on Job.description is assigned, otherwise defaults to &#39;en_US&#39;.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The experience level associated with the job, such as
    * &quot;Entry Level&quot;.
    */
  var level: js.UndefOr[String] = js.native
  
  /**
    * Optional but strongly recommended for the best service experience.
    * Location(s) where the emploeyer is looking to hire for this job posting.
    * Specifying the full street address(es) of the hiring location enables
    * better API results, especially job searches by commute time.  At most 50
    * locations are allowed for best search performance. If a job has more
    * locations, it is suggested to split it into multiple jobs with unique
    * requisition_ids (e.g. &#39;ReqA&#39; becomes &#39;ReqA-1&#39;,
    * &#39;ReqA-2&#39;, etc.) as multiple jobs with the same requisition_id,
    * company_name and language_code are not allowed. If the original
    * requisition_id must be preserved, a custom field should be used for
    * storage. It is also suggested to group the locations that close to each
    * other in the same job for better search experience.  The maximum number
    * of allowed characters is 500.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required during job update.  Resource name assigned to a job by the API,
    * for example, &quot;/jobs/foo&quot;. Use of this field in job queries and
    * API calls is preferred over the use of requisition_id since this value is
    * unique.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A promotion value of the job, as determined by the client. The
    * value determines the sort order of the jobs returned when searching for
    * jobs using the featured jobs search call, with higher promotional values
    * being returned first and ties being resolved by relevance sort. Only the
    * jobs with a promotionValue &gt;0 are returned in a FEATURED_JOB_SEARCH.
    * Default value is 0, and negative values are treated as 0.
    */
  var promotionValue: js.UndefOr[Double] = js.native
  
  /**
    * Optional.  The date this job was most recently published in UTC format.
    * The default value is the time the request arrives at the server.
    */
  var publishDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * Optional.  A description of the qualifications required to perform the
    * job. The use of this field is recommended as an alternative to using the
    * more general description field.  This field accepts and sanitizes HTML
    * input, and also accepts bold, italic, ordered list, and unordered list
    * markup tags.  The maximum number of allowed characters is 10,000.
    */
  var qualifications: js.UndefOr[String] = js.native
  
  /**
    * Output only.  The URL of a web page that displays job details.
    */
  var referenceUrl: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The job Region (for example, state, country) throughout which
    * the job is available. If this field is set, a LocationFilter in a search
    * query within the job region finds this job if an exact location match is
    * not specified. If this field is set, setting job locations to the same
    * location level as this field is strongly recommended.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Required.  The requisition ID, also referred to as the posting ID,
    * assigned by the client to identify a job. This field is intended to be
    * used by clients for client identification and tracking of listings. A job
    * is not allowed to be created if there is another job with the same
    * requisition_id, company_name and language_code.  The maximum number of
    * allowed characters is 255.
    */
  var requisitionId: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A description of job responsibilities. The use of this field
    * is recommended as an alternative to using the more general description
    * field.  This field accepts and sanitizes HTML input, and also accepts
    * bold, italic, ordered list, and unordered list markup tags.  The maximum
    * number of allowed characters is 10,000.
    */
  var responsibilities: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The start date of the job in UTC time zone. Typically this
    * field is used for contracting engagements. Dates prior to 1970/1/1 and
    * invalid date formats are ignored.
    */
  var startDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * Deprecated. Use custom_attributes instead.  Optional.  A map of fields to
    * hold non-filterable custom job attributes, similar to
    * filterable_custom_fields. These fields are distinct in that the data in
    * these fields are not indexed. Therefore, the client cannot search against
    * them, nor can the client use them to list jobs.  The key of the map can
    * be any valid string.
    */
  var unindexedCustomFields: js.UndefOr[StringDictionary[SchemaCustomField]] = js.native
  
  /**
    * Output only.  The timestamp when this job was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The visibility of the job. Defaults to JobVisibility.PRIVATE
    * if not specified. Currently only JobVisibility.PRIVATE is supported.
    */
  var visibility: js.UndefOr[String] = js.native
}
object SchemaJob {
  
  @scala.inline
  def apply(): SchemaJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJob]
  }
  
  @scala.inline
  implicit class SchemaJobMutableBuilder[Self <: SchemaJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationEmailList(value: js.Array[String]): Self = StObject.set(x, "applicationEmailList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationEmailListUndefined: Self = StObject.set(x, "applicationEmailList", js.undefined)
    
    @scala.inline
    def setApplicationEmailListVarargs(value: String*): Self = StObject.set(x, "applicationEmailList", js.Array(value :_*))
    
    @scala.inline
    def setApplicationInstruction(value: String): Self = StObject.set(x, "applicationInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationInstructionUndefined: Self = StObject.set(x, "applicationInstruction", js.undefined)
    
    @scala.inline
    def setApplicationUrls(value: js.Array[String]): Self = StObject.set(x, "applicationUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUrlsUndefined: Self = StObject.set(x, "applicationUrls", js.undefined)
    
    @scala.inline
    def setApplicationUrlsVarargs(value: String*): Self = StObject.set(x, "applicationUrls", js.Array(value :_*))
    
    @scala.inline
    def setBenefits(value: js.Array[String]): Self = StObject.set(x, "benefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitsUndefined: Self = StObject.set(x, "benefits", js.undefined)
    
    @scala.inline
    def setBenefitsVarargs(value: String*): Self = StObject.set(x, "benefits", js.Array(value :_*))
    
    @scala.inline
    def setCompanyDisplayName(value: String): Self = StObject.set(x, "companyDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyDisplayNameUndefined: Self = StObject.set(x, "companyDisplayName", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setCompanyTitle(value: String): Self = StObject.set(x, "companyTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyTitleUndefined: Self = StObject.set(x, "companyTitle", js.undefined)
    
    @scala.inline
    def setCompensationInfo(value: SchemaCompensationInfo): Self = StObject.set(x, "compensationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationInfoUndefined: Self = StObject.set(x, "compensationInfo", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: StringDictionary[SchemaCustomAttribute]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDistributorCompanyId(value: String): Self = StObject.set(x, "distributorCompanyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorCompanyIdUndefined: Self = StObject.set(x, "distributorCompanyId", js.undefined)
    
    @scala.inline
    def setEducationLevels(value: js.Array[String]): Self = StObject.set(x, "educationLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEducationLevelsUndefined: Self = StObject.set(x, "educationLevels", js.undefined)
    
    @scala.inline
    def setEducationLevelsVarargs(value: String*): Self = StObject.set(x, "educationLevels", js.Array(value :_*))
    
    @scala.inline
    def setEmploymentTypes(value: js.Array[String]): Self = StObject.set(x, "employmentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmploymentTypesUndefined: Self = StObject.set(x, "employmentTypes", js.undefined)
    
    @scala.inline
    def setEmploymentTypesVarargs(value: String*): Self = StObject.set(x, "employmentTypes", js.Array(value :_*))
    
    @scala.inline
    def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setExpiryDate(value: SchemaDate): Self = StObject.set(x, "expiryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryDateUndefined: Self = StObject.set(x, "expiryDate", js.undefined)
    
    @scala.inline
    def setExtendedCompensationInfo(value: SchemaExtendedCompensationInfo): Self = StObject.set(x, "extendedCompensationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedCompensationInfoUndefined: Self = StObject.set(x, "extendedCompensationInfo", js.undefined)
    
    @scala.inline
    def setFilterableCustomFields(value: StringDictionary[SchemaCustomField]): Self = StObject.set(x, "filterableCustomFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterableCustomFieldsUndefined: Self = StObject.set(x, "filterableCustomFields", js.undefined)
    
    @scala.inline
    def setIncentives(value: String): Self = StObject.set(x, "incentives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncentivesUndefined: Self = StObject.set(x, "incentives", js.undefined)
    
    @scala.inline
    def setJobLocations(value: js.Array[SchemaJobLocation]): Self = StObject.set(x, "jobLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobLocationsUndefined: Self = StObject.set(x, "jobLocations", js.undefined)
    
    @scala.inline
    def setJobLocationsVarargs(value: SchemaJobLocation*): Self = StObject.set(x, "jobLocations", js.Array(value :_*))
    
    @scala.inline
    def setJobTitle(value: String): Self = StObject.set(x, "jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTitleUndefined: Self = StObject.set(x, "jobTitle", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPromotionValue(value: Double): Self = StObject.set(x, "promotionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionValueUndefined: Self = StObject.set(x, "promotionValue", js.undefined)
    
    @scala.inline
    def setPublishDate(value: SchemaDate): Self = StObject.set(x, "publishDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishDateUndefined: Self = StObject.set(x, "publishDate", js.undefined)
    
    @scala.inline
    def setQualifications(value: String): Self = StObject.set(x, "qualifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationsUndefined: Self = StObject.set(x, "qualifications", js.undefined)
    
    @scala.inline
    def setReferenceUrl(value: String): Self = StObject.set(x, "referenceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUrlUndefined: Self = StObject.set(x, "referenceUrl", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRequisitionId(value: String): Self = StObject.set(x, "requisitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequisitionIdUndefined: Self = StObject.set(x, "requisitionId", js.undefined)
    
    @scala.inline
    def setResponsibilities(value: String): Self = StObject.set(x, "responsibilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsibilitiesUndefined: Self = StObject.set(x, "responsibilities", js.undefined)
    
    @scala.inline
    def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setUnindexedCustomFields(value: StringDictionary[SchemaCustomField]): Self = StObject.set(x, "unindexedCustomFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnindexedCustomFieldsUndefined: Self = StObject.set(x, "unindexedCustomFields", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
