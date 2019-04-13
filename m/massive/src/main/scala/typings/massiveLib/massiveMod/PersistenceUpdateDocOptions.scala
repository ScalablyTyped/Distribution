package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceUpdateDocOptions extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
}

object PersistenceUpdateDocOptions {
  @scala.inline
  def apply(body: java.lang.String = null): PersistenceUpdateDocOptions = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[PersistenceUpdateDocOptions]
  }
}

