package typings.lucene

import typings.lucene.mod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object luceneStrings {
  @js.native
  sealed trait AND extends Operator
  
  @js.native
  sealed trait `AND NOT` extends Operator
  
  @js.native
  sealed trait LessthansignimplicitGreaterthansign extends Operator
  
  @js.native
  sealed trait NOT extends Operator
  
  @js.native
  sealed trait OR extends Operator
  
  @js.native
  sealed trait `OR NOT` extends Operator
  
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def `AND NOT`: `AND NOT` = ("AND NOT").asInstanceOf[`AND NOT`]
  @scala.inline
  def LessthansignimplicitGreaterthansign: LessthansignimplicitGreaterthansign = "<implicit>".asInstanceOf[LessthansignimplicitGreaterthansign]
  @scala.inline
  def NOT: NOT = "NOT".asInstanceOf[NOT]
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  @scala.inline
  def `OR NOT`: `OR NOT` = ("OR NOT").asInstanceOf[`OR NOT`]
}

