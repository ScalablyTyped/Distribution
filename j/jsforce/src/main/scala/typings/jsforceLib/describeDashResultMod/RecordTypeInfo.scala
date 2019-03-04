package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordTypeInfo extends js.Object {
  var available: scala.Boolean
  var defaultRecordTypeMapping: scala.Boolean
  var developerName: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var master: scala.Boolean
  var name: java.lang.String
  var recordTypeId: java.lang.String
  var urls: stdLib.Record[java.lang.String, java.lang.String]
}

object RecordTypeInfo {
  @scala.inline
  def apply(
    available: scala.Boolean,
    defaultRecordTypeMapping: scala.Boolean,
    master: scala.Boolean,
    name: java.lang.String,
    recordTypeId: java.lang.String,
    urls: stdLib.Record[java.lang.String, java.lang.String],
    developerName: maybe[java.lang.String] = null
  ): RecordTypeInfo = {
    val __obj = js.Dynamic.literal(available = available, defaultRecordTypeMapping = defaultRecordTypeMapping, master = master, name = name, recordTypeId = recordTypeId, urls = urls)
    if (developerName != null) __obj.updateDynamic("developerName")(developerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTypeInfo]
  }
}

