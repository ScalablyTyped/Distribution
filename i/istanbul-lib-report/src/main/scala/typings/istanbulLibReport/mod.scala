package typings.istanbulLibReport

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibCoverage.mod.CoverageSummary
import typings.istanbulLibCoverage.mod.FileCoverage
import typings.istanbulLibReport.anon.PartialContextOptions
import typings.istanbulLibReport.anon.PartialReportBaseOptions
import typings.istanbulLibReport.anon.PartialWatermarks
import typings.istanbulLibReport.istanbulLibReportStrings.branches
import typings.istanbulLibReport.istanbulLibReportStrings.functions
import typings.istanbulLibReport.istanbulLibReportStrings.lines
import typings.istanbulLibReport.istanbulLibReportStrings.statements
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-report", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("istanbul-lib-report", "ConsoleWriter")
  @js.native
  open class ConsoleWriter () extends ContentWriter {
    
    def write(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "ContentWriter")
  @js.native
  open class ContentWriter () extends StObject {
    
    /**
      * closes this content writer. Should be called after all writes are complete.
      */
    def close(): Unit = js.native
    
    /**
      * returns the colorized version of a string. Typically,
      * content writers that write to files will return the
      * same string and ones writing to a tty will wrap it in
      * appropriate escape sequences.
      */
    def colorize(str: String): String = js.native
    def colorize(str: String, clazz: String): String = js.native
    
    /**
      * writes a string appended with a newline to the destination
      */
    def println(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "FileContentWriter")
  @js.native
  open class FileContentWriter protected () extends ContentWriter {
    def this(fileDescriptor: Double) = this()
    
    def write(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "FileWriter")
  @js.native
  open class FileWriter protected () extends StObject {
    def this(baseDir: String) = this()
    
    /**
      * copies a file from a source directory to a destination name
      */
    def copyFile(source: String, dest: String): Unit = js.native
    def copyFile(source: String, dest: String, header: String): Unit = js.native
    
    /**
      * returns a content writer for writing content to the supplied file.
      */
    def writeFile(): ContentWriter = js.native
    def writeFile(file: String): ContentWriter = js.native
    
    /**
      * returns a FileWriter that is rooted at the supplied subdirectory
      */
    def writeForDir(subdir: String): FileWriter = js.native
  }
  /* static members */
  object FileWriter {
    
    @JSImport("istanbul-lib-report", "FileWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getOutput(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutput")().asInstanceOf[String]
    
    inline def resetOutput(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetOutput")().asInstanceOf[Unit]
    
    inline def startCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startCapture")().asInstanceOf[Unit]
    
    inline def stopCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCapture")().asInstanceOf[Unit]
  }
  
  @JSImport("istanbul-lib-report", "ReportBase")
  @js.native
  open class ReportBase () extends StObject {
    def this(options: PartialReportBaseOptions) = this()
    
    def execute(context: Context): Unit = js.native
  }
  
  inline def createContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[Context]
  inline def createContext(options: PartialContextOptions): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(options.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def getDefaultWatermarks(): Watermarks = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultWatermarks")().asInstanceOf[Watermarks]
  
  @js.native
  trait Context extends StObject {
    
    /**
      * returns the coverage class given a coverage
      * types and a percentage value.
      */
    def classForPercent(`type`: statements | functions | branches | lines, value: Double): String = js.native
    
    var data: Any = js.native
    
    var dir: String = js.native
    
    /**
      * returns the source code for the specified file path or throws if
      * the source could not be found.
      */
    def getSource(filepath: String): String = js.native
    
    def getTree(): Tree[Node] = js.native
    def getTree(summarizer: Summarizers): Tree[Node] = js.native
    
    /**
      * returns a full visitor given a partial one.
      */
    def getVisitor[N /* <: Node */](visitor: Partial[Visitor[N]]): Visitor[N] = js.native
    
    /**
      * returns a FileWriter implementation for reporting use. Also available
      * as the `writer` property on the context.
      */
    def getWriter(): FileWriter = js.native
    
    /**
      * returns an XML writer for the supplied content writer
      */
    def getXmlWriter(contentWriter: ContentWriter): XmlWriter = js.native
    
    def sourceFinder(filepath: String): String = js.native
    
    var watermarks: Watermarks = js.native
    
    var writer: FileWriter = js.native
  }
  
  trait ContextOptions extends StObject {
    
    var coverageMap: CoverageMap
    
    var defaultSummarizer: Summarizers
    
    var dir: String
    
    def sourceFinder(filepath: String): String
    
    var watermarks: PartialWatermarks
  }
  object ContextOptions {
    
    inline def apply(
      coverageMap: CoverageMap,
      defaultSummarizer: Summarizers,
      dir: String,
      sourceFinder: String => String,
      watermarks: PartialWatermarks
    ): ContextOptions = {
      val __obj = js.Dynamic.literal(coverageMap = coverageMap.asInstanceOf[js.Any], defaultSummarizer = defaultSummarizer.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      inline def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
      
      inline def setDefaultSummarizer(value: Summarizers): Self = StObject.set(x, "defaultSummarizer", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setSourceFinder(value: String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      inline def setWatermarks(value: PartialWatermarks): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    def isRoot(): Boolean
    
    def visit(visitor: Visitor[Node], state: Any): Unit
  }
  object Node {
    
    inline def apply(isRoot: () => Boolean, visit: (Visitor[Node], Any) => Unit): Node = {
      val __obj = js.Dynamic.literal(isRoot = js.Any.fromFunction0(isRoot), visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setIsRoot(value: () => Boolean): Self = StObject.set(x, "isRoot", js.Any.fromFunction0(value))
      
      inline def setVisit(value: (Visitor[Node], Any) => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    }
  }
  
  trait ReportBaseOptions extends StObject {
    
    var summarizer: Summarizers
  }
  object ReportBaseOptions {
    
    inline def apply(summarizer: Summarizers): ReportBaseOptions = {
      val __obj = js.Dynamic.literal(summarizer = summarizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportBaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportBaseOptions] (val x: Self) extends AnyVal {
      
      inline def setSummarizer(value: Summarizers): Self = StObject.set(x, "summarizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportNode
    extends StObject
       with Node {
    
    def addChild(child: ReportNode): Unit
    
    def asRelative(p: String): String
    
    var children: js.Array[ReportNode]
    
    var fileCoverage: FileCoverage
    
    def getChildren(): js.Array[Node]
    
    def getCoverageSummary(filesOnly: Boolean): CoverageSummary
    
    def getFileCoverage(): FileCoverage
    
    def getParent(): Node
    
    def getQualifiedName(): String
    
    def getRelativeName(): String
    
    def isSummary(): Boolean
    
    var parent: ReportNode | Null
    
    var path: String
  }
  object ReportNode {
    
    inline def apply(
      addChild: ReportNode => Unit,
      asRelative: String => String,
      children: js.Array[ReportNode],
      fileCoverage: FileCoverage,
      getChildren: () => js.Array[Node],
      getCoverageSummary: Boolean => CoverageSummary,
      getFileCoverage: () => FileCoverage,
      getParent: () => Node,
      getQualifiedName: () => String,
      getRelativeName: () => String,
      isRoot: () => Boolean,
      isSummary: () => Boolean,
      path: String,
      visit: (Visitor[Node], Any) => Unit
    ): ReportNode = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), asRelative = js.Any.fromFunction1(asRelative), children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), path = path.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit), parent = null)
      __obj.asInstanceOf[ReportNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportNode] (val x: Self) extends AnyVal {
      
      inline def setAddChild(value: ReportNode => Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      inline def setAsRelative(value: String => String): Self = StObject.set(x, "asRelative", js.Any.fromFunction1(value))
      
      inline def setChildren(value: js.Array[ReportNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReportNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setFileCoverage(value: FileCoverage): Self = StObject.set(x, "fileCoverage", value.asInstanceOf[js.Any])
      
      inline def setGetChildren(value: () => js.Array[Node]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setGetCoverageSummary(value: Boolean => CoverageSummary): Self = StObject.set(x, "getCoverageSummary", js.Any.fromFunction1(value))
      
      inline def setGetFileCoverage(value: () => FileCoverage): Self = StObject.set(x, "getFileCoverage", js.Any.fromFunction0(value))
      
      inline def setGetParent(value: () => Node): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      inline def setGetQualifiedName(value: () => String): Self = StObject.set(x, "getQualifiedName", js.Any.fromFunction0(value))
      
      inline def setGetRelativeName(value: () => String): Self = StObject.set(x, "getRelativeName", js.Any.fromFunction0(value))
      
      inline def setIsSummary(value: () => Boolean): Self = StObject.set(x, "isSummary", js.Any.fromFunction0(value))
      
      inline def setParent(value: ReportNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.istanbulLibReport.istanbulLibReportStrings.flat
    - typings.istanbulLibReport.istanbulLibReportStrings.nested
    - typings.istanbulLibReport.istanbulLibReportStrings.pkg
    - typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer
  */
  trait Summarizers extends StObject
  object Summarizers {
    
    inline def defaultSummarizer: typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer = "defaultSummarizer".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer]
    
    inline def flat: typings.istanbulLibReport.istanbulLibReportStrings.flat = "flat".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.flat]
    
    inline def nested: typings.istanbulLibReport.istanbulLibReportStrings.nested = "nested".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.nested]
    
    inline def pkg: typings.istanbulLibReport.istanbulLibReportStrings.pkg = "pkg".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.pkg]
  }
  
  trait Tree[N /* <: Node */] extends StObject {
    
    def getRoot(): N
    
    def visit(visitor: Partial[Visitor[N]], state: Any): Unit
  }
  object Tree {
    
    inline def apply[N /* <: Node */](getRoot: () => N, visit: (Partial[Visitor[N]], Any) => Unit): Tree[N] = {
      val __obj = js.Dynamic.literal(getRoot = js.Any.fromFunction0(getRoot), visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[Tree[N]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tree[?], N /* <: Node */] (val x: Self & Tree[N]) extends AnyVal {
      
      inline def setGetRoot(value: () => N): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
      
      inline def setVisit(value: (Partial[Visitor[N]], Any) => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    }
  }
  
  trait Visitor[N /* <: Node */] extends StObject {
    
    def onDetail(root: N, state: Any): Unit
    
    def onEnd(root: N, state: Any): Unit
    
    def onStart(root: N, state: Any): Unit
    
    def onSummary(root: N, state: Any): Unit
    
    def onSummaryEnd(root: N, state: Any): Unit
  }
  object Visitor {
    
    inline def apply[N /* <: Node */](
      onDetail: (N, Any) => Unit,
      onEnd: (N, Any) => Unit,
      onStart: (N, Any) => Unit,
      onSummary: (N, Any) => Unit,
      onSummaryEnd: (N, Any) => Unit
    ): Visitor[N] = {
      val __obj = js.Dynamic.literal(onDetail = js.Any.fromFunction2(onDetail), onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction2(onStart), onSummary = js.Any.fromFunction2(onSummary), onSummaryEnd = js.Any.fromFunction2(onSummaryEnd))
      __obj.asInstanceOf[Visitor[N]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Visitor[?], N /* <: Node */] (val x: Self & Visitor[N]) extends AnyVal {
      
      inline def setOnDetail(value: (N, Any) => Unit): Self = StObject.set(x, "onDetail", js.Any.fromFunction2(value))
      
      inline def setOnEnd(value: (N, Any) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
      
      inline def setOnStart(value: (N, Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnSummary(value: (N, Any) => Unit): Self = StObject.set(x, "onSummary", js.Any.fromFunction2(value))
      
      inline def setOnSummaryEnd(value: (N, Any) => Unit): Self = StObject.set(x, "onSummaryEnd", js.Any.fromFunction2(value))
    }
  }
  
  type Watermark = js.Tuple2[Double, Double]
  
  trait Watermarks extends StObject {
    
    var branches: Watermark
    
    var functions: Watermark
    
    var lines: Watermark
    
    var statements: Watermark
  }
  object Watermarks {
    
    inline def apply(branches: Watermark, functions: Watermark, lines: Watermark, statements: Watermark): Watermarks = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Watermarks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Watermarks] (val x: Self) extends AnyVal {
      
      inline def setBranches(value: Watermark): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: Watermark): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Watermark): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: Watermark): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlWriter extends StObject {
    
    /**
      * closes all open tags and ends the document
      */
    def closeAll(): Unit = js.native
    
    /**
      * closes an open XML tag.
      */
    def closeTag(name: String): Unit = js.native
    
    def indent(str: String): String = js.native
    
    /**
      * writes a tag and its value opening and closing it at the same time
      */
    def inlineTag(name: String): Unit = js.native
    def inlineTag(name: String, attrs: Any): Unit = js.native
    def inlineTag(name: String, attrs: Any, content: String): Unit = js.native
    def inlineTag(name: String, attrs: Unit, content: String): Unit = js.native
    
    /**
      * writes the opening XML tag with the supplied attributes
      */
    def openTag(name: String): Unit = js.native
    def openTag(name: String, attrs: Any): Unit = js.native
  }
}
