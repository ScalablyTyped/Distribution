package typings.jsep

import typings.jsep.mod.ExpressionType
import typings.jsep.mod.HookType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsepStrings {
  
  @js.native
  sealed trait ArrayExpression
    extends StObject
       with ExpressionType
  inline def ArrayExpression: ArrayExpression = "ArrayExpression".asInstanceOf[ArrayExpression]
  
  @js.native
  sealed trait BinaryExpression
    extends StObject
       with ExpressionType
  inline def BinaryExpression: BinaryExpression = "BinaryExpression".asInstanceOf[BinaryExpression]
  
  @js.native
  sealed trait CallExpression
    extends StObject
       with ExpressionType
  inline def CallExpression: CallExpression = "CallExpression".asInstanceOf[CallExpression]
  
  @js.native
  sealed trait Compound
    extends StObject
       with ExpressionType
  inline def Compound: Compound = "Compound".asInstanceOf[Compound]
  
  @js.native
  sealed trait ConditionalExpression
    extends StObject
       with ExpressionType
  inline def ConditionalExpression: ConditionalExpression = "ConditionalExpression".asInstanceOf[ConditionalExpression]
  
  @js.native
  sealed trait Identifier
    extends StObject
       with ExpressionType
  inline def Identifier: Identifier = "Identifier".asInstanceOf[Identifier]
  
  @js.native
  sealed trait Literal
    extends StObject
       with ExpressionType
  inline def Literal: Literal = "Literal".asInstanceOf[Literal]
  
  @js.native
  sealed trait MemberExpression
    extends StObject
       with ExpressionType
  inline def MemberExpression: MemberExpression = "MemberExpression".asInstanceOf[MemberExpression]
  
  @js.native
  sealed trait ThisExpression
    extends StObject
       with ExpressionType
  inline def ThisExpression: ThisExpression = "ThisExpression".asInstanceOf[ThisExpression]
  
  @js.native
  sealed trait UnaryExpression
    extends StObject
       with ExpressionType
  inline def UnaryExpression: UnaryExpression = "UnaryExpression".asInstanceOf[UnaryExpression]
  
  @js.native
  sealed trait `after-expression`
    extends StObject
       with HookType
  inline def `after-expression`: `after-expression` = "after-expression".asInstanceOf[`after-expression`]
  
  @js.native
  sealed trait `after-token`
    extends StObject
       with HookType
  inline def `after-token`: `after-token` = "after-token".asInstanceOf[`after-token`]
  
  @js.native
  sealed trait `gobble-expression`
    extends StObject
       with HookType
  inline def `gobble-expression`: `gobble-expression` = "gobble-expression".asInstanceOf[`gobble-expression`]
  
  @js.native
  sealed trait `gobble-spaces`
    extends StObject
       with HookType
  inline def `gobble-spaces`: `gobble-spaces` = "gobble-spaces".asInstanceOf[`gobble-spaces`]
  
  @js.native
  sealed trait `gobble-token`
    extends StObject
       with HookType
  inline def `gobble-token`: `gobble-token` = "gobble-token".asInstanceOf[`gobble-token`]
}
