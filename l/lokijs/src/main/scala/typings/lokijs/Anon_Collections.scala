package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collections extends js.Object {
  var collections: js.Array[Collection[_]]
  var databaseVersion: Double
  var name: js.UndefOr[String] = js.undefined
  var throttledSaves: Boolean
}

object Anon_Collections {
  @scala.inline
  def apply(
    collections: js.Array[Collection[_]],
    databaseVersion: Double,
    throttledSaves: Boolean,
    name: String = null
  ): Anon_Collections = {
    val __obj = js.Dynamic.literal(collections = collections, databaseVersion = databaseVersion, throttledSaves = throttledSaves)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Collections]
  }
}

