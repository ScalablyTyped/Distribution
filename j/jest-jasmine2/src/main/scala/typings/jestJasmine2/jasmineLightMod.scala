package typings.jestJasmine2

import typings.jestJasmine2.typesMod.Jasmine
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/jasmineLight", JSImport.Namespace)
@js.native
object jasmineLightMod extends js.Object {
  def create(createOptions: Record[String, _]): Jasmine = js.native
  @JSName("_interface")
  def interface(jasmine: Jasmine, env: js.Any): AnonAfterAll = js.native
}

