package typings.jestJasmine2

import typings.jestJasmine2.jsApiReporterMod.default
import typings.jestJasmine2.typesMod.Jasmine
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessTypeAfterAll extends js.Object {
  var jasmine: Jasmine = js.native
  var jsApiReporter: default = js.native
  def afterAll(): js.Any = js.native
  def afterEach(): js.Any = js.native
  def beforeAll(): js.Any = js.native
  def beforeEach(): js.Any = js.native
  def describe(description: String, specDefinitions: js.Function): js.Any = js.native
  def fail(): js.Any = js.native
  def fdescribe(description: String, specDefinitions: js.Function): js.Any = js.native
  def fit(): js.Any = js.native
  def it(): js.Any = js.native
  def pending(): js.Any = js.native
  def spyOn(obj: Record[String, _], methodName: String): js.Any = js.native
  def spyOn(obj: Record[String, _], methodName: String, accessType: String): js.Any = js.native
  def xdescribe(description: String, specDefinitions: js.Function): js.Any = js.native
  def xit(): js.Any = js.native
}

