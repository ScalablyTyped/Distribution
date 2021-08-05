package typings.idyllCompiler

import typings.idyllCompiler.mod.PropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idyllCompilerStrings {
  
  @js.native
  sealed trait expression
    extends StObject
       with PropType
  inline def expression: expression = "expression".asInstanceOf[expression]
  
  @js.native
  sealed trait value
    extends StObject
       with PropType
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait variable
    extends StObject
       with PropType
  inline def variable: variable = "variable".asInstanceOf[variable]
}
