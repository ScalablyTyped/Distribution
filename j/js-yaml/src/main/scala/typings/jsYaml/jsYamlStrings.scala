package typings.jsYaml

import typings.jsYaml.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsYamlStrings {
  
  @js.native
  sealed trait close extends EventType
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait mapping extends StObject
  @scala.inline
  def mapping: mapping = "mapping".asInstanceOf[mapping]
  
  @js.native
  sealed trait open extends EventType
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait scalar extends StObject
  @scala.inline
  def scalar: scalar = "scalar".asInstanceOf[scalar]
  
  @js.native
  sealed trait sequence extends StObject
  @scala.inline
  def sequence: sequence = "sequence".asInstanceOf[sequence]
}
