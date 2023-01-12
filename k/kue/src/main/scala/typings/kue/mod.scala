package typings.kue

import typings.express.mod.Application_
import typings.node.eventsMod.EventEmitter
import typings.redis.mod.RedisClusterType
import typings.redis.mod.RedisDefaultModules
import typings.redisClient.distLibClientMod.RedisClientOptions
import typings.redisClient.distLibClientMod.RedisClientType
import typings.redisClient.distLibClusterMod.RedisClusterOptions
import typings.redisClient.distLibCommandsMod.RedisFunctions
import typings.redisClient.distLibCommandsMod.RedisModules
import typings.redisClient.distLibCommandsMod.RedisScripts
import typings.redisClient.distLibLuaScriptMod.RedisScriptConfig
import typings.redisClient.distLibLuaScriptMod.SHA1
import typings.redisGraph.distGraphMod.GraphClientType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kue", "Job")
  @js.native
  open class Job protected () extends EventEmitter {
    def this(`type`: String) = this()
    def this(`type`: String, data: Any) = this()
    
    /* private */ var _error: String = js.native
    
    /* private */ def _getBackoffImpl(): Unit = js.native
    
    /* private */ var _max_attempts: Any = js.native
    
    def active(): Job = js.native
    def active(fn: js.Function): Job = js.native
    
    def attempt(fn: js.Function): Job = js.native
    
    def attempts(n: Double): Job = js.native
    
    def backoff(param: Any): Job = js.native
    
    var client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redisClientFactory.RedisClient */ Any = js.native
    
    def complete(): Job = js.native
    def complete(fn: js.Function): Job = js.native
    
    // Should always be a number however currently it is a number when creating and a string when loading
    // https://github.com/Automattic/kue/issues/1081
    var created_at: String | Double = js.native
    
    var data: Any = js.native
    
    def delay(ms: js.Date): Job = js.native
    def delay(ms: Double): Job = js.native
    
    def delayed(): Job = js.native
    def delayed(fn: js.Function): Job = js.native
    
    def error(err: js.Error): Job = js.native
    
    def events(events: Boolean): Job = js.native
    
    def failed(): Job = js.native
    def failed(fn: js.Function): Job = js.native
    
    var failed_at: String | Double = js.native
    
    def get(key: String): Job = js.native
    def get(key: String, fn: js.Function): Job = js.native
    def get(key: String, jobType: String): Job = js.native
    def get(key: String, jobType: String, fn: js.Function): Job = js.native
    
    var id: Double = js.native
    
    def inactive(): Job = js.native
    def inactive(fn: js.Function): Job = js.native
    
    def log(str: String): Job = js.native
    
    def priority(): Double | String = js.native
    def priority(level: String): Job = js.native
    def priority(level: Double): Job = js.native
    
    def progress(complete: Double, total: Double): Job = js.native
    def progress(complete: Double, total: Double, data: Any): Job = js.native
    
    var promote_at: String | Double = js.native
    
    def reattempt(attempt: Double): Unit = js.native
    def reattempt(attempt: Double, fn: js.Function): Unit = js.native
    
    def remove(): Job = js.native
    def remove(fn: js.Function): Job = js.native
    
    def removeOnComplete(param: Any): Job = js.native
    
    var result: Any = js.native
    
    def save(): Job = js.native
    def save(fn: js.Function): Job = js.native
    
    def searchKeys(keys: String): Job = js.native
    def searchKeys(keys: js.Array[String]): Job = js.native
    
    def set(key: String, `val`: String): Job = js.native
    def set(key: String, `val`: String, fn: js.Function): Job = js.native
    
    var started_at: String | Double = js.native
    
    def state(state: String): Job = js.native
    def state(state: String, fn: js.Function): Job = js.native
    
    def subscribe(): Job = js.native
    def subscribe(fn: js.Function): Job = js.native
    
    def toJSON(): js.Object = js.native
    
    def ttl(param: Any): Job = js.native
    
    var `type`: String = js.native
    
    def update(): Job = js.native
    def update(fn: js.Function): Job = js.native
    
    var updated_at: String | Double = js.native
    
    var workerId: String = js.native
  }
  /* static members */
  object Job {
    
    @JSImport("kue", "Job")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kue", "Job.disableSearch")
    @js.native
    def disableSearch: Boolean = js.native
    inline def disableSearch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableSearch")(x.asInstanceOf[js.Any])
    
    inline def get(id: Double, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: Double, `type`: String, fn: JobCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: Double, `type`: JobCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def get(id: Double, `type`: JobCallback, fn: JobCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("kue", "Job.jobEvents")
    @js.native
    def jobEvents: Boolean = js.native
    inline def jobEvents_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jobEvents")(x.asInstanceOf[js.Any])
    
    inline def log(id: Double, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("kue", "Job.priorities")
    @js.native
    def priorities: Priorities = js.native
    inline def priorities_=(x: Priorities): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priorities")(x.asInstanceOf[js.Any])
    
    inline def range(from: Double, to: Double, order: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], order.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rangeByState(state: String, from: Double, to: Double, order: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeByState")(state.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], order.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def rangeByType(`type`: String, state: String, from: Double, to: Double, order: String, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeByType")(`type`.asInstanceOf[js.Any], state.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], order.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def remove(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def remove(id: Double, fn: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(id.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeBadJob(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBadJob")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("kue", "Queue")
  @js.native
  open class Queue protected () extends EventEmitter {
    def this(options: js.Object) = this()
    
    def active(fn: js.Function): Queue = js.native
    
    def activeCount(`type`: String, fn: js.Function): Queue = js.native
    
    def card(state: String, fn: js.Function): Queue = js.native
    
    def cardByType(`type`: String, state: String, fn: js.Function): Queue = js.native
    
    def checkActiveJobTtl(ttlOptions: js.Object): Unit = js.native
    
    def checkJobPromotion(ms: Double): Unit = js.native
    
    var client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redisClientFactory.RedisClient */ Any = js.native
    
    def complete(fn: js.Function): Queue = js.native
    
    def completeCount(`type`: String, fn: js.Function): Queue = js.native
    
    def create(`type`: String, data: js.Object): Job = js.native
    
    def createJob(`type`: String, data: js.Object): Job = js.native
    
    def delayed(fn: js.Function): Queue = js.native
    
    def delayedCount(`type`: String, fn: js.Function): Queue = js.native
    
    def failed(fn: js.Function): Queue = js.native
    
    def failedCount(`type`: String, fn: js.Function): Queue = js.native
    
    var id: String = js.native
    
    def inactive(fn: js.Function): Queue = js.native
    
    def inactiveCount(`type`: String, fn: js.Function): Queue = js.native
    
    var name: String = js.native
    
    def process(`type`: String): Unit = js.native
    def process(`type`: String, fn: ProcessCallback): Unit = js.native
    def process(`type`: String, n: Double): Unit = js.native
    def process(`type`: String, n: Double, fn: ProcessCallback): Unit = js.native
    
    def promote(): Unit = js.native
    def promote(ms: Double): Unit = js.native
    
    var promoter: Any = js.native
    
    def setting(name: String, fn: js.Function): Queue = js.native
    
    def setupTimer(): Unit = js.native
    
    def shutdown(timeout: Double, fn: js.Function): Queue = js.native
    def shutdown(timeout: Double, `type`: String, fn: js.Function): Queue = js.native
    
    var shuttingDown: Boolean = js.native
    
    def state(string: String, fn: js.Function): Queue = js.native
    
    var testMode: TestMode = js.native
    
    def types(fn: js.Function): Queue = js.native
    
    def watchStuckJobs(): Unit = js.native
    def watchStuckJobs(ms: Double): Unit = js.native
    
    def workTime(fn: js.Function): Queue = js.native
    
    var workers: js.Array[Worker] = js.native
  }
  /* static members */
  object Queue {
    
    @JSImport("kue", "Queue")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kue", "Queue.singleton")
    @js.native
    def singleton: Queue = js.native
    inline def singleton_=(x: Queue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("singleton")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("kue", "app")
  @js.native
  def app: Application_ = js.native
  inline def app_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])
  
  inline def createQueue(): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueue")().asInstanceOf[Queue]
  inline def createQueue(options: js.Object): Queue = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueue")(options.asInstanceOf[js.Any]).asInstanceOf[Queue]
  
  object redisClientFactory {
    
    @JSImport("kue", "redisClientFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kue", "redisClientFactory.AbortError")
    @js.native
    open class AbortError ()
      extends typings.redis.mod.AbortError
    
    @JSImport("kue", "redisClientFactory.AggregateGroupByReducers")
    @js.native
    object AggregateGroupByReducers extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers & String] = js.native
      
      /* "AVG" */ val AVG: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.AVG & String = js.native
      
      /* "COUNT" */ val COUNT: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT & String = js.native
      
      /* "COUNT_DISTINCT" */ val COUNT_DISTINCT: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCT & String = js.native
      
      /* "COUNT_DISTINCTISH" */ val COUNT_DISTINCTISH: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.COUNT_DISTINCTISH & String = js.native
      
      /* "FIRST_VALUE" */ val FIRST_VALUE: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.FIRST_VALUE & String = js.native
      
      /* "MAX" */ val MAX: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MAX & String = js.native
      
      /* "MIN" */ val MIN: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.MIN & String = js.native
      
      /* "QUANTILE" */ val QUANTILE: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.QUANTILE & String = js.native
      
      /* "RANDOM_SAMPLE" */ val RANDOM_SAMPLE: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.RANDOM_SAMPLE & String = js.native
      
      /* "STDDEV" */ val STDDEV: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.STDDEV & String = js.native
      
      /* "SUM" */ val SUM: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.SUM & String = js.native
      
      /* "TOLIST" */ val TOLIST: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TOLIST & String = js.native
      
      /* "TOLIST" */ val TO_LIST: typings.redisSearch.distCommandsAggregateMod.AggregateGroupByReducers.TO_LIST & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.AggregateSteps")
    @js.native
    object AggregateSteps extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsAggregateMod.AggregateSteps & String] = js.native
      
      /* "APPLY" */ val APPLY: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.APPLY & String = js.native
      
      /* "FILTER" */ val FILTER: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.FILTER & String = js.native
      
      /* "GROUPBY" */ val GROUPBY: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.GROUPBY & String = js.native
      
      /* "LIMIT" */ val LIMIT: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.LIMIT & String = js.native
      
      /* "SORTBY" */ val SORTBY: typings.redisSearch.distCommandsAggregateMod.AggregateSteps.SORTBY & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.ClientClosedError")
    @js.native
    open class ClientClosedError ()
      extends typings.redis.mod.ClientClosedError
    
    @JSImport("kue", "redisClientFactory.ConnectionTimeoutError")
    @js.native
    open class ConnectionTimeoutError ()
      extends typings.redis.mod.ConnectionTimeoutError
    
    @JSImport("kue", "redisClientFactory.DisconnectsClientError")
    @js.native
    open class DisconnectsClientError ()
      extends typings.redis.mod.DisconnectsClientError
    
    @JSImport("kue", "redisClientFactory.ErrorReply")
    @js.native
    open class ErrorReply protected ()
      extends typings.redis.mod.ErrorReply {
      def this(message: String) = this()
    }
    
    @JSImport("kue", "redisClientFactory.GeoReplyWith")
    @js.native
    object GeoReplyWith extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith & String] = js.native
      
      /* "WITHCOORD" */ val COORDINATES: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
      
      /* "WITHDIST" */ val DISTANCE: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
      
      /* "WITHHASH" */ val HASH: typings.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.HASH & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.Graph")
    @js.native
    open class Graph protected ()
      extends typings.redis.mod.Graph {
      def this(client: GraphClientType, name: String) = this()
    }
    
    @JSImport("kue", "redisClientFactory.ReconnectStrategyError")
    @js.native
    open class ReconnectStrategyError protected ()
      extends typings.redis.mod.ReconnectStrategyError {
      def this(originalError: js.Error, socketError: Any) = this()
    }
    
    @JSImport("kue", "redisClientFactory.RootNodesUnavailableError")
    @js.native
    open class RootNodesUnavailableError ()
      extends typings.redis.mod.RootNodesUnavailableError
    
    @JSImport("kue", "redisClientFactory.SchemaFieldTypes")
    @js.native
    object SchemaFieldTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsMod.SchemaFieldTypes & String] = js.native
      
      /* "GEO" */ val GEO: typings.redisSearch.distCommandsMod.SchemaFieldTypes.GEO & String = js.native
      
      /* "NUMERIC" */ val NUMERIC: typings.redisSearch.distCommandsMod.SchemaFieldTypes.NUMERIC & String = js.native
      
      /* "TAG" */ val TAG: typings.redisSearch.distCommandsMod.SchemaFieldTypes.TAG & String = js.native
      
      /* "TEXT" */ val TEXT: typings.redisSearch.distCommandsMod.SchemaFieldTypes.TEXT & String = js.native
      
      /* "VECTOR" */ val VECTOR: typings.redisSearch.distCommandsMod.SchemaFieldTypes.VECTOR & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.SchemaTextFieldPhonetics")
    @js.native
    object SchemaTextFieldPhonetics extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics & String] = js.native
      
      /* "dm:en" */ val DM_EN: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_EN & String = js.native
      
      /* "dm:es" */ val DM_ES: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_ES & String = js.native
      
      /* "dm:fr" */ val DM_FR: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.DM_FR & String = js.native
      
      /* "dm:pt" */ val FM_PT: typings.redisSearch.distCommandsMod.SchemaTextFieldPhonetics.FM_PT & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.SocketClosedUnexpectedlyError")
    @js.native
    open class SocketClosedUnexpectedlyError ()
      extends typings.redis.mod.SocketClosedUnexpectedlyError
    
    @JSImport("kue", "redisClientFactory.TimeSeriesAggregationType")
    @js.native
    object TimeSeriesAggregationType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType & String] = js.native
      
      /* "AVG" */ val AVERAGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVERAGE & String = js.native
      
      /* "AVG" */ val AVG: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.AVG & String = js.native
      
      /* "COUNT" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.COUNT & String = js.native
      
      /* "FIRST" */ val FIRST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.FIRST & String = js.native
      
      /* "LAST" */ val LAST: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.LAST & String = js.native
      
      /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAX & String = js.native
      
      /* "MAX" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MAXIMUM & String = js.native
      
      /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MIN & String = js.native
      
      /* "MIN" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.MINIMUM & String = js.native
      
      /* "RANGE" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.RANGE & String = js.native
      
      /* "STD.P" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_P & String = js.native
      
      /* "STD.S" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.STD_S & String = js.native
      
      /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.SUM & String = js.native
      
      /* "TWA" */ val TWA: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.TWA & String = js.native
      
      /* "VAR.P" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_P & String = js.native
      
      /* "VAR.S" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesAggregationType.VAR_S & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.TimeSeriesBucketTimestamp")
    @js.native
    object TimeSeriesBucketTimestamp extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp & String] = js.native
      
      /* "+" */ val HIGH: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.HIGH & String = js.native
      
      /* "-" */ val LOW: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.LOW & String = js.native
      
      /* "~" */ val MID: typings.redisTimeSeries.distCommandsMod.TimeSeriesBucketTimestamp.MID & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.TimeSeriesDuplicatePolicies")
    @js.native
    object TimeSeriesDuplicatePolicies extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies & String] = js.native
      
      /* "BLOCK" */ val BLOCK: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.BLOCK & String = js.native
      
      /* "FIRST" */ val FIRST: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.FIRST & String = js.native
      
      /* "LAST" */ val LAST: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.LAST & String = js.native
      
      /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MAX & String = js.native
      
      /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.MIN & String = js.native
      
      /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesDuplicatePolicies.SUM & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.TimeSeriesEncoding")
    @js.native
    object TimeSeriesEncoding extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesEncoding & String] = js.native
      
      /* "COMPRESSED" */ val COMPRESSED: typings.redisTimeSeries.distCommandsMod.TimeSeriesEncoding.COMPRESSED & String = js.native
      
      /* "UNCOMPRESSED" */ val UNCOMPRESSED: typings.redisTimeSeries.distCommandsMod.TimeSeriesEncoding.UNCOMPRESSED & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.TimeSeriesReducers")
    @js.native
    object TimeSeriesReducers extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers & String] = js.native
      
      /* "AVG" */ val AVG: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.AVG & String = js.native
      
      /* "COUNT" */ val COUNT: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.COUNT & String = js.native
      
      /* "MAX" */ val MAX: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MAX & String = js.native
      
      /* "MAX" */ val MAXIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MAXIMUM & String = js.native
      
      /* "MIN" */ val MIN: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MIN & String = js.native
      
      /* "MIN" */ val MINIMUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.MINIMUM & String = js.native
      
      /* "range" */ val RANGE: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.RANGE & String = js.native
      
      /* "STD.P" */ val STD_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.STD_P & String = js.native
      
      /* "STD.S" */ val STD_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.STD_S & String = js.native
      
      /* "SUM" */ val SUM: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.SUM & String = js.native
      
      /* "VAR.P" */ val VAR_P: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.VAR_P & String = js.native
      
      /* "VAR.S" */ val VAR_S: typings.redisTimeSeries.distCommandsMod.TimeSeriesReducers.VAR_S & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.VectorAlgorithms")
    @js.native
    object VectorAlgorithms extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.redisSearch.distCommandsMod.VectorAlgorithms & String] = js.native
      
      /* "FLAT" */ val FLAT: typings.redisSearch.distCommandsMod.VectorAlgorithms.FLAT & String = js.native
      
      /* "HNSW" */ val HNSW: typings.redisSearch.distCommandsMod.VectorAlgorithms.HNSW & String = js.native
    }
    
    @JSImport("kue", "redisClientFactory.WatchError")
    @js.native
    open class WatchError ()
      extends typings.redis.mod.WatchError
    
    @JSImport("kue", "redisClientFactory.commandOptions")
    @js.native
    val commandOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.commandOptions */ Any = js.native
    
    inline def createClient[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](): RedisClientType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[RedisClientType[RedisDefaultModules & M, F, S]]
    inline def createClient[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClientOptions[M, F, S]): RedisClientType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClientType[RedisDefaultModules & M, F, S]]
    
    inline def createCluster[M /* <: RedisModules */, F /* <: RedisFunctions */, S /* <: RedisScripts */](options: RedisClusterOptions[M, F, S]): RedisClusterType[RedisDefaultModules & M, F, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCluster")(options.asInstanceOf[js.Any]).asInstanceOf[RedisClusterType[RedisDefaultModules & M, F, S]]
    
    inline def defineScript[S /* <: RedisScriptConfig */](script: S): S & SHA1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defineScript")(script.asInstanceOf[js.Any]).asInstanceOf[S & SHA1]
  }
  
  @JSImport("kue", "workers")
  @js.native
  def workers: js.Array[Worker] = js.native
  inline def workers_=(x: js.Array[Worker]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workers")(x.asInstanceOf[js.Any])
  
  type DoneCallback = js.Function2[/* err */ js.UndefOr[Any], /* result */ js.UndefOr[Any], Unit]
  
  type JobCallback = js.Function2[/* err */ js.UndefOr[Any], /* job */ js.UndefOr[Job], Unit]
  
  trait Priorities extends StObject {
    
    var critical: Double
    
    var high: Double
    
    var low: Double
    
    var medium: Double
    
    var normal: Double
  }
  object Priorities {
    
    inline def apply(critical: Double, high: Double, low: Double, medium: Double, normal: Double): Priorities = {
      val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Priorities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Priorities] (val x: Self) extends AnyVal {
      
      inline def setCritical(value: Double): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: Double): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    }
  }
  
  type ProcessCallback = (js.Function2[/* job */ Job, /* cb */ DoneCallback, Unit]) | (js.Function3[/* job */ Job, /* ctx */ WorkerCtx, /* cb */ DoneCallback, Unit])
  
  trait Redis extends StObject {
    
    def client(): Any
    
    def configureFactory(options: js.Object, queue: Queue): Unit
    
    def createClient(): Any
    
    def createClientFactory(options: js.Object): Any
    
    def pubsubClient(): Any
    
    def reset(): Unit
  }
  object Redis {
    
    inline def apply(
      client: () => Any,
      configureFactory: (js.Object, Queue) => Unit,
      createClient: () => Any,
      createClientFactory: js.Object => Any,
      pubsubClient: () => Any,
      reset: () => Unit
    ): Redis = {
      val __obj = js.Dynamic.literal(client = js.Any.fromFunction0(client), configureFactory = js.Any.fromFunction2(configureFactory), createClient = js.Any.fromFunction0(createClient), createClientFactory = js.Any.fromFunction1(createClientFactory), pubsubClient = js.Any.fromFunction0(pubsubClient), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Redis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Redis] (val x: Self) extends AnyVal {
      
      inline def setClient(value: () => Any): Self = StObject.set(x, "client", js.Any.fromFunction0(value))
      
      inline def setConfigureFactory(value: (js.Object, Queue) => Unit): Self = StObject.set(x, "configureFactory", js.Any.fromFunction2(value))
      
      inline def setCreateClient(value: () => Any): Self = StObject.set(x, "createClient", js.Any.fromFunction0(value))
      
      inline def setCreateClientFactory(value: js.Object => Any): Self = StObject.set(x, "createClientFactory", js.Any.fromFunction1(value))
      
      inline def setPubsubClient(value: () => Any): Self = StObject.set(x, "pubsubClient", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TestMode extends StObject {
    
    def clear(): Unit = js.native
    
    def enter(): Unit = js.native
    def enter(process: Boolean): Unit = js.native
    
    def exit(): Unit = js.native
    
    var jobs: js.Array[Job] = js.native
  }
  
  @js.native
  trait Worker extends EventEmitter {
    
    var client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redisClientFactory.RedisClient */ Any = js.native
    
    def emitJobEvent(event: js.Object, job: Job, arg1: Any, arg2: Any): Unit = js.native
    
    def error(err: js.Error, job: Job): Worker = js.native
    
    def failed(job: Job, theErr: js.Object): Worker = js.native
    def failed(job: Job, theErr: js.Object, fn: js.Function): Worker = js.native
    
    /* private */ def getJob(fn: js.Function): Unit = js.native
    
    def idle(): Worker = js.native
    
    var job: Job = js.native
    
    def process(job: Job, fn: js.Function): Worker = js.native
    
    var queue: Queue = js.native
    
    def resume(): Boolean = js.native
    
    def shutdown(timeout: Double, fn: js.Function): Unit = js.native
    
    def start(fn: js.Function): Worker = js.native
    
    var `type`: String = js.native
    
    /* private */ def zpop(key: String, fn: js.Function): Unit = js.native
  }
  
  @js.native
  trait WorkerCtx extends StObject {
    
    def pause(): Unit = js.native
    def pause(fn: DoneCallback): Unit = js.native
    def pause(timeout: Double): Unit = js.native
    def pause(timeout: Double, fn: DoneCallback): Unit = js.native
    
    def resume(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
