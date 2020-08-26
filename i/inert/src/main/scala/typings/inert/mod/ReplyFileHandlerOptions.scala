package typings.inert.mod

import org.scalablytyped.runtime.StringDictionary
import typings.inert.inertBooleans.`false`
import typings.inert.inertStrings.`inline`
import typings.inert.inertStrings.attachment
import typings.inert.inertStrings.hash
import typings.inert.inertStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplyFileHandlerOptions extends js.Object {
  /**
    * confine - serve file relative to this directory and returns 403 Forbidden if the path resolves outside the confine directory.
    * Defaults to true which uses the relativeTo route option as the confine. Set to false to disable this security feature.
    */
  var confine: js.UndefOr[Boolean] = js.native
  /**
    * end - offset in file to stop reading from. If not set, will read to end of file.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * etagMethod - specifies the method used to calculate the ETag header response. Available values:
    *  * 'hash' - SHA1 sum of the file contents, suitable for distributed deployments. Default value.
    *  * 'simple' - Hex encoded size and modification date, suitable when files are stored on a single server.
    *  * false - Disable ETag computation.
    */
  var etagMethod: js.UndefOr[hash | simple | `false`] = js.native
  /**
    * filename - an optional filename to specify if sending a 'Content-Disposition' header, defaults to the basename of path
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * lookupCompressed - if true, looks for for a pre-compressed version of the file with the same filename with an extension, depending on the accepted encoding. Defaults to false.
    */
  var lookupCompressed: js.UndefOr[Boolean] = js.native
  /**
    * lookupMap - an object which maps content encoding to expected file name extension. Defaults to `{ gzip: '.gz' }.
    */
  var lookupMap: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * mode - specifies whether to include the 'Content-Disposition' header with the response. Available values:
    *  * false - header is not included. This is the default value.
    *  * 'attachment'
    *  *'inline'
    */
  var mode: js.UndefOr[`false` | attachment | `inline`] = js.native
  /**
    * start - offset in file to reading from, defaults to 0.
    */
  var start: js.UndefOr[Double] = js.native
}

object ReplyFileHandlerOptions {
  @scala.inline
  def apply(): ReplyFileHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplyFileHandlerOptions]
  }
  @scala.inline
  implicit class ReplyFileHandlerOptionsOps[Self <: ReplyFileHandlerOptions] (val x: Self) extends AnyVal {
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
    def setConfine(value: Boolean): Self = this.set("confine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfine: Self = this.set("confine", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEtagMethod(value: hash | simple | `false`): Self = this.set("etagMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtagMethod: Self = this.set("etagMethod", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setLookupCompressed(value: Boolean): Self = this.set("lookupCompressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupCompressed: Self = this.set("lookupCompressed", js.undefined)
    @scala.inline
    def setLookupMap(value: StringDictionary[String]): Self = this.set("lookupMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupMap: Self = this.set("lookupMap", js.undefined)
    @scala.inline
    def setMode(value: `false` | attachment | `inline`): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

