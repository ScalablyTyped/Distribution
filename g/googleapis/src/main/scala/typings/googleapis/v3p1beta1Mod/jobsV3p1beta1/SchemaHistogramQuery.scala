package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogramQuery extends StObject {
  
  /**
    * An expression specifies a histogram request against matching resources (for example, jobs) for searches. Expression syntax is a aggregation function call with histogram facets and other options. Available aggregation function calls are: * `count(string_histogram_facet)`: Count the number of matching entity, for each distinct attribute value. * `count(numeric_histogram_facet, list of buckets)`: Count the number of matching entity within each bucket. A maximum of 200 histogram buckets are supported. Data types: * Histogram facet: facet names with format a-zA-Z+. * String: string like "any string with backslash escape for quote(\")." * Number: whole number and floating point number like 10, -1 and -0.01. * List: list of elements with comma(,) separator surrounded by square brackets. For example, [1, 2, 3] and ["one", "two", "three"]. Built-in constants: * MIN (minimum number similar to java Double.MIN_VALUE) * MAX (maximum number similar to java Double.MAX_VALUE) Built-in functions: * bucket(start, end[, label]): bucket built-in function creates a bucket with range of start, end). Note that the end is exclusive. For example, bucket(1, MAX, "positive number") or bucket(1, 10). Job histogram facets: * company_id: histogram by [Job.distributor_company_id. * company_display_name: histogram by Job.company_display_name. * employment_type: histogram by Job.employment_types. For example, "FULL_TIME", "PART_TIME". * company_size: histogram by CompanySize, for example, "SMALL", "MEDIUM", "BIG". * publish_time_in_day: histogram by the Job.publish_time in days. Must specify list of numeric buckets in spec. * publish_time_in_month: histogram by the Job.publish_time in months. Must specify list of numeric buckets in spec. * publish_time_in_year: histogram by the Job.publish_time in years. Must specify list of numeric buckets in spec. * degree_type: histogram by the Job.degree_type. For example, "Bachelors", "Masters". * job_level: histogram by the Job.job_level. For example, "Entry Level". * country: histogram by the country code of jobs. For example, "US", "FR". * admin1: histogram by the admin1 code of jobs, which is a global placeholder referring to the state, province, or the particular term a country uses to define the geographic structure below the country level. For example, "CA", "IL". * city: histogram by a combination of the "city name, admin1 code". For example, "Mountain View, CA", "New York, NY". * admin1_country: histogram by a combination of the "admin1 code, country". For example, "CA, US", "IL, US". * city_coordinate: histogram by the city center's GPS coordinates (latitude and longitude). For example, 37.4038522,-122.0987765. Since the coordinates of a city center can change, customers may need to refresh them periodically. * locale: histogram by the Job.language_code. For example, "en-US", "fr-FR". * language: histogram by the language subtag of the Job.language_code. For example, "en", "fr". * category: histogram by the JobCategory. For example, "COMPUTER_AND_IT", "HEALTHCARE". * base_compensation_unit: histogram by the CompensationUnit of base salary. For example, "WEEKLY", "MONTHLY". * base_compensation: histogram by the base salary. Must specify list of numeric buckets to group results by. * annualized_base_compensation: histogram by the base annualized salary. Must specify list of numeric buckets to group results by. * annualized_total_compensation: histogram by the total annualized salary. Must specify list of numeric buckets to group results by. * string_custom_attribute: histogram by string Job.custom_attributes. Values can be accessed via square bracket notations like string_custom_attribute["key1"]. * numeric_custom_attribute: histogram by numeric Job.custom_attributes. Values can be accessed via square bracket notations like numeric_custom_attribute["key1"]. Must specify list of numeric buckets to group results by. Example expressions: * count(admin1) * count(base_compensation, [bucket(1000, 10000), bucket(10000, 100000), bucket(100000, MAX)]) * count(string_custom_attribute["some-string-custom-attribute"]) * count(numeric_custom_attribute["some-numeric-custom-attribute"], [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative")])
    */
  var histogramQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaHistogramQuery {
  
  inline def apply(): SchemaHistogramQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramQuery]
  }
  
  extension [Self <: SchemaHistogramQuery](x: Self) {
    
    inline def setHistogramQuery(value: String): Self = StObject.set(x, "histogramQuery", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueryNull: Self = StObject.set(x, "histogramQuery", null)
    
    inline def setHistogramQueryUndefined: Self = StObject.set(x, "histogramQuery", js.undefined)
  }
}
