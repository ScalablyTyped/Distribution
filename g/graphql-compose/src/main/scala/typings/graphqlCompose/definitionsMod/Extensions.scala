package typings.graphqlCompose.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extensions
  extends /* opt */ StringDictionary[js.Any] {
  var directives: js.UndefOr[js.Array[ExtensionsDirective]] = js.native
}

object Extensions {
  @scala.inline
  def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  @scala.inline
  implicit class ExtensionsOps[Self <: Extensions] (val x: Self) extends AnyVal {
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
    def setDirectivesVarargs(value: ExtensionsDirective*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[ExtensionsDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
  }
  
}

