package typings.lezerCommon

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.anon.Deserialize
import typings.lezerCommon.anon.Error
import typings.lezerCommon.anon.From
import typings.lezerCommon.mixMod.NestedParse
import typings.lezerCommon.parseMod.ChangedRange
import typings.lezerCommon.parseMod.Input
import typings.lezerCommon.parseMod.ParseWrapper
import typings.lezerCommon.treeMod.BuildData
import typings.lezerCommon.treeMod.SyntaxNodeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/common", "DefaultBufferLength")
  @js.native
  val DefaultBufferLength: /* 1024 */ Double = js.native
  
  @JSImport("@lezer/common", "IterMode")
  @js.native
  object IterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.lezerCommon.treeMod.IterMode & Double] = js.native
    
    /* 1 */ val ExcludeBuffers: typings.lezerCommon.treeMod.IterMode.ExcludeBuffers & Double = js.native
    
    /* 4 */ val IgnoreMounts: typings.lezerCommon.treeMod.IterMode.IgnoreMounts & Double = js.native
    
    /* 8 */ val IgnoreOverlays: typings.lezerCommon.treeMod.IterMode.IgnoreOverlays & Double = js.native
    
    /* 2 */ val IncludeAnonymous: typings.lezerCommon.treeMod.IterMode.IncludeAnonymous & Double = js.native
  }
  
  @JSImport("@lezer/common", "MountedTree")
  @js.native
  open class MountedTree protected ()
    extends typings.lezerCommon.treeMod.MountedTree {
    def this(
      tree: typings.lezerCommon.treeMod.Tree,
      overlay: js.Array[From],
      parser: typings.lezerCommon.parseMod.Parser
    ) = this()
    def this(tree: typings.lezerCommon.treeMod.Tree, overlay: Null, parser: typings.lezerCommon.parseMod.Parser) = this()
  }
  
  @JSImport("@lezer/common", "NodeProp")
  @js.native
  open class NodeProp[T] ()
    extends typings.lezerCommon.treeMod.NodeProp[T] {
    def this(config: Deserialize[T]) = this()
  }
  /* static members */
  object NodeProp {
    
    @JSImport("@lezer/common", "NodeProp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lezer/common", "NodeProp.closedBy")
    @js.native
    def closedBy: typings.lezerCommon.treeMod.NodeProp[js.Array[String]] = js.native
    inline def closedBy_=(x: typings.lezerCommon.treeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closedBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.contextHash")
    @js.native
    def contextHash: typings.lezerCommon.treeMod.NodeProp[Double] = js.native
    inline def contextHash_=(x: typings.lezerCommon.treeMod.NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextHash")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.group")
    @js.native
    def group: typings.lezerCommon.treeMod.NodeProp[js.Array[String]] = js.native
    inline def group_=(x: typings.lezerCommon.treeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.lookAhead")
    @js.native
    def lookAhead: typings.lezerCommon.treeMod.NodeProp[Double] = js.native
    inline def lookAhead_=(x: typings.lezerCommon.treeMod.NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lookAhead")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.mounted")
    @js.native
    def mounted: typings.lezerCommon.treeMod.NodeProp[typings.lezerCommon.treeMod.MountedTree] = js.native
    inline def mounted_=(x: typings.lezerCommon.treeMod.NodeProp[typings.lezerCommon.treeMod.MountedTree]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mounted")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.openedBy")
    @js.native
    def openedBy: typings.lezerCommon.treeMod.NodeProp[js.Array[String]] = js.native
    inline def openedBy_=(x: typings.lezerCommon.treeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openedBy")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "NodeSet")
  @js.native
  open class NodeSet protected ()
    extends typings.lezerCommon.treeMod.NodeSet {
    def this(types: js.Array[typings.lezerCommon.treeMod.NodeType]) = this()
  }
  
  @JSImport("@lezer/common", "NodeType")
  @js.native
  open class NodeType ()
    extends typings.lezerCommon.treeMod.NodeType
  /* static members */
  object NodeType {
    
    @JSImport("@lezer/common", "NodeType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(spec: Error): typings.lezerCommon.treeMod.NodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[typings.lezerCommon.treeMod.NodeType]
    
    inline def `match`[T](map: StringDictionary[T]): js.Function1[/* node */ this.type, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(map.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ this.type, js.UndefOr[T]]]
    
    @JSImport("@lezer/common", "NodeType.none")
    @js.native
    def none: typings.lezerCommon.treeMod.NodeType = js.native
    inline def none_=(x: typings.lezerCommon.treeMod.NodeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "NodeWeakMap")
  @js.native
  open class NodeWeakMap[T] ()
    extends typings.lezerCommon.treeMod.NodeWeakMap[T]
  
  @JSImport("@lezer/common", "Parser")
  @js.native
  abstract class Parser ()
    extends typings.lezerCommon.parseMod.Parser
  
  @JSImport("@lezer/common", "Tree")
  @js.native
  open class Tree protected ()
    extends typings.lezerCommon.treeMod.Tree {
    def this(
      `type`: typings.lezerCommon.treeMod.NodeType,
      children: js.Array[typings.lezerCommon.treeMod.Tree | typings.lezerCommon.treeMod.TreeBuffer],
      positions: js.Array[Double],
      length: Double
    ) = this()
    def this(
      `type`: typings.lezerCommon.treeMod.NodeType,
      children: js.Array[typings.lezerCommon.treeMod.Tree | typings.lezerCommon.treeMod.TreeBuffer],
      positions: js.Array[Double],
      length: Double,
      props: js.Array[js.Tuple2[typings.lezerCommon.treeMod.NodeProp[Any] | Double, Any]]
    ) = this()
  }
  /* static members */
  object Tree {
    
    @JSImport("@lezer/common", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(data: BuildData): typings.lezerCommon.treeMod.Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(data.asInstanceOf[js.Any]).asInstanceOf[typings.lezerCommon.treeMod.Tree]
    
    @JSImport("@lezer/common", "Tree.empty")
    @js.native
    def empty: typings.lezerCommon.treeMod.Tree = js.native
    inline def empty_=(x: typings.lezerCommon.treeMod.Tree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "TreeBuffer")
  @js.native
  open class TreeBuffer protected ()
    extends typings.lezerCommon.treeMod.TreeBuffer {
    def this(buffer: js.typedarray.Uint16Array, length: Double, set: typings.lezerCommon.treeMod.NodeSet) = this()
  }
  
  @JSImport("@lezer/common", "TreeCursor")
  @js.native
  open class TreeCursor ()
    extends typings.lezerCommon.treeMod.TreeCursor
  
  @JSImport("@lezer/common", "TreeFragment")
  @js.native
  open class TreeFragment protected ()
    extends typings.lezerCommon.parseMod.TreeFragment {
    def this(from: Double, to: Double, tree: typings.lezerCommon.treeMod.Tree, offset: Double) = this()
    def this(
      from: Double,
      to: Double,
      tree: typings.lezerCommon.treeMod.Tree,
      offset: Double,
      openStart: Boolean
    ) = this()
    def this(
      from: Double,
      to: Double,
      tree: typings.lezerCommon.treeMod.Tree,
      offset: Double,
      openStart: Boolean,
      openEnd: Boolean
    ) = this()
    def this(
      from: Double,
      to: Double,
      tree: typings.lezerCommon.treeMod.Tree,
      offset: Double,
      openStart: Unit,
      openEnd: Boolean
    ) = this()
  }
  /* static members */
  object TreeFragment {
    
    @JSImport("@lezer/common", "TreeFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addTree(tree: typings.lezerCommon.treeMod.Tree): js.Array[typings.lezerCommon.parseMod.TreeFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.lezerCommon.parseMod.TreeFragment]]
    inline def addTree(
      tree: typings.lezerCommon.treeMod.Tree,
      fragments: js.Array[typings.lezerCommon.parseMod.TreeFragment]
    ): js.Array[typings.lezerCommon.parseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.parseMod.TreeFragment]]
    inline def addTree(
      tree: typings.lezerCommon.treeMod.Tree,
      fragments: js.Array[typings.lezerCommon.parseMod.TreeFragment],
      partial: Boolean
    ): js.Array[typings.lezerCommon.parseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.parseMod.TreeFragment]]
    inline def addTree(tree: typings.lezerCommon.treeMod.Tree, fragments: Unit, partial: Boolean): js.Array[typings.lezerCommon.parseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.parseMod.TreeFragment]]
    
    inline def applyChanges(fragments: js.Array[typings.lezerCommon.parseMod.TreeFragment], changes: js.Array[ChangedRange]): js.Array[typings.lezerCommon.parseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.parseMod.TreeFragment]]
    inline def applyChanges(
      fragments: js.Array[typings.lezerCommon.parseMod.TreeFragment],
      changes: js.Array[ChangedRange],
      minGap: Double
    ): js.Array[typings.lezerCommon.parseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], minGap.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.parseMod.TreeFragment]]
  }
  
  inline def parseMixed(nest: js.Function2[/* node */ SyntaxNodeRef, /* input */ Input, NestedParse | Null]): ParseWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMixed")(nest.asInstanceOf[js.Any]).asInstanceOf[ParseWrapper]
}
