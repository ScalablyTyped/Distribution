package typings.homeworks

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/tab/main", JSImport.Namespace)
@js.native
object tabMainMod extends js.Object {
  @js.native
  class WorksTab protected ()
    extends typings.homeworks.componentTabMod.WorksTab {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
  }
  
  @js.native
  class WorksTabItem protected ()
    extends typings.homeworks.componentTabMod.WorksTabItem {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
  }
  
  @js.native
  class WorksTabTitle protected ()
    extends typings.homeworks.componentTabMod.WorksTabTitle {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
  }
  
}

