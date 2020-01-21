package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.JSONStore.closeAll")
@js.native
object closeAll extends js.Object {
  /**
    * Locks access to all the collections until WL.JSONStore.init is called.
    */
  def apply(): JQueryDeferred[_] = js.native
  def apply(options: Options): JQueryDeferred[_] = js.native
}

