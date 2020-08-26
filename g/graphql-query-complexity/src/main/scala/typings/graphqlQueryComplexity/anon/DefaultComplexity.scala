package typings.graphqlQueryComplexity.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultComplexity extends js.Object {
  var defaultComplexity: js.UndefOr[Double] = js.native
}

object DefaultComplexity {
  @scala.inline
  def apply(): DefaultComplexity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultComplexity]
  }
  @scala.inline
  implicit class DefaultComplexityOps[Self <: DefaultComplexity] (val x: Self) extends AnyVal {
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
    def setDefaultComplexity(value: Double): Self = this.set("defaultComplexity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultComplexity: Self = this.set("defaultComplexity", js.undefined)
  }
  
}

