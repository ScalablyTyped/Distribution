package typings.massive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecomposeOptions
  extends /* foreignTable */ StringDictionary[DecomposeOptions | js.Any] {
  var columns: js.UndefOr[js.Array[String] | AnyObject[String]] = js.native
  var pk: String = js.native
}

object DecomposeOptions {
  @scala.inline
  def apply(pk: String): DecomposeOptions = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeOptions]
  }
  @scala.inline
  implicit class DecomposeOptionsOps[Self <: DecomposeOptions] (val x: Self) extends AnyVal {
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
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[String] | AnyObject[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
  }
  
}

