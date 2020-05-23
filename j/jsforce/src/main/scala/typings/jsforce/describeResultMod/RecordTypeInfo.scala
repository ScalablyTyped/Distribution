package typings.jsforce.describeResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordTypeInfo extends js.Object {
  var available: Boolean
  var defaultRecordTypeMapping: Boolean
  var developerName: js.UndefOr[maybe[String]] = js.undefined
  var master: Boolean
  var name: String
  var recordTypeId: String
  var urls: Record[String, String]
}

object RecordTypeInfo {
  @scala.inline
  def apply(
    available: Boolean,
    defaultRecordTypeMapping: Boolean,
    master: Boolean,
    name: String,
    recordTypeId: String,
    urls: Record[String, String],
    developerName: js.UndefOr[Null | maybe[String]] = js.undefined
  ): RecordTypeInfo = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], defaultRecordTypeMapping = defaultRecordTypeMapping.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordTypeId = recordTypeId.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    if (!js.isUndefined(developerName)) __obj.updateDynamic("developerName")(developerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTypeInfo]
  }
}

