package typings.jestWatcher

import typings.jestTestResult.mod.AggregatedResult
import typings.jestTypes.mod.ProjectConfig
import typings.jestWatcher.mod.FileChange
import typings.jestWatcher.mod.JestHookExposedFS
import typings.jestWatcher.mod.ShouldRunTestSuite
import typings.jestWatcher.mod.TestRunComplete
import typings.jestWatcher.mod.TestSuiteInfo
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config extends StObject {
    
    var config: ProjectConfig
    
    var testPaths: js.Array[String]
  }
  object Config {
    
    inline def apply(config: ProjectConfig, testPaths: js.Array[String]): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setTestPaths(value: js.Array[String]): Self = StObject.set(x, "testPaths", value.asInstanceOf[js.Any])
      
      inline def setTestPathsVarargs(value: String*): Self = StObject.set(x, "testPaths", js.Array(value*))
    }
  }
  
  trait Header extends StObject {
    
    var header: String
  }
  object Header {
    
    inline def apply(header: String): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsWatchMode extends StObject {
    
    var isWatchMode: Boolean
  }
  object IsWatchMode {
    
    inline def apply(isWatchMode: Boolean): IsWatchMode = {
      val __obj = js.Dynamic.literal(isWatchMode = isWatchMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsWatchMode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsWatchMode] (val x: Self) extends AnyVal {
      
      inline def setIsWatchMode(value: Boolean): Self = StObject.set(x, "isWatchMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<jest-watcher.jest-watcher.JestHookEmitter> */
  trait ReadonlyJestHookEmitter extends StObject {
    
    def onFileChange(fs: JestHookExposedFS): Unit
    
    def onTestRunComplete(results: AggregatedResult): Unit
    
    def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] | Boolean
  }
  object ReadonlyJestHookEmitter {
    
    inline def apply(
      onFileChange: JestHookExposedFS => Unit,
      onTestRunComplete: AggregatedResult => Unit,
      shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean] | Boolean
    ): ReadonlyJestHookEmitter = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[ReadonlyJestHookEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyJestHookEmitter] (val x: Self) extends AnyVal {
      
      inline def setOnFileChange(value: JestHookExposedFS => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: AggregatedResult => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<jest-watcher.jest-watcher.JestHookSubscriber> */
  trait ReadonlyJestHookSubscribe extends StObject {
    
    def onFileChange(fn: FileChange): Unit
    
    def onTestRunComplete(fn: TestRunComplete): Unit
    
    def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit
  }
  object ReadonlyJestHookSubscribe {
    
    inline def apply(
      onFileChange: FileChange => Unit,
      onTestRunComplete: TestRunComplete => Unit,
      shouldRunTestSuite: ShouldRunTestSuite => Unit
    ): ReadonlyJestHookSubscribe = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[ReadonlyJestHookSubscribe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyJestHookSubscribe] (val x: Self) extends AnyVal {
      
      inline def setOnFileChange(value: FileChange => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: TestRunComplete => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: ShouldRunTestSuite => Unit): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  trait Stdin extends StObject {
    
    var stdin: ReadStream
    
    var stdout: WriteStream
  }
  object Stdin {
    
    inline def apply(stdin: ReadStream, stdout: WriteStream): Stdin = {
      val __obj = js.Dynamic.literal(stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stdin] (val x: Self) extends AnyVal {
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stdout extends StObject {
    
    var config: Record[String, Any]
    
    var stdin: ReadStream
    
    var stdout: WriteStream
  }
  object Stdout {
    
    inline def apply(config: Record[String, Any], stdin: ReadStream, stdout: WriteStream): Stdout = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stdout] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
