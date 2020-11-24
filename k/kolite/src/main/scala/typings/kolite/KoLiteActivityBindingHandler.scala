package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ @js.native
trait KoLiteActivityBindingHandler extends js.Object {
  
  var defaultOptions: KoLiteActivityDefaultOptions = js.native
}
object KoLiteActivityBindingHandler {
  
  @scala.inline
  def apply(defaultOptions: KoLiteActivityDefaultOptions): KoLiteActivityBindingHandler = {
    val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoLiteActivityBindingHandler]
  }
  
  @scala.inline
  implicit class KoLiteActivityBindingHandlerOps[Self <: KoLiteActivityBindingHandler] (val x: Self) extends AnyVal {
    
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
    def setDefaultOptions(value: KoLiteActivityDefaultOptions): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
  }
}
