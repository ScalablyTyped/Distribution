package typings.matchSorter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T] extends js.Object {
  var keepDiacritics: js.UndefOr[Boolean] = js.native
  var keys: js.UndefOr[js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], T] (val x: Self with Options[T]) extends AnyVal {
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
    def setKeepDiacritics(value: Boolean): Self = this.set("keepDiacritics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepDiacritics: Self = this.set("keepDiacritics", js.undefined)
    @scala.inline
    def setKeysVarargs(value: (KeyOptions[T] | ExtendedKeyOptions[T])*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

