package typings.mathjs

import org.scalablytyped.runtime.Shortcut
import typings.mathjs.anon.NodeTNode
import typings.mathjs.mod.AccessorNode
import typings.mathjs.mod.ArrayNode
import typings.mathjs.mod.AssignmentNode
import typings.mathjs.mod.BlockNode
import typings.mathjs.mod.ConditionalNode
import typings.mathjs.mod.ConstantNode
import typings.mathjs.mod.FunctionAssignmentNode
import typings.mathjs.mod.FunctionNode
import typings.mathjs.mod.IndexNode
import typings.mathjs.mod.MathJsStatic
import typings.mathjs.mod.MathNode
import typings.mathjs.mod.Matrix
import typings.mathjs.mod.ObjectNode
import typings.mathjs.mod.OperatorNode
import typings.mathjs.mod.OperatorNodeFn
import typings.mathjs.mod.ParenthesisNode
import typings.mathjs.mod.RangeNode
import typings.mathjs.mod.RelationalNode
import typings.mathjs.mod.SymbolNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object libEsmNumberMod extends Shortcut {
  
  @JSImport("mathjs/lib/esm/number", JSImport.Namespace)
  @js.native
  val ^ : MathJsStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "AccessorNode")
  @js.native
  open class AccessorNodeCls[TObject /* <: MathNode */] protected ()
    extends StObject
       with AccessorNode[TObject] {
    def this(`object`: TObject, index: IndexNode[js.Array[MathNode]]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ArrayNode")
  @js.native
  open class ArrayNodeCls[TItems /* <: js.Array[MathNode] */] protected ()
    extends StObject
       with ArrayNode[TItems] {
    def this(items: js.Array[MathNode]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "AssignmentNode")
  @js.native
  open class AssignmentNodeCls[TValue /* <: MathNode */] protected ()
    extends StObject
       with AssignmentNode[TValue] {
    def this(`object`: SymbolNode, value: TValue) = this()
    def this(`object`: AccessorNode[MathNode], index: IndexNode[js.Array[MathNode]], value: TValue) = this()
    def this(`object`: SymbolNode, index: IndexNode[js.Array[MathNode]], value: TValue) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "BlockNode")
  @js.native
  open class BlockNodeCls[TNode /* <: MathNode */] protected ()
    extends StObject
       with BlockNode[MathNode] {
    def this(arr: js.Array[NodeTNode[TNode] | typings.mathjs.anon.Node[TNode]]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ConditionalNode")
  @js.native
  open class ConditionalNodeCls[TCond /* <: MathNode */, TTrueNode /* <: MathNode */, TFalseNode /* <: MathNode */] protected ()
    extends StObject
       with ConditionalNode[MathNode, MathNode, MathNode] {
    def this(condition: TCond, trueExpr: TTrueNode, falseExpr: TFalseNode) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ConstantNode")
  @js.native
  open class ConstantNodeCls[TValue /* <: String | Double */] protected ()
    extends StObject
       with ConstantNode[TValue] {
    def this(value: TValue) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "FunctionAssignmentNode")
  @js.native
  open class FunctionAssignmentNodeCls[TExpr /* <: MathNode */] protected ()
    extends StObject
       with FunctionAssignmentNode[TExpr] {
    def this(name: String, params: js.Array[String], expr: TExpr) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "FunctionNode")
  @js.native
  open class FunctionNodeCls[TFn, TArgs /* <: js.Array[MathNode] */] protected ()
    extends StObject
       with FunctionNode[TFn, TArgs] {
    def this(fn: TFn, args: TArgs) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "IndexNode")
  @js.native
  open class IndexNodeCls[TDims /* <: js.Array[MathNode] */] protected ()
    extends StObject
       with IndexNode[js.Array[MathNode]] {
    def this(dimensions: TDims) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "Matrix")
  @js.native
  open class MatrixCls ()
    extends StObject
       with Matrix
  
  // Class-like constructors
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("mathjs/lib/esm/number", "Node")
  @js.native
  open class Node ()
    extends StObject
       with MathNode
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ObjectNode")
  @js.native
  open class ObjectNodeCls[TProps /* <: Record[String, MathNode] */] protected ()
    extends StObject
       with ObjectNode[TProps] {
    def this(properties: TProps) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "OperatorNode")
  @js.native
  open class OperatorNodeCls[TOp /* <: /* import warning: importer.ImportType#apply Failed type conversion: mathjs.mathjs.OperatorNodeMap[TFn] */ js.Any */, TFn /* <: OperatorNodeFn */, TArgs /* <: js.Array[MathNode] */] protected ()
    extends StObject
       with OperatorNode[TOp, TFn, TArgs] {
    def this(op: TOp, fn: TFn, args: TArgs) = this()
    def this(op: TOp, fn: TFn, args: TArgs, `implicit`: Boolean) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ParenthesisNode")
  @js.native
  open class ParenthesisNodeCls[TContent /* <: MathNode */] protected ()
    extends StObject
       with ParenthesisNode[TContent] {
    def this(content: TContent) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "RangeNode")
  @js.native
  open class RangeNodeCls[TStart /* <: MathNode */, TEnd /* <: MathNode */, TStep /* <: MathNode */] protected ()
    extends StObject
       with RangeNode[TStart, TEnd, TStep] {
    def this(start: TStart, end: TEnd) = this()
    def this(start: TStart, end: TEnd, step: TStep) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "RelationalNode")
  @js.native
  open class RelationalNodeCls[TParams /* <: js.Array[MathNode] */] protected ()
    extends StObject
       with RelationalNode[TParams] {
    def this(conditionals: js.Array[String], params: TParams) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "SymbolNode")
  @js.native
  open class SymbolNodeCls protected ()
    extends StObject
       with SymbolNode {
    def this(name: String) = this()
  }
  
  type _To = MathJsStatic
  
  /* This means you don't have to write `^`, but can instead just say `libEsmNumberMod.foo` */
  override def _to: MathJsStatic = ^
}
