package typings.lucene

import typings.lucene.mod.Operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luceneStrings {
  
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
  
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
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
  
  @js.native
  sealed trait both extends js.Object
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait right extends js.Object
}
