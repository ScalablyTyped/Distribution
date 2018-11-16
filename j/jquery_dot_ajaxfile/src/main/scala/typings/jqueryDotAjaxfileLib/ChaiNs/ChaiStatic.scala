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

