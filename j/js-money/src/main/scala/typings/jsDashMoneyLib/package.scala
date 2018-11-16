package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashMoneyLib {
  type RoundFunction = js.Function1[/* num */ scala.Double, scala.Double]
  type Rounders = jsDashMoneyLib.jsDashMoneyLibStrings.round | jsDashMoneyLib.jsDashMoneyLibStrings.floor | jsDashMoneyLib.jsDashMoneyLibStrings.ceil
}
