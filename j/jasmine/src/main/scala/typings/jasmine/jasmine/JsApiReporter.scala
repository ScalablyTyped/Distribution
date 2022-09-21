package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsApiReporter
  extends StObject
     with CustomReporter
     with Instantiable0[scala.Any] {
  
  def executionTime(): Double = js.native
  
  var finished: Boolean = js.native
  
  var runDetails: JasmineDoneInfo = js.native
  
  def specResults(index: Double, length: Double): js.Array[SpecResult] = js.native
  
  def specs(): js.Array[SpecResult] = js.native
  
  var started: Boolean = js.native
  
  def status(): String = js.native
  
  def suiteResults(index: Double, length: Double): js.Array[SuiteResult] = js.native
  
  def suites(): StringDictionary[SuiteResult] = js.native
}
