package typings
package greasemonkeyLib.GMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptInfo extends js.Object {
  var description: java.lang.String
  var excludes: js.Array[java.lang.String]
  var includes: js.Array[java.lang.String]
  var matches: js.Array[java.lang.String]
  var name: java.lang.String
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object keyed by resource name.
    * Each value is an object with keys `name` and `mimetype` and `url`
    * with string values.
    */
  var resources: org.scalablytyped.runtime.StringDictionary[greasemonkeyLib.Anon_Mimetype]
  /** @default 'end' */
  var runAt: greasemonkeyLib.greasemonkeyLibStrings.start | greasemonkeyLib.greasemonkeyLibStrings.end | greasemonkeyLib.greasemonkeyLibStrings.idle
  var uuid: java.lang.String
  var version: java.lang.String
}

object ScriptInfo {
  @scala.inline
  def apply(
    description: java.lang.String,
    excludes: js.Array[java.lang.String],
    includes: js.Array[java.lang.String],
    matches: js.Array[java.lang.String],
    name: java.lang.String,
    resources: org.scalablytyped.runtime.StringDictionary[greasemonkeyLib.Anon_Mimetype],
    runAt: greasemonkeyLib.greasemonkeyLibStrings.start | greasemonkeyLib.greasemonkeyLibStrings.end | greasemonkeyLib.greasemonkeyLibStrings.idle,
    uuid: java.lang.String,
    version: java.lang.String,
    namespace: java.lang.String = null
  ): ScriptInfo = {
    val __obj = js.Dynamic.literal(description = description, excludes = excludes, includes = includes, matches = matches, name = name, resources = resources, runAt = runAt.asInstanceOf[js.Any], uuid = uuid, version = version)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[ScriptInfo]
  }
}

