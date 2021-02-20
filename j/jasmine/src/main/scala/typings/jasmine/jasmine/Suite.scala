package typings.jasmine.jasmine

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suite
  extends SuiteOrSpec
     with Instantiable4[
      /* env */ Env, 
      /* description */ String, 
      /* specDefinitions */ js.Function0[Unit], 
      /* parentSuite */ Suite, 
      js.Any
    ] {
  
  def add(suiteOrSpec: SuiteOrSpec): Unit = js.native
  
  def afterAll(afterAllFunction: SpecFunction): Unit = js.native
  
  def afterEach(afterEachFunction: SpecFunction): Unit = js.native
  
  def beforeAll(beforeAllFunction: SpecFunction): Unit = js.native
  
  def beforeEach(beforeEachFunction: SpecFunction): Unit = js.native
  
  def children(): js.Array[_] = js.native
  
  def execute(): Unit = js.native
  def execute(onComplete: js.Function0[Unit]): Unit = js.native
  
  def finish(): Unit = js.native
  def finish(onComplete: js.Function0[Unit]): Unit = js.native
  
  def getFullName(): String = js.native
  
  var parentSuite: Suite = js.native
  
  def results(): NestedResults = js.native
  
  def specs(): js.Array[Spec] = js.native
  
  def suites(): js.Array[Suite] = js.native
}
