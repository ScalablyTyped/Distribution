package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofuacRedirect extends js.Object {
  def get_redirects(max_c: Double, max_b: Double): Double = js.native
  def get_redirects_acc(max_c: Double, max_b: Double, reason: String): Double = js.native
  def get_redirects_all(): Double = js.native
}

object TypeofuacRedirect {
  @scala.inline
  def apply(
    get_redirects: (Double, Double) => Double,
    get_redirects_acc: (Double, Double, String) => Double,
    get_redirects_all: () => Double
  ): TypeofuacRedirect = {
    val __obj = js.Dynamic.literal(get_redirects = js.Any.fromFunction2(get_redirects), get_redirects_acc = js.Any.fromFunction3(get_redirects_acc), get_redirects_all = js.Any.fromFunction0(get_redirects_all))
    __obj.asInstanceOf[TypeofuacRedirect]
  }
  @scala.inline
  implicit class TypeofuacRedirectOps[Self <: TypeofuacRedirect] (val x: Self) extends AnyVal {
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
    def setGet_redirects(value: (Double, Double) => Double): Self = this.set("get_redirects", js.Any.fromFunction2(value))
    @scala.inline
    def setGet_redirects_acc(value: (Double, Double, String) => Double): Self = this.set("get_redirects_acc", js.Any.fromFunction3(value))
    @scala.inline
    def setGet_redirects_all(value: () => Double): Self = this.set("get_redirects_all", js.Any.fromFunction0(value))
  }
  
}

