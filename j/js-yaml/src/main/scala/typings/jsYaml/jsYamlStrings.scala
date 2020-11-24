package typings.jsYaml

import typings.jsYaml.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsYamlStrings {
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def mapping: mapping = "mapping".asInstanceOf[mapping]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  
  @scala.inline
  def sequence: sequence = "sequence".asInstanceOf[sequence]
  
  @js.native
  sealed trait close extends EventType
  
  @js.native
  sealed trait mapping extends js.Object
  
  @js.native
  sealed trait open extends EventType
  
  @js.native
  sealed trait scalar extends js.Object
  
  @js.native
  sealed trait sequence extends js.Object
}
