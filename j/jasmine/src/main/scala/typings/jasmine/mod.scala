package typings.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jasmine", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.jasmine.mod.jasmine {
    def this(options: js.Any) = this()
  }
  
  /* static member */
  @JSImport("jasmine", "ConsoleReporter")
  @js.native
  def ConsoleReporter(): js.Any = js.native
  
  @js.native
  trait jasmine extends StObject {
    
    def addMatchers(
      matchers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomMatcherFactories */ js.Any
    ): Unit = js.native
    
    def addReporter(
      reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ js.Any
    ): Unit = js.native
    
    def addSpecFile(filePath: String): Unit = js.native
    
    def addSpecFiles(files: js.Array[String]): Unit = js.native
    
    var completionReporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomReporter */ js.Any = js.native
    
    def configureDefaultReporter(options: js.Any, args: js.Any*): Unit = js.native
    
    def coreVersion(): String = js.native
    
    var env: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Env */ js.Any = js.native
    
    def execute(): js.Any = js.native
    def execute(files: js.UndefOr[scala.Nothing], filterString: String): js.Any = js.native
    def execute(files: js.Array[String]): js.Any = js.native
    def execute(files: js.Array[String], filterString: String): js.Any = js.native
    
    def exitCodeCompletion(passed: js.Any): Unit = js.native
    
    var helperFiles: js.Array[String] = js.native
    
    var jasmine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Jasmine */ js.Any = js.native
    
    def loadConfig(config: js.Any): Unit = js.native
    
    def loadConfigFile(configFilePath: js.Any): Unit = js.native
    
    def loadHelpers(): Unit = js.native
    
    def loadSpecs(): Unit = js.native
    
    def onComplete(onCompleteCallback: js.Function1[/* passed */ Boolean, Unit]): Unit = js.native
    
    def printDeprecation(): Unit = js.native
    
    var projectBaseDir: String = js.native
    
    def provideFallbackReporter(
      reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ js.Any
    ): Unit = js.native
    
    def randomizeTests(): Boolean = js.native
    def randomizeTests(value: js.Any): Boolean = js.native
    
    var reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomReporter */ js.Any = js.native
    
    var reportersCount: Double = js.native
    
    def seed(value: js.Any): Unit = js.native
    
    def showColors(value: js.Any): Unit = js.native
    
    var showingColors: Boolean = js.native
    
    var specFiles: js.Array[String] = js.native
    
    def stopSpecOnExpectationFailure(value: js.Any): Unit = js.native
  }
}
