package typings.idyllCompiler

import typings.idyllCompiler.mod.PropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idyllCompilerStrings {
  
  @scala.inline
  def expression: expression = "expression".asInstanceOf[expression]
  
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  
  @scala.inline
  def variable: variable = "variable".asInstanceOf[variable]
  
  @js.native
  sealed trait expression extends PropType
  
  @js.native
  sealed trait value extends PropType
  
  @js.native
  sealed trait variable extends PropType
}
