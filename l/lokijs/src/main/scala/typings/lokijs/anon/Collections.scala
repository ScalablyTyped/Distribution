package typings.lokijs.anon

import typings.lokijs.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collections extends js.Object {
  var collections: js.Array[Collection[_]]
  var databaseVersion: Double
  var name: js.UndefOr[String] = js.undefined
  var throttledSaves: Boolean
}

object Collections {
  @scala.inline
  def apply(
    collections: js.Array[Collection[_]],
    databaseVersion: Double,
    throttledSaves: Boolean,
    name: String = null
  ): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], databaseVersion = databaseVersion.asInstanceOf[js.Any], throttledSaves = throttledSaves.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
}

