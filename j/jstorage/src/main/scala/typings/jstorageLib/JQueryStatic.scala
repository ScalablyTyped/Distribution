package typings
package jstorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var jStorage: JStorageStatic
}

object JQueryStatic {
  @scala.inline
  def apply(jStorage: JStorageStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jStorage")(jStorage)
    __obj.asInstanceOf[JQueryStatic]
  }
}

