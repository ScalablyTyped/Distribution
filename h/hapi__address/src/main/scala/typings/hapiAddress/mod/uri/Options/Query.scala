package typings.hapiAddress.mod.uri.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  /**
    * Allow the use of [] in query parameters.
    * 
    * @default false
    */
  val allowQuerySquareBrackets: js.UndefOr[Boolean] = js.native
}

object Query {
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
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
    def setAllowQuerySquareBrackets(value: Boolean): Self = this.set("allowQuerySquareBrackets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowQuerySquareBrackets: Self = this.set("allowQuerySquareBrackets", js.undefined)
  }
  
}

