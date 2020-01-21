package typings.jestTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlobal extends js.Object {
  var global: StringDictionary[Double]
}

object AnonGlobal {
  @scala.inline
  def apply(global: StringDictionary[Double]): AnonGlobal = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlobal]
  }
}

