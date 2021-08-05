package typings.jasmineNode

import typings.jasmine.jasmine.Runner
import typings.jasmineNode.anon.Consolidate
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmine {
  
  trait Env extends StObject {
    
    var defaultTimeoutInterval: Double
  }
  object Env {
    
    inline def apply(defaultTimeoutInterval: Double): Env = {
      val __obj = js.Dynamic.literal(defaultTimeoutInterval = defaultTimeoutInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    extension [Self <: Env](x: Self) {
      
      inline def setDefaultTimeoutInterval(value: Double): Self = StObject.set(x, "defaultTimeoutInterval", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecuteSpecsOptions extends StObject {
    
    var growl: js.UndefOr[Boolean] = js.undefined
    
    var includeStackTrace: js.UndefOr[Boolean] = js.undefined
    
    var isVerbose: js.UndefOr[Boolean] = js.undefined
    
    var junitreport: js.UndefOr[Consolidate] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* runner */ Runner, Unit]] = js.undefined
    
    var regExpSpec: RegExp
    
    var showColors: js.UndefOr[Boolean] = js.undefined
    
    var specFolders: js.Array[String]
    
    var teamcity: js.UndefOr[String | Boolean] = js.undefined
    
    var useRequireJs: js.UndefOr[Boolean] = js.undefined
  }
  object ExecuteSpecsOptions {
    
    inline def apply(regExpSpec: RegExp, specFolders: js.Array[String]): ExecuteSpecsOptions = {
      val __obj = js.Dynamic.literal(regExpSpec = regExpSpec.asInstanceOf[js.Any], specFolders = specFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteSpecsOptions]
    }
    
    extension [Self <: ExecuteSpecsOptions](x: Self) {
      
      inline def setGrowl(value: Boolean): Self = StObject.set(x, "growl", value.asInstanceOf[js.Any])
      
      inline def setGrowlUndefined: Self = StObject.set(x, "growl", js.undefined)
      
      inline def setIncludeStackTrace(value: Boolean): Self = StObject.set(x, "includeStackTrace", value.asInstanceOf[js.Any])
      
      inline def setIncludeStackTraceUndefined: Self = StObject.set(x, "includeStackTrace", js.undefined)
      
      inline def setIsVerbose(value: Boolean): Self = StObject.set(x, "isVerbose", value.asInstanceOf[js.Any])
      
      inline def setIsVerboseUndefined: Self = StObject.set(x, "isVerbose", js.undefined)
      
      inline def setJunitreport(value: Consolidate): Self = StObject.set(x, "junitreport", value.asInstanceOf[js.Any])
      
      inline def setJunitreportUndefined: Self = StObject.set(x, "junitreport", js.undefined)
      
      inline def setOnComplete(value: /* runner */ Runner => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setRegExpSpec(value: RegExp): Self = StObject.set(x, "regExpSpec", value.asInstanceOf[js.Any])
      
      inline def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
      
      inline def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
      
      inline def setSpecFolders(value: js.Array[String]): Self = StObject.set(x, "specFolders", value.asInstanceOf[js.Any])
      
      inline def setSpecFoldersVarargs(value: String*): Self = StObject.set(x, "specFolders", js.Array(value :_*))
      
      inline def setTeamcity(value: String | Boolean): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      inline def setTeamcityUndefined: Self = StObject.set(x, "teamcity", js.undefined)
      
      inline def setUseRequireJs(value: Boolean): Self = StObject.set(x, "useRequireJs", value.asInstanceOf[js.Any])
      
      inline def setUseRequireJsUndefined: Self = StObject.set(x, "useRequireJs", js.undefined)
    }
  }
  
  trait JasmineNode extends StObject {
    
    def executeSpecsInFolder(options: ExecuteSpecsOptions): Unit
    
    def loadHelpersInFolder(path: String, pattern: RegExp): Unit
  }
  object JasmineNode {
    
    inline def apply(executeSpecsInFolder: ExecuteSpecsOptions => Unit, loadHelpersInFolder: (String, RegExp) => Unit): JasmineNode = {
      val __obj = js.Dynamic.literal(executeSpecsInFolder = js.Any.fromFunction1(executeSpecsInFolder), loadHelpersInFolder = js.Any.fromFunction2(loadHelpersInFolder))
      __obj.asInstanceOf[JasmineNode]
    }
    
    extension [Self <: JasmineNode](x: Self) {
      
      inline def setExecuteSpecsInFolder(value: ExecuteSpecsOptions => Unit): Self = StObject.set(x, "executeSpecsInFolder", js.Any.fromFunction1(value))
      
      inline def setLoadHelpersInFolder(value: (String, RegExp) => Unit): Self = StObject.set(x, "loadHelpersInFolder", js.Any.fromFunction2(value))
    }
  }
}
