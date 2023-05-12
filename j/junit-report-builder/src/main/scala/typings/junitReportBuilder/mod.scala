package typings.junitReportBuilder

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("junit-report-builder", JSImport.Namespace)
  @js.native
  val ^ : JUnitReportBuilder = js.native
  
  trait JUnitReportBuilder extends StObject {
    
    /**
      * Returns report as string
      */
    def build(): String
    
    /**
      * Creates a new builder for a separate report
      */
    def newBuilder(): JUnitReportBuilder
    
    /**
      * Adds a test case outside of any test suite to the report
      */
    def testCase(): TestCase
    
    /**
      * Adds a test suite to the report
      */
    def testSuite(): TestSuite
    
    /**
      * Writes report to disk synchronously
      */
    def writeTo(reportPath: String): Unit
  }
  object JUnitReportBuilder {
    
    inline def apply(
      build: () => String,
      newBuilder: () => JUnitReportBuilder,
      testCase: () => TestCase,
      testSuite: () => TestSuite,
      writeTo: String => Unit
    ): JUnitReportBuilder = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), newBuilder = js.Any.fromFunction0(newBuilder), testCase = js.Any.fromFunction0(testCase), testSuite = js.Any.fromFunction0(testSuite), writeTo = js.Any.fromFunction1(writeTo))
      __obj.asInstanceOf[JUnitReportBuilder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JUnitReportBuilder] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: () => String): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      inline def setNewBuilder(value: () => JUnitReportBuilder): Self = StObject.set(x, "newBuilder", js.Any.fromFunction0(value))
      
      inline def setTestCase(value: () => TestCase): Self = StObject.set(x, "testCase", js.Any.fromFunction0(value))
      
      inline def setTestSuite(value: () => TestSuite): Self = StObject.set(x, "testSuite", js.Any.fromFunction0(value))
      
      inline def setWriteTo(value: String => Unit): Self = StObject.set(x, "writeTo", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TestCase extends StObject {
    
    /**
      * Adds the class name associated with the test case
      */
    def className(className: String): TestCase = js.native
    
    /**
      * Marks the test case as erroneous
      */
    def error(): TestCase = js.native
    def error(message: String): TestCase = js.native
    def error(message: String, `type`: String): TestCase = js.native
    def error(message: String, `type`: String, content: String): TestCase = js.native
    def error(message: String, `type`: Unit, content: String): TestCase = js.native
    def error(message: Unit, `type`: String): TestCase = js.native
    def error(message: Unit, `type`: String, content: String): TestCase = js.native
    def error(message: Unit, `type`: Unit, content: String): TestCase = js.native
    
    /**
      * Adds the path to an attachment associated with test case failure or error
      */
    def errorAttachment(filePath: String): TestCase = js.native
    
    /**
      * Marks the test case as a failure
      */
    def failure(): TestCase = js.native
    def failure(message: String): TestCase = js.native
    def failure(message: String, `type`: String): TestCase = js.native
    def failure(message: Unit, `type`: String): TestCase = js.native
    
    /**
      * Adds the path to the file associated with the test case
      */
    def file(filePath: String): TestCase = js.native
    
    /**
      * Sets the label of the test case
      */
    def name(name: String): TestCase = js.native
    def name(name: Double): TestCase = js.native
    
    /**
      * Marks the test case as skipped
      */
    def skipped(): TestCase = js.native
    
    /**
      * Adds the stack trace associated with test case failure or error
      */
    def stacktrace(stackTrace: String): TestCase = js.native
    
    /**
      * Adds the text written to stderr during test case execution
      */
    def standardError(log: String): TestCase = js.native
    
    /**
      * Adds the text written to stdout during test case execution
      */
    def standardOutput(log: String): TestCase = js.native
    
    /**
      * Sets the elapsed time for the test case
      */
    def time(timeInSeconds: Double): TestCase = js.native
  }
  
  @js.native
  trait TestSuite extends StObject {
    
    /**
      * Sets the label of the test suite
      */
    def name(name: String): TestSuite = js.native
    def name(name: Double): TestSuite = js.native
    
    /**
      * Adds a custom property to the test suite
      */
    def property(name: String, value: String): TestSuite = js.native
    def property(name: String, value: Double): TestSuite = js.native
    def property(name: Double, value: String): TestSuite = js.native
    def property(name: Double, value: Double): TestSuite = js.native
    
    /**
      * Adds a test case to the test suite
      */
    def testCase(): TestCase = js.native
    
    /**
      * Sets the elapsed time for all test cases within the test suite
      */
    def time(timeInSeconds: Double): TestSuite = js.native
    
    /**
      * Sets the timestamp denoting the start of the test suite
      */
    def timestamp(timestamp: String): TestSuite = js.native
    def timestamp(timestamp: js.Date): TestSuite = js.native
    def timestamp(timestamp: Double): TestSuite = js.native
  }
  
  type _To = JUnitReportBuilder
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JUnitReportBuilder = ^
}
