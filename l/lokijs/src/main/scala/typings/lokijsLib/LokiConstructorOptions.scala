package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiConstructorOptions extends js.Object {
  var env: lokijsLib.lokijsLibStrings.NATIVESCRIPT | lokijsLib.lokijsLibStrings.NODEJS | lokijsLib.lokijsLibStrings.CORDOVA | lokijsLib.lokijsLibStrings.BROWSER | lokijsLib.lokijsLibStrings.NA
  var verbose: scala.Boolean
}

object LokiConstructorOptions {
  @scala.inline
  def apply(
    env: lokijsLib.lokijsLibStrings.NATIVESCRIPT | lokijsLib.lokijsLibStrings.NODEJS | lokijsLib.lokijsLibStrings.CORDOVA | lokijsLib.lokijsLibStrings.BROWSER | lokijsLib.lokijsLibStrings.NA,
    verbose: scala.Boolean
  ): LokiConstructorOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], verbose = verbose)
  
    __obj.asInstanceOf[LokiConstructorOptions]
  }
}

