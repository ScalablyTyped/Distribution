package typings.koaSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object koaSessionStrings {
  @js.native
  sealed trait lax extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait session extends js.Object
  
  @js.native
  sealed trait strict extends js.Object
  
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
}

