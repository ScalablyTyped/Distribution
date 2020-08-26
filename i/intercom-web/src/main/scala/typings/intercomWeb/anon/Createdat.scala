package typings.intercomWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Createdat extends js.Object {
  var created_at: js.UndefOr[Double] = js.native
  var id: String | Double = js.native
  var industry: js.UndefOr[String] = js.native
  var monthly_spend: js.UndefOr[Double] = js.native
  var name: String = js.native
  var plan: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var user_count: js.UndefOr[Double] = js.native
  var website: js.UndefOr[String] = js.native
}

object Createdat {
  @scala.inline
  def apply(id: String | Double, name: String): Createdat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
  @scala.inline
  implicit class CreatedatOps[Self <: Createdat] (val x: Self) extends AnyVal {
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
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Double): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setIndustry(value: String): Self = this.set("industry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndustry: Self = this.set("industry", js.undefined)
    @scala.inline
    def setMonthly_spend(value: Double): Self = this.set("monthly_spend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthly_spend: Self = this.set("monthly_spend", js.undefined)
    @scala.inline
    def setPlan(value: String): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUser_count(value: Double): Self = this.set("user_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_count: Self = this.set("user_count", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

