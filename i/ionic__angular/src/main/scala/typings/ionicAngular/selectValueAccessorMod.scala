package typings.ionicAngular

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.ionicAngular.valueAccessorMod.ValueAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/control-value-accessors/select-value-accessor", JSImport.Namespace)
@js.native
object selectValueAccessorMod extends js.Object {
  
  @js.native
  class SelectValueAccessor protected () extends ValueAccessor {
    def this(injector: Injector, el: ElementRef[_]) = this()
    
    def _handleChangeEvent(el: js.Any): Unit = js.native
  }
}
