package typings.jest.mod

import typings.jest.mod.jest.Describe
import typings.jest.mod.jest.It
import typings.jest.mod.jest.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var afterAll: Lifecycle = js.native
  var afterEach: Lifecycle = js.native
  var beforeAll: Lifecycle = js.native
  var beforeEach: Lifecycle = js.native
  var describe: Describe = js.native
  var fdescribe: Describe = js.native
  var fit: It = js.native
  var it: It = js.native
  var test: It = js.native
  var xdescribe: Describe = js.native
  var xit: It = js.native
  var xtest: It = js.native
}

