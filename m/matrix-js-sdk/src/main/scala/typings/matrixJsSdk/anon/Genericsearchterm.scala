package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Genericsearchterm extends js.Object {
  //  Filter parameters
  var generic_search_term: String = js.native
}

object Genericsearchterm {
  @scala.inline
  def apply(generic_search_term: String): Genericsearchterm = {
    val __obj = js.Dynamic.literal(generic_search_term = generic_search_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genericsearchterm]
  }
  @scala.inline
  implicit class GenericsearchtermOps[Self <: Genericsearchterm] (val x: Self) extends AnyVal {
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
    def setGeneric_search_term(value: String): Self = this.set("generic_search_term", value.asInstanceOf[js.Any])
  }
  
}

