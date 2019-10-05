package typings.ibmDashMobilefirst.WL.JSONStore

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.JSONStore.fileInfo")
@js.native
object fileInfo extends js.Object {
  /**
    * Returns information about the file that is used to persist data in the store. The following key value pairs are returned:
    * name - name of the store
    * size - the total size, in bytes, of the store
    * isEncrypted - boolean that is true when encrypted and false otherwise.
    */
  def apply(): JQueryDeferred[_] = js.native
}

