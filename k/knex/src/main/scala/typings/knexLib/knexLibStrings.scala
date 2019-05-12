package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object knexLibStrings {
  @js.native
  sealed trait `*` extends js.Object
  
  @js.native
  sealed trait `<`
    extends knexLib.knexMod.ComparisionOperator
  
  @js.native
  sealed trait `<=`
    extends knexLib.knexMod.ComparisionOperator
  
  @js.native
  sealed trait `<>`
    extends knexLib.knexMod.ComparisionOperator
  
  @js.native
  sealed trait `=`
    extends knexLib.knexMod.ComparisionOperator
  
  @js.native
  sealed trait `>`
    extends knexLib.knexMod.ComparisionOperator
  
  @js.native
  sealed trait `>=`
    extends knexLib.knexMod.ComparisionOperator
  
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
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

