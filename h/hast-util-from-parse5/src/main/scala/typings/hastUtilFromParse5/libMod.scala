package typings.hastUtilFromParse5

import typings.hast.mod.DocType
import typings.std.Document
import typings.std.DocumentType
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-from-parse5/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromParse5(ast: P5Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def fromParse5(ast: P5Node, options: Options): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def fromParse5(ast: P5Node, options: typings.vfile.mod.VFile): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  type Child = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.Content>[number] */ js.Any
  
  type Comment = typings.hast.mod.Comment
  
  trait Context extends StObject {
    
    var file: js.UndefOr[VFile] = js.undefined
    
    var location: Boolean
    
    var schema: Schema
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Context {
    
    inline def apply(location: Boolean, schema: Schema): Context = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setFile(value: VFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type Doctype = DocType
  
  type Element = typings.hast.mod.Element
  
  type ElementChild = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.ElementContent>[number] */ js.Any
  
  type Handler = js.Function3[
    /* ctx */ Context, 
    /* node */ P5Node, 
    /* children */ js.UndefOr[
      js.Array[
        typings.hast.mod.Element | typings.hast.mod.Text | typings.hast.mod.Comment | DocType
      ]
    ], 
    Node
  ]
  
  type Node = Child | Root
  
  trait Options extends StObject {
    
    /**
      * `VFile`, used to add positional information to nodes. If given, the file should have the original HTML source as its contents
      */
    var file: js.UndefOr[typings.vfile.mod.VFile] = js.undefined
    
    /**
      * Whether the root of the tree is in the `'html'` or `'svg'` space. If an element in with the SVG namespace is found in `ast`, `fromParse5` automatically switches to the SVG space when entering the element, and switches back when leaving
      */
    var space: js.UndefOr[Space] = js.undefined
    
    /**
      * Whether to add extra positional information about starting tags, closing tags, and attributes to elements. Note: not used without `file`
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFile(value: typings.vfile.mod.VFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type P5Attribute = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.Attribute */ Any
  
  type P5Comment = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.CommentNode */ Any
  
  type P5Doctype = DocumentType
  
  type P5Document = Document
  
  type P5Element = Element
  
  type P5ElementLocation = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.ElementLocation */ Any
  
  type P5Location = Location
  
  type P5Node = Node
  
  type P5Text = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5.TextNode */ Any
  
  type Parent = typings.hast.mod.Parent
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
  
  type Root = typings.hast.mod.Root
  
  type Schema = typings.propertyInformation.mod.Schema
  
  /* Rewritten from type alias, can be one of: 
    - typings.hastUtilFromParse5.hastUtilFromParse5Strings.html
    - typings.hastUtilFromParse5.hastUtilFromParse5Strings.svg
  */
  trait Space extends StObject
  object Space {
    
    inline def html: typings.hastUtilFromParse5.hastUtilFromParse5Strings.html = "html".asInstanceOf[typings.hastUtilFromParse5.hastUtilFromParse5Strings.html]
    
    inline def svg: typings.hastUtilFromParse5.hastUtilFromParse5Strings.svg = "svg".asInstanceOf[typings.hastUtilFromParse5.hastUtilFromParse5Strings.svg]
  }
  
  type Text = typings.hast.mod.Text
  
  type VFile = typings.vfile.mod.VFile
}
