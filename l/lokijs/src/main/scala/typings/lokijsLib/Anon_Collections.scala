package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collections extends js.Object {
  var collections: js.Array[Collection[_]]
  var databaseVersion: scala.Double
  var name: js.UndefOr[java.lang.String] = js.undefined
  var throttledSaves: scala.Boolean
}

object Anon_Collections {
  @scala.inline
  def apply(
    collections: js.Array[Collection[_]],
    databaseVersion: scala.Double,
    throttledSaves: scala.Boolean,
    name: java.lang.String = null
  ): Anon_Collections = {
    val __obj = js.Dynamic.literal(collections = collections, databaseVersion = databaseVersion, throttledSaves = throttledSaves)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Collections]
  }
}

