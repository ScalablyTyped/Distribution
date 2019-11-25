package typings.jsforce.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailyApiRequests extends Limit {
  var `Chatter Desktop`: Limit
  var `Chatter Mobile for BlackBerry`: Limit
  var `Salesforce Files`: Limit
  var `Salesforce Marketing Cloud`: Limit
  var `Salesforce for Android`: Limit
  var `Salesforce for iOS`: Limit
  var SalesforceA: Limit
}

object DailyApiRequests {
  @scala.inline
  def apply(
    `Chatter Desktop`: Limit,
    `Chatter Mobile for BlackBerry`: Limit,
    Max: Double,
    Remaining: Double,
    `Salesforce Files`: Limit,
    `Salesforce Marketing Cloud`: Limit,
    `Salesforce for Android`: Limit,
    `Salesforce for iOS`: Limit,
    SalesforceA: Limit
  ): DailyApiRequests = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any], SalesforceA = SalesforceA.asInstanceOf[js.Any])
    __obj.updateDynamic("Chatter Desktop")(`Chatter Desktop`.asInstanceOf[js.Any])
    __obj.updateDynamic("Chatter Mobile for BlackBerry")(`Chatter Mobile for BlackBerry`.asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce Files")(`Salesforce Files`.asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce Marketing Cloud")(`Salesforce Marketing Cloud`.asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce for Android")(`Salesforce for Android`.asInstanceOf[js.Any])
    __obj.updateDynamic("Salesforce for iOS")(`Salesforce for iOS`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyApiRequests]
  }
}

