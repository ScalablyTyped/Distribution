package typings.hasura

import typings.hasura.mod.Equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasuraBooleans {
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
  
  @js.native
  sealed trait `false`
    extends Equals[js.Any, js.Any]
  
  @js.native
  sealed trait `true`
    extends Equals[js.Any, js.Any]
}
