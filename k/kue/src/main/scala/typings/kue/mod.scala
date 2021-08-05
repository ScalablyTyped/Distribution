package typings.kue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.Application_
import typings.node.eventsMod.EventEmitter
import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kue", "Job")
  @js.native
  class Job protected () extends EventEmitter {
    def this(`type`: String) = this()
    def this(`type`: String, data: js.Any) = this()
    
    /* private */ var _error: String = js.native
    
    /* private */ def _getBackoffImpl(): Unit = js.native
    
    /* private */ var _max_attempts: js.Any = js.native
    
    def active(): Job = js.native
    def active(fn: js.Function): Job = js.native
    
    def attempt(fn: js.Function): Job = js.native
    
    def attempts(n: Double): Job = js.native
    
    def backoff(param: js.Any): Job = js.native
    
    var client: RedisClient = js.native
    
    def complete(): Job = js.native
    def complete(fn: js.Function): Job = js.native
    
    // Should always be a number however currently it is a number when creating and a string when loading
    // https://github.com/Automattic/kue/issues/1081
    var created_at: String | Double = js.native
    
    var data: js.Any = js.native
    
    def delay(ms: Double): Job = js.native
    def delay(ms: Date): Job = js.native
    
    def delayed(): Job = js.native
    def delayed(fn: js.Function): Job = js.native
    
    def error(err: Error): Job = js.native
    
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
    def progress(complete: Double, total: Double, data: js.Any): Job = js.native
    
    var promote_at: String | Double = js.native
    
    def reattempt(attempt: Double): Unit = js.native
    def reattempt(attempt: Double, fn: js.Function): Unit = js.native
    
    def remove(): Job = js.native
    def remove(fn: js.Function): Job = js.native
    
    def removeOnComplete(param: js.Any): Job = js.native
    
    var result: js.Any = js.native
    
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
    
    def ttl(param: js.Any): Job = js.native
    
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
  class Queue protected () extends EventEmitter {
    def this(options: js.Object) = this()
    
    def active(fn: js.Function): Queue = js.native
    
    def activeCount(`type`: String, fn: js.Function): Queue = js.native
    
    def card(state: String, fn: js.Function): Queue = js.native
    
    def cardByType(`type`: String, state: String, fn: js.Function): Queue = js.native
    
    def checkActiveJobTtl(ttlOptions: js.Object): Unit = js.native
    
    def checkJobPromotion(ms: Double): Unit = js.native
    
    var client: RedisClient = js.native
    
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
    
    var promoter: js.Any = js.native
    
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
    class AbortError ()
      extends typings.redis.mod.AbortError
    
    @JSImport("kue", "redisClientFactory.AggregateError")
    @js.native
    class AggregateError ()
      extends typings.redis.mod.AggregateError
    
    @JSImport("kue", "redisClientFactory.Multi")
    @js.native
    val Multi: Instantiable0[typings.redis.mod.Multi] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("kue", "redisClientFactory.MultiCls")
    @js.native
    class MultiCls ()
      extends typings.redis.mod.MultiCls
    
    @JSImport("kue", "redisClientFactory.ParserError")
    @js.native
    class ParserError ()
      extends typings.redis.mod.ParserError
    
    @JSImport("kue", "redisClientFactory.RedisClient")
    @js.native
    val RedisClient: Instantiable1[/* options */ ClientOpts, typings.redis.mod.RedisClient] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("kue", "redisClientFactory.RedisClientCls")
    @js.native
    class RedisClientCls protected ()
      extends typings.redis.mod.RedisClientCls {
      def this(options: ClientOpts) = this()
    }
    
    @JSImport("kue", "redisClientFactory.RedisError")
    @js.native
    class RedisError ()
      extends typings.redis.mod.RedisError
    
    @JSImport("kue", "redisClientFactory.ReplyError")
    @js.native
    class ReplyError ()
      extends typings.redis.mod.ReplyError
    
    inline def createClient(): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(options: ClientOpts): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(port: Double): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any]).asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(port: Double, host: String): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(port: Double, host: String, options: ClientOpts): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(port: Double, host: Unit, options: ClientOpts): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(unix_socket: String): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(unix_socket.asInstanceOf[js.Any]).asInstanceOf[typings.redis.mod.RedisClient]
    inline def createClient(unix_socket: String, options: ClientOpts): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(unix_socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
    
    @JSImport("kue", "redisClientFactory.debug_mode")
    @js.native
    def debugMode: Boolean = js.native
    
    inline def debugMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug_mode")(x.asInstanceOf[js.Any])
    
    inline def print(err: Null, reply: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def print(err: Error, reply: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("kue", "workers")
  @js.native
  def workers: js.Array[Worker] = js.native
  inline def workers_=(x: js.Array[Worker]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workers")(x.asInstanceOf[js.Any])
  
  type DoneCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]
  
  type JobCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* job */ js.UndefOr[Job], Unit]
  
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
    
    extension [Self <: Priorities](x: Self) {
      
      inline def setCritical(value: Double): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: Double): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    }
  }
  
  type ProcessCallback = (js.Function2[/* job */ Job, /* cb */ DoneCallback, Unit]) | (js.Function3[/* job */ Job, /* ctx */ WorkerCtx, /* cb */ DoneCallback, Unit])
  
  trait Redis extends StObject {
    
    def client(): RedisClient
    
    def configureFactory(options: js.Object, queue: Queue): Unit
    
    def createClient(): RedisClient
    
    def createClientFactory(options: js.Object): RedisClient
    
    def pubsubClient(): RedisClient
    
    def reset(): Unit
  }
  object Redis {
    
    inline def apply(
      client: () => RedisClient,
      configureFactory: (js.Object, Queue) => Unit,
      createClient: () => RedisClient,
      createClientFactory: js.Object => RedisClient,
      pubsubClient: () => RedisClient,
      reset: () => Unit
    ): Redis = {
      val __obj = js.Dynamic.literal(client = js.Any.fromFunction0(client), configureFactory = js.Any.fromFunction2(configureFactory), createClient = js.Any.fromFunction0(createClient), createClientFactory = js.Any.fromFunction1(createClientFactory), pubsubClient = js.Any.fromFunction0(pubsubClient), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Redis]
    }
    
    extension [Self <: Redis](x: Self) {
      
      inline def setClient(value: () => RedisClient): Self = StObject.set(x, "client", js.Any.fromFunction0(value))
      
      inline def setConfigureFactory(value: (js.Object, Queue) => Unit): Self = StObject.set(x, "configureFactory", js.Any.fromFunction2(value))
      
      inline def setCreateClient(value: () => RedisClient): Self = StObject.set(x, "createClient", js.Any.fromFunction0(value))
      
      inline def setCreateClientFactory(value: js.Object => RedisClient): Self = StObject.set(x, "createClientFactory", js.Any.fromFunction1(value))
      
      inline def setPubsubClient(value: () => RedisClient): Self = StObject.set(x, "pubsubClient", js.Any.fromFunction0(value))
      
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
    
    var client: RedisClient = js.native
    
    def emitJobEvent(event: js.Object, job: Job, arg1: js.Any, arg2: js.Any): Unit = js.native
    
    def error(err: Error, job: Job): Worker = js.native
    
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
