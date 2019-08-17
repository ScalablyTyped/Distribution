package typings.jsreportDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsreportDashCoreMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jsreportDashCore.jsreportDashCoreStrings.html
  import typings.jsreportDashCore.jsreportDashCoreStrings.none

  type Engine = none
  type Extension = js.Function2[/* reporter */ Reporter, /* definition */ js.Object, Unit]
  type Helpers = String | (StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]])
  type Recipe = html
}
