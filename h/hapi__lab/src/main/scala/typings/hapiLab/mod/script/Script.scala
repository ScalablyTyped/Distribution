package typings.hapiLab.mod.script

import typings.hapiLab.anon.OmitTestOptionsplan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Script extends js.Object {
  
  def after(action: Action): Unit = js.native
  def after(options: TestOptions, action: Action): Unit = js.native
  
  def afterEach(action: Action): Unit = js.native
  def afterEach(options: TestOptions, action: Action): Unit = js.native
  @JSName("afterEach")
  var afterEach_Original: Setup = js.native
  
  @JSName("after")
  var after_Original: Setup = js.native
  
  def before(action: Action): Unit = js.native
  def before(options: TestOptions, action: Action): Unit = js.native
  
  def beforeEach(action: Action): Unit = js.native
  def beforeEach(options: TestOptions, action: Action): Unit = js.native
  @JSName("beforeEach")
  var beforeEach_Original: Setup = js.native
  
  @JSName("before")
  var before_Original: Setup = js.native
  
  def describe(title: String, content: js.Function0[Unit]): Unit = js.native
  def describe(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
  @JSName("describe")
  var describe_Original: Experiment = js.native
  
  def experiment(title: String, content: js.Function0[Unit]): Unit = js.native
  def experiment(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
  @JSName("experiment")
  var experiment_Original: Experiment = js.native
  
  def it(title: String, options: TestOptions, test: Action): Unit = js.native
  def it(title: String, test: Action): Unit = js.native
  @JSName("it")
  var it_Original: Test = js.native
  
  def suite(title: String, content: js.Function0[Unit]): Unit = js.native
  def suite(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
  @JSName("suite")
  var suite_Original: Experiment = js.native
  
  def test(title: String, options: TestOptions, test: Action): Unit = js.native
  def test(title: String, test: Action): Unit = js.native
  @JSName("test")
  var test_Original: Test = js.native
}
