package typings.jsData.dataStoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsData.simpleStoreMod.SimpleStoreOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataStoreOpts
  extends SimpleStoreOpts
     with /* customAttr */ StringDictionary[js.Any] {
  var collectionClass: js.UndefOr[js.Any] = js.native
  var linkRelations: js.UndefOr[Boolean] = js.native
  var mapperClass: js.UndefOr[js.Any] = js.native
  var scopes: js.UndefOr[js.Any] = js.native
  var unlinkOnDestroy: js.UndefOr[Boolean] = js.native
}

object DataStoreOpts {
  @scala.inline
  def apply(): DataStoreOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataStoreOpts]
  }
  @scala.inline
  implicit class DataStoreOptsOps[Self <: DataStoreOpts] (val x: Self) extends AnyVal {
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
    def setCollectionClass(value: js.Any): Self = this.set("collectionClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionClass: Self = this.set("collectionClass", js.undefined)
    @scala.inline
    def setLinkRelations(value: Boolean): Self = this.set("linkRelations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkRelations: Self = this.set("linkRelations", js.undefined)
    @scala.inline
    def setMapperClass(value: js.Any): Self = this.set("mapperClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapperClass: Self = this.set("mapperClass", js.undefined)
    @scala.inline
    def setScopes(value: js.Any): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    @scala.inline
    def setUnlinkOnDestroy(value: Boolean): Self = this.set("unlinkOnDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlinkOnDestroy: Self = this.set("unlinkOnDestroy", js.undefined)
  }
  
}

