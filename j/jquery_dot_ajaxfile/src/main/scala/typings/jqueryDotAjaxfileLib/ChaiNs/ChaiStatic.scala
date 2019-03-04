package typings
package jqueryDotAjaxfileLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChaiStatic extends js.Object {
  var assert: AssertStatic
  var config: Config
  var expect: ExpectStatic
  def should(): Should
  /**
    * Provides a way to extend the internals of Chai
    */
  def use(fn: js.Function2[/* chai */ js.Any, /* utils */ js.Any, scala.Unit]): js.Any
}

object ChaiStatic {
  @scala.inline
  def apply(
    assert: AssertStatic,
    config: Config,
    expect: ExpectStatic,
    should: js.Function0[Should],
    use: js.Function1[js.Function2[/* chai */ js.Any, /* utils */ js.Any, scala.Unit], js.Any]
  ): ChaiStatic = {
    val __obj = js.Dynamic.literal(assert = assert, config = config, expect = expect, should = should, use = use)
  
    __obj.asInstanceOf[ChaiStatic]
  }
}

