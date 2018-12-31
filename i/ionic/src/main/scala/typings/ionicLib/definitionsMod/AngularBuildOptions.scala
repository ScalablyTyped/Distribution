package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularBuildOptions
  extends BuildOptions[ionicLib.ionicLibStrings.angular] {
  /**
    * The Angular architect configuration to use for builds.
    *
    * The `--prod` command line flag is a shortcut which translates to the
    * 'production' configuration.
    */
  var configuration: js.UndefOr[java.lang.String] = js.undefined
  var cordovaAssets: js.UndefOr[scala.Boolean] = js.undefined
  var sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
}

