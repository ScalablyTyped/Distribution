package typings.jupyterlabUiComponents.blueprintMod

import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.button
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.reset
import typings.jupyterlabUiComponents.jupyterlabUiComponentsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPButtonProps * / any */ trait IButtonProps extends js.Object {
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[button | submit | reset] = js.undefined
}

object IButtonProps {
  @scala.inline
  def apply(title: String = null, `type`: button | submit | reset = null): IButtonProps = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonProps]
  }
}

