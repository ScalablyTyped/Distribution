package typings.htmlDashPdf.htmlDashPdfMod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlDashPdf.Anon_Bottom
import typings.htmlDashPdf.Anon_Contents
import typings.htmlDashPdf.Anon_ContentsHeight
import typings.htmlDashPdf.htmlDashPdfStrings.A3
import typings.htmlDashPdf.htmlDashPdfStrings.A4
import typings.htmlDashPdf.htmlDashPdfStrings.A5
import typings.htmlDashPdf.htmlDashPdfStrings.Legal
import typings.htmlDashPdf.htmlDashPdfStrings.Letter
import typings.htmlDashPdf.htmlDashPdfStrings.Tabloid
import typings.htmlDashPdf.htmlDashPdfStrings.jpeg
import typings.htmlDashPdf.htmlDashPdfStrings.landscape
import typings.htmlDashPdf.htmlDashPdfStrings.pdf
import typings.htmlDashPdf.htmlDashPdfStrings.png
import typings.htmlDashPdf.htmlDashPdfStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  // Rendering options
  var base: js.UndefOr[String] = js.undefined
  // Page options
  var border: js.UndefOr[String | Anon_Bottom] = js.undefined
  // Export options
  var directory: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[Anon_ContentsHeight] = js.undefined
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var header: js.UndefOr[Anon_Contents] = js.undefined
  // Papersize Options: http://phantomjs.org/api/webpage/property/paper-size.html
  var height: js.UndefOr[String] = js.undefined
  // HTTP Headers that are used for requests
  var httpHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var phantomArgs: js.UndefOr[js.Array[String]] = js.undefined
  // Script options
  var phantomPath: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  // File options
  var `type`: js.UndefOr[png | jpeg | pdf] = js.undefined
  var width: js.UndefOr[String] = js.undefined
  // Zooming option, can be used to scale images if `options.type` is not pdf
  var zoomFactor: js.UndefOr[String] = js.undefined
}

object CreateOptions {
  @scala.inline
  def apply(
    base: String = null,
    border: String | Anon_Bottom = null,
    directory: String = null,
    footer: Anon_ContentsHeight = null,
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    header: Anon_Contents = null,
    height: String = null,
    httpHeaders: StringDictionary[String] = null,
    orientation: portrait | landscape = null,
    phantomArgs: js.Array[String] = null,
    phantomPath: String = null,
    quality: String = null,
    script: String = null,
    timeout: Int | Double = null,
    `type`: png | jpeg | pdf = null,
    width: String = null,
    zoomFactor: String = null
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

