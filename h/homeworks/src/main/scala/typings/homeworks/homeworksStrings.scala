package typings.homeworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object homeworksStrings {
  @js.native
  sealed trait move extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
}

