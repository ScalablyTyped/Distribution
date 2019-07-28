package typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsMod

import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.button
import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.reset
import typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait IButtonProps extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[button | submit | reset] = js.undefined
}

object IButtonProps {
  @scala.inline
  def apply(title: String = null, `type`: button | submit | reset = null): IButtonProps = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonProps]
  }
}

