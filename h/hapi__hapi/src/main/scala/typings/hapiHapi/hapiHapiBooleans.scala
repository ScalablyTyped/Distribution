package typings.hapiHapi

import typings.hapiHapi.mod.SameSitePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hapiHapiBooleans {
  @js.native
  sealed trait `false` extends SameSitePolicy
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

