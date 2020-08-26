package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s name.
  */
@js.native
trait SchemaName extends js.Object {
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer&#39;s account or the &lt;code&gt;Accept-Language&lt;/code&gt;
    * HTTP header.
    */
  var displayName: js.UndefOr[String] = js.native
}

object SchemaName {
  @scala.inline
  def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  @scala.inline
  implicit class SchemaNameOps[Self <: SchemaName] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
  
}

