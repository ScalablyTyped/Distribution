package typings.lezerLr

import typings.lezerCommon.distParseMod.Input
import typings.lezerCommon.distParseMod.ParseWrapper
import typings.lezerCommon.distParseMod.PartialParse
import typings.lezerCommon.distTreeMod.NodePropSource
import typings.lezerCommon.distTreeMod.Tree
import typings.lezerCommon.mod.NodeSet
import typings.lezerCommon.mod.NodeType
import typings.lezerCommon.mod.Parser
import typings.lezerCommon.mod.TreeFragment
import typings.lezerLr.anon.From
import typings.lezerLr.anon.FromTo
import typings.lezerLr.anon.Hash
import typings.lezerLr.anon.To
import typings.lezerLr.distStackMod.Stack
import typings.lezerLr.distTokenMod.CachedToken
import typings.lezerLr.distTokenMod.InputStream
import typings.lezerLr.distTokenMod.Tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseMod {
  
  @JSImport("@lezer/lr/dist/parse", "ContextTracker")
  @js.native
  open class ContextTracker[T] protected () extends StObject {
    def this(spec: Hash[T]) = this()
  }
  
  @JSImport("@lezer/lr/dist/parse", "Dialect")
  @js.native
  open class Dialect protected () extends StObject {
    def this(source: String, flags: js.Array[Boolean]) = this()
    def this(source: Unit, flags: js.Array[Boolean]) = this()
    def this(source: String, flags: js.Array[Boolean], disabled: js.typedarray.Uint8Array) = this()
    def this(source: Unit, flags: js.Array[Boolean], disabled: js.typedarray.Uint8Array) = this()
    
    def allows(term: Double): Boolean = js.native
    
    val disabled: Null | js.typedarray.Uint8Array = js.native
    
    val flags: js.Array[Boolean] = js.native
    
    val source: js.UndefOr[String] = js.native
  }
  
  @JSImport("@lezer/lr/dist/parse", "LRParser")
  @js.native
  open class LRParser () extends Parser {
    
    def configure(config: ParserConfig): LRParser = js.native
    
    def getName(term: Double): String = js.native
    
    def hasWrappers(): Boolean = js.native
    
    val nodeSet: NodeSet = js.native
    
    def topNode: NodeType = js.native
  }
  /* static members */
  object LRParser {
    
    @JSImport("@lezer/lr/dist/parse", "LRParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(spec: Any): LRParser = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(spec.asInstanceOf[js.Any]).asInstanceOf[LRParser]
  }
  
  @JSImport("@lezer/lr/dist/parse", "Parse")
  @js.native
  open class Parse protected ()
    extends StObject
       with PartialParse {
    def this(parser: LRParser, input: Input, fragments: js.Array[TreeFragment], ranges: js.Array[From]) = this()
    
    /* CompleteClass */
    override def advance(): Tree | Null = js.native
    
    /* private */ var advanceFully: Any = js.native
    
    /* private */ var advanceStack: Any = js.native
    
    var bigReductionCount: Double = js.native
    
    var fragments: FragmentCursor | Null = js.native
    
    val input: Input = js.native
    
    var lastBigReductionSize: Double = js.native
    
    var lastBigReductionStart: Double = js.native
    
    var minStackPos: Double = js.native
    
    var nextStackID: Double = js.native
    
    /* CompleteClass */
    override val parsedPos: Double = js.native
    @JSName("parsedPos")
    def parsedPos_MParse: Double = js.native
    
    val parser: LRParser = js.native
    
    val ranges: js.Array[From] = js.native
    
    var recovering: Double = js.native
    
    var reused: js.Array[typings.lezerCommon.mod.Tree] = js.native
    
    /* private */ var runRecovery: Any = js.native
    
    /* private */ var stackID: Any = js.native
    
    def stackToTree(stack: Stack): typings.lezerCommon.mod.Tree = js.native
    
    var stacks: js.Array[Stack] = js.native
    
    /* CompleteClass */
    override def stopAt(pos: Double): Unit = js.native
    
    /* CompleteClass */
    override val stoppedAt: Double | Null = js.native
    @JSName("stoppedAt")
    var stoppedAt_Parse: Null | Double = js.native
    
    var stream: InputStream = js.native
    
    var tokens: TokenCache = js.native
    
    var topTerm: Double = js.native
  }
  
  trait FragmentCursor extends StObject {
    
    var fragment: TreeFragment | Null
    
    val fragments: js.Array[TreeFragment]
    
    var i: Double
    
    var index: js.Array[Double]
    
    def nextFragment(): Unit
    
    var nextStart: Double
    
    def nodeAt(pos: Double): typings.lezerCommon.mod.Tree | Null
    
    val nodeSet: NodeSet
    
    var safeFrom: Double
    
    var safeTo: Double
    
    var start: js.Array[Double]
    
    var trees: js.Array[typings.lezerCommon.mod.Tree]
  }
  object FragmentCursor {
    
    inline def apply(
      fragments: js.Array[TreeFragment],
      i: Double,
      index: js.Array[Double],
      nextFragment: () => Unit,
      nextStart: Double,
      nodeAt: Double => typings.lezerCommon.mod.Tree | Null,
      nodeSet: NodeSet,
      safeFrom: Double,
      safeTo: Double,
      start: js.Array[Double],
      trees: js.Array[typings.lezerCommon.mod.Tree]
    ): FragmentCursor = {
      val __obj = js.Dynamic.literal(fragments = fragments.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nextFragment = js.Any.fromFunction0(nextFragment), nextStart = nextStart.asInstanceOf[js.Any], nodeAt = js.Any.fromFunction1(nodeAt), nodeSet = nodeSet.asInstanceOf[js.Any], safeFrom = safeFrom.asInstanceOf[js.Any], safeTo = safeTo.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trees = trees.asInstanceOf[js.Any], fragment = null)
      __obj.asInstanceOf[FragmentCursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FragmentCursor] (val x: Self) extends AnyVal {
      
      inline def setFragment(value: TreeFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentNull: Self = StObject.set(x, "fragment", null)
      
      inline def setFragments(value: js.Array[TreeFragment]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
      
      inline def setFragmentsVarargs(value: TreeFragment*): Self = StObject.set(x, "fragments", js.Array(value*))
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: js.Array[Double]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexVarargs(value: Double*): Self = StObject.set(x, "index", js.Array(value*))
      
      inline def setNextFragment(value: () => Unit): Self = StObject.set(x, "nextFragment", js.Any.fromFunction0(value))
      
      inline def setNextStart(value: Double): Self = StObject.set(x, "nextStart", value.asInstanceOf[js.Any])
      
      inline def setNodeAt(value: Double => typings.lezerCommon.mod.Tree | Null): Self = StObject.set(x, "nodeAt", js.Any.fromFunction1(value))
      
      inline def setNodeSet(value: NodeSet): Self = StObject.set(x, "nodeSet", value.asInstanceOf[js.Any])
      
      inline def setSafeFrom(value: Double): Self = StObject.set(x, "safeFrom", value.asInstanceOf[js.Any])
      
      inline def setSafeTo(value: Double): Self = StObject.set(x, "safeTo", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
      
      inline def setTrees(value: js.Array[typings.lezerCommon.mod.Tree]): Self = StObject.set(x, "trees", value.asInstanceOf[js.Any])
      
      inline def setTreesVarargs(value: typings.lezerCommon.mod.Tree*): Self = StObject.set(x, "trees", js.Array(value*))
    }
  }
  
  trait ParserConfig extends StObject {
    
    var bufferLength: js.UndefOr[Double] = js.undefined
    
    var contextTracker: js.UndefOr[ContextTracker[Any]] = js.undefined
    
    var dialect: js.UndefOr[String] = js.undefined
    
    var props: js.UndefOr[js.Array[NodePropSource]] = js.undefined
    
    var specializers: js.UndefOr[js.Array[FromTo]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var tokenizers: js.UndefOr[js.Array[To]] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[ParseWrapper] = js.undefined
  }
  object ParserConfig {
    
    inline def apply(): ParserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParserConfig] (val x: Self) extends AnyVal {
      
      inline def setBufferLength(value: Double): Self = StObject.set(x, "bufferLength", value.asInstanceOf[js.Any])
      
      inline def setBufferLengthUndefined: Self = StObject.set(x, "bufferLength", js.undefined)
      
      inline def setContextTracker(value: ContextTracker[Any]): Self = StObject.set(x, "contextTracker", value.asInstanceOf[js.Any])
      
      inline def setContextTrackerUndefined: Self = StObject.set(x, "contextTracker", js.undefined)
      
      inline def setDialect(value: String): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
      
      inline def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
      
      inline def setProps(value: js.Array[NodePropSource]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPropsVarargs(value: NodePropSource*): Self = StObject.set(x, "props", js.Array(value*))
      
      inline def setSpecializers(value: js.Array[FromTo]): Self = StObject.set(x, "specializers", value.asInstanceOf[js.Any])
      
      inline def setSpecializersUndefined: Self = StObject.set(x, "specializers", js.undefined)
      
      inline def setSpecializersVarargs(value: FromTo*): Self = StObject.set(x, "specializers", js.Array(value*))
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTokenizers(value: js.Array[To]): Self = StObject.set(x, "tokenizers", value.asInstanceOf[js.Any])
      
      inline def setTokenizersUndefined: Self = StObject.set(x, "tokenizers", js.undefined)
      
      inline def setTokenizersVarargs(value: To*): Self = StObject.set(x, "tokenizers", js.Array(value*))
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWrap(
        value: (/* inner */ PartialParse, /* input */ Input, /* fragments */ js.Array[typings.lezerCommon.distParseMod.TreeFragment], /* ranges */ js.Array[typings.lezerCommon.anon.From]) => PartialParse
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction4(value))
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait TokenCache extends StObject {
    
    var actions: js.Array[Double]
    
    def addActions(stack: Stack, token: Double, end: Double, index: Double): Double
    
    def getActions(stack: Stack): js.Array[Double]
    
    def getMainToken(stack: Stack): CachedToken
    
    var mainToken: CachedToken | Null
    
    def putAction(action: Double, token: Double, end: Double, index: Double): Double
    
    val stream: InputStream
    
    var tokens: js.Array[CachedToken]
    
    def updateCachedToken(token: CachedToken, tokenizer: Tokenizer, stack: Stack): Unit
  }
  object TokenCache {
    
    inline def apply(
      actions: js.Array[Double],
      addActions: (Stack, Double, Double, Double) => Double,
      getActions: Stack => js.Array[Double],
      getMainToken: Stack => CachedToken,
      putAction: (Double, Double, Double, Double) => Double,
      stream: InputStream,
      tokens: js.Array[CachedToken],
      updateCachedToken: (CachedToken, Tokenizer, Stack) => Unit
    ): TokenCache = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], addActions = js.Any.fromFunction4(addActions), getActions = js.Any.fromFunction1(getActions), getMainToken = js.Any.fromFunction1(getMainToken), putAction = js.Any.fromFunction4(putAction), stream = stream.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], updateCachedToken = js.Any.fromFunction3(updateCachedToken), mainToken = null)
      __obj.asInstanceOf[TokenCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenCache] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[Double]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Double*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAddActions(value: (Stack, Double, Double, Double) => Double): Self = StObject.set(x, "addActions", js.Any.fromFunction4(value))
      
      inline def setGetActions(value: Stack => js.Array[Double]): Self = StObject.set(x, "getActions", js.Any.fromFunction1(value))
      
      inline def setGetMainToken(value: Stack => CachedToken): Self = StObject.set(x, "getMainToken", js.Any.fromFunction1(value))
      
      inline def setMainToken(value: CachedToken): Self = StObject.set(x, "mainToken", value.asInstanceOf[js.Any])
      
      inline def setMainTokenNull: Self = StObject.set(x, "mainToken", null)
      
      inline def setPutAction(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "putAction", js.Any.fromFunction4(value))
      
      inline def setStream(value: InputStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[CachedToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: CachedToken*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setUpdateCachedToken(value: (CachedToken, Tokenizer, Stack) => Unit): Self = StObject.set(x, "updateCachedToken", js.Any.fromFunction3(value))
    }
  }
}
