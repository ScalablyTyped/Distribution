package typings
package jszipLib.jszipMod.JSZipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSZipGeneratorOptions[T /* <: OutputType */] extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var compression: js.UndefOr[jszipLib.Compression] = js.undefined
  var compressionOptions: js.UndefOr[scala.Null | jszipLib.Anon_Level] = js.undefined
  var encodeFileName: js.UndefOr[js.Function1[/* filename */ java.lang.String, java.lang.String]] = js.undefined
  /**
           * mime-type for the generated file.
           * Useful when you need to generate a file with a different extension, ie: “.ods”.
           * @default 'application/zip'
           */
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  /** DOS (default) or UNIX */
  var platform: js.UndefOr[jszipLib.jszipLibStrings.DOS | jszipLib.jszipLibStrings.UNIX] = js.undefined
  /** Stream the files and create file descriptors */
  var streamFiles: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[T] = js.undefined
}

