package typings
package koaDashMulterLib.koaDashMulterMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MulterIncomingMessage
  extends nodeLib.httpMod.IncomingMessage {
  var body: js.Any = js.native
  var file: File = js.native
  var files: ScalablyTyped.runtime.StringDictionary[js.Array[File]] | js.Array[File] = js.native
}

