package typings.inlineCritical

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inlineCriticalStrings {
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait head extends js.Object
  
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def head: head = "head".asInstanceOf[head]
}

