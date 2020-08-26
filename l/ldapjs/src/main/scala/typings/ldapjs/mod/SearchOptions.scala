package typings.ldapjs.mod

import typings.ldapjs.anon.PagePause
import typings.ldapjs.ldapjsStrings.base
import typings.ldapjs.ldapjsStrings.one
import typings.ldapjs.ldapjsStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  /** Defaults to the empty set, which means all attributes */
  var attributes: js.UndefOr[String | js.Array[String]] = js.native
  var derefAliases: js.UndefOr[Double] = js.native
  /**  Defaults to (objectclass=*) */
  var filter: js.UndefOr[String | Filter] = js.native
  var paged: js.UndefOr[Boolean | PagePause] = js.native
  /** Defaults to base */
  var scope: js.UndefOr[base | one | sub] = js.native
  /** Defaults to 0 (unlimited) */
  var sizeLimit: js.UndefOr[Double] = js.native
  /** Timeout in seconds. Defaults to 10. Lots of servers will ignore this! */
  var timeLimit: js.UndefOr[Double] = js.native
  var typesOnly: js.UndefOr[Boolean] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: String | js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setDerefAliases(value: Double): Self = this.set("derefAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDerefAliases: Self = this.set("derefAliases", js.undefined)
    @scala.inline
    def setFilter(value: String | Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPaged(value: Boolean | PagePause): Self = this.set("paged", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaged: Self = this.set("paged", js.undefined)
    @scala.inline
    def setScope(value: base | one | sub): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSizeLimit(value: Double): Self = this.set("sizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLimit: Self = this.set("sizeLimit", js.undefined)
    @scala.inline
    def setTimeLimit(value: Double): Self = this.set("timeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeLimit: Self = this.set("timeLimit", js.undefined)
    @scala.inline
    def setTypesOnly(value: Boolean): Self = this.set("typesOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypesOnly: Self = this.set("typesOnly", js.undefined)
  }
  
}

