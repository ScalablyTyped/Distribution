package typings
package jestDashCliLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: org.scalablytyped.runtime.StringDictionary[js.Any]
  var path: java.lang.String
}

object Anon_Config {
  @scala.inline
  def apply(config: org.scalablytyped.runtime.StringDictionary[js.Any], path: java.lang.String): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Config]
  }
}

