package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [`header`](/docs/hosting/full-config#headers) defines custom headers to
  * add to a response should the request URL path match the pattern.
  */
@js.native
trait SchemaHeader extends js.Object {
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.native
  /**
    * Required. The additional headers to add to the response.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaHeader {
  @scala.inline
  def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  @scala.inline
  implicit class SchemaHeaderOps[Self <: SchemaHeader] (val x: Self) extends AnyVal {
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
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

