package typings.jestTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Global extends js.Object {
  var global: StringDictionary[Double]
}

object Global {
  @scala.inline
  def apply(global: StringDictionary[Double]): Global = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
}

