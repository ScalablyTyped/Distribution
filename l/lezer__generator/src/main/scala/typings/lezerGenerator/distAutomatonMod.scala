package typings.lezerGenerator

import org.scalablytyped.runtime.StringDictionary
import typings.lezerGenerator.distGrammarMod.Conflicts
import typings.lezerGenerator.distGrammarMod.Rule
import typings.lezerGenerator.distGrammarMod.Term
import typings.lezerGenerator.distGrammarMod.TermSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutomatonMod {
  
  @JSImport("@lezer/generator/dist/automaton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/generator/dist/automaton", "Pos")
  @js.native
  open class Pos protected () extends StObject {
    def this(rule: Rule, pos: Double, ahead: js.Array[Term], ambigAhead: js.Array[String], skipAhead: Term) = this()
    def this(
      rule: Rule,
      pos: Double,
      ahead: js.Array[Term],
      ambigAhead: js.Array[String],
      skipAhead: Term,
      via: Pos
    ) = this()
    
    def advance(): Pos = js.native
    
    val ahead: js.Array[Term] = js.native
    
    var ambigAhead: js.Array[String] = js.native
    
    def cmp(pos: Pos): Double = js.native
    
    def conflicts(): Conflicts = js.native
    def conflicts(pos: Double): Conflicts = js.native
    
    def eq(other: Pos): Boolean = js.native
    
    def eqSimple(pos: Pos): Boolean = js.native
    
    def finish(): this.type = js.native
    
    var hash: Double = js.native
    
    def next: Term = js.native
    
    val pos: Double = js.native
    
    val rule: Rule = js.native
    
    def skip: Term = js.native
    
    val skipAhead: Term = js.native
    
    def trail(): String = js.native
    def trail(maxLen: Double): String = js.native
    
    val via: Pos | Null = js.native
  }
  /* static members */
  object Pos {
    
    @JSImport("@lezer/generator/dist/automaton", "Pos")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addOrigins(group: js.Array[Pos], context: js.Array[Pos]): js.Array[Pos] = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrigins")(group.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pos]]
  }
  
  @JSImport("@lezer/generator/dist/automaton", "Reduce")
  @js.native
  open class Reduce protected () extends StObject {
    def this(term: Term, rule: Rule) = this()
    
    def cmp(other: Reduce): Double = js.native
    def cmp(other: Shift): Double = js.native
    
    def eq(other: Reduce): Boolean = js.native
    def eq(other: Shift): Boolean = js.native
    
    def map(): this.type = js.native
    
    val rule: Rule = js.native
    
    val term: Term = js.native
  }
  
  @JSImport("@lezer/generator/dist/automaton", "Shift")
  @js.native
  open class Shift protected () extends StObject {
    def this(term: Term, target: State) = this()
    
    def cmp(other: Reduce): Double = js.native
    def cmp(other: Shift): Double = js.native
    
    def eq(other: Reduce): Boolean = js.native
    def eq(other: Shift): Boolean = js.native
    
    def map(mapping: js.Array[Double], states: js.Array[State]): Shift = js.native
    
    val target: State = js.native
    
    val term: Term = js.native
  }
  
  @JSImport("@lezer/generator/dist/automaton", "State")
  @js.native
  open class State protected () extends StObject {
    def this(id: Double, set: js.Array[Pos], flags: Double, skip: Term) = this()
    def this(id: Double, set: js.Array[Pos], flags: Double, skip: Term, hash: Double) = this()
    def this(id: Double, set: js.Array[Pos], flags: Double, skip: Term, hash: Double, startRule: Term) = this()
    def this(id: Double, set: js.Array[Pos], flags: Double, skip: Term, hash: Unit, startRule: Term) = this()
    
    var actionPositions: js.Array[js.Array[Pos]] = js.native
    
    var actions: js.Array[Shift | Reduce] = js.native
    
    def addAction(value: Reduce, positions: js.Array[Pos], conflicts: js.Array[Conflict]): Unit = js.native
    def addAction(value: Shift, positions: js.Array[Pos], conflicts: js.Array[Conflict]): Unit = js.native
    
    def addActionInner(value: Reduce, positions: js.Array[Pos]): Shift | Reduce | Null = js.native
    def addActionInner(value: Shift, positions: js.Array[Pos]): Shift | Reduce | Null = js.native
    
    var defaultReduce: Rule | Null = js.native
    
    def eq(other: State): Boolean = js.native
    
    def finish(): Unit = js.native
    
    var flags: Double = js.native
    
    def getGoto(term: Term): Shift = js.native
    
    var goto: js.Array[Shift] = js.native
    
    def hasSet(set: js.Array[Pos]): Boolean = js.native
    
    val hash: Double = js.native
    
    var id: Double = js.native
    
    var set: js.Array[Pos] = js.native
    
    val skip: Term = js.native
    
    val startRule: Term | Null = js.native
    
    var tokenGroup: Double = js.native
  }
  
  inline def buildFullAutomaton(terms: TermSet, startTerms: js.Array[Term], first: StringDictionary[js.Array[Term]]): js.Array[State] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildFullAutomaton")(terms.asInstanceOf[js.Any], startTerms.asInstanceOf[js.Any], first.asInstanceOf[js.Any])).asInstanceOf[js.Array[State]]
  
  inline def computeFirstSets(terms: TermSet): StringDictionary[js.Array[Term]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeFirstSets")(terms.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[Term]]]
  
  inline def finishAutomaton(full: js.Array[State]): js.Array[State] = ^.asInstanceOf[js.Dynamic].applyDynamic("finishAutomaton")(full.asInstanceOf[js.Any]).asInstanceOf[js.Array[State]]
  
  trait Conflict extends StObject {
    
    val error: String
    
    val rules: js.Array[Term]
  }
  object Conflict {
    
    inline def apply(error: String, rules: js.Array[Term]): Conflict = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conflict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Conflict] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[Term]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Term*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
