package typings
package jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  /**
    * The raw file contents, in whatever form they were returned by the resolver that read the file.
    */
  var data: java.lang.String | nodeLib.Buffer
  /**
    * The lowercase file extension, such as ".json", ".yaml", ".txt", etc.
    */
  var extension: java.lang.String
  /**
    * The full URL of the file. This could be any type of URL, including "http://", "https://", "file://", "ftp://", "mongodb://", or even a local filesystem path (when running in Node.js).
    */
  var url: java.lang.String
}

object FileInfo {
  @scala.inline
  def apply(data: java.lang.String | nodeLib.Buffer, extension: java.lang.String, url: java.lang.String): FileInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FileInfo]
  }
}

