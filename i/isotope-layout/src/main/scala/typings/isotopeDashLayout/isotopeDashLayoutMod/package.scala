package typings.isotopeDashLayout

import org.scalablytyped.runtime.StringDictionary
import typings.isotopeDashLayout.isotopeDashLayoutMod.Global.JQuery
import typings.std.HTMLElement
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object isotopeDashLayoutMod {
  type Elements = js.Array[HTMLElement] | HTMLElement | JQuery | NodeList
  type SortOrder = StringDictionary[Boolean]
  type Sorter = StringDictionary[(js.Function1[/* itemElm */ JQuery, Double | String]) | String]
  type Style = StringDictionary[Double | String]
}
