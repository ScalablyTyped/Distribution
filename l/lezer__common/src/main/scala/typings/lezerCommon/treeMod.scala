package typings.lezerCommon

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.anon.Deserialize
import typings.lezerCommon.anon.Enter
import typings.lezerCommon.anon.Error
import typings.lezerCommon.anon.From
import typings.lezerCommon.anon.MakeTree
import typings.lezerCommon.lezerCommonNumbers.`-1`
import typings.lezerCommon.lezerCommonNumbers.`-2`
import typings.lezerCommon.lezerCommonNumbers.`0`
import typings.lezerCommon.lezerCommonNumbers.`1`
import typings.lezerCommon.lezerCommonNumbers.`2`
import typings.lezerCommon.lezerCommonNumbers.`4`
import typings.lezerCommon.parseMod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  @JSImport("@lezer/common/dist/tree", "DefaultBufferLength")
  @js.native
  val DefaultBufferLength: /* 1024 */ Double = js.native
  
  @js.native
  sealed trait IterMode extends StObject
  @JSImport("@lezer/common/dist/tree", "IterMode")
  @js.native
  object IterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[IterMode & Double] = js.native
    
    @js.native
    sealed trait ExcludeBuffers
      extends StObject
         with IterMode
    /* 1 */ val ExcludeBuffers: typings.lezerCommon.treeMod.IterMode.ExcludeBuffers & Double = js.native
    
    @js.native
    sealed trait IgnoreMounts
      extends StObject
         with IterMode
    /* 4 */ val IgnoreMounts: typings.lezerCommon.treeMod.IterMode.IgnoreMounts & Double = js.native
    
    @js.native
    sealed trait IgnoreOverlays
      extends StObject
         with IterMode
    /* 8 */ val IgnoreOverlays: typings.lezerCommon.treeMod.IterMode.IgnoreOverlays & Double = js.native
    
    @js.native
    sealed trait IncludeAnonymous
      extends StObject
         with IterMode
    /* 2 */ val IncludeAnonymous: typings.lezerCommon.treeMod.IterMode.IncludeAnonymous & Double = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "MountedTree")
  @js.native
  open class MountedTree protected () extends StObject {
    def this(tree: Tree, overlay: js.Array[From], parser: Parser) = this()
    def this(tree: Tree, overlay: Null, parser: Parser) = this()
    
    val overlay: js.Array[From] | Null = js.native
    
    val parser: Parser = js.native
    
    val tree: Tree = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "NodeProp")
  @js.native
  open class NodeProp[T] () extends StObject {
    def this(config: Deserialize[T]) = this()
    
    def add(`match`: js.Function1[/* type */ NodeType, js.UndefOr[T]]): NodePropSource = js.native
    def add(`match`: StringDictionary[T]): NodePropSource = js.native
    
    def deserialize(str: String): T = js.native
    
    var perNode: Boolean = js.native
  }
  /* static members */
  object NodeProp {
    
    @JSImport("@lezer/common/dist/tree", "NodeProp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lezer/common/dist/tree", "NodeProp.closedBy")
    @js.native
    def closedBy: NodeProp[js.Array[String]] = js.native
    inline def closedBy_=(x: NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closedBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common/dist/tree", "NodeProp.contextHash")
    @js.native
    def contextHash: NodeProp[Double] = js.native
    inline def contextHash_=(x: NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextHash")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common/dist/tree", "NodeProp.group")
    @js.native
    def group: NodeProp[js.Array[String]] = js.native
    inline def group_=(x: NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common/dist/tree", "NodeProp.lookAhead")
    @js.native
    def lookAhead: NodeProp[Double] = js.native
    inline def lookAhead_=(x: NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lookAhead")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common/dist/tree", "NodeProp.mounted")
    @js.native
    def mounted: NodeProp[MountedTree] = js.native
    inline def mounted_=(x: NodeProp[MountedTree]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mounted")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common/dist/tree", "NodeProp.openedBy")
    @js.native
    def openedBy: NodeProp[js.Array[String]] = js.native
    inline def openedBy_=(x: NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openedBy")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common/dist/tree", "NodeSet")
  @js.native
  open class NodeSet protected () extends StObject {
    def this(types: js.Array[NodeType]) = this()
    
    def extend(props: NodePropSource*): NodeSet = js.native
    
    val types: js.Array[NodeType] = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "NodeType")
  @js.native
  open class NodeType () extends StObject {
    
    val id: Double = js.native
    
    def is(name: String): Boolean = js.native
    def is(name: Double): Boolean = js.native
    
    def isAnonymous: Boolean = js.native
    
    def isError: Boolean = js.native
    
    def isSkipped: Boolean = js.native
    
    def isTop: Boolean = js.native
    
    val name: String = js.native
    
    def prop[T](prop: NodeProp[T]): js.UndefOr[T] = js.native
  }
  /* static members */
  object NodeType {
    
    @JSImport("@lezer/common/dist/tree", "NodeType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(spec: Error): NodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[NodeType]
    
    inline def `match`[T](map: StringDictionary[T]): js.Function1[/* node */ this.type, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(map.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ this.type, js.UndefOr[T]]]
    
    @JSImport("@lezer/common/dist/tree", "NodeType.none")
    @js.native
    def none: NodeType = js.native
    inline def none_=(x: NodeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common/dist/tree", "NodeWeakMap")
  @js.native
  open class NodeWeakMap[T] () extends StObject {
    
    def cursorGet(cursor: TreeCursor): js.UndefOr[T] = js.native
    
    def cursorSet(cursor: TreeCursor, value: T): Unit = js.native
    
    def get(node: SyntaxNode): js.UndefOr[T] = js.native
    
    /* private */ var getBuffer: Any = js.native
    
    /* private */ var map: Any = js.native
    
    def set(node: SyntaxNode, value: T): Unit = js.native
    
    /* private */ var setBuffer: Any = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "Range")
  @js.native
  open class Range protected () extends StObject {
    def this(from: Double, to: Double) = this()
    
    val from: Double = js.native
    
    val to: Double = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "Tree")
  @js.native
  open class Tree protected () extends StObject {
    def this(
      `type`: NodeType,
      children: js.Array[Tree | TreeBuffer],
      positions: js.Array[Double],
      length: Double
    ) = this()
    def this(
      `type`: NodeType,
      children: js.Array[Tree | TreeBuffer],
      positions: js.Array[Double],
      length: Double,
      props: js.Array[js.Tuple2[NodeProp[Any] | Double, Any]]
    ) = this()
    
    def balance(): Tree = js.native
    def balance(config: MakeTree): Tree = js.native
    
    val children: js.Array[Tree | TreeBuffer] = js.native
    
    def cursor(): TreeCursor = js.native
    def cursor(mode: IterMode): TreeCursor = js.native
    
    def cursorAt(pos: Double): TreeCursor = js.native
    def cursorAt(pos: Double, side: `-1` | `0` | `1`): TreeCursor = js.native
    def cursorAt(pos: Double, side: `-1` | `0` | `1`, mode: IterMode): TreeCursor = js.native
    def cursorAt(pos: Double, side: Unit, mode: IterMode): TreeCursor = js.native
    
    def iterate(spec: Enter): Unit = js.native
    
    val length: Double = js.native
    
    val positions: js.Array[Double] = js.native
    
    def prop[T](prop: NodeProp[T]): js.UndefOr[T] = js.native
    
    def propValues: js.Array[js.Tuple2[NodeProp[Any] | Double, Any]] = js.native
    
    def resolve(pos: Double): SyntaxNode = js.native
    def resolve(pos: Double, side: `-1` | `0` | `1`): SyntaxNode = js.native
    
    def resolveInner(pos: Double): SyntaxNode = js.native
    def resolveInner(pos: Double, side: `-1` | `0` | `1`): SyntaxNode = js.native
    
    def topNode: SyntaxNode = js.native
    
    val `type`: NodeType = js.native
  }
  /* static members */
  object Tree {
    
    @JSImport("@lezer/common/dist/tree", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(data: BuildData): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(data.asInstanceOf[js.Any]).asInstanceOf[Tree]
    
    @JSImport("@lezer/common/dist/tree", "Tree.empty")
    @js.native
    def empty: Tree = js.native
    inline def empty_=(x: Tree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common/dist/tree", "TreeBuffer")
  @js.native
  open class TreeBuffer protected () extends StObject {
    def this(buffer: js.typedarray.Uint16Array, length: Double, set: NodeSet) = this()
    
    val buffer: js.typedarray.Uint16Array = js.native
    
    val length: Double = js.native
    
    val set: NodeSet = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "TreeCursor")
  @js.native
  open class TreeCursor ()
    extends StObject
       with SyntaxNodeRef {
    
    /* private */ var atLastNode: Any = js.native
    
    /* private */ var bufferNode: Any = js.native
    
    def childAfter(pos: Double): Boolean = js.native
    
    def childBefore(pos: Double): Boolean = js.native
    
    def enter(pos: Double, side: `-1` | `0` | `1`): Boolean = js.native
    def enter(pos: Double, side: `-1` | `0` | `1`, mode: IterMode): Boolean = js.native
    
    def firstChild(): Boolean = js.native
    
    /* CompleteClass */
    override val from: Double = js.native
    
    def iterate(enter: js.Function1[/* node */ SyntaxNodeRef, Boolean | Unit]): Unit = js.native
    def iterate(
      enter: js.Function1[/* node */ SyntaxNodeRef, Boolean | Unit],
      leave: js.Function1[/* node */ SyntaxNodeRef, Unit]
    ): Unit = js.native
    
    def lastChild(): Boolean = js.native
    
    /* CompleteClass */
    override def matchContext(context: js.Array[String]): Boolean = js.native
    
    /* private */ var move: Any = js.native
    
    def moveTo(pos: Double): this.type = js.native
    def moveTo(pos: Double, side: `-1` | `0` | `1`): this.type = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    @JSName("name")
    def name_MTreeCursor: String = js.native
    
    def next(): Boolean = js.native
    def next(enter: Boolean): Boolean = js.native
    
    def nextSibling(): Boolean = js.native
    
    /* CompleteClass */
    override val node: SyntaxNode = js.native
    @JSName("node")
    def node_MTreeCursor: SyntaxNode = js.native
    
    def parent(): Boolean = js.native
    
    def prev(): Boolean = js.native
    def prev(enter: Boolean): Boolean = js.native
    
    def prevSibling(): Boolean = js.native
    
    /* private */ var stack: Any = js.native
    
    /* CompleteClass */
    override val to: Double = js.native
    
    /* CompleteClass */
    override val tree: Tree | Null = js.native
    @JSName("tree")
    def tree_MTreeCursor: Tree | Null = js.native
    
    /* CompleteClass */
    override val `type`: NodeType = js.native
    
    /* private */ var `yield`: Any = js.native
    
    /* private */ var yieldBuf: Any = js.native
    
    /* private */ var yieldNode: Any = js.native
  }
  
  @JSImport("@lezer/common/dist/tree", "TreeNode")
  @js.native
  open class TreeNode protected ()
    extends StObject
       with SyntaxNode {
    def this(_tree: Tree, from: Double, index: Double) = this()
    def this(_tree: Tree, from: Double, index: Double, _parent: TreeNode) = this()
    
    val _parent: TreeNode | Null = js.native
    
    val _tree: Tree = js.native
    
    def enter(pos: Double, side: `-1` | `0` | `1`, mode: Double): TreeNode | BufferNode = js.native
    
    @JSName("firstChild")
    def firstChild_MTreeNode: TreeNode | BufferNode = js.native
    
    /* CompleteClass */
    override val from: Double = js.native
    
    val index: Double = js.native
    
    @JSName("lastChild")
    def lastChild_MTreeNode: TreeNode | BufferNode = js.native
    
    /* CompleteClass */
    override def matchContext(context: js.Array[String]): Boolean = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    @JSName("name")
    def name_MTreeNode: String = js.native
    
    def nextChild(i: Double, dir: `1` | `-1`, pos: Double, side: Side): TreeNode | BufferNode | Null = js.native
    def nextChild(i: Double, dir: `1` | `-1`, pos: Double, side: Side, mode: IterMode): TreeNode | BufferNode | Null = js.native
    
    @JSName("nextSibling")
    def nextSibling_MTreeNode: SyntaxNode | Null = js.native
    
    def nextSignificantParent(): TreeNode = js.native
    
    /* CompleteClass */
    override val node: SyntaxNode = js.native
    @JSName("node")
    def node_MTreeNode: this.type = js.native
    
    @JSName("parent")
    def parent_MTreeNode: TreeNode | Null = js.native
    
    @JSName("prevSibling")
    def prevSibling_MTreeNode: SyntaxNode | Null = js.native
    
    /* CompleteClass */
    override val to: Double = js.native
    @JSName("to")
    def to_MTreeNode: Double = js.native
    
    /* CompleteClass */
    override val tree: Tree | Null = js.native
    @JSName("tree")
    def tree_MTreeNode: Tree = js.native
    
    /* CompleteClass */
    override val `type`: NodeType = js.native
    @JSName("type")
    def type_MTreeNode: NodeType = js.native
  }
  
  trait BufferContext extends StObject {
    
    val buffer: TreeBuffer
    
    val index: Double
    
    val parent: TreeNode
    
    val start: Double
  }
  object BufferContext {
    
    inline def apply(buffer: TreeBuffer, index: Double, parent: TreeNode, start: Double): BufferContext = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferContext]
    }
    
    extension [Self <: BufferContext](x: Self) {
      
      inline def setBuffer(value: TreeBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParent(value: TreeNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferCursor extends StObject {
    
    var end: Double
    
    def fork(): BufferCursor
    
    var id: Double
    
    def next(): Unit
    
    var pos: Double
    
    var size: Double
    
    var start: Double
  }
  object BufferCursor {
    
    inline def apply(
      end: Double,
      fork: () => BufferCursor,
      id: Double,
      next: () => Unit,
      pos: Double,
      size: Double,
      start: Double
    ): BufferCursor = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fork = js.Any.fromFunction0(fork), id = id.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), pos = pos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferCursor]
    }
    
    extension [Self <: BufferCursor](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFork(value: () => BufferCursor): Self = StObject.set(x, "fork", js.Any.fromFunction0(value))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BufferNode
    extends StObject
       with SyntaxNode {
    
    val _parent: BufferNode | Null = js.native
    
    def child(dir: `1` | `-1`, pos: Double, side: Side): BufferNode | Null = js.native
    
    val context: BufferContext = js.native
    
    def externalSibling(dir: `1` | `-1`): TreeNode | BufferNode = js.native
    
    @JSName("firstChild")
    def firstChild_MBufferNode: BufferNode = js.native
    
    @JSName("from")
    def from_MBufferNode: Double = js.native
    
    val index: Double = js.native
    
    @JSName("lastChild")
    def lastChild_MBufferNode: BufferNode = js.native
    
    @JSName("name")
    def name_MBufferNode: String = js.native
    
    @JSName("nextSibling")
    def nextSibling_MBufferNode: SyntaxNode | Null = js.native
    
    @JSName("node")
    def node_MBufferNode: this.type = js.native
    
    @JSName("parent")
    def parent_MBufferNode: SyntaxNode | Null = js.native
    
    @JSName("prevSibling")
    def prevSibling_MBufferNode: SyntaxNode | Null = js.native
    
    @JSName("to")
    def to_MBufferNode: Double = js.native
    
    @JSName("tree")
    def tree_MBufferNode: Any = js.native
  }
  
  trait BuildData extends StObject {
    
    var buffer: BufferCursor | js.Array[Double]
    
    var bufferStart: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var maxBufferLength: js.UndefOr[Double] = js.undefined
    
    var minRepeatType: js.UndefOr[Double] = js.undefined
    
    var nodeSet: NodeSet
    
    var reused: js.UndefOr[js.Array[Tree]] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var topID: Double
  }
  object BuildData {
    
    inline def apply(buffer: BufferCursor | js.Array[Double], nodeSet: NodeSet, topID: Double): BuildData = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], nodeSet = nodeSet.asInstanceOf[js.Any], topID = topID.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildData]
    }
    
    extension [Self <: BuildData](x: Self) {
      
      inline def setBuffer(value: BufferCursor | js.Array[Double]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferStart(value: Double): Self = StObject.set(x, "bufferStart", value.asInstanceOf[js.Any])
      
      inline def setBufferStartUndefined: Self = StObject.set(x, "bufferStart", js.undefined)
      
      inline def setBufferVarargs(value: Double*): Self = StObject.set(x, "buffer", js.Array(value*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
      
      inline def setMinRepeatType(value: Double): Self = StObject.set(x, "minRepeatType", value.asInstanceOf[js.Any])
      
      inline def setMinRepeatTypeUndefined: Self = StObject.set(x, "minRepeatType", js.undefined)
      
      inline def setNodeSet(value: NodeSet): Self = StObject.set(x, "nodeSet", value.asInstanceOf[js.Any])
      
      inline def setReused(value: js.Array[Tree]): Self = StObject.set(x, "reused", value.asInstanceOf[js.Any])
      
      inline def setReusedUndefined: Self = StObject.set(x, "reused", js.undefined)
      
      inline def setReusedVarargs(value: Tree*): Self = StObject.set(x, "reused", js.Array(value*))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTopID(value: Double): Self = StObject.set(x, "topID", value.asInstanceOf[js.Any])
    }
  }
  
  type NodePropSource = js.Function1[/* type */ NodeType, Null | (js.Tuple2[NodeProp[Any], Any])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.lezerCommon.lezerCommonNumbers.`-2`
    - typings.lezerCommon.lezerCommonNumbers.`-1`
    - typings.lezerCommon.lezerCommonNumbers.`0`
    - typings.lezerCommon.lezerCommonNumbers.`1`
    - typings.lezerCommon.lezerCommonNumbers.`2`
    - typings.lezerCommon.lezerCommonNumbers.`4`
  */
  trait Side extends StObject
  object Side {
    
    inline def After: `2` = 2.asInstanceOf[`2`]
    
    inline def Around: `0` = 0.asInstanceOf[`0`]
    
    inline def AtOrAfter: `1` = 1.asInstanceOf[`1`]
    
    inline def AtOrBefore: `-1` = -1.asInstanceOf[`-1`]
    
    inline def Before: `-2` = -2.asInstanceOf[`-2`]
    
    inline def DontCare: `4` = 4.asInstanceOf[`4`]
  }
  
  @js.native
  trait SyntaxNode
    extends StObject
       with SyntaxNodeRef {
    
    def childAfter(pos: Double): SyntaxNode | Null = js.native
    
    def childBefore(pos: Double): SyntaxNode | Null = js.native
    
    def cursor(): TreeCursor = js.native
    def cursor(mode: IterMode): TreeCursor = js.native
    
    def enter(pos: Double, side: `-1` | `0` | `1`): SyntaxNode | Null = js.native
    def enter(pos: Double, side: `-1` | `0` | `1`, mode: IterMode): SyntaxNode | Null = js.native
    
    def enterUnfinishedNodesBefore(pos: Double): SyntaxNode = js.native
    
    var firstChild: SyntaxNode | Null = js.native
    
    def getChild(`type`: String): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: String): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: String, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: String, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Double): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Double, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Double, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Null, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Null, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Unit, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: String, before: Unit, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: Double): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: String): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: String, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: String, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Double): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Double, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Double, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Null, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Null, after: Double): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Unit, after: String): SyntaxNode | Null = js.native
    def getChild(`type`: Double, before: Unit, after: Double): SyntaxNode | Null = js.native
    
    def getChildren(`type`: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: String, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: String, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Double, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Double, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Null, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Null, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Unit, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: String, before: Unit, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: String, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: String, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Double, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Double, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Null, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Null, after: Double): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Unit, after: String): js.Array[SyntaxNode] = js.native
    def getChildren(`type`: Double, before: Unit, after: Double): js.Array[SyntaxNode] = js.native
    
    var lastChild: SyntaxNode | Null = js.native
    
    var nextSibling: SyntaxNode | Null = js.native
    
    var parent: SyntaxNode | Null = js.native
    
    var prevSibling: SyntaxNode | Null = js.native
    
    def resolve(pos: Double): SyntaxNode = js.native
    def resolve(pos: Double, side: `-1` | `0` | `1`): SyntaxNode = js.native
    
    def resolveInner(pos: Double): SyntaxNode = js.native
    def resolveInner(pos: Double, side: `-1` | `0` | `1`): SyntaxNode = js.native
    
    def toTree(): Tree = js.native
  }
  
  trait SyntaxNodeRef extends StObject {
    
    val from: Double
    
    def matchContext(context: js.Array[String]): Boolean
    
    val name: String
    
    val node: SyntaxNode
    
    val to: Double
    
    val tree: Tree | Null
    
    val `type`: NodeType
  }
  object SyntaxNodeRef {
    
    inline def apply(
      from: Double,
      matchContext: js.Array[String] => Boolean,
      name: String,
      node: SyntaxNode,
      to: Double,
      `type`: NodeType
    ): SyntaxNodeRef = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], matchContext = js.Any.fromFunction1(matchContext), name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], tree = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxNodeRef]
    }
    
    extension [Self <: SyntaxNodeRef](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMatchContext(value: js.Array[String] => Boolean): Self = StObject.set(x, "matchContext", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: SyntaxNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTree(value: Tree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeNull: Self = StObject.set(x, "tree", null)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
