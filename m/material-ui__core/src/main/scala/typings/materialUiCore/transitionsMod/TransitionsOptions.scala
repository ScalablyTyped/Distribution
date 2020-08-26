package typings.materialUiCore.transitionsMod

import typings.materialUiCore.anon.PartialDuration
import typings.materialUiCore.anon.PartialEasing
import typings.materialUiCore.anon.Partialdurationnumberstri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ String | js.Array[String], 
      /* options */ js.UndefOr[Partialdurationnumberstri], 
      String
    ]
  ] = js.native
  var duration: js.UndefOr[PartialDuration] = js.native
  var easing: js.UndefOr[PartialEasing] = js.native
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.native
}

object TransitionsOptions {
  @scala.inline
  def apply(): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionsOptions]
  }
  @scala.inline
  implicit class TransitionsOptionsOps[Self <: TransitionsOptions] (val x: Self) extends AnyVal {
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
    def setCreate(
      value: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partialdurationnumberstri]) => String
    ): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDuration(value: PartialDuration): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: PartialEasing): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setGetAutoHeightDuration(value: /* height */ Double => Double): Self = this.set("getAutoHeightDuration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAutoHeightDuration: Self = this.set("getAutoHeightDuration", js.undefined)
  }
  
}

