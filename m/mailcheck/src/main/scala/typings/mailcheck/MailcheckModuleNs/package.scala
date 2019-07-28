package typings.mailcheck

import typings.mailcheck.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MailcheckModuleNs {
  type IDistanceFunction = js.Function2[/* s1 */ String, /* s2 */ String, Double]
  type IEmpty = js.Function0[Unit]
  type IJQueryEmpty = js.Function1[/* element */ JQuery, Unit]
  type IJQuerySuggested = js.Function2[/* element */ JQuery, /* suggested */ ISuggestion, Unit]
  type ISuggestFunction = js.Function4[
    /* email */ String, 
    /* domains */ js.UndefOr[js.Array[String]], 
    /* topLevelDomains */ js.UndefOr[js.Array[String]], 
    /* distanceFunction */ js.UndefOr[IDistanceFunction], 
    Unit
  ]
  type ISuggested = js.Function1[/* suggested */ ISuggestion, Unit]
}
