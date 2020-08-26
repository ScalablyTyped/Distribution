package typings.matterJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.matterJs.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uses
  extends /* _ */ StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.native
}

object Uses {
  @scala.inline
  def apply(): Uses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uses]
  }
  @scala.inline
  implicit class UsesOps[Self <: Uses] (val x: Self) extends AnyVal {
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
    def setUsesVarargs(value: (Plugin | String)*): Self = this.set("uses", js.Array(value :_*))
    @scala.inline
    def setUses(value: js.Array[Plugin | String]): Self = this.set("uses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUses: Self = this.set("uses", js.undefined)
  }
  
}

