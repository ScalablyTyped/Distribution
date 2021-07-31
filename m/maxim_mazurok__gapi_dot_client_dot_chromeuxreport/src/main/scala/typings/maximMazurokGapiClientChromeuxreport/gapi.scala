package typings.maximMazurokGapiClientChromeuxreport

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientChromeuxreport.anon.Accesstoken
import typings.maximMazurokGapiClientChromeuxreport.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object chromeuxreport {
      
      trait Bin extends StObject {
        
        /** The proportion of users that experienced this bin's value for the given metric. */
        var density: js.UndefOr[Double] = js.undefined
        
        /** End is the end of the data bin. If end is not populated, then the bin has no end and is valid from start to +inf. */
        var end: js.UndefOr[js.Any] = js.undefined
        
        /** Start is the beginning of the data bin. */
        var start: js.UndefOr[js.Any] = js.undefined
      }
      object Bin {
        
        @scala.inline
        def apply(): Bin = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Bin]
        }
        
        @scala.inline
        implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
          
          @scala.inline
          def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
          
          @scala.inline
          def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        }
      }
      
      trait Key extends StObject {
        
        /**
          * The effective connection type is the general connection class that all users experienced for this record. This field uses the values ["offline", "slow-2G", "2G", "3G", "4G"] as
          * specified in: https://wicg.github.io/netinfo/#effective-connection-types If the effective connection type is unspecified, then aggregated data over all effective connection types
          * will be returned.
          */
        var effectiveConnectionType: js.UndefOr[String] = js.undefined
        
        /**
          * The form factor is the device class that all users used to access the site for this record. If the form factor is unspecified, then aggregated data over all form factors will be
          * returned.
          */
        var formFactor: js.UndefOr[String] = js.undefined
        
        /**
          * Origin specifies the origin that this record is for. Note: When specifying an origin, data for loads under this origin over all pages are aggregated into origin level user
          * experience data.
          */
        var origin: js.UndefOr[String] = js.undefined
        
        /** Url specifies a specific url that this record is for. Note: When specifying a "url" only data for that specific url will be aggregated. */
        var url: js.UndefOr[String] = js.undefined
      }
      object Key {
        
        @scala.inline
        def apply(): Key = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Key]
        }
        
        @scala.inline
        implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEffectiveConnectionType(value: String): Self = StObject.set(x, "effectiveConnectionType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEffectiveConnectionTypeUndefined: Self = StObject.set(x, "effectiveConnectionType", js.undefined)
          
          @scala.inline
          def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
          
          @scala.inline
          def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      trait Metric extends StObject {
        
        /** The histogram of user experiences for a metric. The histogram will have at least one bin and the densities of all bins will add up to ~1. */
        var histogram: js.UndefOr[js.Array[Bin]] = js.undefined
        
        /** Common useful percentiles of the Metric. The value type for the percentiles will be the same as the value types given for the Histogram bins. */
        var percentiles: js.UndefOr[Percentiles] = js.undefined
      }
      object Metric {
        
        @scala.inline
        def apply(): Metric = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Metric]
        }
        
        @scala.inline
        implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHistogram(value: js.Array[Bin]): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
          
          @scala.inline
          def setHistogramVarargs(value: Bin*): Self = StObject.set(x, "histogram", js.Array(value :_*))
          
          @scala.inline
          def setPercentiles(value: Percentiles): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
        }
      }
      
      trait Percentiles extends StObject {
        
        /** 75% of users experienced the given metric at or below this value. */
        var p75: js.UndefOr[js.Any] = js.undefined
      }
      object Percentiles {
        
        @scala.inline
        def apply(): Percentiles = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Percentiles]
        }
        
        @scala.inline
        implicit class PercentilesMutableBuilder[Self <: Percentiles] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setP75(value: js.Any): Self = StObject.set(x, "p75", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setP75Undefined: Self = StObject.set(x, "p75", js.undefined)
        }
      }
      
      trait QueryRequest extends StObject {
        
        /**
          * The effective connection type is a query dimension that specifies the effective network class that the record's data should belong to. This field uses the values ["offline",
          * "slow-2G", "2G", "3G", "4G"] as specified in: https://wicg.github.io/netinfo/#effective-connection-types Note: If no effective connection type is specified, then a special record
          * with aggregated data over all effective connection types will be returned.
          */
        var effectiveConnectionType: js.UndefOr[String] = js.undefined
        
        /**
          * The form factor is a query dimension that specifies the device class that the record's data should belong to. Note: If no form factor is specified, then a special record with
          * aggregated data over all form factors will be returned.
          */
        var formFactor: js.UndefOr[String] = js.undefined
        
        /**
          * The metrics that should be included in the response. If none are specified then any metrics found will be returned. Allowed values: ["first_contentful_paint", "first_input_delay",
          * "largest_contentful_paint", "cumulative_layout_shift"]
          */
        var metrics: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The url pattern "origin" refers to a url pattern that is the origin of a website. Examples: "https://example.com", "https://cloud.google.com" */
        var origin: js.UndefOr[String] = js.undefined
        
        /** The url pattern "url" refers to a url pattern that is any arbitrary url. Examples: "https://example.com/", "https://cloud.google.com/why-google-cloud/" */
        var url: js.UndefOr[String] = js.undefined
      }
      object QueryRequest {
        
        @scala.inline
        def apply(): QueryRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[QueryRequest]
        }
        
        @scala.inline
        implicit class QueryRequestMutableBuilder[Self <: QueryRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEffectiveConnectionType(value: String): Self = StObject.set(x, "effectiveConnectionType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEffectiveConnectionTypeUndefined: Self = StObject.set(x, "effectiveConnectionType", js.undefined)
          
          @scala.inline
          def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
          
          @scala.inline
          def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
          
          @scala.inline
          def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
          
          @scala.inline
          def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      trait QueryResponse extends StObject {
        
        /** The record that was found. */
        var record: js.UndefOr[Record] = js.undefined
        
        /** These are details about automated normalization actions that were taken in order to make the requested `url_pattern` valid. */
        var urlNormalizationDetails: js.UndefOr[UrlNormalization] = js.undefined
      }
      object QueryResponse {
        
        @scala.inline
        def apply(): QueryResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[QueryResponse]
        }
        
        @scala.inline
        implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setRecord(value: Record): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
          
          @scala.inline
          def setUrlNormalizationDetails(value: UrlNormalization): Self = StObject.set(x, "urlNormalizationDetails", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlNormalizationDetailsUndefined: Self = StObject.set(x, "urlNormalizationDetails", js.undefined)
        }
      }
      
      trait Record extends StObject {
        
        /** Key defines all of the unique querying parameters needed to look up a user experience record. */
        var key: js.UndefOr[Key] = js.undefined
        
        /**
          * Metrics is the map of user experience data available for the record defined in the key field. Metrics are keyed on the metric name. Allowed key values: ["first_contentful_paint",
          * "first_input_delay", "largest_contentful_paint", "cumulative_layout_shift"]
          */
        var metrics: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: @maxim_mazurok/gapi.client.chromeuxreport.gapi.client.chromeuxreport.Metric}
          */ typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.Record & TopLevel[js.Any]
              ] = js.undefined
      }
      object Record {
        
        @scala.inline
        def apply(): Record = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Record]
        }
        
        @scala.inline
        implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
          
          @scala.inline
          def setMetrics(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: @maxim_mazurok/gapi.client.chromeuxreport.gapi.client.chromeuxreport.Metric}
            */ typings.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.Record & TopLevel[js.Any]
          ): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
        }
      }
      
      @js.native
      trait RecordsResource extends StObject {
        
        /**
          * Queries the Chrome User Experience for a single `record` for a given site. Returns a `record` that contains one or more `metrics` corresponding to performance data about the
          * requested site.
          */
        def queryRecord(request: Accesstoken): Request[QueryResponse] = js.native
        def queryRecord(request: Alt, body: QueryRequest): Request[QueryResponse] = js.native
      }
      
      trait UrlNormalization extends StObject {
        
        /** The URL after any normalization actions. This is a valid user experience URL that could reasonably be looked up. */
        var normalizedUrl: js.UndefOr[String] = js.undefined
        
        /** The original requested URL prior to any normalization actions. */
        var originalUrl: js.UndefOr[String] = js.undefined
      }
      object UrlNormalization {
        
        @scala.inline
        def apply(): UrlNormalization = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UrlNormalization]
        }
        
        @scala.inline
        implicit class UrlNormalizationMutableBuilder[Self <: UrlNormalization] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setNormalizedUrl(value: String): Self = StObject.set(x, "normalizedUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNormalizedUrlUndefined: Self = StObject.set(x, "normalizedUrl", js.undefined)
          
          @scala.inline
          def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
        }
      }
    }
  }
}
