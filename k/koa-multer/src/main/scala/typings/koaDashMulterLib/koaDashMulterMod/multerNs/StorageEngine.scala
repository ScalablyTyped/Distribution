package typings
package koaDashMulterLib.koaDashMulterMod.multerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEngine extends js.Object {
  def _handleFile(
    req: nodeLib.httpMod.IncomingMessage,
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], scala.Unit]
  ): scala.Unit
  def _removeFile(
    req: nodeLib.httpMod.IncomingMessage,
    file: File,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (nodeLib.httpMod.IncomingMessage, File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], scala.Unit]) => scala.Unit,
    _removeFile: (nodeLib.httpMod.IncomingMessage, File, js.Function1[/* error */ stdLib.Error, scala.Unit]) => scala.Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
  
    __obj.asInstanceOf[StorageEngine]
  }
}

