package typings.atJupyterlabApplication.libTokensMod.IRouter

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The specification for registering a route with the router.
  */
trait IRegisterOptions extends js.Object {
  /**
    * The command string that will be invoked upon matching.
    */
  var command: String
  /**
    * The regular expression that will be matched against URLs.
    */
  var pattern: RegExp
  /**
    * The rank order of the registered rule. A lower rank denotes a higher
    * priority. The default rank is `100`.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object IRegisterOptions {
  @scala.inline
  def apply(command: String, pattern: RegExp, rank: Int | Double = null): IRegisterOptions = {
    val __obj = js.Dynamic.literal(command = command, pattern = pattern)
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisterOptions]
  }
}

