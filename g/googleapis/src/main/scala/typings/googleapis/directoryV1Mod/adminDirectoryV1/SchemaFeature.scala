package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Feature object in Directory API.
  */
@js.native
trait SchemaFeature extends js.Object {
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the feature.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFeature {
  @scala.inline
  def apply(): SchemaFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeature]
  }
  @scala.inline
  implicit class SchemaFeatureOps[Self <: SchemaFeature] (val x: Self) extends AnyVal {
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
    def setEtags(value: String): Self = this.set("etags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtags: Self = this.set("etags", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

