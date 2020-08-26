package typings.hexoUtil.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictindex
  extends /* index */ NumberDictionary[js.Any]
     with /* name */ StringDictionary[js.Any] {
  var `0`: String = js.native
}

object Dictindex {
  @scala.inline
  def apply(`0`: String): Dictindex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex] (val x: Self) extends AnyVal {
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
    def set0(value: String): Self = this.set("0", value.asInstanceOf[js.Any])
  }
  
}

