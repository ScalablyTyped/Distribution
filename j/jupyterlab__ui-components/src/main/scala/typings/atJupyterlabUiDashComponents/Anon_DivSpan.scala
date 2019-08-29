package typings.atJupyterlabUiDashComponents

import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.div
import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DivSpan extends js.Object {
  var tag: js.UndefOr[span | div] = js.undefined
}

object Anon_DivSpan {
  @scala.inline
  def apply(tag: span | div = null): Anon_DivSpan = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DivSpan]
  }
}

