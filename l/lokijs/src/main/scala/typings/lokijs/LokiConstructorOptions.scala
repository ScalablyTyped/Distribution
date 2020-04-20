package typings.lokijs

import typings.lokijs.lokijsStrings.BROWSER
import typings.lokijs.lokijsStrings.CORDOVA
import typings.lokijs.lokijsStrings.NA
import typings.lokijs.lokijsStrings.NATIVESCRIPT
import typings.lokijs.lokijsStrings.NODEJS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LokiConstructorOptions extends js.Object {
  var env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA
  var verbose: Boolean
}

object LokiConstructorOptions {
  @scala.inline
  def apply(env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA, verbose: Boolean): LokiConstructorOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiConstructorOptions]
  }
}

