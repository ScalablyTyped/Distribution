package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * These are valid for compact-format
         */

trait IExpandedFilesConfig extends IFilesConfig {
  /**
               * Replace any existing extension with this value in generated {@link IExpandedFilesConfig.dest} paths.
               */
  var ext: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Remove all path parts from generated {@link IExpandedFilesConfig.dest} paths.
               */
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * This function is called for each matched src file, (after extension renaming and flattening).
               * The {@link IExpandedFilesConfig.dest} and matched {@link IExpandedFilesConfig.src} path are passed in,
               * and this function must return a new dest value.
               * If the same dest is returned more than once, each src which used it will be added to an array of sources for it.
               */
  var rename: js.UndefOr[js.Function] = js.undefined
}

