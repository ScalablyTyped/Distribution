package typings.jqueryDotAjaxfile

import typings.jqueryDotAjaxfile.ChaiNs.ChaiStatic
import typings.jqueryDotAjaxfile.MochaNs.IContextDefinition
import typings.jqueryDotAjaxfile.MochaNs.ITestDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: JQueryStatic = js.native
  var AjaxFile: IAjaxFileStatic = js.native
  var chai: ChaiStatic = js.native
  // alias for `describe`
  var context: IContextDefinition = js.native
  var describe: IContextDefinition = js.native
  var it: ITestDefinition = js.native
  var jQuery: JQueryStatic = js.native
  var ko: KnockoutStatic = js.native
  var mocha: Mocha = js.native
  // alias for `describe`
  var suite: IContextDefinition = js.native
  // alias for `it`
  var test: ITestDefinition = js.native
  var xdescribe: IContextDefinition = js.native
  var xit: ITestDefinition = js.native
  def after(action: js.Function0[Unit]): Unit = js.native
  def after(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def afterEach(action: js.Function0[Unit]): Unit = js.native
  def afterEach(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def before(action: js.Function0[Unit]): Unit = js.native
  def before(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def beforeEach(action: js.Function0[Unit]): Unit = js.native
  def beforeEach(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def setup(action: js.Function0[Unit]): Unit = js.native
  def setup(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def suiteSetup(action: js.Function0[Unit]): Unit = js.native
  def suiteSetup(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def suiteTeardown(action: js.Function0[Unit]): Unit = js.native
  def suiteTeardown(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def teardown(action: js.Function0[Unit]): Unit = js.native
  def teardown(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
}

