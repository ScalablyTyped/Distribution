package typings.lucene

import typings.lucene.mod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luceneStrings {
  
  @js.native
  sealed trait AND
    extends StObject
       with Operator
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait `AND NOT`
    extends StObject
       with Operator
  inline def `AND NOT`: `AND NOT` = ("AND NOT").asInstanceOf[`AND NOT`]
  
  @js.native
  sealed trait LessthansignimplicitGreaterthansign
    extends StObject
       with Operator
  inline def LessthansignimplicitGreaterthansign: LessthansignimplicitGreaterthansign = "<implicit>".asInstanceOf[LessthansignimplicitGreaterthansign]
  
  @js.native
  sealed trait NOT
    extends StObject
       with Operator
  inline def NOT: NOT = "NOT".asInstanceOf[NOT]
  
  @js.native
  sealed trait OR
    extends StObject
       with Operator
  inline def OR: OR = "OR".asInstanceOf[OR]
  
  @js.native
  sealed trait `OR NOT`
    extends StObject
       with Operator
  inline def `OR NOT`: `OR NOT` = ("OR NOT").asInstanceOf[`OR NOT`]
  
  @js.native
  sealed trait both extends StObject
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
}
