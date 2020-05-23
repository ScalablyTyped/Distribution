package typings.materialUiCore.withStylesMod

import typings.materialUiCore.anon.Index
import typings.materialUiCore.createMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesCreator extends js.Object {
  var options: Index = js.native
  var themingEnabled: Boolean = js.native
  def create(theme: Theme, name: String): StyleRules[String] = js.native
}

object StylesCreator {
  @scala.inline
  def apply(create: (Theme, String) => StyleRules[String], options: Index, themingEnabled: Boolean): StylesCreator = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesCreator]
  }
}

