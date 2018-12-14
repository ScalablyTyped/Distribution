package typings
package htmlDashPdfLib.htmlDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateOptions extends js.Object {
  // Rendering options
  var base: js.UndefOr[java.lang.String] = js.undefined
  // Page options
  var border: js.UndefOr[java.lang.String | htmlDashPdfLib.Anon_Bottom] = js.undefined
  // Export options
  var directory: js.UndefOr[java.lang.String] = js.undefined
  var footer: js.UndefOr[htmlDashPdfLib.Anon_HeightContents] = js.undefined
  var format: js.UndefOr[
    htmlDashPdfLib.htmlDashPdfLibStrings.A3 | htmlDashPdfLib.htmlDashPdfLibStrings.A4 | htmlDashPdfLib.htmlDashPdfLibStrings.A5 | htmlDashPdfLib.htmlDashPdfLibStrings.Legal | htmlDashPdfLib.htmlDashPdfLibStrings.Letter | htmlDashPdfLib.htmlDashPdfLibStrings.Tabloid
  ] = js.undefined
  var header: js.UndefOr[htmlDashPdfLib.Anon_Height] = js.undefined
  // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
  var height: js.UndefOr[java.lang.String] = js.undefined
  // HTTP Headers that are used for requests
  var httpHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var orientation: js.UndefOr[
    htmlDashPdfLib.htmlDashPdfLibStrings.portrait | htmlDashPdfLib.htmlDashPdfLibStrings.landscape
  ] = js.undefined
  var phantomArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Script options
  var phantomPath: js.UndefOr[java.lang.String] = js.undefined
  var quality: js.UndefOr[java.lang.String] = js.undefined
  var script: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  // File options
  var `type`: js.UndefOr[
    htmlDashPdfLib.htmlDashPdfLibStrings.png | htmlDashPdfLib.htmlDashPdfLibStrings.jpeg | htmlDashPdfLib.htmlDashPdfLibStrings.pdf
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
  // Zooming option, can be used to scale images if `options.type` is not pdf
  var zoomFactor: js.UndefOr[java.lang.String] = js.undefined
}

