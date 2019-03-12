package typings
package atMaterialDashUiCoreLib.stylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesCreator extends js.Object {
  var options: atMaterialDashUiCoreLib.Anon_Index
  var themingEnabled: scala.Boolean
  def create(theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme, name: java.lang.String): StyleRules[java.lang.String]
}

object StylesCreator {
  @scala.inline
  def apply(
    create: (atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme, java.lang.String) => StyleRules[java.lang.String],
    options: atMaterialDashUiCoreLib.Anon_Index,
    themingEnabled: scala.Boolean
  ): StylesCreator = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), options = options, themingEnabled = themingEnabled)
  
    __obj.asInstanceOf[StylesCreator]
  }
}

