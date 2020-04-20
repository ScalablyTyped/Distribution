package typings.i18next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranslation extends js.Object {
  var translation: StringDictionary[String]
}

object AnonTranslation {
  @scala.inline
  def apply(translation: StringDictionary[String]): AnonTranslation = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslation]
  }
}

