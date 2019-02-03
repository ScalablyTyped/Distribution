package typings
package koaDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object koaDashSessionLibStrings {
  @js.native
  sealed trait session extends js.Object
  
  @js.native
  sealed trait `session:expired` extends js.Object
  
  @js.native
  sealed trait `session:invalid` extends js.Object
  
  @js.native
  sealed trait `session:missed` extends js.Object
  
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def `session:expired`: `session:expired` = "session:expired".asInstanceOf[`session:expired`]
  @scala.inline
  def `session:invalid`: `session:invalid` = "session:invalid".asInstanceOf[`session:invalid`]
  @scala.inline
  def `session:missed`: `session:missed` = "session:missed".asInstanceOf[`session:missed`]
}

