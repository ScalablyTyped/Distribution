package typings.lokijs.anon

import typings.lokijs.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collections extends js.Object {
  var collections: js.Array[Collection[_]] = js.native
  var databaseVersion: Double = js.native
  var name: js.UndefOr[String] = js.native
  var throttledSaves: Boolean = js.native
}

object Collections {
  @scala.inline
  def apply(collections: js.Array[Collection[_]], databaseVersion: Double, throttledSaves: Boolean): Collections = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], databaseVersion = databaseVersion.asInstanceOf[js.Any], throttledSaves = throttledSaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collections]
  }
  @scala.inline
  implicit class CollectionsOps[Self <: Collections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectionsVarargs(value: Collection[js.Any]*): Self = this.set("collections", js.Array(value :_*))
    @scala.inline
    def setCollections(value: js.Array[Collection[_]]): Self = this.set("collections", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseVersion(value: Double): Self = this.set("databaseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = this.set("throttledSaves", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

