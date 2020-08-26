package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the publisher.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher extends js.Object {
  /**
    * The name of this publisher. For instance, &quot;Awesome Fact
    * Checks&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Host-level site name, without the protocol or &quot;www&quot; prefix. For
    * instance, &quot;awesomefactchecks.com&quot;. This value of this field is
    * based purely on the claim review URL.
    */
  var site: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1PublisherOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Publisher] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSite(value: String): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
  }
  
}

