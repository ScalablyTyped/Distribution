package typings.knex

import typings.knex.knexMod.ComparisionOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object knexStrings {
  @js.native
  sealed trait `*` extends js.Object
  
  @js.native
  sealed trait `<` extends ComparisionOperator
  
  @js.native
  sealed trait `<=` extends ComparisionOperator
  
  @js.native
  sealed trait `<>` extends ComparisionOperator
  
  @js.native
  sealed trait `=` extends ComparisionOperator
  
  @js.native
  sealed trait `>` extends ComparisionOperator
  
  @js.native
  sealed trait `>=` extends ComparisionOperator
  
  @js.native
  sealed trait Count extends js.Object
  
  @js.native
  sealed trait Knex extends js.Object
  
  @js.native
  sealed trait MappedAliasType extends js.Object
  
  @js.native
  sealed trait Ref extends js.Object
  
  @js.native
  sealed trait RefBuilder extends js.Object
  
  @js.native
  sealed trait asc extends js.Object
  
  @js.native
  sealed trait desc extends js.Object
  
  @scala.inline
  def `*`: `*` = "*".asInstanceOf[`*`]
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `<=`: `<=` = "<=".asInstanceOf[`<=`]
  @scala.inline
  def `<>`: `<>` = "<>".asInstanceOf[`<>`]
  @scala.inline
  def `=`: `=` = "=".asInstanceOf[`=`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `>=`: `>=` = ">=".asInstanceOf[`>=`]
  @scala.inline
  def Count: Count = "Count".asInstanceOf[Count]
  @scala.inline
  def Knex: Knex = "Knex".asInstanceOf[Knex]
  @scala.inline
  def MappedAliasType: MappedAliasType = "MappedAliasType".asInstanceOf[MappedAliasType]
  @scala.inline
  def Ref: Ref = "Ref".asInstanceOf[Ref]
  @scala.inline
  def RefBuilder: RefBuilder = "RefBuilder".asInstanceOf[RefBuilder]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

