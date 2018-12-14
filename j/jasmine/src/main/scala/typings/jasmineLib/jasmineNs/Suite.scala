package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suite
  extends SuiteOrSpec
     with org.scalablytyped.runtime.Instantiable4[
      /* env */ Env, 
      /* description */ java.lang.String, 
      /* specDefinitions */ js.Function0[scala.Unit], 
      /* parentSuite */ Suite, 
      js.Any
    ] {
  var parentSuite: Suite = js.native
  def add(suiteOrSpec: SuiteOrSpec): scala.Unit = js.native
  def afterAll(afterAllFunction: SpecFunction): scala.Unit = js.native
  def afterEach(afterEachFunction: SpecFunction): scala.Unit = js.native
  def beforeAll(beforeAllFunction: SpecFunction): scala.Unit = js.native
  def beforeEach(beforeEachFunction: SpecFunction): scala.Unit = js.native
  def children(): js.Array[_] = js.native
  def execute(): scala.Unit = js.native
  def execute(onComplete: js.Function0[scala.Unit]): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def finish(onComplete: js.Function0[scala.Unit]): scala.Unit = js.native
  def getFullName(): java.lang.String = js.native
  def results(): NestedResults = js.native
  def specs(): js.Array[Spec] = js.native
  def suites(): js.Array[Suite] = js.native
}

