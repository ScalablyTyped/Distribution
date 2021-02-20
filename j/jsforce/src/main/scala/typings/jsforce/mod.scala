package typings.jsforce

import typings.jsforce.bulkMod.BulkOptions
import typings.jsforce.chatterMod.RequestParams
import typings.jsforce.connectionMod.ConnectionOptions
import typings.jsforce.oauth2Mod.OAuth2Options
import typings.jsforce.salesforceIdMod.SalesforceId
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsforce", "Analytics")
  @js.native
  class Analytics ()
    extends typings.jsforce.analyticsMod.Analytics
  
  @JSImport("jsforce", "Apex")
  @js.native
  class Apex protected ()
    extends typings.jsforce.apexMod.Apex {
    def this(conn: typings.jsforce.connectionMod.Connection) = this()
  }
  
  @JSImport("jsforce", "AsyncResultLocator")
  @js.native
  class AsyncResultLocator[T] ()
    extends typings.jsforce.metadataMod.AsyncResultLocator[T] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("jsforce", "BaseConnection")
  @js.native
  abstract class BaseConnection ()
    extends typings.jsforce.connectionMod.BaseConnection {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("jsforce", "Batch")
  @js.native
  class Batch ()
    extends typings.jsforce.batchMod.Batch {
    def this(opts: WritableOptions) = this()
  }
  
  @JSImport("jsforce", "Bulk")
  @js.native
  class Bulk protected ()
    extends typings.jsforce.bulkMod.Bulk {
    def this(connection: typings.jsforce.connectionMod.Connection) = this()
  }
  
  @JSImport("jsforce", "Cache")
  @js.native
  class Cache ()
    extends typings.jsforce.cacheMod.Cache
  
  @JSImport("jsforce", "CacheEntry")
  @js.native
  class CacheEntry[T] ()
    extends typings.jsforce.cacheMod.CacheEntry[T] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("jsforce", "Channel")
  @js.native
  class Channel protected ()
    extends typings.jsforce.channelMod.Channel {
    def this(streaming: typings.jsforce.streamingMod.Streaming, name: String) = this()
  }
  
  @JSImport("jsforce", "Chatter")
  @js.native
  class Chatter protected ()
    extends typings.jsforce.chatterMod.Chatter {
    def this(conn: typings.jsforce.connectionMod.Connection) = this()
  }
  
  @JSImport("jsforce", "Connection")
  @js.native
  class Connection protected ()
    extends typings.jsforce.connectionMod.Connection {
    def this(params: ConnectionOptions) = this()
  }
  
  @JSImport("jsforce", "Dashboard")
  @js.native
  class Dashboard ()
    extends typings.jsforce.analyticsMod.Dashboard
  
  @JSImport("jsforce", "Date")
  @js.native
  object Date extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.jsforce.dateEnumMod.Date with Double] = js.native
    
    /* 9 */ val LAST_90_DAYS: typings.jsforce.dateEnumMod.Date.LAST_90_DAYS with Double = js.native
    
    /* 28 */ val LAST_FISCAL_QUARTER: typings.jsforce.dateEnumMod.Date.LAST_FISCAL_QUARTER with Double = js.native
    
    /* 33 */ val LAST_FISCAL_YEAR: typings.jsforce.dateEnumMod.Date.LAST_FISCAL_YEAR with Double = js.native
    
    /* 6 */ val LAST_MONTH: typings.jsforce.dateEnumMod.Date.LAST_MONTH with Double = js.native
    
    /* 11 */ val LAST_N_DAYS: typings.jsforce.dateEnumMod.Date.LAST_N_DAYS with Double = js.native
    
    /* 31 */ val LAST_N_FISCAL_QUARTERS: typings.jsforce.dateEnumMod.Date.LAST_N_FISCAL_QUARTERS with Double = js.native
    
    /* 36 */ val LAST_N_FISCAL_YEARS: typings.jsforce.dateEnumMod.Date.LAST_N_FISCAL_YEARS with Double = js.native
    
    /* 16 */ val LAST_N_MONTHS: typings.jsforce.dateEnumMod.Date.LAST_N_MONTHS with Double = js.native
    
    /* 21 */ val LAST_N_QUARTERS: typings.jsforce.dateEnumMod.Date.LAST_N_QUARTERS with Double = js.native
    
    /* 14 */ val LAST_N_WEEKS: typings.jsforce.dateEnumMod.Date.LAST_N_WEEKS with Double = js.native
    
    /* 26 */ val LAST_N_YEARS: typings.jsforce.dateEnumMod.Date.LAST_N_YEARS with Double = js.native
    
    /* 18 */ val LAST_QUARTER: typings.jsforce.dateEnumMod.Date.LAST_QUARTER with Double = js.native
    
    /* 3 */ val LAST_WEEK: typings.jsforce.dateEnumMod.Date.LAST_WEEK with Double = js.native
    
    /* 23 */ val LAST_YEAR: typings.jsforce.dateEnumMod.Date.LAST_YEAR with Double = js.native
    
    /* 10 */ val NEXT_90_DAYS: typings.jsforce.dateEnumMod.Date.NEXT_90_DAYS with Double = js.native
    
    /* 29 */ val NEXT_FISCAL_QUARTER: typings.jsforce.dateEnumMod.Date.NEXT_FISCAL_QUARTER with Double = js.native
    
    /* 34 */ val NEXT_FISCAL_YEAR: typings.jsforce.dateEnumMod.Date.NEXT_FISCAL_YEAR with Double = js.native
    
    /* 8 */ val NEXT_MONTH: typings.jsforce.dateEnumMod.Date.NEXT_MONTH with Double = js.native
    
    /* 12 */ val NEXT_N_DAYS: typings.jsforce.dateEnumMod.Date.NEXT_N_DAYS with Double = js.native
    
    /* 30 */ val NEXT_N_FISCAL_QUARTERS: typings.jsforce.dateEnumMod.Date.NEXT_N_FISCAL_QUARTERS with Double = js.native
    
    /* 35 */ val NEXT_N_FISCAL_YEARS: typings.jsforce.dateEnumMod.Date.NEXT_N_FISCAL_YEARS with Double = js.native
    
    /* 15 */ val NEXT_N_MONTHS: typings.jsforce.dateEnumMod.Date.NEXT_N_MONTHS with Double = js.native
    
    /* 20 */ val NEXT_N_QUARTERS: typings.jsforce.dateEnumMod.Date.NEXT_N_QUARTERS with Double = js.native
    
    /* 13 */ val NEXT_N_WEEKS: typings.jsforce.dateEnumMod.Date.NEXT_N_WEEKS with Double = js.native
    
    /* 25 */ val NEXT_N_YEARS: typings.jsforce.dateEnumMod.Date.NEXT_N_YEARS with Double = js.native
    
    /* 19 */ val NEXT_QUARTER: typings.jsforce.dateEnumMod.Date.NEXT_QUARTER with Double = js.native
    
    /* 5 */ val NEXT_WEEK: typings.jsforce.dateEnumMod.Date.NEXT_WEEK with Double = js.native
    
    /* 24 */ val NEXT_YEAR: typings.jsforce.dateEnumMod.Date.NEXT_YEAR with Double = js.native
    
    /* 27 */ val THIS_FISCAL_QUARTER: typings.jsforce.dateEnumMod.Date.THIS_FISCAL_QUARTER with Double = js.native
    
    /* 32 */ val THIS_FISCAL_YEAR: typings.jsforce.dateEnumMod.Date.THIS_FISCAL_YEAR with Double = js.native
    
    /* 7 */ val THIS_MONTH: typings.jsforce.dateEnumMod.Date.THIS_MONTH with Double = js.native
    
    /* 17 */ val THIS_QUARTER: typings.jsforce.dateEnumMod.Date.THIS_QUARTER with Double = js.native
    
    /* 4 */ val THIS_WEEK: typings.jsforce.dateEnumMod.Date.THIS_WEEK with Double = js.native
    
    /* 22 */ val THIS_YEAR: typings.jsforce.dateEnumMod.Date.THIS_YEAR with Double = js.native
    
    /* 1 */ val TODAY: typings.jsforce.dateEnumMod.Date.TODAY with Double = js.native
    
    /* 2 */ val TOMORROW: typings.jsforce.dateEnumMod.Date.TOMORROW with Double = js.native
    
    /* 0 */ val YESTERDAY: typings.jsforce.dateEnumMod.Date.YESTERDAY with Double = js.native
  }
  
  @JSImport("jsforce", "DeployResultLocator")
  @js.native
  class DeployResultLocator[T] ()
    extends typings.jsforce.metadataMod.DeployResultLocator[T] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("jsforce", "ExplainInfo")
  @js.native
  class ExplainInfo ()
    extends typings.jsforce.queryMod.ExplainInfo
  
  @JSImport("jsforce", "Job")
  @js.native
  class Job protected ()
    extends typings.jsforce.jobMod.Job {
    def this(bulk: typings.jsforce.bulkMod.Bulk) = this()
    def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: String) = this()
    def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: js.UndefOr[scala.Nothing], operation: String) = this()
    def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: String, operation: String) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: js.UndefOr[scala.Nothing],
      operation: js.UndefOr[scala.Nothing],
      options: BulkOptions
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: js.UndefOr[scala.Nothing],
      operation: String,
      options: BulkOptions
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: String,
      operation: js.UndefOr[scala.Nothing],
      options: BulkOptions
    ) = this()
    def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: String, operation: String, options: BulkOptions) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: js.UndefOr[scala.Nothing],
      operation: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: js.UndefOr[scala.Nothing],
      operation: js.UndefOr[scala.Nothing],
      options: BulkOptions,
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: js.UndefOr[scala.Nothing],
      operation: String,
      options: js.UndefOr[scala.Nothing],
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: js.UndefOr[scala.Nothing],
      operation: String,
      options: BulkOptions,
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: String,
      operation: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: String,
      operation: js.UndefOr[scala.Nothing],
      options: BulkOptions,
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: String,
      operation: String,
      options: js.UndefOr[scala.Nothing],
      jobId: String
    ) = this()
    def this(
      bulk: typings.jsforce.bulkMod.Bulk,
      `type`: String,
      operation: String,
      options: BulkOptions,
      jobId: String
    ) = this()
  }
  
  @JSImport("jsforce", "ListView")
  @js.native
  class ListView protected ()
    extends typings.jsforce.salesforceObjectMod.ListView {
    def this(connection: typings.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
  }
  
  @JSImport("jsforce", "ListViewsInfo")
  @js.native
  class ListViewsInfo ()
    extends typings.jsforce.salesforceObjectMod.ListViewsInfo
  
  @JSImport("jsforce", "Metadata")
  @js.native
  class Metadata protected ()
    extends typings.jsforce.metadataMod.Metadata {
    def this(conn: typings.jsforce.connectionMod.Connection) = this()
  }
  
  @JSImport("jsforce", "OAuth2")
  @js.native
  class OAuth2 ()
    extends typings.jsforce.oauth2Mod.OAuth2 {
    def this(options: OAuth2Options) = this()
  }
  
  @JSImport("jsforce", "Promise")
  @js.native
  class Promise ()
    extends typings.jsforce.promiseMod.Promise
  
  @JSImport("jsforce", "Query")
  @js.native
  class Query[T] ()
    extends typings.jsforce.queryMod.Query[T] {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("jsforce", "QuickAction")
  @js.native
  class QuickAction ()
    extends typings.jsforce.salesforceObjectMod.QuickAction
  
  @JSImport("jsforce", "RecordReference")
  @js.native
  class RecordReference[T] protected ()
    extends typings.jsforce.recordMod.RecordReference[T] {
    def this(conn: typings.jsforce.connectionMod.Connection, `type`: String, id: SalesforceId) = this()
  }
  
  @JSImport("jsforce", "Report")
  @js.native
  class Report ()
    extends typings.jsforce.analyticsMod.Report
  
  @JSImport("jsforce", "ReportInstance")
  @js.native
  class ReportInstance protected ()
    extends typings.jsforce.analyticsMod.ReportInstance {
    def this(report: typings.jsforce.analyticsMod.Report, id: String) = this()
  }
  
  @JSImport("jsforce", "Request")
  @js.native
  class Request[T] protected ()
    extends typings.jsforce.chatterMod.Request[T] {
    def this(chatter: typings.jsforce.chatterMod.Chatter, params: RequestParams) = this()
  }
  
  @JSImport("jsforce", "RequestResult")
  @js.native
  class RequestResult ()
    extends typings.jsforce.chatterMod.RequestResult
  
  @JSImport("jsforce", "Resource")
  @js.native
  class Resource[T] protected ()
    extends typings.jsforce.chatterMod.Resource[T] {
    def this(chatter: typings.jsforce.chatterMod.Chatter, url: String) = this()
    def this(chatter: typings.jsforce.chatterMod.Chatter, url: String, queryParams: js.Object) = this()
  }
  
  @JSImport("jsforce", "RestApi")
  @js.native
  abstract class RestApi ()
    extends typings.jsforce.connectionMod.RestApi
  
  @JSImport("jsforce", "RetrieveResultLocator")
  @js.native
  class RetrieveResultLocator[T] ()
    extends typings.jsforce.metadataMod.RetrieveResultLocator[T] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("jsforce", "SObject")
  @js.native
  class SObject[T] ()
    extends typings.jsforce.salesforceObjectMod.SObject[T]
  
  @JSImport("jsforce", "SfDate")
  @js.native
  class SfDate ()
    extends typings.jsforce.dateMod.SfDate
  /* static members */
  object SfDate {
    
    @JSImport("jsforce", "SfDate.parseDate")
    @js.native
    def parseDate(str: String): Date = js.native
    
    @JSImport("jsforce", "SfDate.toDateLiteral")
    @js.native
    def toDateLiteral(date: String): typings.jsforce.dateMod.SfDate = js.native
    @JSImport("jsforce", "SfDate.toDateLiteral")
    @js.native
    def toDateLiteral(date: Double): typings.jsforce.dateMod.SfDate = js.native
    @JSImport("jsforce", "SfDate.toDateLiteral")
    @js.native
    def toDateLiteral(date: Date): typings.jsforce.dateMod.SfDate = js.native
    
    @JSImport("jsforce", "SfDate.toDateTimeLiteral")
    @js.native
    def toDateTimeLiteral(date: String): typings.jsforce.dateMod.SfDate = js.native
    @JSImport("jsforce", "SfDate.toDateTimeLiteral")
    @js.native
    def toDateTimeLiteral(date: Double): typings.jsforce.dateMod.SfDate = js.native
    @JSImport("jsforce", "SfDate.toDateTimeLiteral")
    @js.native
    def toDateTimeLiteral(date: Date): typings.jsforce.dateMod.SfDate = js.native
  }
  
  @JSImport("jsforce", "Streaming")
  @js.native
  class Streaming protected ()
    extends typings.jsforce.streamingMod.Streaming {
    def this(connection: typings.jsforce.connectionMod.Connection) = this()
  }
  
  object StreamingExtension {
    
    @JSImport("jsforce", "StreamingExtension.AuthFailure")
    @js.native
    class AuthFailure protected ()
      extends typings.jsforce.streamingMod.StreamingExtension.AuthFailure {
      def this(failureCallback: js.Function0[_]) = this()
    }
    
    @JSImport("jsforce", "StreamingExtension.Replay")
    @js.native
    class Replay protected ()
      extends typings.jsforce.streamingMod.StreamingExtension.Replay {
      def this(channel: String, replayId: Double) = this()
    }
  }
  
  @JSImport("jsforce", "Tooling")
  @js.native
  class Tooling ()
    extends typings.jsforce.connectionMod.Tooling {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("jsforce", "Topic")
  @js.native
  class Topic protected ()
    extends typings.jsforce.topicMod.Topic {
    def this(streaming: typings.jsforce.streamingMod.Streaming, name: String) = this()
  }
}
