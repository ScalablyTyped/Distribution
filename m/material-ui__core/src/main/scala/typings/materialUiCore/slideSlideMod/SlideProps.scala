package typings.materialUiCore.slideSlideMod

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.materialUiCoreStrings.down
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.up
import typings.materialUiCore.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideProps extends TransitionProps {
  var direction: left | right | up | down = js.native
  var theme: js.UndefOr[Theme] = js.native
}

object SlideProps {
  @scala.inline
  def apply(direction: left | right | up | down): SlideProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideProps]
  }
  @scala.inline
  implicit class SlidePropsOps[Self <: SlideProps] (val x: Self) extends AnyVal {
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
    def setDirection(value: left | right | up | down): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

