package typings
package atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait IButtonProps extends js.Object {
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsLibStrings.button | atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsLibStrings.submit | atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsLibStrings.reset
  ] = js.undefined
}

object IButtonProps {
  @scala.inline
  def apply(
    title: java.lang.String = null,
    `type`: atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsLibStrings.button | atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsLibStrings.submit | atJupyterlabUiDashComponentsLib.atJupyterlabUiDashComponentsLibStrings.reset = null
  ): IButtonProps = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonProps]
  }
}

