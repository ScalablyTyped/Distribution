package typings.istextorbinary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object istextorbinaryStrings {
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait utf8 extends js.Object
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

