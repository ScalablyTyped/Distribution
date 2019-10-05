package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner
  extends Instantiable1[/* env */ Env, js.Any] {
  def add(block: Block): Unit = js.native
  def addSuite(suite: Suite): Unit = js.native
  def afterAll(afterAllFunction: SpecFunction): Unit = js.native
  def afterEach(afterEachFunction: SpecFunction): Unit = js.native
  def beforeAll(beforeAllFunction: SpecFunction): Unit = js.native
  def beforeEach(beforeEachFunction: SpecFunction): Unit = js.native
  def execute(): Unit = js.native
  def finishCallback(): Unit = js.native
  def results(): NestedResults = js.native
  def specs(): js.Array[Spec] = js.native
  def suites(): js.Array[Suite] = js.native
  def topLevelSuites(): js.Array[Suite] = js.native
}

