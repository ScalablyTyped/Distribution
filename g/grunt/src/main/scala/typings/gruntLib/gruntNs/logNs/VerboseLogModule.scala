package typings
package gruntLib.gruntNs.logNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @note all methods available under grunt.verbose work exactly like grunt.log methods,
         *       but only log if the --verbose command-line option was specified.
         */

trait VerboseLogModule extends CommonLogging[VerboseLogModule] {
  var or: NotVerboseLogModule
}

