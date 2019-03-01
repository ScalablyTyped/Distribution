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
    val __obj = js.Dynamic.literal(`Chatter Desktop` = `Chatter Desktop`, `Chatter Mobile for BlackBerry` = `Chatter Mobile for BlackBerry`, `Salesforce Files` = `Salesforce Files`, `Salesforce Marketing Cloud` = `Salesforce Marketing Cloud`, `Salesforce for Android` = `Salesforce for Android`, `Salesforce for iOS` = `Salesforce for iOS`)
    __obj.updateDynamic("Max")(Max)
    __obj.updateDynamic("Remaining")(Remaining)
    __obj.updateDynamic("SalesforceA")(SalesforceA)
    __obj.asInstanceOf[DailyApiRequests]
  }
}

