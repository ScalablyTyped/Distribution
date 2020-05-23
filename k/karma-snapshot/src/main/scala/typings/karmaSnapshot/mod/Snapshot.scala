package typings.karmaSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * details about snapshot.
  */
trait Snapshot extends js.Object {
  /**
    * snapshot value that will be checked by an assertion plugin
    */
  var code: String
  /**
    * Flag that should be marked by an assertion plugin when it updates or adds a new snapshot
    */
  var dirty: js.UndefOr[Boolean] = js.undefined
  /**
    * which language should be used in a markdown format to improve readability
    */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * Flag that should be marked by an assertion plugin when it visits suites and snapshots.
    * Visited flags are used to automatically prune removed snapshots
    */
  var visited: js.UndefOr[Boolean] = js.undefined
}

object Snapshot {
  @scala.inline
  def apply(
    code: String,
    dirty: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    visited: js.UndefOr[Boolean] = js.undefined
  ): Snapshot = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

