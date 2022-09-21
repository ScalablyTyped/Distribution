package typings.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jasmine", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typings.jasmine.mod.jasmine {
    def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JasmineOptions */ Any) = this()
  }
  @JSImport("jasmine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def ConsoleReporter(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ConsoleReporter")().asInstanceOf[Any]
  
  @js.native
  trait jasmine extends StObject {
    
    def addHelperFile(filePath: String): Unit = js.native
    
    def addMatchers(
      matchers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomMatcherFactories */ Any
    ): Unit = js.native
    
    def addMatchingHelperFiles(patterns: js.Array[String]): Unit = js.native
    
    def addMatchingSpecFiles(patterns: js.Array[String]): Unit = js.native
    
    /**
      * Add a custom reporter to the Jasmine environment.
      */
    def addReporter(
      reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomReporter */ Any
    ): Unit = js.native
    
    /**
      * @deprecated Private method that may be changed or removed in the future
      */
    def addRequires(files: js.Array[String]): Unit = js.native
    
    /**
      * Adds a spec file to the list that will be loaded when the suite is executed.
      */
    def addSpecFile(filePath: String): Unit = js.native
    
    /**
      * Clears all registered reporters.
      */
    def clearReporters(): Unit = js.native
    
    /**
      * Configure the default reporter.
      */
    def configureDefaultReporter(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultReporterOptions */ Any
    ): Unit = js.native
    
    /**
      * The version of jasmine-core in use
      */
    def coreVersion(): String = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var defaultReporterConfigured: Boolean = js.native
    
    var env: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Env */ Any = js.native
    
    def execute(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JasmineDoneInfo */ Any
      ] = js.native
    def execute(files: js.Array[String]): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JasmineDoneInfo */ Any
      ] = js.native
    def execute(files: js.Array[String], filterString: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JasmineDoneInfo */ Any
      ] = js.native
    def execute(files: Unit, filterString: String): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JasmineDoneInfo */ Any
      ] = js.native
    
    var exitOnCompletion: Boolean = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var helperFiles: js.Array[String] = js.native
    
    var jasmine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Jasmine */ Any = js.native
    
    def loadConfig(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JasmineConfig */ Any
    ): Unit = js.native
    
    def loadConfigFile(): Unit = js.native
    def loadConfigFile(configFilePath: String): Unit = js.native
    
    /**
      * @deprecated Private method that may be changed or removed in the future
      */
    def loadHelpers(): js.Promise[Unit] = js.native
    
    /**
      * @deprecated Private method that may be changed or removed in the future
      */
    def loadRequires(): Unit = js.native
    
    /**
      * @deprecated Private method that may be changed or removed in the future
      */
    def loadSpecs(): js.Promise[Unit] = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var projectBaseDir: String = js.native
    
    /**
      * Provide a fallback reporter if no other reporters have been specified.
      */
    def provideFallbackReporter(
      reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomReporter */ Any
    ): Unit = js.native
    
    /**
      * Sets whether to randomize the order of specs.
      */
    def randomizeTests(value: Boolean): Unit = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomReporter */ Any = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var reportersCount: Double = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var requires: js.Array[String] = js.native
    
    /**
      * Sets the random seed.
      */
    def seed(value: Double): Unit = js.native
    
    /**
      * Sets whether to show colors in the console reporter.
      */
    def showColors(value: Boolean): Unit = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var showingColors: Boolean = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var specDir: String = js.native
    
    /**
      * @deprecated Private property that may be changed or removed in the future
      */
    var specFiles: js.Array[String] = js.native
    
    def stopOnSpecFailure(value: Boolean): Unit = js.native
    
    def stopSpecOnExpectationFailure(value: Boolean): Unit = js.native
  }
}
