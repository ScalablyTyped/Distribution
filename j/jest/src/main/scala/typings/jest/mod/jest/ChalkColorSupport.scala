package typings.jest.mod.jest

import typings.jest.jestNumbers.`0`
import typings.jest.jestNumbers.`1`
import typings.jest.jestNumbers.`2`
import typings.jest.jestNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChalkColorSupport extends js.Object {
  var has16m: Boolean
  var has256: Boolean
  var hasBasic: Boolean
  var level: `0` | `1` | `2` | `3`
}

object ChalkColorSupport {
  @scala.inline
  def apply(has16m: Boolean, has256: Boolean, hasBasic: Boolean, level: `0` | `1` | `2` | `3`): ChalkColorSupport = {
    val __obj = js.Dynamic.literal(has16m = has16m.asInstanceOf[js.Any], has256 = has256.asInstanceOf[js.Any], hasBasic = hasBasic.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChalkColorSupport]
  }
}

