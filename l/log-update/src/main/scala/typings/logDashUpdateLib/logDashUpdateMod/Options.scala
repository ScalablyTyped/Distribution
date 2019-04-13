package typings
package logDashUpdateLib.logDashUpdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Show the cursor. This can be useful when a CLI accepts input from a user.
  		@example
  		```
  		import logUpdate = require('log-update');
  		// Write output but don't hide the cursor
  		const log = logUpdate.create(process.stdout, {
  			showCursor: true
  		});
  		```
  		*/
  val showCursor: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(showCursor: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCursor)) __obj.updateDynamic("showCursor")(showCursor)
    __obj.asInstanceOf[Options]
  }
}

