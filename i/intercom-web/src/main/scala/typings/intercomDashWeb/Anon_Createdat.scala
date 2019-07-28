package typings.intercomDashWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Createdat
  extends /* index */ StringDictionary[js.Any] {
  var created_at: Double
  var id: String | Double
  var monthly_spend: js.UndefOr[Double] = js.undefined
  var name: String
  var plan: js.UndefOr[String] = js.undefined
}

object Anon_Createdat {
  @scala.inline
  def apply(
    created_at: Double,
    id: String | Double,
    name: String,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    monthly_spend: Int | Double = null,
    plan: String = null
  ): Anon_Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id.asInstanceOf[js.Any], name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (monthly_spend != null) __obj.updateDynamic("monthly_spend")(monthly_spend.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan)
    __obj.asInstanceOf[Anon_Createdat]
  }
}

