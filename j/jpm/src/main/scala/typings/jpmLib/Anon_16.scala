package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_16 extends js.Object {
  var `16`: js.UndefOr[java.lang.String] = js.undefined
  var `32`: js.UndefOr[java.lang.String] = js.undefined
  var `64`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_16 {
  @scala.inline
  def apply(`16`: java.lang.String = null, `32`: java.lang.String = null, `64`: java.lang.String = null): Anon_16 = {
    val __obj = js.Dynamic.literal()
    if (`16` != null) __obj.updateDynamic("16")(`16`)
    if (`32` != null) __obj.updateDynamic("32")(`32`)
    if (`64` != null) __obj.updateDynamic("64")(`64`)
    __obj.asInstanceOf[Anon_16]
  }
}

