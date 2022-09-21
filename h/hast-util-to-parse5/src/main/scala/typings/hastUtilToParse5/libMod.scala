package typings.hastUtilToParse5

import typings.hast.mod.DocType
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.DocumentType
import typings.std.Exclude
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-to-parse5/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toParse5(tree: Node): P5Node = ^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any]).asInstanceOf[P5Node]
  inline def toParse5(tree: Node, space: Space): P5Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[P5Node]
  
  type Child = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.Content>[number] */ js.Any
  
  type Comment = typings.hast.mod.Comment
  
  type Doctype = DocType
  
  type Element = typings.hast.mod.Element
  
  type Handle = js.Function2[/* node */ Node, /* schema */ Schema, P5Node]
  
  type Info = typings.propertyInformation.mod.Info
  
  type Node = Child | Root
  
  type P5Attribute = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.Attribute */ Any
  
  type P5Child = Exclude[P5Node, P5Document | P5Fragment]
  
  type P5Comment = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.CommentNode */ Any
  
  type P5Doctype = DocumentType
  
  type P5Document = Document
  
  type P5Element = Element
  
  type P5Fragment = DocumentFragment
  
  type P5Node = Node
  
  type P5Parent = ParentNode
  
  type P5Text = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.TextNode */ Any
  
  type Parent = typings.hast.mod.Parent
  
  type Root = typings.hast.mod.Root
  
  type Schema = typings.propertyInformation.mod.Schema
  
  /* Rewritten from type alias, can be one of: 
    - typings.hastUtilToParse5.hastUtilToParse5Strings.html
    - typings.hastUtilToParse5.hastUtilToParse5Strings.svg
  */
  trait Space extends StObject
  object Space {
    
    inline def html: typings.hastUtilToParse5.hastUtilToParse5Strings.html = "html".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.html]
    
    inline def svg: typings.hastUtilToParse5.hastUtilToParse5Strings.svg = "svg".asInstanceOf[typings.hastUtilToParse5.hastUtilToParse5Strings.svg]
  }
  
  type Text = typings.hast.mod.Text
}
