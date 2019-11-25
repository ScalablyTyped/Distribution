package typings.jsforce.salesforceDashObjectDashOptionsMod

import typings.jsforce.salesforceDashIdMod.SalesforceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SObjectOptions extends js.Object {
  var ExtId__c: js.UndefOr[String] = js.undefined
  var Id: js.UndefOr[SalesforceId] = js.undefined
  var Name: js.UndefOr[String] = js.undefined
}

object SObjectOptions {
  @scala.inline
  def apply(ExtId__c: String = null, Id: SalesforceId = null, Name: String = null): SObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (ExtId__c != null) __obj.updateDynamic("ExtId__c")(ExtId__c.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SObjectOptions]
  }
}

