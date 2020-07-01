package typings.ionicAngular

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.ionicAngular.valueAccessorMod.ValueAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/control-value-accessors/boolean-value-accessor", JSImport.Namespace)
@js.native
object booleanValueAccessorMod extends js.Object {
  @js.native
  class BooleanValueAccessor protected () extends ValueAccessor {
    def this(injector: Injector, el: ElementRef[_]) = this()
    def _handleIonChange(el: js.Any): Unit = js.native
  }
  
}

