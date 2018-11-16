package typings
package gruntLib.gruntNs.fileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * {@link http://gruntjs.com/configuring-tasks#files}
         */

trait IFilesConfig
  extends gruntLib.minimatchNs.IMinimatchOptions {
  /**
               * Patterns will be matched relative to this path, and all returned filepaths will
               * also be relative to this path.
               */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Destination path prefix.
               */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Process a dynamic src-dest file mapping,
               * @see {@link http://gruntjs.com/configuring-tasks#building-the-files-object-dynamically for more information.
              */
  var expand: js.UndefOr[scala.Boolean] = js.undefined
   // = false
  /**
               * Either a valid fs.Stats method name:
               * - isFile
               * - isDirectory
               * - isBlockDevice
               * - isCharacterDevice
               * - isSymbolicLink
               * - isFIFO
               * - isSocket
               *
               * or a function that is passed the matched src filepath and returns true or false.
               *
               * string
               * (src: string) => boolean
               */
  // filter?: string
  // filter?: (src: string) => boolean
  var filter: js.UndefOr[js.Any] = js.undefined
  /**
               * Pattern(s) to match, relative to the {@link IExpandedFilesConfig.cwd}.
               */
  var src: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

