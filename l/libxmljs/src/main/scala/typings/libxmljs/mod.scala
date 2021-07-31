package typings.libxmljs

import org.scalablytyped.runtime.StringDictionary
import typings.libxmljs.anon.Declaration
import typings.libxmljs.anon.ExternalId
import typings.libxmljs.libxmljsStrings.attribute
import typings.libxmljs.libxmljsStrings.comment
import typings.libxmljs.libxmljsStrings.document
import typings.libxmljs.libxmljsStrings.element
import typings.libxmljs.libxmljsStrings.text
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libxmljs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("libxmljs", "Attribute")
  @js.native
  class Attribute () extends StObject {
    
    def name(): String = js.native
    
    def namespace(): Namespace = js.native
    
    def remove(): Unit = js.native
    
    def value(): String = js.native
    def value(newValue: String): Attribute = js.native
  }
  
  @JSImport("libxmljs", "Document")
  @js.native
  /**
    * Create a new XML Document
    * @param version XML document version, defaults to 1.0
    * @param encoding Encoding, defaults to utf8
    */
  class Document () extends StObject {
    def this(version: Double) = this()
    def this(version: Double, encoding: String) = this()
    def this(version: Unit, encoding: String) = this()
    
    def child(idx: Double): Element | Null = js.native
    
    def childNodes(): js.Array[Element] = js.native
    
    def encoding(): String = js.native
    def encoding(enc: String): this.type = js.native
    
    var errors: js.Array[SyntaxError] = js.native
    
    def find(xpath: String): js.Array[Element] = js.native
    def find(xpath: String, namespaces: StringMap): js.Array[Element] = js.native
    def find(xpath: String, ns_uri: String): js.Array[Element] = js.native
    
    def get(xpath: String): Element | Null = js.native
    def get(xpath: String, namespaces: StringMap): Element | Null = js.native
    
    def getDtd(): ExternalId = js.native
    
    def node(name: String): Element = js.native
    def node(name: String, content: String): Element = js.native
    
    def root(): Element | Null = js.native
    def root(newRoot: Node): Node = js.native
    
    def setDtd(name: String, ext: String, sys: String): Unit = js.native
    
    def toString(formatted: Boolean): String = js.native
    
    def `type`(): document = js.native
    
    def validate(xsdDoc: Document): Boolean = js.native
    
    var validationErrors: js.Array[ValidationError] = js.native
    
    def version(): String = js.native
  }
  
  @JSImport("libxmljs", "Element")
  @js.native
  class Element protected () extends Node {
    def this(doc: Document, name: String) = this()
    def this(doc: Document, name: String, content: String) = this()
    
    /**
      * @return The original element, not the child.
      */
    def addChild(child: Element): this.type = js.native
    
    def addNextSibling(siblingNode: Node): Node = js.native
    
    def addPrevSibling(siblingNode: Node): Node = js.native
    
    def attr(attrObject: StringMap): this.type = js.native
    def attr(name: String): Attribute | Null = js.native
    
    def attrs(): js.Array[Attribute] = js.native
    
    def child(idx: Double): Node | Null = js.native
    
    def childNodes(): js.Array[Node] = js.native
    
    def defineNamespace(prefixOrHref: String): Namespace = js.native
    def defineNamespace(prefixOrHref: String, hrefInCaseOfPrefix: String): Namespace = js.native
    
    def find(xpath: String): js.Array[Node] = js.native
    def find(xpath: String, namespaces: StringMap): js.Array[Node] = js.native
    def find(xpath: String, ns_uri: String): js.Array[Node] = js.native
    
    def get(xpath: String): Element | Null = js.native
    def get(xpath: String, namespaces: StringMap): Element | Null = js.native
    def get(xpath: String, ns_uri: String): Element | Null = js.native
    
    def name(): String = js.native
    def name(newName: String): this.type = js.native
    
    def namespace(newNamespace: Namespace): this.type = js.native
    def namespace(prefixOrHref: String): Namespace = js.native
    def namespace(prefixOrHref: String, hrefInCaseOfPrefix: String): Namespace = js.native
    
    def nextElement(): Element | Null = js.native
    
    def node(name: String): Element = js.native
    def node(name: String, content: String): Element = js.native
    
    def path(): String = js.native
    
    def prevElement(): Element | Null = js.native
    
    def replace(replacement: String): String = js.native
    def replace(replacement: Element): Element = js.native
    
    def text(): String = js.native
    def text(newText: String): this.type = js.native
  }
  
  @JSImport("libxmljs", "Namespace")
  @js.native
  class Namespace () extends StObject {
    
    def href(): String = js.native
    
    def prefix(): String = js.native
  }
  
  @JSImport("libxmljs", "Node")
  @js.native
  class Node () extends StObject {
    
    def doc(): Document = js.native
    
    /**
      * The namespace or null in case of comment nodes
      */
    def namespace(): Namespace | Null = js.native
    
    /**
      * An array of namespaces that the object belongs to.
      *
      * @param local If it is true, only the namespace declarations local to this
      *              node are returned, rather than all of the namespaces in scope
      *              at this node (including the ones from the parent elements).
      */
    def namespaces(): js.Array[Namespace] = js.native
    def namespaces(local: Boolean): js.Array[Namespace] = js.native
    
    def nextSibling(): Node | Null = js.native
    
    def parent(): Element | Document = js.native
    
    def prevSibling(): Node | Null = js.native
    
    def remove(): this.type = js.native
    
    def toString(format: Boolean): String = js.native
    def toString(format: Declaration): String = js.native
    
    def `type`(): comment | element | text | attribute = js.native
  }
  
  @JSImport("libxmljs", "SaxParser")
  @js.native
  class SaxParser () extends EventEmitter {
    
    def parseString(source: String): Boolean = js.native
  }
  
  @JSImport("libxmljs", "SaxPushParser")
  @js.native
  class SaxPushParser () extends EventEmitter {
    
    def push(source: String): Boolean = js.native
  }
  
  @JSImport("libxmljs", "libxml_parser_version")
  @js.native
  val libxmlParserVersion: String = js.native
  
  @JSImport("libxmljs", "libxml_version")
  @js.native
  val libxmlVersion: String = js.native
  
  @scala.inline
  def memoryUsage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryUsage")().asInstanceOf[Double]
  
  @scala.inline
  def nodeCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeCount")().asInstanceOf[Double]
  
  @scala.inline
  def parseHtml(source: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtml")(source.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def parseHtml(source: String, options: ParserOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtml")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @scala.inline
  def parseHtmlFragment(source: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(source.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def parseHtmlFragment(source: String, options: ParserOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlFragment")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @scala.inline
  def parseHtmlString(source: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlString")(source.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def parseHtmlString(source: String, options: ParserOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlString")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @scala.inline
  def parseXml(source: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(source.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def parseXml(source: String, options: ParserOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @scala.inline
  def parseXmlString(source: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXmlString")(source.asInstanceOf[js.Any]).asInstanceOf[Document]
  @scala.inline
  def parseXmlString(source: String, options: ParserOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseXmlString")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @JSImport("libxmljs", "version")
  @js.native
  val version: String = js.native
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  trait ParserOptions extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var basefix: js.UndefOr[Boolean] = js.undefined
    
    var big_lines: js.UndefOr[Boolean] = js.undefined
    
    var blanks: js.UndefOr[Boolean] = js.undefined
    
    var cdata: js.UndefOr[Boolean] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var dict: js.UndefOr[Boolean] = js.undefined
    
    var doctype: js.UndefOr[Boolean] = js.undefined
    
    var dtdattr: js.UndefOr[js.Any] = js.undefined
    
    var dtdload: js.UndefOr[Boolean] = js.undefined
    
    var dtdvalid: js.UndefOr[Boolean] = js.undefined
    
    var errors: js.UndefOr[Boolean] = js.undefined
    
    var huge: js.UndefOr[Boolean] = js.undefined
    
    var ignore_enc: js.UndefOr[Boolean] = js.undefined
    
    var implied: js.UndefOr[Boolean] = js.undefined
    
    var net: js.UndefOr[Boolean] = js.undefined
    
    var nobasefix: js.UndefOr[Boolean] = js.undefined
    
    var noblanks: js.UndefOr[Boolean] = js.undefined
    
    var nocdata: js.UndefOr[Boolean] = js.undefined
    
    var nodict: js.UndefOr[Boolean] = js.undefined
    
    var noent: js.UndefOr[Boolean] = js.undefined
    
    var noerror: js.UndefOr[Boolean] = js.undefined
    
    var nonet: js.UndefOr[Boolean] = js.undefined
    
    var nowarning: js.UndefOr[Boolean] = js.undefined
    
    var noxincnode: js.UndefOr[Boolean] = js.undefined
    
    var nsclean: js.UndefOr[Boolean] = js.undefined
    
    var old: js.UndefOr[Boolean] = js.undefined
    
    var oldsax: js.UndefOr[Boolean] = js.undefined
    
    var pedantic: js.UndefOr[Boolean] = js.undefined
    
    var recover: js.UndefOr[Boolean] = js.undefined
    
    var sax1: js.UndefOr[Boolean] = js.undefined
    
    var warnings: js.UndefOr[Boolean] = js.undefined
    
    var xinclude: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setBasefix(value: Boolean): Self = StObject.set(x, "basefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasefixUndefined: Self = StObject.set(x, "basefix", js.undefined)
      
      @scala.inline
      def setBig_lines(value: Boolean): Self = StObject.set(x, "big_lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBig_linesUndefined: Self = StObject.set(x, "big_lines", js.undefined)
      
      @scala.inline
      def setBlanks(value: Boolean): Self = StObject.set(x, "blanks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlanksUndefined: Self = StObject.set(x, "blanks", js.undefined)
      
      @scala.inline
      def setCdata(value: Boolean): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDict(value: Boolean): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
      
      @scala.inline
      def setDoctype(value: Boolean): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoctypeUndefined: Self = StObject.set(x, "doctype", js.undefined)
      
      @scala.inline
      def setDtdattr(value: js.Any): Self = StObject.set(x, "dtdattr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtdattrUndefined: Self = StObject.set(x, "dtdattr", js.undefined)
      
      @scala.inline
      def setDtdload(value: Boolean): Self = StObject.set(x, "dtdload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtdloadUndefined: Self = StObject.set(x, "dtdload", js.undefined)
      
      @scala.inline
      def setDtdvalid(value: Boolean): Self = StObject.set(x, "dtdvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtdvalidUndefined: Self = StObject.set(x, "dtdvalid", js.undefined)
      
      @scala.inline
      def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setHuge(value: Boolean): Self = StObject.set(x, "huge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHugeUndefined: Self = StObject.set(x, "huge", js.undefined)
      
      @scala.inline
      def setIgnore_enc(value: Boolean): Self = StObject.set(x, "ignore_enc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore_encUndefined: Self = StObject.set(x, "ignore_enc", js.undefined)
      
      @scala.inline
      def setImplied(value: Boolean): Self = StObject.set(x, "implied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpliedUndefined: Self = StObject.set(x, "implied", js.undefined)
      
      @scala.inline
      def setNet(value: Boolean): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
      
      @scala.inline
      def setNobasefix(value: Boolean): Self = StObject.set(x, "nobasefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobasefixUndefined: Self = StObject.set(x, "nobasefix", js.undefined)
      
      @scala.inline
      def setNoblanks(value: Boolean): Self = StObject.set(x, "noblanks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoblanksUndefined: Self = StObject.set(x, "noblanks", js.undefined)
      
      @scala.inline
      def setNocdata(value: Boolean): Self = StObject.set(x, "nocdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocdataUndefined: Self = StObject.set(x, "nocdata", js.undefined)
      
      @scala.inline
      def setNodict(value: Boolean): Self = StObject.set(x, "nodict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodictUndefined: Self = StObject.set(x, "nodict", js.undefined)
      
      @scala.inline
      def setNoent(value: Boolean): Self = StObject.set(x, "noent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoentUndefined: Self = StObject.set(x, "noent", js.undefined)
      
      @scala.inline
      def setNoerror(value: Boolean): Self = StObject.set(x, "noerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoerrorUndefined: Self = StObject.set(x, "noerror", js.undefined)
      
      @scala.inline
      def setNonet(value: Boolean): Self = StObject.set(x, "nonet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonetUndefined: Self = StObject.set(x, "nonet", js.undefined)
      
      @scala.inline
      def setNowarning(value: Boolean): Self = StObject.set(x, "nowarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNowarningUndefined: Self = StObject.set(x, "nowarning", js.undefined)
      
      @scala.inline
      def setNoxincnode(value: Boolean): Self = StObject.set(x, "noxincnode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoxincnodeUndefined: Self = StObject.set(x, "noxincnode", js.undefined)
      
      @scala.inline
      def setNsclean(value: Boolean): Self = StObject.set(x, "nsclean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNscleanUndefined: Self = StObject.set(x, "nsclean", js.undefined)
      
      @scala.inline
      def setOld(value: Boolean): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
      
      @scala.inline
      def setOldsax(value: Boolean): Self = StObject.set(x, "oldsax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldsaxUndefined: Self = StObject.set(x, "oldsax", js.undefined)
      
      @scala.inline
      def setPedantic(value: Boolean): Self = StObject.set(x, "pedantic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPedanticUndefined: Self = StObject.set(x, "pedantic", js.undefined)
      
      @scala.inline
      def setRecover(value: Boolean): Self = StObject.set(x, "recover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoverUndefined: Self = StObject.set(x, "recover", js.undefined)
      
      @scala.inline
      def setSax1(value: Boolean): Self = StObject.set(x, "sax1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSax1Undefined: Self = StObject.set(x, "sax1", js.undefined)
      
      @scala.inline
      def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      @scala.inline
      def setXinclude(value: Boolean): Self = StObject.set(x, "xinclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXincludeUndefined: Self = StObject.set(x, "xinclude", js.undefined)
    }
  }
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  type StringMap = StringDictionary[String]
  
  trait SyntaxError extends StObject {
    
    var code: Double | Null
    
    /**
      * 1-based column number, 0 if not applicable/available.
      */
    var column: Double
    
    var domain: Double | Null
    
    var file: String | Null
    
    var int1: Double | Null
    
    var level: Double | Null
    
    var line: Double | Null
    
    var message: String | Null
    
    var str1: Double | Null
    
    var str2: Double | Null
    
    var str3: Double | Null
  }
  object SyntaxError {
    
    @scala.inline
    def apply(column: Double): SyntaxError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], code = null, domain = null, file = null, int1 = null, level = null, line = null, message = null, str1 = null, str2 = null, str3 = null)
      __obj.asInstanceOf[SyntaxError]
    }
    
    @scala.inline
    implicit class SyntaxErrorMutableBuilder[Self <: SyntaxError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeNull: Self = StObject.set(x, "code", null)
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: Double): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNull: Self = StObject.set(x, "domain", null)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNull: Self = StObject.set(x, "file", null)
      
      @scala.inline
      def setInt1(value: Double): Self = StObject.set(x, "int1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt1Null: Self = StObject.set(x, "int1", null)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelNull: Self = StObject.set(x, "level", null)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageNull: Self = StObject.set(x, "message", null)
      
      @scala.inline
      def setStr1(value: Double): Self = StObject.set(x, "str1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStr1Null: Self = StObject.set(x, "str1", null)
      
      @scala.inline
      def setStr2(value: Double): Self = StObject.set(x, "str2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStr2Null: Self = StObject.set(x, "str2", null)
      
      @scala.inline
      def setStr3(value: Double): Self = StObject.set(x, "str3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStr3Null: Self = StObject.set(x, "str3", null)
    }
  }
  
  trait ValidationError
    extends StObject
       with Error {
    
    var code: Double | Null
    
    /**
      * 1-based column number, 0 if not applicable/available.
      */
    var column: Double
    
    var domain: Double | Null
    
    var level: Double | Null
    
    var line: Double | Null
  }
  object ValidationError {
    
    @scala.inline
    def apply(column: Double, message: String, name: String): ValidationError = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], code = null, domain = null, level = null, line = null)
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeNull: Self = StObject.set(x, "code", null)
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: Double): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNull: Self = StObject.set(x, "domain", null)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelNull: Self = StObject.set(x, "level", null)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNull: Self = StObject.set(x, "line", null)
    }
  }
}
