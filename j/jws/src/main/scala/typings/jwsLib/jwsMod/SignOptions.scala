package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var header: Header
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var key: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var payload: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var privateKey: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var secret: js.UndefOr[js.Any] = js.undefined
}

