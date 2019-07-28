package typings.hashDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hashDotJsStrings {
  @js.native
  sealed trait big extends js.Object
  
  @js.native
  sealed trait hex extends js.Object
  
  @js.native
  sealed trait little extends js.Object
  
  @scala.inline
  def big: big = "big".asInstanceOf[big]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def little: little = "little".asInstanceOf[little]
}

