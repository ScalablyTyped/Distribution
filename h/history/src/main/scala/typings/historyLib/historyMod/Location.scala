package typings
package historyLib.historyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location[S] extends js.Object {
  var hash: Hash
  var key: js.UndefOr[LocationKey] = js.undefined
  var pathname: Pathname
  var search: Search
  var state: S
}

