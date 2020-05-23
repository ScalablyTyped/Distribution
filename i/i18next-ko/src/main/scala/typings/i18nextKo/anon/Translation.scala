package typings.i18nextKo.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translation extends js.Object {
  var translation: StringDictionary[String]
}

object Translation {
  @scala.inline
  def apply(translation: StringDictionary[String]): Translation = {
    val __obj = js.Dynamic.literal(translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
}

