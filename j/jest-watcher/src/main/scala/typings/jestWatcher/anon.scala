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
    
    extension [Self <: Config](x: Self) {
      
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
    
    extension [Self <: Header](x: Self) {
      
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
    
    extension [Self <: IsWatchMode](x: Self) {
      
      inline def setIsWatchMode(value: Boolean): Self = StObject.set(x, "isWatchMode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<jest-watcher.jest-watcher.JestHookEmitter> */
  trait ReadonlyJestHookEmitter extends StObject {
    
    val onFileChange: js.Function1[/* fs */ JestHookExposedFS, Unit]
    
    val onTestRunComplete: js.Function1[/* results */ AggregatedResult, Unit]
    
    val shouldRunTestSuite: js.Function1[/* testSuiteInfo */ TestSuiteInfo, js.Promise[Boolean] | Boolean]
  }
  object ReadonlyJestHookEmitter {
    
    inline def apply(
      onFileChange: /* fs */ JestHookExposedFS => Unit,
      onTestRunComplete: /* results */ AggregatedResult => Unit,
      shouldRunTestSuite: /* testSuiteInfo */ TestSuiteInfo => js.Promise[Boolean] | Boolean
    ): ReadonlyJestHookEmitter = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[ReadonlyJestHookEmitter]
    }
    
    extension [Self <: ReadonlyJestHookEmitter](x: Self) {
      
      inline def setOnFileChange(value: /* fs */ JestHookExposedFS => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: /* results */ AggregatedResult => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: /* testSuiteInfo */ TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<jest-watcher.jest-watcher.JestHookSubscriber> */
  trait ReadonlyJestHookSubscribe extends StObject {
    
    val onFileChange: js.Function1[/* fn */ FileChange, Unit]
    
    val onTestRunComplete: js.Function1[/* fn */ TestRunComplete, Unit]
    
    val shouldRunTestSuite: js.Function1[/* fn */ ShouldRunTestSuite, Unit]
  }
  object ReadonlyJestHookSubscribe {
    
    inline def apply(
      onFileChange: /* fn */ FileChange => Unit,
      onTestRunComplete: /* fn */ TestRunComplete => Unit,
      shouldRunTestSuite: /* fn */ ShouldRunTestSuite => Unit
    ): ReadonlyJestHookSubscribe = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[ReadonlyJestHookSubscribe]
    }
    
    extension [Self <: ReadonlyJestHookSubscribe](x: Self) {
      
      inline def setOnFileChange(value: /* fn */ FileChange => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: /* fn */ TestRunComplete => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: /* fn */ ShouldRunTestSuite => Unit): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
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
    
    extension [Self <: Stdin](x: Self) {
      
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
    
    extension [Self <: Stdout](x: Self) {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
