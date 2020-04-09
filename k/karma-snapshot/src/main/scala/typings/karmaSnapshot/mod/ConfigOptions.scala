package typings.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * See {@link https://github.com/localvoid/karma-snapshot#config}
    */
  var snapshot: js.UndefOr[SnapshotOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(snapshot: SnapshotOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

