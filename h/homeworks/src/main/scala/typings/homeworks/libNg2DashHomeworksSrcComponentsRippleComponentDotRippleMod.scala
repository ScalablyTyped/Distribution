package typings.homeworks

import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.Renderer2
import typings.homeworks.libNg2DashHomeworksSrcCoreManagerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("homeworks/lib/ng2-homeworks/src/components/ripple/component.ripple", JSImport.Namespace)
@js.native
object libNg2DashHomeworksSrcComponentsRippleComponentDotRippleMod extends js.Object {
  @js.native
  class WorksRipple protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    @JSName("$element")
    var $element: js.Any = js.native
    var elementRef: js.Any = js.native
    var ripple: String = js.native
    def ngOnInit(): Unit = js.native
  }
  
}

