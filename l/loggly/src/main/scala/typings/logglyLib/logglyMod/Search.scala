package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
  def run(callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, scala.Unit]): this.type
}

object Search {
  @scala.inline
  def apply(run: js.Function1[js.Function2[/* err */ js.Any, /* results */ SearchResults, scala.Unit], Search]): Search = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[Search]
  }
}

