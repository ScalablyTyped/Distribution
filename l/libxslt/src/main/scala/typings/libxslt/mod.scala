package typings.libxslt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.libxmljs.mod.Document
import typings.libxmljs.mod.ParserOptions
import typings.libxslt.anon.NoWrapParams
import typings.libxslt.anon.OutputFormat
import typings.libxslt.internalTypesMod.ApplyCallback
import typings.libxslt.internalTypesMod.ApplyDocumentCallback
import typings.libxslt.internalTypesMod.ApplyStringCallback
import typings.libxslt.internalTypesMod.ParseCallback
import typings.libxslt.libxsltStrings.document
import typings.libxslt.libxsltStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libxslt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object libxmljs {
    
    @JSImport("libxslt", "libxmljs")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Attribute")
    @js.native
    class Attribute ()
      extends typings.libxmljs.mod.Attribute
    @JSImport("libxslt", "libxmljs.Attribute")
    @js.native
    def Attribute: Instantiable0[typings.libxmljs.mod.Attribute] = js.native
    inline def Attribute_=(x: Instantiable0[typings.libxmljs.mod.Attribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Document")
    @js.native
    /**
      * Create a new XML Document
      * @param version XML document version, defaults to 1.0
      * @param encoding Encoding, defaults to utf8
      */
    class Document ()
      extends typings.libxmljs.mod.Document
    @JSImport("libxslt", "libxmljs.Document")
    @js.native
    def Document: Instantiable0[typings.libxmljs.mod.Document] = js.native
    inline def Document_=(x: Instantiable0[typings.libxmljs.mod.Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Document")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Element")
    @js.native
    class Element protected ()
      extends typings.libxmljs.mod.Element {
      def this(doc: typings.libxmljs.mod.Document, name: String) = this()
    }
    @JSImport("libxslt", "libxmljs.Element")
    @js.native
    def Element: Instantiable2[
        /* doc */ typings.libxmljs.mod.Document, 
        /* name */ String, 
        typings.libxmljs.mod.Element
      ] = js.native
    inline def Element_=(
      x: Instantiable2[
          /* doc */ typings.libxmljs.mod.Document, 
          /* name */ String, 
          typings.libxmljs.mod.Element
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Namespace")
    @js.native
    class Namespace ()
      extends typings.libxmljs.mod.Namespace
    @JSImport("libxslt", "libxmljs.Namespace")
    @js.native
    def Namespace: Instantiable0[typings.libxmljs.mod.Namespace] = js.native
    inline def Namespace_=(x: Instantiable0[typings.libxmljs.mod.Namespace]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Namespace")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.Node")
    @js.native
    class Node ()
      extends typings.libxmljs.mod.Node
    @JSImport("libxslt", "libxmljs.Node")
    @js.native
    def Node: Instantiable0[typings.libxmljs.mod.Node] = js.native
    inline def Node_=(x: Instantiable0[typings.libxmljs.mod.Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.SaxParser")
    @js.native
    class SaxParser ()
      extends typings.libxmljs.mod.SaxParser
    @JSImport("libxslt", "libxmljs.SaxParser")
    @js.native
    def SaxParser: Instantiable0[typings.libxmljs.mod.SaxParser] = js.native
    inline def SaxParser_=(x: Instantiable0[typings.libxmljs.mod.SaxParser]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaxParser")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("libxslt", "libxmljs.SaxPushParser")
    @js.native
    class SaxPushParser ()
      extends typings.libxmljs.mod.SaxPushParser
    @JSImport("libxslt", "libxmljs.SaxPushParser")
    @js.native
    def SaxPushParser: Instantiable0[typings.libxmljs.mod.SaxPushParser] = js.native
    inline def SaxPushParser_=(x: Instantiable0[typings.libxmljs.mod.SaxPushParser]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaxPushParser")(x.asInstanceOf[js.Any])
    
    @JSImport("libxslt", "libxmljs.libxml_parser_version")
    @js.native
    val libxmlParserVersion: String = js.native
    
    @JSImport("libxslt", "libxmljs.libxml_version")
    @js.native
    val libxmlVersion: String = js.native
    
    inline def memoryUsage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryUsage")().asInstanceOf[Double]
    
    inline def nodeCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeCount")().asInstanceOf[Double]
    
    inline def parseHtml(source: String): typings.libxmljs.mod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtml")(source.asInstanceOf[js.Any]).asInstanceOf[typings.libxmljs.mod.Document]
    inline def parseHtml(source: String, options: ParserOptions): typings.libxmljs.mod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtml")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.libxmljs.mod.Document]
    
    inline def parseHtmlFragment(source: String): typings.libxmljs.mod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(source.asInstanceOf[js.Any]).asInstanceOf[typings.libxmljs.mod.Document]
    inline def parseHtmlFragment(source: String, options: ParserOptions): typings.libxmljs.mod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.libxmljs.mod.Document]
    
    inline def parseHtmlString(source: String): typings.libxmljs.mod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlString")(source.asInstanceOf[js.Any]).asInstanceOf[typings.libxmljs.mod.Document]
    inline def parseHtmlString(source: String, options: ParserOptions): typings.libxmljs.mod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlString")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.libxmljs.mod.Document]
    
    inline def parseXml(source: String): typings.libxmljs.mod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(source.asInstanceOf[js.Any]).asInstanceOf[typings.libxmljs.mod.Document]
    inline def parseXml(source: String, options: ParserOptions): typings.libxmljs.mod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.libxmljs.mod.Document]
    
    inline def parseXmlString(source: String): typings.libxmljs.mod.Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXmlString")(source.asInstanceOf[js.Any]).asInstanceOf[typings.libxmljs.mod.Document]
    inline def parseXmlString(source: String, options: ParserOptions): typings.libxmljs.mod.Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXmlString")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.libxmljs.mod.Document]
    
    @JSImport("libxslt", "libxmljs.version")
    @js.native
    val version: String = js.native
  }
  
  inline def parse(source: String): Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[Stylesheet]
  inline def parse(source: String, callback: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(source: Document): Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[Stylesheet]
  inline def parse(source: Document, callback: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseFile(sourcePath: String, callback: ParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(sourcePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ApplyOptions extends StObject {
    
    var noWrapParams: js.UndefOr[Boolean] = js.undefined
    
    var outputFormat: string | document
  }
  object ApplyOptions {
    
    inline def apply(outputFormat: string | document): ApplyOptions = {
      val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyOptions]
    }
    
    extension [Self <: ApplyOptions](x: Self) {
      
      inline def setNoWrapParams(value: Boolean): Self = StObject.set(x, "noWrapParams", value.asInstanceOf[js.Any])
      
      inline def setNoWrapParamsUndefined: Self = StObject.set(x, "noWrapParams", js.undefined)
      
      inline def setOutputFormat(value: string | document): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stylesheet extends StObject {
    
    @JSName("apply")
    def apply(source: String): String = js.native
    @JSName("apply")
    def apply(source: String, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object): String = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: NoWrapParams): String = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: NoWrapParams, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: OutputFormat): Document = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: OutputFormat, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: String, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
    @JSName("apply")
    def apply(source: String, params: Unit, options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: Document): Document = js.native
    @JSName("apply")
    def apply(source: Document, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object): Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: NoWrapParams): String = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: NoWrapParams, callback: ApplyStringCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: OutputFormat): Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: OutputFormat, callback: ApplyDocumentCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: ApplyOptions): String | Document = js.native
    @JSName("apply")
    def apply(source: Document, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
    @JSName("apply")
    def apply(source: Document, params: Unit, options: ApplyOptions): String | Document = js.native
    
    def applyToFile(sourcePath: String, callback: ApplyStringCallback): Unit = js.native
    def applyToFile(sourcePath: String, params: js.Object, callback: ApplyStringCallback): Unit = js.native
    def applyToFile(sourcePath: String, params: js.Object, options: ApplyOptions, callback: ApplyStringCallback): Unit = js.native
    
    @JSName("apply")
    def apply_Union(source: String): String | Document = js.native
    @JSName("apply")
    def apply_Union(source: String, params: js.Object): String | Document = js.native
    @JSName("apply")
    def apply_Union(source: Document): String | Document = js.native
    @JSName("apply")
    def apply_Union(source: Document, params: js.Object): String | Document = js.native
  }
}
