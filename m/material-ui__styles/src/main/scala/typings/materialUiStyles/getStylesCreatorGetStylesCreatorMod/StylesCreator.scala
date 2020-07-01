package typings.materialUiStyles.getStylesCreatorGetStylesCreatorMod

import typings.materialUiStyles.withStylesWithStylesMod.StyleRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesCreator[Theme, Props /* <: js.Object */, ClassKey /* <: String */] extends js.Object {
  var themingEnabled: Boolean
  def create(theme: Theme, name: String): StyleRules[Props, ClassKey]
}

object StylesCreator {
  @scala.inline
  def apply[Theme, /* <: js.Object */ Props, /* <: java.lang.String */ ClassKey](create: (Theme, String) => StyleRules[Props, ClassKey], themingEnabled: Boolean): StylesCreator[Theme, Props, ClassKey] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesCreator[Theme, Props, ClassKey]]
  }
}

