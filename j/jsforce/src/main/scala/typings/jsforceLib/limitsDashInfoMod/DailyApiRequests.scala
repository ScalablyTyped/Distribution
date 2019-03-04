package typings
package jsforceLib.limitsDashInfoMod

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
    Max: scala.Double,
    Remaining: scala.Double,
    `Salesforce Files`: Limit,
    `Salesforce Marketing Cloud`: Limit,
    `Salesforce for Android`: Limit,
    `Salesforce for iOS`: Limit,
    SalesforceA: Limit
  ): DailyApiRequests = {
    val __obj = js.Dynamic.literal(Max = Max, Remaining = Remaining, SalesforceA = SalesforceA)
    __obj.updateDynamic("Chatter Desktop")(`Chatter Desktop`)
    __obj.updateDynamic("Chatter Mobile for BlackBerry")(`Chatter Mobile for BlackBerry`)
    __obj.updateDynamic("Salesforce Files")(`Salesforce Files`)
    __obj.updateDynamic("Salesforce Marketing Cloud")(`Salesforce Marketing Cloud`)
    __obj.updateDynamic("Salesforce for Android")(`Salesforce for Android`)
    __obj.updateDynamic("Salesforce for iOS")(`Salesforce for iOS`)
    __obj.asInstanceOf[DailyApiRequests]
  }
}

