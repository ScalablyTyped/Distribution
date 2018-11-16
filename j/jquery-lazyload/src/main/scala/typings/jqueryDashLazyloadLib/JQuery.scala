package typings
package jqueryDashLazyloadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def lazyload(): JQuery = js.native
  def lazyload(options: jqueryDashLazyloadLib.JQueryLazyLoadNs.Options): JQuery = js.native
  @JSName("on")
  def on_load(
    event: jqueryDashLazyloadLib.jqueryDashLazyloadLibStrings.load,
    callback: js.Function1[
      /* options */ js.UndefOr[jqueryDashLazyloadLib.JQueryLazyLoadNs.Options], 
      scala.Unit
    ]
  ): JQuery = js.native
}

