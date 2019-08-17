package typings.atJupyterlabUiDashComponents.atJupyterlabUiDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IBPInputGroupProps * / any */ trait IInputGroupProps extends js.Object {
  var rightIcon: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
  ] = js.undefined
}

object IInputGroupProps {
  @scala.inline
  def apply(
    rightIcon: /* import warning: ImportType.apply Failed type conversion: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any = null
  ): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    __obj.asInstanceOf[IInputGroupProps]
  }
}

