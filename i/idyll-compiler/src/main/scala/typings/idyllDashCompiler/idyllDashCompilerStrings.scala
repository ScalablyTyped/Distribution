package typings.idyllDashCompiler

import typings.idyllDashCompiler.idyllDashCompilerMod.PropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object idyllDashCompilerStrings {
  @js.native
  sealed trait expression extends PropType
  
  @js.native
  sealed trait value extends PropType
  
  @js.native
  sealed trait variable extends PropType
  
  @scala.inline
  def expression: expression = "expression".asInstanceOf[expression]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def variable: variable = "variable".asInstanceOf[variable]
}

