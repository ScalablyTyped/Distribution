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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-report", "ConsoleWriter")
  @js.native
  class ConsoleWriter () extends ContentWriter {
    
    def write(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "ContentWriter")
  @js.native
  class ContentWriter () extends StObject {
    
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
  class FileContentWriter protected () extends ContentWriter {
    def this(fileDescriptor: Double) = this()
    
    def write(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "FileWriter")
  @js.native
  class FileWriter protected () extends StObject {
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
    
    @JSImport("istanbul-lib-report", "FileWriter.getOutput")
    @js.native
    def getOutput(): String = js.native
    
    @JSImport("istanbul-lib-report", "FileWriter.resetOutput")
    @js.native
    def resetOutput(): Unit = js.native
    
    @JSImport("istanbul-lib-report", "FileWriter.startCapture")
    @js.native
    def startCapture(): Unit = js.native
    
    @JSImport("istanbul-lib-report", "FileWriter.stopCapture")
    @js.native
    def stopCapture(): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "ReportBase")
  @js.native
  class ReportBase () extends StObject {
    def this(options: PartialReportBaseOptions) = this()
    
    def execute(context: Context): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "createContext")
  @js.native
  def createContext(): Context = js.native
  @JSImport("istanbul-lib-report", "createContext")
  @js.native
  def createContext(options: PartialContextOptions): Context = js.native
  
  @JSImport("istanbul-lib-report", "getDefaultWatermarks")
  @js.native
  def getDefaultWatermarks(): Watermarks = js.native
  
  @js.native
  trait Context extends StObject {
    
    @JSName("classForPercent")
    def classForPercent_branches(`type`: branches, value: Double): String = js.native
    @JSName("classForPercent")
    def classForPercent_functions(`type`: functions, value: Double): String = js.native
    @JSName("classForPercent")
    def classForPercent_lines(`type`: lines, value: Double): String = js.native
    /**
      * returns the coverage class given a coverage
      * types and a percentage value.
      */
    @JSName("classForPercent")
    def classForPercent_statements(`type`: statements, value: Double): String = js.native
    
    var data: js.Any = js.native
    
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
  
  @js.native
  trait ContextOptions extends StObject {
    
    var coverageMap: CoverageMap = js.native
    
    var defaultSummarizer: Summarizers = js.native
    
    var dir: String = js.native
    
    def sourceFinder(filepath: String): String = js.native
    
    var watermarks: PartialWatermarks = js.native
  }
  object ContextOptions {
    
    @scala.inline
    def apply(
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
    implicit class ContextOptionsMutableBuilder[Self <: ContextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSummarizer(value: Summarizers): Self = StObject.set(x, "defaultSummarizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFinder(value: String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWatermarks(value: PartialWatermarks): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    def isRoot(): Boolean = js.native
    
    def visit(visitor: Visitor[Node], state: js.Any): Unit = js.native
  }
  object Node {
    
    @scala.inline
    def apply(isRoot: () => Boolean, visit: (Visitor[Node], js.Any) => Unit): Node = {
      val __obj = js.Dynamic.literal(isRoot = js.Any.fromFunction0(isRoot), visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRoot(value: () => Boolean): Self = StObject.set(x, "isRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisit(value: (Visitor[Node], js.Any) => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ReportBaseOptions extends StObject {
    
    var summarizer: Summarizers = js.native
  }
  object ReportBaseOptions {
    
    @scala.inline
    def apply(summarizer: Summarizers): ReportBaseOptions = {
      val __obj = js.Dynamic.literal(summarizer = summarizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportBaseOptions]
    }
    
    @scala.inline
    implicit class ReportBaseOptionsMutableBuilder[Self <: ReportBaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSummarizer(value: Summarizers): Self = StObject.set(x, "summarizer", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReportNode extends Node {
    
    def addChild(child: ReportNode): Unit = js.native
    
    def asRelative(p: String): String = js.native
    
    var children: js.Array[ReportNode] = js.native
    
    var fileCoverage: FileCoverage = js.native
    
    def getChildren(): js.Array[Node] = js.native
    
    def getCoverageSummary(filesOnly: Boolean): CoverageSummary = js.native
    
    def getFileCoverage(): FileCoverage = js.native
    
    def getParent(): Node = js.native
    
    def getQualifiedName(): String = js.native
    
    def getRelativeName(): String = js.native
    
    def isSummary(): Boolean = js.native
    
    var parent: ReportNode | Null = js.native
    
    var path: String = js.native
  }
  object ReportNode {
    
    @scala.inline
    def apply(
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
      visit: (Visitor[Node], js.Any) => Unit
    ): ReportNode = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1(addChild), asRelative = js.Any.fromFunction1(asRelative), children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], getChildren = js.Any.fromFunction0(getChildren), getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = js.Any.fromFunction0(getFileCoverage), getParent = js.Any.fromFunction0(getParent), getQualifiedName = js.Any.fromFunction0(getQualifiedName), getRelativeName = js.Any.fromFunction0(getRelativeName), isRoot = js.Any.fromFunction0(isRoot), isSummary = js.Any.fromFunction0(isSummary), path = path.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[ReportNode]
    }
    
    @scala.inline
    implicit class ReportNodeMutableBuilder[Self <: ReportNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddChild(value: ReportNode => Unit): Self = StObject.set(x, "addChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsRelative(value: String => String): Self = StObject.set(x, "asRelative", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildren(value: js.Array[ReportNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: ReportNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setFileCoverage(value: FileCoverage): Self = StObject.set(x, "fileCoverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetChildren(value: () => js.Array[Node]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCoverageSummary(value: Boolean => CoverageSummary): Self = StObject.set(x, "getCoverageSummary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFileCoverage(value: () => FileCoverage): Self = StObject.set(x, "getFileCoverage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Node): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetQualifiedName(value: () => String): Self = StObject.set(x, "getQualifiedName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRelativeName(value: () => String): Self = StObject.set(x, "getRelativeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSummary(value: () => Boolean): Self = StObject.set(x, "isSummary", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParent(value: ReportNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def defaultSummarizer: typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer = "defaultSummarizer".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer]
    
    @scala.inline
    def flat: typings.istanbulLibReport.istanbulLibReportStrings.flat = "flat".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.flat]
    
    @scala.inline
    def nested: typings.istanbulLibReport.istanbulLibReportStrings.nested = "nested".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.nested]
    
    @scala.inline
    def pkg: typings.istanbulLibReport.istanbulLibReportStrings.pkg = "pkg".asInstanceOf[typings.istanbulLibReport.istanbulLibReportStrings.pkg]
  }
  
  @js.native
  trait Tree[N /* <: Node */] extends StObject {
    
    def getRoot(): N = js.native
    
    def visit(visitor: Partial[Visitor[N]], state: js.Any): Unit = js.native
  }
  object Tree {
    
    @scala.inline
    def apply[N /* <: Node */](getRoot: () => N, visit: (Partial[Visitor[N]], js.Any) => Unit): Tree[N] = {
      val __obj = js.Dynamic.literal(getRoot = js.Any.fromFunction0(getRoot), visit = js.Any.fromFunction2(visit))
      __obj.asInstanceOf[Tree[N]]
    }
    
    @scala.inline
    implicit class TreeMutableBuilder[Self <: Tree[_], N /* <: Node */] (val x: Self with Tree[N]) extends AnyVal {
      
      @scala.inline
      def setGetRoot(value: () => N): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVisit(value: (Partial[Visitor[N]], js.Any) => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Visitor[N /* <: Node */] extends StObject {
    
    def onDetail(root: N, state: js.Any): Unit = js.native
    
    def onEnd(root: N, state: js.Any): Unit = js.native
    
    def onStart(root: N, state: js.Any): Unit = js.native
    
    def onSummary(root: N, state: js.Any): Unit = js.native
    
    def onSummaryEnd(root: N, state: js.Any): Unit = js.native
  }
  object Visitor {
    
    @scala.inline
    def apply[N /* <: Node */](
      onDetail: (N, js.Any) => Unit,
      onEnd: (N, js.Any) => Unit,
      onStart: (N, js.Any) => Unit,
      onSummary: (N, js.Any) => Unit,
      onSummaryEnd: (N, js.Any) => Unit
    ): Visitor[N] = {
      val __obj = js.Dynamic.literal(onDetail = js.Any.fromFunction2(onDetail), onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction2(onStart), onSummary = js.Any.fromFunction2(onSummary), onSummaryEnd = js.Any.fromFunction2(onSummaryEnd))
      __obj.asInstanceOf[Visitor[N]]
    }
    
    @scala.inline
    implicit class VisitorMutableBuilder[Self <: Visitor[_], N /* <: Node */] (val x: Self with Visitor[N]) extends AnyVal {
      
      @scala.inline
      def setOnDetail(value: (N, js.Any) => Unit): Self = StObject.set(x, "onDetail", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnd(value: (N, js.Any) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStart(value: (N, js.Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSummary(value: (N, js.Any) => Unit): Self = StObject.set(x, "onSummary", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSummaryEnd(value: (N, js.Any) => Unit): Self = StObject.set(x, "onSummaryEnd", js.Any.fromFunction2(value))
    }
  }
  
  type Watermark = js.Tuple2[Double, Double]
  
  @js.native
  trait Watermarks extends StObject {
    
    var branches: Watermark = js.native
    
    var functions: Watermark = js.native
    
    var lines: Watermark = js.native
    
    var statements: Watermark = js.native
  }
  object Watermarks {
    
    @scala.inline
    def apply(branches: Watermark, functions: Watermark, lines: Watermark, statements: Watermark): Watermarks = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Watermarks]
    }
    
    @scala.inline
    implicit class WatermarksMutableBuilder[Self <: Watermarks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: Watermark): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctions(value: Watermark): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: Watermark): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatements(value: Watermark): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
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
    def inlineTag(name: String, attrs: js.UndefOr[scala.Nothing], content: String): Unit = js.native
    def inlineTag(name: String, attrs: js.Any): Unit = js.native
    def inlineTag(name: String, attrs: js.Any, content: String): Unit = js.native
    
    /**
      * writes the opening XML tag with the supplied attributes
      */
    def openTag(name: String): Unit = js.native
    def openTag(name: String, attrs: js.Any): Unit = js.native
  }
}
