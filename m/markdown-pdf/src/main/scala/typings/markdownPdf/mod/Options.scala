package typings.markdownPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configuration options */
@js.native
trait Options extends js.Object {
  /** Path to custom CSS file, relative to current directory. */
  var cssPath: js.UndefOr[String] = js.native
  /** Current working directory. */
  var cwd: js.UndefOr[String] = js.native
  /** Path to custorm highlight CSS file (for code highlighting with highlight.js), relative to the current directory. */
  var highlightCssPath: js.UndefOr[String] = js.native
  /** If renderDelay option isn't set, this is the timeout (in ms) before the page is rendered in case the page.onLoadFinished event doesn't fire. */
  var loadTimeout: js.UndefOr[Double] = js.native
  /** Supported dimension units are: 'mm', 'cm', 'in', 'px' */
  var paperBorder: js.UndefOr[String] = js.native
  var paperFormat: js.UndefOr[PaperFormat] = js.native
  var paperOrientation: js.UndefOr[PaperOrientation] = js.native
  /** Path to the phantomjs library. */
  var phantomPath: js.UndefOr[String] = js.native
  /** A function that returns a through2 stream that transforms the HTML before it is converted to PDF. */
  var preProcessHtml: js.UndefOr[js.Function0[_]] = js.native
  /** A function that returns a through2 stream that transforms the markdown before it is converted to HTML. */
  var preProcessMd: js.UndefOr[js.Function0[_]] = js.native
  /** A config object that is passed to remarkable, the underlying markdown parser */
  var remarkable: js.UndefOr[js.Any] = js.native
  /** Delay (in ms) before the PDF is rendered. */
  var renderDelay: js.UndefOr[Double] = js.native
  /** Path to CommonJS module which sets the page header and footer (see runnings.js). */
  var runningsPath: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCssPath(value: String): Self = this.set("cssPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssPath: Self = this.set("cssPath", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setHighlightCssPath(value: String): Self = this.set("highlightCssPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCssPath: Self = this.set("highlightCssPath", js.undefined)
    @scala.inline
    def setLoadTimeout(value: Double): Self = this.set("loadTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadTimeout: Self = this.set("loadTimeout", js.undefined)
    @scala.inline
    def setPaperBorder(value: String): Self = this.set("paperBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperBorder: Self = this.set("paperBorder", js.undefined)
    @scala.inline
    def setPaperFormat(value: PaperFormat): Self = this.set("paperFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperFormat: Self = this.set("paperFormat", js.undefined)
    @scala.inline
    def setPaperOrientation(value: PaperOrientation): Self = this.set("paperOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperOrientation: Self = this.set("paperOrientation", js.undefined)
    @scala.inline
    def setPhantomPath(value: String): Self = this.set("phantomPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhantomPath: Self = this.set("phantomPath", js.undefined)
    @scala.inline
    def setPreProcessHtml(value: () => _): Self = this.set("preProcessHtml", js.Any.fromFunction0(value))
    @scala.inline
    def deletePreProcessHtml: Self = this.set("preProcessHtml", js.undefined)
    @scala.inline
    def setPreProcessMd(value: () => _): Self = this.set("preProcessMd", js.Any.fromFunction0(value))
    @scala.inline
    def deletePreProcessMd: Self = this.set("preProcessMd", js.undefined)
    @scala.inline
    def setRemarkable(value: js.Any): Self = this.set("remarkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarkable: Self = this.set("remarkable", js.undefined)
    @scala.inline
    def setRenderDelay(value: Double): Self = this.set("renderDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderDelay: Self = this.set("renderDelay", js.undefined)
    @scala.inline
    def setRunningsPath(value: String): Self = this.set("runningsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunningsPath: Self = this.set("runningsPath", js.undefined)
  }
  
}

