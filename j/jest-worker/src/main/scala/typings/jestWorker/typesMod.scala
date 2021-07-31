package typings.jestWorker

import org.scalablytyped.runtime.Instantiable0
import typings.jestWorker.anon.PostMessage
import typings.jestWorker.anon.TypeofEventEmitter
import typings.jestWorker.jestWorkerNumbers.`0`
import typings.jestWorker.jestWorkerNumbers.`1`
import typings.jestWorker.jestWorkerNumbers.`2`
import typings.node.NodeJS.ReadableStream
import typings.node.childProcessMod.ForkOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("jest-worker/build/types", "CHILD_MESSAGE_CALL")
  @js.native
  val CHILD_MESSAGE_CALL: `1` = js.native
  
  @JSImport("jest-worker/build/types", "CHILD_MESSAGE_END")
  @js.native
  val CHILD_MESSAGE_END: `2` = js.native
  
  @JSImport("jest-worker/build/types", "CHILD_MESSAGE_INITIALIZE")
  @js.native
  val CHILD_MESSAGE_INITIALIZE: `0` = js.native
  
  @JSImport("jest-worker/build/types", "PARENT_MESSAGE_CLIENT_ERROR")
  @js.native
  val PARENT_MESSAGE_CLIENT_ERROR: `1` = js.native
  
  @JSImport("jest-worker/build/types", "PARENT_MESSAGE_OK")
  @js.native
  val PARENT_MESSAGE_OK: `0` = js.native
  
  @JSImport("jest-worker/build/types", "PARENT_MESSAGE_SETUP_ERROR")
  @js.native
  val PARENT_MESSAGE_SETUP_ERROR: `2` = js.native
  
  type ChildMessage = ChildMessageInitialize | ChildMessageCall | ChildMessageEnd
  
  type ChildMessageCall = js.Tuple4[`1`, // type
  Boolean, // processed
  String, // method
  js.Array[js.Any]]
  
  type ChildMessageEnd = js.Tuple2[`2`, // type
  Boolean]
  
  type ChildMessageInitialize = js.Tuple5[
    `0`, 
    // type
  Boolean, 
    // processed
  String, 
    js.UndefOr[// file
  // file
  js.Array[js.Any]], 
    js.UndefOr[// setupArgs
  // setupArgs
  MessagePort]
  ]
  
  trait FarmOptions extends StObject {
    
    var WorkerPool: js.UndefOr[
        js.Function2[
          /* workerPath */ String, 
          /* options */ js.UndefOr[WorkerPoolOptions], 
          WorkerPoolInterface
        ]
      ] = js.undefined
    
    var computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]] = js.undefined
    
    var enableWorkerThreads: js.UndefOr[Boolean] = js.undefined
    
    var exposedMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var forkOptions: js.UndefOr[ForkOptions] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var numWorkers: js.UndefOr[Double] = js.undefined
    
    var setupArgs: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object FarmOptions {
    
    @scala.inline
    def apply(): FarmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FarmOptions]
    }
    
    @scala.inline
    implicit class FarmOptionsMutableBuilder[Self <: FarmOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeWorkerKey(value: (/* method */ String, /* repeated */ js.Any) => String | Null): Self = StObject.set(x, "computeWorkerKey", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComputeWorkerKeyUndefined: Self = StObject.set(x, "computeWorkerKey", js.undefined)
      
      @scala.inline
      def setEnableWorkerThreads(value: Boolean): Self = StObject.set(x, "enableWorkerThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWorkerThreadsUndefined: Self = StObject.set(x, "enableWorkerThreads", js.undefined)
      
      @scala.inline
      def setExposedMethods(value: js.Array[String]): Self = StObject.set(x, "exposedMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposedMethodsUndefined: Self = StObject.set(x, "exposedMethods", js.undefined)
      
      @scala.inline
      def setExposedMethodsVarargs(value: String*): Self = StObject.set(x, "exposedMethods", js.Array(value :_*))
      
      @scala.inline
      def setForkOptions(value: ForkOptions): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForkOptionsUndefined: Self = StObject.set(x, "forkOptions", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
      
      @scala.inline
      def setSetupArgs(value: js.Array[js.Any]): Self = StObject.set(x, "setupArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupArgsUndefined: Self = StObject.set(x, "setupArgs", js.undefined)
      
      @scala.inline
      def setSetupArgsVarargs(value: js.Any*): Self = StObject.set(x, "setupArgs", js.Array(value :_*))
      
      @scala.inline
      def setWorkerPool(
        value: (/* workerPath */ String, /* options */ js.UndefOr[WorkerPoolOptions]) => WorkerPoolInterface
      ): Self = StObject.set(x, "WorkerPool", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWorkerPoolUndefined: Self = StObject.set(x, "WorkerPool", js.undefined)
    }
  }
  
  trait MessageChannel extends StObject {
    
    var port1: MessagePort
    
    var port2: MessagePort
  }
  object MessageChannel {
    
    @scala.inline
    def apply(port1: MessagePort, port2: MessagePort): MessageChannel = {
      val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageChannel]
    }
    
    @scala.inline
    implicit class MessageChannelMutableBuilder[Self <: MessageChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort1(value: MessagePort): Self = StObject.set(x, "port1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort2(value: MessagePort): Self = StObject.set(x, "port2", value.asInstanceOf[js.Any])
    }
  }
  
  type MessagePort = TypeofEventEmitter & Instantiable0[EventEmitter] & PostMessage
  
  type OnEnd = js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
  
  type OnStart = js.Function1[/* worker */ WorkerInterface, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestWorker.jestWorkerNumbers.`1`
    - typings.jestWorker.jestWorkerNumbers.`2`
  */
  trait PARENT_MESSAGE_ERROR extends StObject
  object PARENT_MESSAGE_ERROR {
    
    @scala.inline
    def `1`: typings.jestWorker.jestWorkerNumbers.`1` = 1.asInstanceOf[typings.jestWorker.jestWorkerNumbers.`1`]
    
    @scala.inline
    def `2`: typings.jestWorker.jestWorkerNumbers.`2` = 2.asInstanceOf[typings.jestWorker.jestWorkerNumbers.`2`]
  }
  
  type ParentMessage = ParentMessageOk | ParentMessageError
  
  type ParentMessageError = js.Tuple5[
    PARENT_MESSAGE_ERROR, 
    // type
  String, 
    // constructor
  String, 
    // message
  String, 
    // stack
  js.Any
  ]
  
  type ParentMessageOk = js.Tuple2[`0`, // type
  js.Any]
  
  trait QueueChildMessage extends StObject {
    
    def onEnd(err: Null, result: js.Any): Unit
    def onEnd(err: Error, result: js.Any): Unit
    @JSName("onEnd")
    var onEnd_Original: OnEnd
    
    def onStart(worker: WorkerInterface): Unit
    @JSName("onStart")
    var onStart_Original: OnStart
    
    var request: ChildMessage
  }
  object QueueChildMessage {
    
    @scala.inline
    def apply(
      onEnd: (/* err */ Error | Null, /* result */ js.Any) => Unit,
      onStart: /* worker */ WorkerInterface => Unit,
      request: ChildMessage
    ): QueueChildMessage = {
      val __obj = js.Dynamic.literal(onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction1(onStart), request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueChildMessage]
    }
    
    @scala.inline
    implicit class QueueChildMessageMutableBuilder[Self <: QueueChildMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEnd(value: (/* err */ Error | Null, /* result */ js.Any) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStart(value: /* worker */ WorkerInterface => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRequest(value: ChildMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueueItem extends StObject {
    
    var next: QueueItem | Null
    
    var task: QueueChildMessage
  }
  object QueueItem {
    
    @scala.inline
    def apply(task: QueueChildMessage): QueueItem = {
      val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any], next = null)
      __obj.asInstanceOf[QueueItem]
    }
    
    @scala.inline
    implicit class QueueItemMutableBuilder[Self <: QueueItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: QueueItem): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setTask(value: QueueChildMessage): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerInterface extends StObject {
    
    def getStderr(): ReadableStream | Null
    
    def getStdout(): ReadableStream | Null
    
    def getWorkerId(): Double
    
    def onExit(exitCode: Double): Unit
    
    def onMessage(message: ParentMessage): Unit
    
    def send(request: ChildMessage, onProcessStart: OnStart, onProcessEnd: OnEnd): Unit
  }
  object WorkerInterface {
    
    @scala.inline
    def apply(
      getStderr: () => ReadableStream | Null,
      getStdout: () => ReadableStream | Null,
      getWorkerId: () => Double,
      onExit: Double => Unit,
      onMessage: ParentMessage => Unit,
      send: (ChildMessage, OnStart, OnEnd) => Unit
    ): WorkerInterface = {
      val __obj = js.Dynamic.literal(getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerId = js.Any.fromFunction0(getWorkerId), onExit = js.Any.fromFunction1(onExit), onMessage = js.Any.fromFunction1(onMessage), send = js.Any.fromFunction3(send))
      __obj.asInstanceOf[WorkerInterface]
    }
    
    @scala.inline
    implicit class WorkerInterfaceMutableBuilder[Self <: WorkerInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetStderr(value: () => ReadableStream | Null): Self = StObject.set(x, "getStderr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStdout(value: () => ReadableStream | Null): Self = StObject.set(x, "getStdout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWorkerId(value: () => Double): Self = StObject.set(x, "getWorkerId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExit(value: Double => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMessage(value: ParentMessage => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSend(value: (ChildMessage, OnStart, OnEnd) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction3(value))
    }
  }
  
  trait WorkerOptions extends StObject {
    
    var forkOptions: ForkOptions
    
    var maxRetries: Double
    
    var setupArgs: js.Array[js.Any]
    
    var workerId: Double
    
    var workerPath: String
  }
  object WorkerOptions {
    
    @scala.inline
    def apply(
      forkOptions: ForkOptions,
      maxRetries: Double,
      setupArgs: js.Array[js.Any],
      workerId: Double,
      workerPath: String
    ): WorkerOptions = {
      val __obj = js.Dynamic.literal(forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerOptions]
    }
    
    @scala.inline
    implicit class WorkerOptionsMutableBuilder[Self <: WorkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForkOptions(value: ForkOptions): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupArgs(value: js.Array[js.Any]): Self = StObject.set(x, "setupArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupArgsVarargs(value: js.Any*): Self = StObject.set(x, "setupArgs", js.Array(value :_*))
      
      @scala.inline
      def setWorkerId(value: Double): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerPoolInterface extends StObject {
    
    def createWorker(options: WorkerOptions): WorkerInterface
    
    def end(): Unit
    
    def getStderr(): ReadableStream
    
    def getStdout(): ReadableStream
    
    def getWorkers(): js.Array[WorkerInterface]
    
    def send(workerId: Double, request: ChildMessage, onStart: OnStart, onEnd: OnEnd): Unit
  }
  object WorkerPoolInterface {
    
    @scala.inline
    def apply(
      createWorker: WorkerOptions => WorkerInterface,
      end: () => Unit,
      getStderr: () => ReadableStream,
      getStdout: () => ReadableStream,
      getWorkers: () => js.Array[WorkerInterface],
      send: (Double, ChildMessage, OnStart, OnEnd) => Unit
    ): WorkerPoolInterface = {
      val __obj = js.Dynamic.literal(createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkers = js.Any.fromFunction0(getWorkers), send = js.Any.fromFunction4(send))
      __obj.asInstanceOf[WorkerPoolInterface]
    }
    
    @scala.inline
    implicit class WorkerPoolInterfaceMutableBuilder[Self <: WorkerPoolInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateWorker(value: WorkerOptions => WorkerInterface): Self = StObject.set(x, "createWorker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStderr(value: () => ReadableStream): Self = StObject.set(x, "getStderr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStdout(value: () => ReadableStream): Self = StObject.set(x, "getStdout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWorkers(value: () => js.Array[WorkerInterface]): Self = StObject.set(x, "getWorkers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSend(value: (Double, ChildMessage, OnStart, OnEnd) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction4(value))
    }
  }
  
  trait WorkerPoolOptions extends StObject {
    
    var enableWorkerThreads: Boolean
    
    var forkOptions: ForkOptions
    
    var maxRetries: Double
    
    var numWorkers: Double
    
    var setupArgs: js.Array[js.Any]
  }
  object WorkerPoolOptions {
    
    @scala.inline
    def apply(
      enableWorkerThreads: Boolean,
      forkOptions: ForkOptions,
      maxRetries: Double,
      numWorkers: Double,
      setupArgs: js.Array[js.Any]
    ): WorkerPoolOptions = {
      val __obj = js.Dynamic.literal(enableWorkerThreads = enableWorkerThreads.asInstanceOf[js.Any], forkOptions = forkOptions.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], numWorkers = numWorkers.asInstanceOf[js.Any], setupArgs = setupArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerPoolOptions]
    }
    
    @scala.inline
    implicit class WorkerPoolOptionsMutableBuilder[Self <: WorkerPoolOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableWorkerThreads(value: Boolean): Self = StObject.set(x, "enableWorkerThreads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForkOptions(value: ForkOptions): Self = StObject.set(x, "forkOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumWorkers(value: Double): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupArgs(value: js.Array[js.Any]): Self = StObject.set(x, "setupArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetupArgsVarargs(value: js.Any*): Self = StObject.set(x, "setupArgs", js.Array(value :_*))
    }
  }
}
