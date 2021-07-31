package typings.ionicAngular

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Injector
import typings.ionicAngular.valueAccessorMod.ValueAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numericValueAccesssorMod {
  
  @JSImport("@ionic/angular/directives/control-value-accessors/numeric-value-accesssor", "NumericValueAccessor")
  @js.native
  class NumericValueAccessor protected () extends ValueAccessor {
    def this(injector: Injector, el: ElementRef[js.Any]) = this()
    
    def _handleIonChange(el: js.Any): Unit = js.native
  }
}
