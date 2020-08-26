package typings.jake.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictname
  extends /* name */ StringDictionary[js.Any] {
  var quiet: Boolean = js.native
}

object Dictname {
  @scala.inline
  def apply(quiet: Boolean): Dictname = {
    val __obj = js.Dynamic.literal(quiet = quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
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
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
  }
  
}

