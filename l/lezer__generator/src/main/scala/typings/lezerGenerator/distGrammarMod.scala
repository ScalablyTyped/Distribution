package typings.lezerGenerator

import org.scalablytyped.runtime.StringDictionary
import typings.lezerGenerator.anon.MaxTerm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGrammarMod {
  
  @JSImport("@lezer/generator/dist/grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/generator/dist/grammar", "Conflicts")
  @js.native
  open class Conflicts protected () extends StObject {
    def this(precedence: Double) = this()
    def this(precedence: Double, ambigGroups: js.Array[String]) = this()
    def this(precedence: Double, ambigGroups: js.Array[String], cut: Double) = this()
    def this(precedence: Double, ambigGroups: Unit, cut: Double) = this()
    
    val ambigGroups: js.Array[String] = js.native
    
    def cmp(other: Conflicts): Double = js.native
    
    val cut: Double = js.native
    
    def join(other: Conflicts): Conflicts = js.native
    
    val precedence: Double = js.native
  }
  /* static members */
  object Conflicts {
    
    @JSImport("@lezer/generator/dist/grammar", "Conflicts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lezer/generator/dist/grammar", "Conflicts.none")
    @js.native
    def none: Conflicts = js.native
    inline def none_=(x: Conflicts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/generator/dist/grammar", "Rule")
  @js.native
  open class Rule protected () extends StObject {
    def this(name: Term, parts: js.Array[Term], conflicts: js.Array[Conflicts], skip: Term) = this()
    
    def cmp(rule: Rule): Double = js.native
    
    def cmpNoName(rule: Rule): Double = js.native
    
    val conflicts: js.Array[Conflicts] = js.native
    
    var id: Double = js.native
    
    def isRepeatWrap: Boolean = js.native
    
    val name: Term = js.native
    
    val parts: js.Array[Term] = js.native
    
    def sameReduce(other: Rule): Boolean = js.native
    
    val skip: Term = js.native
  }
  
  @JSImport("@lezer/generator/dist/grammar", "Term")
  @js.native
  open class Term protected () extends StObject {
    def this(name: String, flags: Double) = this()
    def this(name: String, flags: Double, nodeName: String) = this()
    def this(name: String, flags: Double, nodeName: String, props: Props) = this()
    def this(name: String, flags: Double, nodeName: Null, props: Props) = this()
    
    def cmp(other: Term): Double = js.native
    
    def eof: Boolean = js.native
    
    def error: Boolean = js.native
    
    /* private */ var flags: Any = js.native
    
    var hash: Double = js.native
    
    var id: Double = js.native
    
    def `inline`: Boolean = js.native
    def inline_=(value: Boolean): Unit = js.native
    
    def interesting: Boolean = js.native
    
    val name: String = js.native
    
    val nodeName: String | Null = js.native
    
    def nodeType: Boolean = js.native
    
    def preserve: Boolean = js.native
    def preserve_=(value: Boolean): Unit = js.native
    
    val props: Props = js.native
    
    def repeated: Boolean = js.native
    
    var rules: js.Array[Rule] = js.native
    
    def terminal: Boolean = js.native
    
    def top: Boolean = js.native
  }
  
  @JSImport("@lezer/generator/dist/grammar", "TermSet")
  @js.native
  open class TermSet () extends StObject {
    
    var eof: Term = js.native
    
    var error: Term = js.native
    
    def finish(rules: js.Array[Rule]): MaxTerm = js.native
    
    def makeNonTerminal(name: String): Term = js.native
    def makeNonTerminal(name: String, nodeName: String): Term = js.native
    def makeNonTerminal(name: String, nodeName: String, props: js.Object): Term = js.native
    def makeNonTerminal(name: String, nodeName: Null, props: js.Object): Term = js.native
    
    def makeRepeat(name: String): Term = js.native
    
    def makeTerminal(name: String): Term = js.native
    def makeTerminal(name: String, nodeName: String): Term = js.native
    def makeTerminal(name: String, nodeName: String, props: js.Object): Term = js.native
    def makeTerminal(name: String, nodeName: Null, props: js.Object): Term = js.native
    
    def makeTop(nodeName: String, props: Props): Term = js.native
    def makeTop(nodeName: Null, props: Props): Term = js.native
    
    var names: StringDictionary[Term] = js.native
    
    def term(name: String): Term = js.native
    def term(name: String, nodeName: String): Term = js.native
    def term(name: String, nodeName: String, flags: Double): Term = js.native
    def term(name: String, nodeName: String, flags: Double, props: Props): Term = js.native
    def term(name: String, nodeName: String, flags: Unit, props: Props): Term = js.native
    def term(name: String, nodeName: Null, flags: Double): Term = js.native
    def term(name: String, nodeName: Null, flags: Double, props: Props): Term = js.native
    def term(name: String, nodeName: Null, flags: Unit, props: Props): Term = js.native
    
    var terms: js.Array[Term] = js.native
    
    var tops: js.Array[Term] = js.native
    
    def uniqueName(name: String): String = js.native
  }
  
  inline def cmpSet[T](a: js.Array[T], b: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmpSet")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hasProps(props: Props): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasProps")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def union[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  type Props = StringDictionary[String]
}
