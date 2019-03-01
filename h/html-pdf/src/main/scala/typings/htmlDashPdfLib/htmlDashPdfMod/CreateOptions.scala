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
  var footer: js.UndefOr[htmlDashPdfLib.Anon_ContentsHeight] = js.undefined
  var format: js.UndefOr[
    htmlDashPdfLib.htmlDashPdfLibStrings.A3 | htmlDashPdfLib.htmlDashPdfLibStrings.A4 | htmlDashPdfLib.htmlDashPdfLibStrings.A5 | htmlDashPdfLib.htmlDashPdfLibStrings.Legal | htmlDashPdfLib.htmlDashPdfLibStrings.Letter | htmlDashPdfLib.htmlDashPdfLibStrings.Tabloid
  ] = js.undefined
  var header: js.UndefOr[htmlDashPdfLib.Anon_Contents] = js.undefined
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

object CreateOptions {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    border: java.lang.String | htmlDashPdfLib.Anon_Bottom = null,
    directory: java.lang.String = null,
    footer: htmlDashPdfLib.Anon_ContentsHeight = null,
    format: htmlDashPdfLib.htmlDashPdfLibStrings.A3 | htmlDashPdfLib.htmlDashPdfLibStrings.A4 | htmlDashPdfLib.htmlDashPdfLibStrings.A5 | htmlDashPdfLib.htmlDashPdfLibStrings.Legal | htmlDashPdfLib.htmlDashPdfLibStrings.Letter | htmlDashPdfLib.htmlDashPdfLibStrings.Tabloid = null,
    header: htmlDashPdfLib.Anon_Contents = null,
    height: java.lang.String = null,
    httpHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    orientation: htmlDashPdfLib.htmlDashPdfLibStrings.portrait | htmlDashPdfLib.htmlDashPdfLibStrings.landscape = null,
    phantomArgs: js.Array[java.lang.String] = null,
    phantomPath: java.lang.String = null,
    quality: java.lang.String = null,
    script: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    `type`: htmlDashPdfLib.htmlDashPdfLibStrings.png | htmlDashPdfLib.htmlDashPdfLibStrings.jpeg | htmlDashPdfLib.htmlDashPdfLibStrings.pdf = null,
    width: java.lang.String = null,
    zoomFactor: java.lang.String = null
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (height != null) __obj.updateDynamic("height")(height)
    if (httpHeaders != null) __obj.updateDynamic("httpHeaders")(httpHeaders)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (phantomArgs != null) __obj.updateDynamic("phantomArgs")(phantomArgs)
    if (phantomPath != null) __obj.updateDynamic("phantomPath")(phantomPath)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (script != null) __obj.updateDynamic("script")(script)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor)
    __obj.asInstanceOf[CreateOptions]
  }
}

