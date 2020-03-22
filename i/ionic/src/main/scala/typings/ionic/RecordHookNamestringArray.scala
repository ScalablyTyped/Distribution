package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<ionic.ionic/definitions.HookName, string | std.Array<string> | undefined> */
trait RecordHookNamestringArray extends js.Object {
  @JSName("build:after")
  var buildColonafter: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("build:before")
  var buildColonbefore: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("serve:after")
  var serveColonafter: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("serve:before")
  var serveColonbefore: js.UndefOr[String | js.Array[String]] = js.undefined
}

object RecordHookNamestringArray {
  @scala.inline
  def apply(
    buildColonafter: String | js.Array[String] = null,
    buildColonbefore: String | js.Array[String] = null,
    serveColonafter: String | js.Array[String] = null,
    serveColonbefore: String | js.Array[String] = null
  ): RecordHookNamestringArray = {
    val __obj = js.Dynamic.literal()
    if (buildColonafter != null) __obj.updateDynamic("build:after")(buildColonafter.asInstanceOf[js.Any])
    if (buildColonbefore != null) __obj.updateDynamic("build:before")(buildColonbefore.asInstanceOf[js.Any])
    if (serveColonafter != null) __obj.updateDynamic("serve:after")(serveColonafter.asInstanceOf[js.Any])
    if (serveColonbefore != null) __obj.updateDynamic("serve:before")(serveColonbefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordHookNamestringArray]
  }
}

