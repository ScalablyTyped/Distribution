package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofaliasDb extends js.Object {
  def lookup(stable: String): Double = js.native
  def lookup_ex(stable: String, sflags: String): Double = js.native
}

object TypeofaliasDb {
  @scala.inline
  def apply(lookup: String => Double, lookup_ex: (String, String) => Double): TypeofaliasDb = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), lookup_ex = js.Any.fromFunction2(lookup_ex))
    __obj.asInstanceOf[TypeofaliasDb]
  }
  @scala.inline
  implicit class TypeofaliasDbOps[Self <: TypeofaliasDb] (val x: Self) extends AnyVal {
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
    def setLookup(value: String => Double): Self = this.set("lookup", js.Any.fromFunction1(value))
    @scala.inline
    def setLookup_ex(value: (String, String) => Double): Self = this.set("lookup_ex", js.Any.fromFunction2(value))
  }
  
}

