package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsDataStrings {
  @js.native
  sealed trait merge extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait skip extends js.Object
  
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  @scala.inline
  def skip: skip = "skip".asInstanceOf[skip]
}

