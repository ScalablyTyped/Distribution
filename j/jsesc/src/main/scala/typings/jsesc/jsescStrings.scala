package typings.jsesc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsescStrings {
  
  @scala.inline
  def backtick: backtick = "backtick".asInstanceOf[backtick]
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @scala.inline
  def hexadecimal: hexadecimal = "hexadecimal".asInstanceOf[hexadecimal]
  
  @scala.inline
  def octal: octal = "octal".asInstanceOf[octal]
  
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait backtick extends js.Object
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait decimal extends js.Object
  
  @js.native
  sealed trait double extends js.Object
  
  @js.native
  sealed trait hexadecimal extends js.Object
  
  @js.native
  sealed trait octal extends js.Object
  
  @js.native
  sealed trait single extends js.Object
}
