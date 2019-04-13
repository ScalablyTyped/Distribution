package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_File
  extends /**
  * allows you to pass options to a 3rd party module. Their project README will likely list the exposed options
  * @see https://github.com/amark/gun/wiki/Modules
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** Undocumented but mentioned. Write data to a JSON. */
  var file: java.lang.String
  /** default: true, persists local (browser) data to localStorage. */
  var localStorage: scala.Boolean
  /** the URLs are properties, and the value is an empty object. */
  var peers: stdLib.Record[java.lang.String, js.Object]
  /** default: true, creates and persists local (nodejs) data using Radisk. */
  var radisk: scala.Boolean
  /** Undocumented but mentioned. Amazon S3 */
  var s3: Anon_Bucket
  /** Undocumented but mentioned. Create a websocket server */
  var web: js.Any
  /** uuid allows you to override the default 24 random alphanumeric soul generator with your own function. */
  def uuid(): java.lang.String
}

object Anon_File {
  @scala.inline
  def apply(
    file: java.lang.String,
    localStorage: scala.Boolean,
    peers: stdLib.Record[java.lang.String, js.Object],
    radisk: scala.Boolean,
    s3: Anon_Bucket,
    uuid: () => java.lang.String,
    web: js.Any,
    StringDictionary: /**
    * allows you to pass options to a 3rd party module. Their project README will likely list the exposed options
    * @see https://github.com/amark/gun/wiki/Modules
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_File = {
    val __obj = js.Dynamic.literal(file = file, localStorage = localStorage, peers = peers, radisk = radisk, s3 = s3, uuid = js.Any.fromFunction0(uuid), web = web)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_File]
  }
}

