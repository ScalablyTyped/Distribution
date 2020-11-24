package typings.homeworks

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/components/checkbox/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  
  @js.native
  class WorksCheckbox protected ()
    extends typings.homeworks.componentCheckboxMod.WorksCheckbox {
    def this(renderer: Renderer2, changeDetectorRef: ChangeDetectorRef, elementRef: ElementRef[_]) = this()
  }
}
