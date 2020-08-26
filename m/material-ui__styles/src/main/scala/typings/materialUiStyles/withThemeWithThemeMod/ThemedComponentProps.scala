package typings.materialUiStyles.withThemeWithThemeMod

import typings.materialUiStyles.defaultThemeMod.DefaultTheme
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<@material-ui/styles.@material-ui/styles/defaultTheme.DefaultTheme>> */
@js.native
trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[Ref[_]] = js.native
  var ref: js.UndefOr[Ref[_]] = js.native
  var theme: js.UndefOr[DefaultTheme] = js.native
}

object ThemedComponentProps {
  @scala.inline
  def apply(): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemedComponentProps]
  }
  @scala.inline
  implicit class ThemedComponentPropsOps[Self <: ThemedComponentProps] (val x: Self) extends AnyVal {
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
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setTheme(value: DefaultTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

