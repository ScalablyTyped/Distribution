package typings.jestWatcher

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.jestWatcher.typesMod.FileChange
import typings.jestWatcher.typesMod.JestHookExposedFS
import typings.jestWatcher.typesMod.ShouldRunTestSuite
import typings.jestWatcher.typesMod.TestRunComplete
import typings.jestWatcher.typesMod.TestSuiteInfo
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config extends StObject {
    
    var config: ProjectConfig
    
    var testPaths: js.Array[Path]
  }
  object Config {
    
    inline def apply(config: ProjectConfig, testPaths: js.Array[Path]): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setTestPaths(value: js.Array[Path]): Self = StObject.set(x, "testPaths", value.asInstanceOf[js.Any])
      
      inline def setTestPathsVarargs(value: Path*): Self = StObject.set(x, "testPaths", js.Array(value :_*))
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var index: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, index: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
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
  
  /* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookEmitter> */
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
    
    extension [Self <: ReadonlyJestHookEmitter](x: Self) {
      
      inline def setOnFileChange(value: JestHookExposedFS => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: AggregatedResult => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<jest-watcher.jest-watcher/build/types.JestHookSubscriber> */
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
    
    extension [Self <: ReadonlyJestHookSubscribe](x: Self) {
      
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
    
    extension [Self <: Stdin](x: Self) {
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
