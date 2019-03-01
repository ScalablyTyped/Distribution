package typings
package jsforceLib.salesforceDashObjectDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SObjectOptions extends js.Object {
  var ExtId__c: js.UndefOr[java.lang.String] = js.undefined
  var Id: js.UndefOr[jsforceLib.salesforceDashIdMod.SalesforceId] = js.undefined
  var Name: js.UndefOr[java.lang.String] = js.undefined
}

object SObjectOptions {
  @scala.inline
  def apply(
    ExtId__c: java.lang.String = null,
    Id: jsforceLib.salesforceDashIdMod.SalesforceId = null,
    Name: java.lang.String = null
  ): SObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (ExtId__c != null) __obj.updateDynamic("ExtId__c")(ExtId__c)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[SObjectOptions]
  }
}

