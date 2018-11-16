package typings
package gulpDashNodemonLib.gulpDashNodemonMod.nodemonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: Properties may be insufficient
// TODO: In future this interface should be moved to nodemon.d.ts

trait _Option extends js.Object {
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Debounce restart in seconds.
           */
  var delay: js.UndefOr[scala.Double] = js.undefined
  var env: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double]
  ] = js.undefined
  var events: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
           * Execute script with "app", ie. -x "python -v".
           */
  var exec: js.UndefOr[java.lang.String] = js.undefined
  var execMap: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Boolean | scala.Double]
  ] = js.undefined
  /**
           * Exit on crash, allows use of nodemon with daemon tools like forever.js.
           */
  var exitcrash: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Extensions to look for, ie. js,jade,hbs.
           */
  var ext: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Ignore specific files or directories.
           */
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Forces node to use the most compatible version for watching file changes.
           */
  var legacyWatch: js.UndefOr[scala.Boolean] = js.undefined
  var nodeArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Minimise nodemon messages to start/stop only.
           */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var restartable: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Execute script on change only, not startup
           */
  var runOnChangeOnly: js.UndefOr[scala.Boolean] = js.undefined
  var script: js.UndefOr[java.lang.String] = js.undefined
  var scriptPosition: js.UndefOr[scala.Double] = js.undefined
  /**
           * Try to read from stdin.
           */
  var stdin: js.UndefOr[scala.Boolean] = js.undefined
  var stdout: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Show detail on what is causing restarts.
           */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Watch directory "dir" or files. use once for each directory or file to watch.
           */
  var watch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

