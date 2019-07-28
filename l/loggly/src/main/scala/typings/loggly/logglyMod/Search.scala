package typings.loggly.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
  def run(callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]): this.type
}

object Search {
  @scala.inline
  def apply(run: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit] => Search): Search = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
  
    __obj.asInstanceOf[Search]
  }
}

