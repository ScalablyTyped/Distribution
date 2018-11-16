package typings
package jszipLib.jszipMod.JSZipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSZipFileOptions extends js.Object {
  /** Set to `true` if the data is `base64` encoded. For example image data from a `<canvas>` element. Plain text and HTML do not need this option. */
  var base64: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set to `true` if the data should be treated as raw content, `false` if this is a text. If `base64` is used,
           * this defaults to `true`, if the data is not a `string`, this will be set to `true`.
           */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var compression: js.UndefOr[java.lang.String] = js.undefined
  /** Set to `true` if folders in the file path should be automatically created, otherwise there will only be virtual folders that represent the path to the file. */
  var createFolders: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The last modification date, defaults to the current date.
           */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /** Set to `true` if this is a directory and content should be ignored. */
  var dir: js.UndefOr[scala.Boolean] = js.undefined
  /** 6 bits number. The DOS permissions of the file, if any. */
  var dosPermissions: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Set to `true` if (and only if) the input is a "binary string" and has already been prepared with a `0xFF` mask. */
  var optimizedBinaryString: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * 16 bits number. The UNIX permissions of the file, if any.
           * Also accepts a `string` representing the octal value: `"644"`, `"755"`, etc.
           */
  var unixPermissions: js.UndefOr[scala.Double | java.lang.String | scala.Null] = js.undefined
}

