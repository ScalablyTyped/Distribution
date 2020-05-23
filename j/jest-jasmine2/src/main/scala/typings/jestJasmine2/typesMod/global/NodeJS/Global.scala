package typings.jestJasmine2.typesMod.global.NodeJS

import typings.expect.typesMod.Expect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends js.Object {
  var expect: Expect
}

object Global {
  @scala.inline
  def apply(expect: Expect): Global = {
    val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
}

