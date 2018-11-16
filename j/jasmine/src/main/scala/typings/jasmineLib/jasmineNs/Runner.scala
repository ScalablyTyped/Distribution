package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner
  extends ScalablyTyped.runtime.Instantiable1[/* env */ Env, js.Any] {
  def add(block: Block): scala.Unit = js.native
  def addSuite(suite: Suite): scala.Unit = js.native
  def afterAll(afterAllFunction: SpecFunction): scala.Unit = js.native
  def afterEach(afterEachFunction: SpecFunction): scala.Unit = js.native
  def beforeAll(beforeAllFunction: SpecFunction): scala.Unit = js.native
  def beforeEach(beforeEachFunction: SpecFunction): scala.Unit = js.native
  def execute(): scala.Unit = js.native
  def finishCallback(): scala.Unit = js.native
  def results(): NestedResults = js.native
  def specs(): js.Array[Spec] = js.native
  def suites(): js.Array[Suite] = js.native
  def topLevelSuites(): js.Array[Suite] = js.native
}

