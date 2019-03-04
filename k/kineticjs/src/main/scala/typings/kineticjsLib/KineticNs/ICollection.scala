package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollection extends js.Object {
  @JSName("apply")
  def apply(method: js.Function, `val`: js.Any): js.Any
  def each(func: js.Function0[_]): js.Any
}

object ICollection {
  @scala.inline
  def apply(apply: js.Function2[js.Function, js.Any, js.Any], each: js.Function1[js.Function0[_], js.Any]): ICollection = {
    val __obj = js.Dynamic.literal(apply = apply, each = each)
  
    __obj.asInstanceOf[ICollection]
  }
}

