package typings.mathjs

import org.scalablytyped.runtime.Shortcut
import typings.mathjs.anon.NodeMathNode
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
  open class AccessorNodeCls protected ()
    extends StObject
       with AccessorNode {
    def this(`object`: MathNode, index: IndexNode) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ArrayNode")
  @js.native
  open class ArrayNodeCls protected ()
    extends StObject
       with ArrayNode {
    def this(items: js.Array[MathNode]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "AssignmentNode")
  @js.native
  open class AssignmentNodeCls protected ()
    extends StObject
       with AssignmentNode {
    def this(`object`: SymbolNode, value: MathNode) = this()
    def this(`object`: AccessorNode, index: IndexNode, value: MathNode) = this()
    def this(`object`: SymbolNode, index: IndexNode, value: MathNode) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "BlockNode")
  @js.native
  open class BlockNodeCls protected ()
    extends StObject
       with BlockNode {
    def this(arr: js.Array[NodeMathNode | typings.mathjs.anon.Node]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ConditionalNode")
  @js.native
  open class ConditionalNodeCls protected ()
    extends StObject
       with ConditionalNode {
    def this(condition: MathNode, trueExpr: MathNode, falseExpr: MathNode) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "ConstantNode")
  @js.native
  open class ConstantNodeCls protected ()
    extends StObject
       with ConstantNode {
    def this(constant: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "FunctionAssignmentNode")
  @js.native
  open class FunctionAssignmentNodeCls protected ()
    extends StObject
       with FunctionAssignmentNode {
    def this(name: String, params: js.Array[String], expr: MathNode) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "FunctionNode")
  @js.native
  open class FunctionNodeCls protected ()
    extends StObject
       with FunctionNode {
    def this(fn: String, args: js.Array[MathNode]) = this()
    def this(fn: MathNode, args: js.Array[MathNode]) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "IndexNode")
  @js.native
  open class IndexNodeCls protected ()
    extends StObject
       with IndexNode {
    def this(dimensions: js.Array[MathNode]) = this()
    def this(dimensions: js.Array[MathNode], dotNotation: Boolean) = this()
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
  open class ObjectNodeCls protected ()
    extends StObject
       with ObjectNode {
    def this(properties: Record[String, MathNode]) = this()
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
  open class RangeNodeCls protected ()
    extends StObject
       with RangeNode {
    def this(start: MathNode, end: MathNode) = this()
    def this(start: MathNode, end: MathNode, step: MathNode) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mathjs/lib/esm/number", "RelationalNode")
  @js.native
  open class RelationalNodeCls protected ()
    extends StObject
       with RelationalNode {
    def this(conditionals: js.Array[String], params: js.Array[MathNode]) = this()
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
