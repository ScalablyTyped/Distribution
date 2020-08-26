package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPageGenerator extends js.Object {
  def generate[T](pagedObservable: KnockoutPagedObservableArray[T]): js.Array[Double] = js.native
}

object KnockoutPageGenerator {
  @scala.inline
  def apply(generate: KnockoutPagedObservableArray[js.Any] => js.Array[Double]): KnockoutPageGenerator = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[KnockoutPageGenerator]
  }
  @scala.inline
  implicit class KnockoutPageGeneratorOps[Self <: KnockoutPageGenerator] (val x: Self) extends AnyVal {
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
    def setGenerate(value: KnockoutPagedObservableArray[js.Any] => js.Array[Double]): Self = this.set("generate", js.Any.fromFunction1(value))
  }
  
}

