package typings.lezerGenerator

import org.scalablytyped.runtime.NumberDictionary
import typings.lezerGenerator.distGrammarMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenMod {
  
  @JSImport("@lezer/generator/dist/token", "Conflict")
  @js.native
  open class Conflict protected () extends StObject {
    def this(a: Term, b: Term, soft: Double, exampleA: String) = this()
    def this(a: Term, b: Term, soft: Double, exampleA: String, exampleB: String) = this()
    
    val a: Term = js.native
    
    val b: Term = js.native
    
    val exampleA: String = js.native
    
    val exampleB: js.UndefOr[String] = js.native
    
    var soft: Double = js.native
  }
  
  @JSImport("@lezer/generator/dist/token", "Edge")
  @js.native
  open class Edge protected () extends StObject {
    def this(from: Double, to: Double, target: State) = this()
    
    val from: Double = js.native
    
    val target: State = js.native
    
    val to: Double = js.native
  }
  
  @JSImport("@lezer/generator/dist/token", "MAX_CHAR")
  @js.native
  val MAX_CHAR: /* 65535 */ Double = js.native
  
  @JSImport("@lezer/generator/dist/token", "State")
  @js.native
  open class State () extends StObject {
    def this(accepting: js.Array[Term]) = this()
    def this(accepting: js.Array[Term], id: Double) = this()
    def this(accepting: Unit, id: Double) = this()
    
    val accepting: js.Array[Term] = js.native
    
    def closure(): js.Array[State] = js.native
    
    def compile(): State = js.native
    
    def cycleTerms(): js.Array[Term] = js.native
    
    def edge(from: Double, to: Double, target: State): Unit = js.native
    
    var edges: js.Array[Edge] = js.native
    
    def findConflicts(occurTogether: js.Function2[/* a */ Term, /* b */ Term, Boolean]): js.Array[Conflict] = js.native
    
    val id: Double = js.native
    
    def nullEdge(target: State): Unit = js.native
    
    def reachable(f: js.Function2[/* s */ this.type, /* edges */ js.Array[Edge], Unit]): Unit = js.native
    
    def stateMask(groupMasks: NumberDictionary[Double]): Double = js.native
    
    def toArray(groupMasks: NumberDictionary[Double], precedence: js.Array[Double]): js.typedarray.Uint16Array = js.native
  }
}
