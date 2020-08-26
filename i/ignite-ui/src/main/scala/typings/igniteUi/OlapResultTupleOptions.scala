package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlapResultTupleOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Optional="false" array of $.ig.OlapResultAxisMember objects which form the tuple object.
    */
  var members: js.UndefOr[js.Array[_]] = js.native
}

object OlapResultTupleOptions {
  @scala.inline
  def apply(): OlapResultTupleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultTupleOptions]
  }
  @scala.inline
  implicit class OlapResultTupleOptionsOps[Self <: OlapResultTupleOptions] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: js.Any*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[_]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
  }
  
}

