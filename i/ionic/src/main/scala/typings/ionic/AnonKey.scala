package typings.ionic

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var platforms: js.Array[String]
  var plugins: StringDictionary[js.Any]
}

object AnonKey {
  @scala.inline
  def apply(platforms: js.Array[String], plugins: StringDictionary[js.Any]): AnonKey = {
    val __obj = js.Dynamic.literal(platforms = platforms.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

