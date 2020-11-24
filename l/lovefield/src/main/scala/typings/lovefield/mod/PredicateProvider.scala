package typings.lovefield.mod

import typings.lovefield.mod.schema.Column
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredicateProvider extends js.Object {
  
  def between(from: Binder, to: Binder): Predicate = js.native
  def between(from: Binder, to: ValueLiteral): Predicate = js.native
  def between(from: ValueLiteral, to: Binder): Predicate = js.native
  def between(from: ValueLiteral, to: ValueLiteral): Predicate = js.native
  
  def eq(operand: Binder): Predicate = js.native
  def eq(operand: ValueLiteral): Predicate = js.native
  def eq(operand: Column): Predicate = js.native
  
  def gt(operand: Binder): Predicate = js.native
  def gt(operand: ValueLiteral): Predicate = js.native
  def gt(operand: Column): Predicate = js.native
  
  def gte(operand: Binder): Predicate = js.native
  def gte(operand: ValueLiteral): Predicate = js.native
  def gte(operand: Column): Predicate = js.native
  
  def in(values: js.Array[ValueLiteral]): Predicate = js.native
  def in(values: Binder): Predicate = js.native
  
  def isNotNull(): Predicate = js.native
  
  def isNull(): Predicate = js.native
  
  def lt(operand: Binder): Predicate = js.native
  def lt(operand: ValueLiteral): Predicate = js.native
  def lt(operand: Column): Predicate = js.native
  
  def lte(operand: Binder): Predicate = js.native
  def lte(operand: ValueLiteral): Predicate = js.native
  def lte(operand: Column): Predicate = js.native
  
  def `match`(operand: Binder): Predicate = js.native
  def `match`(operand: RegExp): Predicate = js.native
  
  def neq(operand: Binder): Predicate = js.native
  def neq(operand: ValueLiteral): Predicate = js.native
  def neq(operand: Column): Predicate = js.native
}
