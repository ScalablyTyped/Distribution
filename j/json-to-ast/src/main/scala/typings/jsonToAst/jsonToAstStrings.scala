package typings.jsonToAst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonToAstStrings {
  
  @scala.inline
  def Array: Array = "Array".asInstanceOf[Array]
  
  @scala.inline
  def Identifier: Identifier = "Identifier".asInstanceOf[Identifier]
  
  @scala.inline
  def Literal: Literal = "Literal".asInstanceOf[Literal]
  
  @scala.inline
  def Object: Object = "Object".asInstanceOf[Object]
  
  @scala.inline
  def Property: Property = "Property".asInstanceOf[Property]
  
  @js.native
  sealed trait Array extends js.Object
  
  @js.native
  sealed trait Identifier extends js.Object
  
  @js.native
  sealed trait Literal extends js.Object
  
  @js.native
  sealed trait Object extends js.Object
  
  @js.native
  sealed trait Property extends js.Object
}
