package typings.homeworks

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/components/toggle/main", JSImport.Namespace)
@js.native
object toggleMainMod extends js.Object {
  
  @js.native
  class WorksToggle protected ()
    extends typings.homeworks.componentToggleMod.WorksToggle {
    def this(renderer: Renderer2, changeDetectorRef: ChangeDetectorRef, elementRef: ElementRef[_]) = this()
  }
}
