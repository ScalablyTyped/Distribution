package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KnockoutComputedDefine[T] extends js.Object {
  var deferEvaluation: js.UndefOr[scala.Boolean] = js.undefined
  var disposeWhen: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var disposeWhenNodeIsRemoved: js.UndefOr[stdLib.Node] = js.undefined
  var owner: js.UndefOr[js.Any] = js.undefined
  var pure: js.UndefOr[scala.Boolean] = js.undefined
  var write: js.UndefOr[js.Function1[/* value */ T, scala.Unit]] = js.undefined
  def read(): T
}

