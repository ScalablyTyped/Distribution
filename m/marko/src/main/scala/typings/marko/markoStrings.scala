package typings.marko

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object markoStrings {
  @js.native
  sealed trait html extends js.Object
  
  @js.native
  sealed trait vdom extends js.Object
  
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def vdom: vdom = "vdom".asInstanceOf[vdom]
}

