package typings.hastUtilToEstree

import typings.hastUtilToEstree.libMod.EstreeProgram
import typings.hastUtilToEstree.libMod.MdxFlowExpression
import typings.hastUtilToEstree.libMod.MdxJsxAttribute
import typings.hastUtilToEstree.libMod.MdxJsxAttributeValueExpression
import typings.hastUtilToEstree.libMod.MdxJsxExpressionAttribute
import typings.hastUtilToEstree.libMod.MdxJsxFlowElement
import typings.hastUtilToEstree.libMod.MdxJsxTextElement
import typings.hastUtilToEstree.libMod.MdxTextExpression
import typings.hastUtilToEstree.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-to-estree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toEstree(tree: MdxFlowExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxFlowExpression, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttribute): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttributeValueExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttributeValueExpression, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttribute, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxExpressionAttribute): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxExpressionAttribute, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxFlowElement): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxFlowElement, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxTextElement): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxTextElement, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxTextExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxTextExpression, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: Node): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: Node, options: typings.hastUtilToEstree.libMod.Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  
  type Handle = typings.hastUtilToEstree.libMod.Handle
  
  type Options = typings.hastUtilToEstree.libMod.Options
  
  type Space = typings.hastUtilToEstree.libMod.Space
}
