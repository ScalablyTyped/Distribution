package typings.jsonRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsonRulesEngineStrings {
  @js.native
  sealed trait failure extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

