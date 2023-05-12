package typings.jestReporters

import typings.jestTestResult.mod.TestCaseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Basename extends StObject {
    
    var basename: String
    
    var dirname: String
  }
  object Basename {
    
    inline def apply(basename: String, dirname: String): Basename = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Basename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Basename] (val x: Self) extends AnyVal {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    }
  }
  
  trait Silent extends StObject {
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Silent {
    
    inline def apply(): Silent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Silent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Silent] (val x: Self) extends AnyVal {
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait Test extends StObject {
    
    var test: typings.jestTestResult.mod.Test
    
    var testCaseResult: TestCaseResult
  }
  object Test {
    
    inline def apply(test: typings.jestTestResult.mod.Test, testCaseResult: TestCaseResult): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], testCaseResult = testCaseResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Test] (val x: Self) extends AnyVal {
      
      inline def setTest(value: typings.jestTestResult.mod.Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestCaseResult(value: TestCaseResult): Self = StObject.set(x, "testCaseResult", value.asInstanceOf[js.Any])
    }
  }
}
