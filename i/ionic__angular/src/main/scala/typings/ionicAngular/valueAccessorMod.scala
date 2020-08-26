package typings.ionicAngular

import typings.angularCore.mod.AfterViewInit
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.angularCore.mod.OnDestroy
import typings.angularForms.mod.ControlValueAccessor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/control-value-accessors/value-accessor", JSImport.Namespace)
@js.native
object valueAccessorMod extends js.Object {
  @js.native
  class ValueAccessor protected ()
    extends ControlValueAccessor
       with AfterViewInit
       with OnDestroy {
    def this(injector: Injector, el: ElementRef[_]) = this()
    var el: ElementRef[_] = js.native
    var injector: Injector = js.native
    var lastValue: js.Any = js.native
    var onChange: js.Any = js.native
    var onTouched: js.Any = js.native
    var statusChanges: js.Any = js.native
    def _handleBlurEvent(el: js.Any): Unit = js.native
    def handleChangeEvent(el: HTMLElement, value: js.Any): Unit = js.native
    def registerOnChange(fn: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
    @JSName("setDisabledState")
    def setDisabledState_MValueAccessor(isDisabled: Boolean): Unit = js.native
  }
  
  def setIonicClasses(element: ElementRef[_]): Unit = js.native
}

