package typings.i18nextKo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var translation: StringDictionary[String]
}

object AnonKey {
  @scala.inline
  def apply(translation: StringDictionary[String]): AnonKey = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

