package typings.greasemonkey.GM

import org.scalablytyped.runtime.StringDictionary
import typings.greasemonkey.AnonMimetype
import typings.greasemonkey.greasemonkeyStrings.end
import typings.greasemonkey.greasemonkeyStrings.idle
import typings.greasemonkey.greasemonkeyStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptInfo extends js.Object {
  var description: String
  var excludes: js.Array[String]
  var includes: js.Array[String]
  var matches: js.Array[String]
  var name: String
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * An object keyed by resource name.
    * Each value is an object with keys `name` and `mimetype` and `url`
    * with string values.
    */
  var resources: StringDictionary[AnonMimetype]
  /** @default 'end' */
  var runAt: start | end | idle
  var uuid: String
  var version: String
}

object ScriptInfo {
  @scala.inline
  def apply(
    description: String,
    excludes: js.Array[String],
    includes: js.Array[String],
    matches: js.Array[String],
    name: String,
    resources: StringDictionary[AnonMimetype],
    runAt: start | end | idle,
    uuid: String,
    version: String,
    namespace: String = null
  ): ScriptInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptInfo]
  }
}

