package typings.atJupyterlabUiDashComponents

import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.div
import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Div extends js.Object {
  var tag: js.UndefOr[div | span] = js.undefined
}

object Anon_Div {
  @scala.inline
  def apply(tag: div | span = null): Anon_Div = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Div]
  }
}

