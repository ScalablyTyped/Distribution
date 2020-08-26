package typings.graphqlToolsLoad.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlToolsLoad.loadTypedefsMod.LoadTypedefsOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TOptions] extends js.Object {
  var options: LoadTypedefsOptions[Partial[TOptions]] = js.native
  var pointerOptionMap: StringDictionary[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply[TOptions](options: LoadTypedefsOptions[Partial[TOptions]], pointerOptionMap: StringDictionary[js.Any]): Options[TOptions] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], pointerOptionMap = pointerOptionMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TOptions]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], TOptions] (val x: Self with Options[TOptions]) extends AnyVal {
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
    def setOptions(value: LoadTypedefsOptions[Partial[TOptions]]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointerOptionMap(value: StringDictionary[js.Any]): Self = this.set("pointerOptionMap", value.asInstanceOf[js.Any])
  }
  
}

