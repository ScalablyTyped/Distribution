package typings.graphqlDepthLimit.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ignore: js.Array[String | RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])] = js.native
}

object Options {
  @scala.inline
  def apply(ignore: js.Array[String | RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])]): Options = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setIgnoreVarargs(value: (String | RegExp | (js.Function1[/* queryDepths */ js.Array[js.Any], Boolean]))*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: js.Array[String | RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])]): Self = this.set("ignore", value.asInstanceOf[js.Any])
  }
  
}

