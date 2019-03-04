package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandleObjHandleObject[TTarget, TData] extends js.Object {
  var handleObj: jqueryLib.JQueryNs.HandleObject[TTarget, TData]
}

object Anon_HandleObjHandleObject {
  @scala.inline
  def apply[TTarget, TData](handleObj: jqueryLib.JQueryNs.HandleObject[TTarget, TData]): Anon_HandleObjHandleObject[TTarget, TData] = {
    val __obj = js.Dynamic.literal(handleObj = handleObj)
  
    __obj.asInstanceOf[Anon_HandleObjHandleObject[TTarget, TData]]
  }
}

