package typings.jupyterlabUiComponents.blueprintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBPInputGroupProps * / any */ @js.native
trait IInputGroupProps extends js.Object {
  
  var rightIcon: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
  ] = js.native
}
object IInputGroupProps {
  
  @scala.inline
  def apply(): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInputGroupProps]
  }
  
  @scala.inline
  implicit class IInputGroupPropsOps[Self <: IInputGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRightIcon(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIconProps * / any['icon'] */ js.Any
    ): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
  }
}
