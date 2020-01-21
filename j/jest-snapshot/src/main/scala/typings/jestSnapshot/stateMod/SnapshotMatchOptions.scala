package typings.jestSnapshot.stateMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMatchOptions extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var inlineSnapshot: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var received: js.Any
  var testName: String
}

object SnapshotMatchOptions {
  @scala.inline
  def apply(
    received: js.Any,
    testName: String,
    error: Error = null,
    inlineSnapshot: String = null,
    key: String = null
  ): SnapshotMatchOptions = {
    val __obj = js.Dynamic.literal(received = received.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (inlineSnapshot != null) __obj.updateDynamic("inlineSnapshot")(inlineSnapshot.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMatchOptions]
  }
}

