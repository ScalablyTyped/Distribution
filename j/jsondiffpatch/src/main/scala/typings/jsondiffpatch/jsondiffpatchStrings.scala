package typings.jsondiffpatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsondiffpatchStrings {
  
  @scala.inline
  def diff: diff = "diff".asInstanceOf[diff]
  
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait diff extends js.Object
  
  @js.native
  sealed trait patch extends js.Object
  
  @js.native
  sealed trait reverse extends js.Object
}
