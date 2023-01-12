package typings.hastUtilToEstree

import typings.estree.mod.Directive
import typings.estree.mod.Expression
import typings.estree.mod.ModuleDeclaration
import typings.estree.mod.Program
import typings.estree.mod.Property
import typings.estree.mod.Statement
import typings.estreeJsx.mod.JSXAttribute
import typings.estreeJsx.mod.JSXElement
import typings.estreeJsx.mod.JSXExpressionContainer
import typings.estreeJsx.mod.JSXFragment
import typings.estreeJsx.mod.JSXOpeningElement
import typings.estreeJsx.mod.JSXSpreadAttribute
import typings.hastUtilToEstree.hastUtilToEstreeStrings.children
import typings.propertyInformation.libUtilSchemaMod.Schema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-to-estree/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toEstree(tree: MdxFlowExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxFlowExpression, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttribute): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttributeValueExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttributeValueExpression, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxAttribute, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxExpressionAttribute): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxExpressionAttribute, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxFlowElement): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxFlowElement, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxTextElement): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxJsxTextElement, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxTextExpression): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: MdxTextExpression, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: Node): EstreeProgram = ^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any]).asInstanceOf[EstreeProgram]
  inline def toEstree(tree: Node, options: Options): EstreeProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("toEstree")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EstreeProgram]
  
  type Comment = typings.hast.mod.Comment
  
  type Content = typings.hast.mod.Content
  
  trait Context extends StObject {
    
    var comments: js.Array[EstreeComment]
    
    var esm: js.Array[EstreeDirective | EstreeStatement | EstreeModuleDeclaration]
    
    def handle(node: Any, context: Context): EstreeJsxChild | Null
    @JSName("handle")
    var handle_Original: Handle
    
    var schema: Schema
  }
  object Context {
    
    inline def apply(
      comments: js.Array[EstreeComment],
      esm: js.Array[EstreeDirective | EstreeStatement | EstreeModuleDeclaration],
      handle: (/* node */ Any, /* context */ Context) => EstreeJsxChild | Null,
      schema: Schema
    ): Context = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], esm = esm.asInstanceOf[js.Any], handle = js.Any.fromFunction2(handle), schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setComments(value: js.Array[EstreeComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: EstreeComment*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setEsm(value: js.Array[EstreeDirective | EstreeStatement | EstreeModuleDeclaration]): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
      
      inline def setEsmVarargs(value: (EstreeDirective | EstreeStatement | EstreeModuleDeclaration)*): Self = StObject.set(x, "esm", js.Array(value*))
      
      inline def setHandle(value: (/* node */ Any, /* context */ Context) => EstreeJsxChild | Null): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  type Element = typings.hast.mod.Element
  
  type EstreeComment = typings.estree.mod.Comment
  
  type EstreeDirective = Directive
  
  type EstreeExpression = Expression
  
  type EstreeJsxAttribute = JSXAttribute
  
  type EstreeJsxAttributeName = /* import warning: importer.ImportType#apply Failed type conversion: hast-util-to-estree.hast-util-to-estree/lib.EstreeJsxAttribute['name'] */ js.Any
  
  type EstreeJsxChild = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<estree.estree.BaseExpression>[number] */ js.Any
  
  type EstreeJsxElement = JSXElement
  
  /* Inlined hast-util-to-estree.hast-util-to-estree/lib.EstreeJsxOpeningElement['name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.hastUtilToEstree.hastUtilToEstreeStrings.`type`
    - typings.hastUtilToEstree.hastUtilToEstreeStrings.name
  */
  trait EstreeJsxElementName extends StObject
  object EstreeJsxElementName {
    
    inline def name: typings.hastUtilToEstree.hastUtilToEstreeStrings.name = "name".asInstanceOf[typings.hastUtilToEstree.hastUtilToEstreeStrings.name]
    
    inline def `type`: typings.hastUtilToEstree.hastUtilToEstreeStrings.`type` = "type".asInstanceOf[typings.hastUtilToEstree.hastUtilToEstreeStrings.`type`]
  }
  
  type EstreeJsxExpressionContainer = JSXExpressionContainer
  
  type EstreeJsxFragment = JSXFragment
  
  type EstreeJsxOpeningElement = JSXOpeningElement
  
  type EstreeJsxSpreadAttribute = JSXSpreadAttribute
  
  type EstreeModuleDeclaration = ModuleDeclaration
  
  type EstreeNode = typings.estree.mod.Node
  
  type EstreeProgram = Program
  
  type EstreeProperty = Property
  
  type EstreeStatement = Statement
  
  type Handle = js.Function2[/* node */ Any, /* context */ Context, EstreeJsxChild | Null]
  
  type JSXIdentifier = typings.estreeJsx.mod.JSXIdentifier
  
  type JSXMemberExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXMemberExpression */ Any
  
  type MdxFlowExpression = typings.mdastUtilMdxExpression.mod.MdxFlowExpression
  
  type MdxJsxAttribute = typings.mdastUtilMdxJsx.mod.MdxJsxAttribute
  
  type MdxJsxAttributeValueExpression = typings.mdastUtilMdxJsx.mod.MdxJsxAttributeValueExpression
  
  type MdxJsxExpressionAttribute = typings.mdastUtilMdxJsx.mod.MdxJsxExpressionAttribute
  
  type MdxJsxFlowElement = typings.mdastUtilMdxJsx.mod.MdxJsxFlowElement
  
  type MdxJsxTextElement = typings.mdastUtilMdxJsx.mod.MdxJsxTextElement
  
  type MdxTextExpression = typings.mdastUtilMdxExpression.mod.MdxTextExpression
  
  type MdxjsEsm = typings.mdastUtilMdxjsEsm.mod.MdxjsEsm
  
  type Node = Root | Content
  
  trait Options extends StObject {
    
    var handlers: js.UndefOr[Record[String, Handle]] = js.undefined
    
    var space: js.UndefOr[Space] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setHandlers(value: Record[String, Handle]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  /* Inlined std.Extract<hast-util-to-estree.hast-util-to-estree/lib.Node, unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>>> */
  type Parent = children
  
  type Root = typings.hast.mod.Root
  
  /* Rewritten from type alias, can be one of: 
    - typings.hastUtilToEstree.hastUtilToEstreeStrings.html
    - typings.hastUtilToEstree.hastUtilToEstreeStrings.svg
  */
  trait Space extends StObject
  object Space {
    
    inline def html: typings.hastUtilToEstree.hastUtilToEstreeStrings.html = "html".asInstanceOf[typings.hastUtilToEstree.hastUtilToEstreeStrings.html]
    
    inline def svg: typings.hastUtilToEstree.hastUtilToEstreeStrings.svg = "svg".asInstanceOf[typings.hastUtilToEstree.hastUtilToEstreeStrings.svg]
  }
  
  type Text = typings.hast.mod.Text
}
