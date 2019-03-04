package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var `for`: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var version: java.lang.String
  def install(): scala.Unit
}

object Plugin {
  @scala.inline
  def apply(
    install: js.Function0[scala.Unit],
    name: java.lang.String,
    version: java.lang.String,
    `for`: java.lang.String = null
  ): Plugin = {
    val __obj = js.Dynamic.literal(install = install, name = name, version = version)
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    __obj.asInstanceOf[Plugin]
  }
}

