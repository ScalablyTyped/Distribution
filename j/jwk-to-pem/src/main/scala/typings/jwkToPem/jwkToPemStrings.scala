package typings.jwkToPem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jwkToPemStrings {
  @js.native
  sealed trait EC extends js.Object
  
  @js.native
  sealed trait RSA extends js.Object
  
  @scala.inline
  def EC: EC = "EC".asInstanceOf[EC]
  @scala.inline
  def RSA: RSA = "RSA".asInstanceOf[RSA]
}

