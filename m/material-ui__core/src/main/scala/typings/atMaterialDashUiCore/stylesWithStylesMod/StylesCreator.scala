package typings.atMaterialDashUiCore.stylesWithStylesMod

import typings.atMaterialDashUiCore.Anon_Index
import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesCreator extends js.Object {
  var options: Anon_Index
  var themingEnabled: Boolean
  def create(theme: Theme, name: String): StyleRules[String]
}

object StylesCreator {
  @scala.inline
  def apply(create: (Theme, String) => StyleRules[String], options: Anon_Index, themingEnabled: Boolean): StylesCreator = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StylesCreator]
  }
}

