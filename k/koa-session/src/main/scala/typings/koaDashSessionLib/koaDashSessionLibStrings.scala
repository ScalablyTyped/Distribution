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
  
  def session: session = "session".asInstanceOf[session]
  def `session:expired`: `session:expired` = "session:expired".asInstanceOf[`session:expired`]
  def `session:invalid`: `session:invalid` = "session:invalid".asInstanceOf[`session:invalid`]
  def `session:missed`: `session:missed` = "session:missed".asInstanceOf[`session:missed`]
}

