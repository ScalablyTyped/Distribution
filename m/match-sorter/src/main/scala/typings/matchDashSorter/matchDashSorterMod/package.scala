package typings.matchDashSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchDashSorterMod {
  import typings.matchDashSorter.Anon_Item
  import typings.matchDashSorter.Anon_MaxRanking
  import typings.matchDashSorter.Anon_MinRanking
  import typings.matchDashSorter.Anon_Threshold

  type ExtendedKeyOptions[T] = Anon_Item[T] with (Anon_MinRanking | Anon_MaxRanking | Anon_Threshold)
}
