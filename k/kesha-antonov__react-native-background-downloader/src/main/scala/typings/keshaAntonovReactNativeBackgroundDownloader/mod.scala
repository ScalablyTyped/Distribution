package typings.keshaAntonovReactNativeBackgroundDownloader

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@kesha-antonov/react-native-background-downloader", JSImport.Default)
  @js.native
  val default: RNBackgroundDownloader = js.native
  
  trait Network extends StObject {
    
    var ALL: String
    
    var WIFI_ONLY: String
  }
  object Network {
    
    @JSImport("@kesha-antonov/react-native-background-downloader", "Network")
    @js.native
    val ^ : Network = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      inline def setALL(value: String): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setWIFI_ONLY(value: String): Self = StObject.set(x, "WIFI_ONLY", value.asInstanceOf[js.Any])
    }
  }
  
  trait Priority extends StObject {
    
    var HIGH: String
    
    var LOW: String
    
    var MEDIUM: String
  }
  object Priority {
    
    @JSImport("@kesha-antonov/react-native-background-downloader", "Priority")
    @js.native
    val ^ : Priority = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Priority] (val x: Self) extends AnyVal {
      
      inline def setHIGH(value: String): Self = StObject.set(x, "HIGH", value.asInstanceOf[js.Any])
      
      inline def setLOW(value: String): Self = StObject.set(x, "LOW", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM(value: String): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@kesha-antonov/react-native-background-downloader", "checkForExistingDownloads")
  @js.native
  val checkForExistingDownloads: CheckForExistingDownloads_ = js.native
  
  @JSImport("@kesha-antonov/react-native-background-downloader", "completeHandler")
  @js.native
  val completeHandler: CompleteHandler_ = js.native
  
  @JSImport("@kesha-antonov/react-native-background-downloader", "directories")
  @js.native
  val directories: Directories_ = js.native
  
  @JSImport("@kesha-antonov/react-native-background-downloader", "download")
  @js.native
  val download: Download_ = js.native
  
  @JSImport("@kesha-antonov/react-native-background-downloader", "ensureDownloadsAreRunning")
  @js.native
  val ensureDownloadsAreRunning: EnsureDownloadsAreRunning_ = js.native
  
  @JSImport("@kesha-antonov/react-native-background-downloader", "setHeaders")
  @js.native
  val setHeaders: SetHeaders_ = js.native
  
  type BeginHandler = js.Function1[/* param0 */ BeginHandlerObject, Any]
  
  trait BeginHandlerObject extends StObject {
    
    var expectedBytes: Double
    
    var headers: StringDictionary[String]
  }
  object BeginHandlerObject {
    
    inline def apply(expectedBytes: Double, headers: StringDictionary[String]): BeginHandlerObject = {
      val __obj = js.Dynamic.literal(expectedBytes = expectedBytes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeginHandlerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeginHandlerObject] (val x: Self) extends AnyVal {
      
      inline def setExpectedBytes(value: Double): Self = StObject.set(x, "expectedBytes", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckForExistingDownloads_ = js.Function0[js.Promise[js.Array[DownloadTask]]]
  
  type CompleteHandler_ = js.Function1[/* id */ String, Unit]
  
  trait Directories_ extends StObject {
    
    var documents: String
  }
  object Directories_ {
    
    inline def apply(documents: String): Directories_ = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Directories_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Directories_] (val x: Self) extends AnyVal {
      
      inline def setDocuments(value: String): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    }
  }
  
  type DoneHandler = js.Function0[Any]
  
  type DownloadHeaders = StringDictionary[String | Null]
  
  trait DownloadOption extends StObject {
    
    var destination: String
    
    var headers: js.UndefOr[DownloadHeaders] = js.undefined
    
    var id: String
    
    var url: String
  }
  object DownloadOption {
    
    inline def apply(destination: String, id: String, url: String): DownloadOption = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadOption] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: DownloadHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadTask extends StObject {
    
    def _beginHandler(param0: BeginHandlerObject): Any
    @JSName("_beginHandler")
    var _beginHandler_Original: BeginHandler
    
    def _doneHandler(): Any
    @JSName("_doneHandler")
    var _doneHandler_Original: DoneHandler
    
    def _errorHandler(error: Any, errorCode: Any): Any
    @JSName("_errorHandler")
    var _errorHandler_Original: ErrorHandler
    
    def _progressHandler(percent: Double, bytesWritten: Double, totalBytes: Double): Any
    @JSName("_progressHandler")
    var _progressHandler_Original: ProgressHandler
    
    def begin(handler: BeginHandler): DownloadTask
    
    var bytesWritten: Double
    
    def done(handler: DoneHandler): DownloadTask
    
    def error(handler: ErrorHandler): DownloadTask
    
    var id: String
    
    def pause(): Any
    
    var percent: Double
    
    def progress(handler: ProgressHandler): DownloadTask
    
    def resume(): Any
    
    var state: DownloadTaskState
    
    def stop(): Any
    
    var totalBytes: Double
  }
  object DownloadTask {
    
    inline def apply(
      _beginHandler: /* param0 */ BeginHandlerObject => Any,
      _doneHandler: () => Any,
      _errorHandler: (/* error */ Any, /* errorCode */ Any) => Any,
      _progressHandler: (/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double) => Any,
      begin: BeginHandler => DownloadTask,
      bytesWritten: Double,
      done: DoneHandler => DownloadTask,
      error: ErrorHandler => DownloadTask,
      id: String,
      pause: () => Any,
      percent: Double,
      progress: ProgressHandler => DownloadTask,
      resume: () => Any,
      state: DownloadTaskState,
      stop: () => Any,
      totalBytes: Double
    ): DownloadTask = {
      val __obj = js.Dynamic.literal(_beginHandler = js.Any.fromFunction1(_beginHandler), _doneHandler = js.Any.fromFunction0(_doneHandler), _errorHandler = js.Any.fromFunction2(_errorHandler), _progressHandler = js.Any.fromFunction3(_progressHandler), begin = js.Any.fromFunction1(begin), bytesWritten = bytesWritten.asInstanceOf[js.Any], done = js.Any.fromFunction1(done), error = js.Any.fromFunction1(error), id = id.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), percent = percent.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), resume = js.Any.fromFunction0(resume), state = state.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadTask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadTask] (val x: Self) extends AnyVal {
      
      inline def setBegin(value: BeginHandler => DownloadTask): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      inline def setDone(value: DoneHandler => DownloadTask): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setError(value: ErrorHandler => DownloadTask): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Any): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: ProgressHandler => DownloadTask): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
      
      inline def setResume(value: () => Any): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setState(value: DownloadTaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Any): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def set_beginHandler(value: /* param0 */ BeginHandlerObject => Any): Self = StObject.set(x, "_beginHandler", js.Any.fromFunction1(value))
      
      inline def set_doneHandler(value: () => Any): Self = StObject.set(x, "_doneHandler", js.Any.fromFunction0(value))
      
      inline def set_errorHandler(value: (/* error */ Any, /* errorCode */ Any) => Any): Self = StObject.set(x, "_errorHandler", js.Any.fromFunction2(value))
      
      inline def set_progressHandler(value: (/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double) => Any): Self = StObject.set(x, "_progressHandler", js.Any.fromFunction3(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.DOWNLOADING
    - typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.PAUSED
    - typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.DONE
    - typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.FAILED
    - typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.STOPPED
  */
  trait DownloadTaskState extends StObject
  object DownloadTaskState {
    
    inline def DONE: typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.DONE = "DONE".asInstanceOf[typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.DONE]
    
    inline def DOWNLOADING: typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.DOWNLOADING = "DOWNLOADING".asInstanceOf[typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.DOWNLOADING]
    
    inline def FAILED: typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.FAILED = "FAILED".asInstanceOf[typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.FAILED]
    
    inline def PAUSED: typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.PAUSED = "PAUSED".asInstanceOf[typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.PAUSED]
    
    inline def STOPPED: typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.STOPPED = "STOPPED".asInstanceOf[typings.keshaAntonovReactNativeBackgroundDownloader.keshaAntonovReactNativeBackgroundDownloaderStrings.STOPPED]
  }
  
  type Download_ = js.Function1[/* options */ DownloadOption, DownloadTask]
  
  type EnsureDownloadsAreRunning_ = js.Function0[js.Promise[Unit]]
  
  type ErrorHandler = js.Function2[/* error */ Any, /* errorCode */ Any, Any]
  
  type ProgressHandler = js.Function3[/* percent */ Double, /* bytesWritten */ Double, /* totalBytes */ Double, Any]
  
  trait RNBackgroundDownloader extends StObject {
    
    var Network: typings.keshaAntonovReactNativeBackgroundDownloader.mod.Network
    
    var Priority: typings.keshaAntonovReactNativeBackgroundDownloader.mod.Priority
    
    def checkForExistingDownloads(): js.Promise[js.Array[DownloadTask]]
    @JSName("checkForExistingDownloads")
    var checkForExistingDownloads_Original: CheckForExistingDownloads_
    
    def completeHandler(id: String): Unit
    @JSName("completeHandler")
    var completeHandler_Original: CompleteHandler_
    
    var directories: Directories_
    
    def download(options: DownloadOption): DownloadTask
    @JSName("download")
    var download_Original: Download_
    
    def ensureDownloadsAreRunning(): js.Promise[Unit]
    @JSName("ensureDownloadsAreRunning")
    var ensureDownloadsAreRunning_Original: EnsureDownloadsAreRunning_
    
    def setHeaders(h: DownloadHeaders): Unit
    @JSName("setHeaders")
    var setHeaders_Original: SetHeaders_
  }
  object RNBackgroundDownloader {
    
    inline def apply(
      Network: Network,
      Priority: Priority,
      checkForExistingDownloads: () => js.Promise[js.Array[DownloadTask]],
      completeHandler: /* id */ String => Unit,
      directories: Directories_,
      download: /* options */ DownloadOption => DownloadTask,
      ensureDownloadsAreRunning: () => js.Promise[Unit],
      setHeaders: /* h */ DownloadHeaders => Unit
    ): RNBackgroundDownloader = {
      val __obj = js.Dynamic.literal(Network = Network.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], checkForExistingDownloads = js.Any.fromFunction0(checkForExistingDownloads), completeHandler = js.Any.fromFunction1(completeHandler), directories = directories.asInstanceOf[js.Any], download = js.Any.fromFunction1(download), ensureDownloadsAreRunning = js.Any.fromFunction0(ensureDownloadsAreRunning), setHeaders = js.Any.fromFunction1(setHeaders))
      __obj.asInstanceOf[RNBackgroundDownloader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RNBackgroundDownloader] (val x: Self) extends AnyVal {
      
      inline def setCheckForExistingDownloads(value: () => js.Promise[js.Array[DownloadTask]]): Self = StObject.set(x, "checkForExistingDownloads", js.Any.fromFunction0(value))
      
      inline def setCompleteHandler(value: /* id */ String => Unit): Self = StObject.set(x, "completeHandler", js.Any.fromFunction1(value))
      
      inline def setDirectories(value: Directories_): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDownload(value: /* options */ DownloadOption => DownloadTask): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      inline def setEnsureDownloadsAreRunning(value: () => js.Promise[Unit]): Self = StObject.set(x, "ensureDownloadsAreRunning", js.Any.fromFunction0(value))
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      inline def setSetHeaders(value: /* h */ DownloadHeaders => Unit): Self = StObject.set(x, "setHeaders", js.Any.fromFunction1(value))
    }
  }
  
  type SetHeaders_ = js.Function1[/* h */ DownloadHeaders, Unit]
  
  type TaskInfo = String | TaskInfoObject
  
  trait TaskInfoObject extends StObject {
    
    var bytesWritten: Double
    
    var id: String
    
    var percent: Double
    
    var totalBytes: Double
  }
  object TaskInfoObject {
    
    inline def apply(bytesWritten: Double, id: String, percent: Double, totalBytes: Double): TaskInfoObject = {
      val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInfoObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskInfoObject] (val x: Self) extends AnyVal {
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = RNBackgroundDownloader
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RNBackgroundDownloader = default
}
