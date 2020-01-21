package typings.layzrJs

import typings.layzrJs.mod.LayzrEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object layzrJsStrings {
  @js.native
  sealed trait srcColonafter extends LayzrEvents
  
  @js.native
  sealed trait srcColonbefore extends LayzrEvents
  
  @scala.inline
  def srcColonafter: srcColonafter = "src:after".asInstanceOf[srcColonafter]
  @scala.inline
  def srcColonbefore: srcColonbefore = "src:before".asInstanceOf[srcColonbefore]
}

