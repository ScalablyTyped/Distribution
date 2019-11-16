package typings.jestDashJasmine2.buildTypesMod._Global_.NodeJS

import typings.expect.buildTypesMod.Expect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends js.Object {
  var expect: Expect
}

object Global {
  @scala.inline
  def apply(expect: Expect): Global = {
    val __obj = js.Dynamic.literal(expect = expect)
  
    __obj.asInstanceOf[Global]
  }
}

