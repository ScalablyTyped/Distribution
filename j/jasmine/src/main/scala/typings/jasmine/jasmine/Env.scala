package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends StObject {
  
  def addReporter(reporter: CustomReporter): Unit = js.native
  
  def allowRespy(allow: Boolean): Unit = js.native
  
  def clearReporters(): Unit = js.native
  
  def configuration(): Configuration = js.native
  
  def configure(configuration: Configuration): Unit = js.native
  
  /** @async */
  def execute(): js.Thenable[JasmineDoneInfo] = js.native
  def execute(runnablesToRun: js.Array[Suite]): js.Thenable[JasmineDoneInfo] = js.native
  def execute(runnablesToRun: js.Array[Suite], onComplete: Func): Unit = js.native
  def execute(runnablesToRun: Null, onComplete: Func): Unit = js.native
  def execute(runnablesToRun: Unit, onComplete: Func): Unit = js.native
  
  def provideFallbackReporter(reporter: CustomReporter): Unit = js.native
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SpecResult.
    * @since 3.6.0
    */
  def setSpecProperty(key: String, value: scala.Any): Unit = js.native
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SpecResult.
    * @since 3.6.0
    */
  @JSName("setSpecProperty")
  var setSpecProperty_Original: js.Function2[/* key */ String, /* value */ scala.Any, Unit] = js.native
  
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SuiteResult.
    * @since 3.6.0
    */
  def setSuiteProperty(key: String, value: scala.Any): Unit = js.native
  /**
    * Sets a user-defined property that will be provided to reporters as
    * part of the properties field of SuiteResult.
    * @since 3.6.0
    */
  @JSName("setSuiteProperty")
  var setSuiteProperty_Original: js.Function2[/* key */ String, /* value */ scala.Any, Unit] = js.native
  
  def topSuite(): Suite = js.native
}
