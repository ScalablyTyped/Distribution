package typings.jestAxe

import typings.axeCore.mod.Result
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.TestEngine
import typings.axeCore.mod.TestEnvironment
import typings.axeCore.mod.TestRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<axe-core.axe-core.AxeResults> */
  trait PartialAxeResults extends StObject {
    
    var inapplicable: js.UndefOr[js.Array[Result]] = js.undefined
    
    var incomplete: js.UndefOr[js.Array[Result]] = js.undefined
    
    var passes: js.UndefOr[js.Array[Result]] = js.undefined
    
    var testEngine: js.UndefOr[TestEngine] = js.undefined
    
    var testEnvironment: js.UndefOr[TestEnvironment] = js.undefined
    
    var testRunner: js.UndefOr[TestRunner] = js.undefined
    
    var timestamp: js.UndefOr[String] = js.undefined
    
    var toolOptions: js.UndefOr[RunOptions] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var violations: js.UndefOr[js.Array[Result]] = js.undefined
  }
  object PartialAxeResults {
    
    inline def apply(): PartialAxeResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAxeResults]
    }
    
    extension [Self <: PartialAxeResults](x: Self) {
      
      inline def setInapplicable(value: js.Array[Result]): Self = StObject.set(x, "inapplicable", value.asInstanceOf[js.Any])
      
      inline def setInapplicableUndefined: Self = StObject.set(x, "inapplicable", js.undefined)
      
      inline def setInapplicableVarargs(value: Result*): Self = StObject.set(x, "inapplicable", js.Array(value :_*))
      
      inline def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      inline def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
      
      inline def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value :_*))
      
      inline def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      inline def setPassesUndefined: Self = StObject.set(x, "passes", js.undefined)
      
      inline def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value :_*))
      
      inline def setTestEngine(value: TestEngine): Self = StObject.set(x, "testEngine", value.asInstanceOf[js.Any])
      
      inline def setTestEngineUndefined: Self = StObject.set(x, "testEngine", js.undefined)
      
      inline def setTestEnvironment(value: TestEnvironment): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironmentUndefined: Self = StObject.set(x, "testEnvironment", js.undefined)
      
      inline def setTestRunner(value: TestRunner): Self = StObject.set(x, "testRunner", value.asInstanceOf[js.Any])
      
      inline def setTestRunnerUndefined: Self = StObject.set(x, "testRunner", js.undefined)
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setToolOptions(value: RunOptions): Self = StObject.set(x, "toolOptions", value.asInstanceOf[js.Any])
      
      inline def setToolOptionsUndefined: Self = StObject.set(x, "toolOptions", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      inline def setViolationsUndefined: Self = StObject.set(x, "violations", js.undefined)
      
      inline def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value :_*))
    }
  }
}
