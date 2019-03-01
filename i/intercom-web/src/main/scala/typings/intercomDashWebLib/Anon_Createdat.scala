package typings
package intercomDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Createdat
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var created_at: scala.Double
  var id: java.lang.String | scala.Double
  var monthly_spend: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var plan: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Createdat {
  @scala.inline
  def apply(
    created_at: scala.Double,
    id: java.lang.String | scala.Double,
    name: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    monthly_spend: scala.Int | scala.Double = null,
    plan: java.lang.String = null
  ): Anon_Createdat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (monthly_spend != null) __obj.updateDynamic("monthly_spend")(monthly_spend.asInstanceOf[js.Any])
    if (plan != null) __obj.updateDynamic("plan")(plan)
    __obj.asInstanceOf[Anon_Createdat]
  }
}

