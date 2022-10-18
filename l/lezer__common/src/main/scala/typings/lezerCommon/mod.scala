package typings.lezerCommon

import org.scalablytyped.runtime.StringDictionary
import typings.lezerCommon.anon.Deserialize
import typings.lezerCommon.anon.Error
import typings.lezerCommon.anon.From
import typings.lezerCommon.distMixMod.NestedParse
import typings.lezerCommon.distParseMod.ChangedRange
import typings.lezerCommon.distParseMod.Input
import typings.lezerCommon.distParseMod.ParseWrapper
import typings.lezerCommon.distTreeMod.BuildData
import typings.lezerCommon.distTreeMod.SyntaxNodeRef
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
    def apply(value: Double): js.UndefOr[typings.lezerCommon.distTreeMod.IterMode & Double] = js.native
    
    /* 1 */ val ExcludeBuffers: typings.lezerCommon.distTreeMod.IterMode.ExcludeBuffers & Double = js.native
    
    /* 4 */ val IgnoreMounts: typings.lezerCommon.distTreeMod.IterMode.IgnoreMounts & Double = js.native
    
    /* 8 */ val IgnoreOverlays: typings.lezerCommon.distTreeMod.IterMode.IgnoreOverlays & Double = js.native
    
    /* 2 */ val IncludeAnonymous: typings.lezerCommon.distTreeMod.IterMode.IncludeAnonymous & Double = js.native
  }
  
  @JSImport("@lezer/common", "MountedTree")
  @js.native
  open class MountedTree protected ()
    extends typings.lezerCommon.distTreeMod.MountedTree {
    def this(
      tree: typings.lezerCommon.distTreeMod.Tree,
      overlay: js.Array[From],
      parser: typings.lezerCommon.distParseMod.Parser
    ) = this()
    def this(
      tree: typings.lezerCommon.distTreeMod.Tree,
      overlay: Null,
      parser: typings.lezerCommon.distParseMod.Parser
    ) = this()
  }
  
  @JSImport("@lezer/common", "NodeProp")
  @js.native
  open class NodeProp[T] ()
    extends typings.lezerCommon.distTreeMod.NodeProp[T] {
    def this(config: Deserialize[T]) = this()
  }
  /* static members */
  object NodeProp {
    
    @JSImport("@lezer/common", "NodeProp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lezer/common", "NodeProp.closedBy")
    @js.native
    def closedBy: typings.lezerCommon.distTreeMod.NodeProp[js.Array[String]] = js.native
    inline def closedBy_=(x: typings.lezerCommon.distTreeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closedBy")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.contextHash")
    @js.native
    def contextHash: typings.lezerCommon.distTreeMod.NodeProp[Double] = js.native
    inline def contextHash_=(x: typings.lezerCommon.distTreeMod.NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextHash")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.group")
    @js.native
    def group: typings.lezerCommon.distTreeMod.NodeProp[js.Array[String]] = js.native
    inline def group_=(x: typings.lezerCommon.distTreeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.lookAhead")
    @js.native
    def lookAhead: typings.lezerCommon.distTreeMod.NodeProp[Double] = js.native
    inline def lookAhead_=(x: typings.lezerCommon.distTreeMod.NodeProp[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lookAhead")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.mounted")
    @js.native
    def mounted: typings.lezerCommon.distTreeMod.NodeProp[typings.lezerCommon.distTreeMod.MountedTree] = js.native
    inline def mounted_=(x: typings.lezerCommon.distTreeMod.NodeProp[typings.lezerCommon.distTreeMod.MountedTree]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mounted")(x.asInstanceOf[js.Any])
    
    @JSImport("@lezer/common", "NodeProp.openedBy")
    @js.native
    def openedBy: typings.lezerCommon.distTreeMod.NodeProp[js.Array[String]] = js.native
    inline def openedBy_=(x: typings.lezerCommon.distTreeMod.NodeProp[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openedBy")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "NodeSet")
  @js.native
  open class NodeSet protected ()
    extends typings.lezerCommon.distTreeMod.NodeSet {
    def this(types: js.Array[typings.lezerCommon.distTreeMod.NodeType]) = this()
  }
  
  @JSImport("@lezer/common", "NodeType")
  @js.native
  open class NodeType ()
    extends typings.lezerCommon.distTreeMod.NodeType
  /* static members */
  object NodeType {
    
    @JSImport("@lezer/common", "NodeType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(spec: Error): typings.lezerCommon.distTreeMod.NodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(spec.asInstanceOf[js.Any]).asInstanceOf[typings.lezerCommon.distTreeMod.NodeType]
    
    inline def `match`[T](map: StringDictionary[T]): js.Function1[/* node */ this.type, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(map.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* node */ this.type, js.UndefOr[T]]]
    
    @JSImport("@lezer/common", "NodeType.none")
    @js.native
    def none: typings.lezerCommon.distTreeMod.NodeType = js.native
    inline def none_=(x: typings.lezerCommon.distTreeMod.NodeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "NodeWeakMap")
  @js.native
  open class NodeWeakMap[T] ()
    extends typings.lezerCommon.distTreeMod.NodeWeakMap[T]
  
  /* note: abstract class */ @JSImport("@lezer/common", "Parser")
  @js.native
  open class Parser ()
    extends typings.lezerCommon.distParseMod.Parser
  
  @JSImport("@lezer/common", "Tree")
  @js.native
  open class Tree protected ()
    extends typings.lezerCommon.distTreeMod.Tree {
    def this(
      `type`: typings.lezerCommon.distTreeMod.NodeType,
      children: js.Array[
            typings.lezerCommon.distTreeMod.Tree | typings.lezerCommon.distTreeMod.TreeBuffer
          ],
      positions: js.Array[Double],
      length: Double
    ) = this()
    def this(
      `type`: typings.lezerCommon.distTreeMod.NodeType,
      children: js.Array[
            typings.lezerCommon.distTreeMod.Tree | typings.lezerCommon.distTreeMod.TreeBuffer
          ],
      positions: js.Array[Double],
      length: Double,
      props: js.Array[js.Tuple2[typings.lezerCommon.distTreeMod.NodeProp[Any] | Double, Any]]
    ) = this()
  }
  /* static members */
  object Tree {
    
    @JSImport("@lezer/common", "Tree")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(data: BuildData): typings.lezerCommon.distTreeMod.Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(data.asInstanceOf[js.Any]).asInstanceOf[typings.lezerCommon.distTreeMod.Tree]
    
    @JSImport("@lezer/common", "Tree.empty")
    @js.native
    def empty: typings.lezerCommon.distTreeMod.Tree = js.native
    inline def empty_=(x: typings.lezerCommon.distTreeMod.Tree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@lezer/common", "TreeBuffer")
  @js.native
  open class TreeBuffer protected ()
    extends typings.lezerCommon.distTreeMod.TreeBuffer {
    def this(buffer: js.typedarray.Uint16Array, length: Double, set: typings.lezerCommon.distTreeMod.NodeSet) = this()
  }
  
  @JSImport("@lezer/common", "TreeCursor")
  @js.native
  open class TreeCursor ()
    extends typings.lezerCommon.distTreeMod.TreeCursor
  
  @JSImport("@lezer/common", "TreeFragment")
  @js.native
  open class TreeFragment protected ()
    extends typings.lezerCommon.distParseMod.TreeFragment {
    def this(from: Double, to: Double, tree: typings.lezerCommon.distTreeMod.Tree, offset: Double) = this()
    def this(
      from: Double,
      to: Double,
      tree: typings.lezerCommon.distTreeMod.Tree,
      offset: Double,
      openStart: Boolean
    ) = this()
    def this(
      from: Double,
      to: Double,
      tree: typings.lezerCommon.distTreeMod.Tree,
      offset: Double,
      openStart: Boolean,
      openEnd: Boolean
    ) = this()
    def this(
      from: Double,
      to: Double,
      tree: typings.lezerCommon.distTreeMod.Tree,
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
    
    inline def addTree(tree: typings.lezerCommon.distTreeMod.Tree): js.Array[typings.lezerCommon.distParseMod.TreeFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.lezerCommon.distParseMod.TreeFragment]]
    inline def addTree(
      tree: typings.lezerCommon.distTreeMod.Tree,
      fragments: js.Array[typings.lezerCommon.distParseMod.TreeFragment]
    ): js.Array[typings.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.distParseMod.TreeFragment]]
    inline def addTree(
      tree: typings.lezerCommon.distTreeMod.Tree,
      fragments: js.Array[typings.lezerCommon.distParseMod.TreeFragment],
      partial: Boolean
    ): js.Array[typings.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.distParseMod.TreeFragment]]
    inline def addTree(tree: typings.lezerCommon.distTreeMod.Tree, fragments: Unit, partial: Boolean): js.Array[typings.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("addTree")(tree.asInstanceOf[js.Any], fragments.asInstanceOf[js.Any], partial.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.distParseMod.TreeFragment]]
    
    inline def applyChanges(
      fragments: js.Array[typings.lezerCommon.distParseMod.TreeFragment],
      changes: js.Array[ChangedRange]
    ): js.Array[typings.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.distParseMod.TreeFragment]]
    inline def applyChanges(
      fragments: js.Array[typings.lezerCommon.distParseMod.TreeFragment],
      changes: js.Array[ChangedRange],
      minGap: Double
    ): js.Array[typings.lezerCommon.distParseMod.TreeFragment] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")(fragments.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], minGap.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.lezerCommon.distParseMod.TreeFragment]]
  }
  
  inline def parseMixed(nest: js.Function2[/* node */ SyntaxNodeRef, /* input */ Input, NestedParse | Null]): ParseWrapper = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMixed")(nest.asInstanceOf[js.Any]).asInstanceOf[ParseWrapper]
}
