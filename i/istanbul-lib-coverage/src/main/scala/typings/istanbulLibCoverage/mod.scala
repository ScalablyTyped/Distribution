package typings.istanbulLibCoverage

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-coverage", "CoverageMap")
  @js.native
  class CoverageMap protected () extends StObject {
    def this(data: CoverageMap) = this()
    def this(data: CoverageMapData) = this()
    
    def addFileCoverage(pathOrObject: String): Unit = js.native
    def addFileCoverage(pathOrObject: FileCoverage): Unit = js.native
    def addFileCoverage(pathOrObject: FileCoverageData): Unit = js.native
    
    var data: CoverageMapData = js.native
    
    def fileCoverageFor(filename: String): FileCoverage = js.native
    
    def files(): js.Array[String] = js.native
    
    def filter(callback: js.Function1[/* key */ String, Boolean]): Unit = js.native
    
    def getCoverageSummary(): CoverageSummary = js.native
    
    def merge(data: CoverageMap): Unit = js.native
    def merge(data: CoverageMapData): Unit = js.native
    
    def toJSON(): CoverageMapData = js.native
  }
  
  @JSImport("istanbul-lib-coverage", "CoverageSummary")
  @js.native
  class CoverageSummary protected () extends StObject {
    def this(data: CoverageSummary) = this()
    def this(data: CoverageSummaryData) = this()
    
    var branches: Totals = js.native
    
    var data: CoverageSummaryData = js.native
    
    var functions: Totals = js.native
    
    def isEmpty(): Boolean = js.native
    
    var lines: Totals = js.native
    
    def merge(obj: CoverageSummary): CoverageSummary = js.native
    
    var statements: Totals = js.native
    
    def toJSON(): CoverageSummaryData = js.native
  }
  
  @JSImport("istanbul-lib-coverage", "FileCoverage")
  @js.native
  class FileCoverage protected () extends FileCoverageData {
    def this(data: String) = this()
    def this(data: FileCoverage) = this()
    def this(data: FileCoverageData) = this()
    
    def computeBranchTotals(): Totals = js.native
    
    def computeSimpleTotals(): Totals = js.native
    
    var data: FileCoverageData = js.native
    
    def getBranchCoverageByLine(): NumberDictionary[Coverage] = js.native
    
    def getLineCoverage(): NumberDictionary[Double] = js.native
    
    def getUncoveredLines(): js.Array[Double] = js.native
    
    def merge(other: FileCoverageData): Unit = js.native
    
    def resetHits(): Unit = js.native
    
    def toJSON(): js.Object = js.native
    
    def toSummary(): CoverageSummary = js.native
  }
  
  object classes {
    
    @JSImport("istanbul-lib-coverage", "classes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("istanbul-lib-coverage", "classes.FileCoverage")
    @js.native
    def FileCoverage: typings.istanbulLibCoverage.mod.FileCoverage = js.native
    @scala.inline
    def FileCoverage_=(x: FileCoverage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileCoverage")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("istanbul-lib-coverage", "createCoverageMap")
  @js.native
  def createCoverageMap(): CoverageMap = js.native
  @JSImport("istanbul-lib-coverage", "createCoverageMap")
  @js.native
  def createCoverageMap(data: CoverageMap): CoverageMap = js.native
  @JSImport("istanbul-lib-coverage", "createCoverageMap")
  @js.native
  def createCoverageMap(data: CoverageMapData): CoverageMap = js.native
  
  @JSImport("istanbul-lib-coverage", "createCoverageSummary")
  @js.native
  def createCoverageSummary(): CoverageSummary = js.native
  @JSImport("istanbul-lib-coverage", "createCoverageSummary")
  @js.native
  def createCoverageSummary(obj: CoverageSummary): CoverageSummary = js.native
  @JSImport("istanbul-lib-coverage", "createCoverageSummary")
  @js.native
  def createCoverageSummary(obj: CoverageSummaryData): CoverageSummary = js.native
  
  @JSImport("istanbul-lib-coverage", "createFileCoverage")
  @js.native
  def createFileCoverage(pathOrObject: String): FileCoverage = js.native
  @JSImport("istanbul-lib-coverage", "createFileCoverage")
  @js.native
  def createFileCoverage(pathOrObject: FileCoverage): FileCoverage = js.native
  @JSImport("istanbul-lib-coverage", "createFileCoverage")
  @js.native
  def createFileCoverage(pathOrObject: FileCoverageData): FileCoverage = js.native
  
  @js.native
  trait BranchMapping extends StObject {
    
    var line: Double = js.native
    
    var loc: Range = js.native
    
    var locations: js.Array[Range] = js.native
    
    var `type`: String = js.native
  }
  object BranchMapping {
    
    @scala.inline
    def apply(line: Double, loc: Range, locations: js.Array[Range], `type`: String): BranchMapping = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchMapping]
    }
    
    @scala.inline
    implicit class BranchMappingMutableBuilder[Self <: BranchMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc(value: Range): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocations(value: js.Array[Range]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: Range*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Coverage extends StObject {
    
    var coverage: Double = js.native
    
    var covered: Double = js.native
    
    var total: Double = js.native
  }
  object Coverage {
    
    @scala.inline
    def apply(coverage: Double, covered: Double, total: Double): Coverage = {
      val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], covered = covered.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coverage]
    }
    
    @scala.inline
    implicit class CoverageMutableBuilder[Self <: Coverage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverage(value: Double): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type CoverageMapData = StringDictionary[FileCoverage | FileCoverageData]
  
  @js.native
  trait CoverageSummaryData extends StObject {
    
    var branches: Totals = js.native
    
    var functions: Totals = js.native
    
    var lines: Totals = js.native
    
    var statements: Totals = js.native
  }
  object CoverageSummaryData {
    
    @scala.inline
    def apply(branches: Totals, functions: Totals, lines: Totals, statements: Totals): CoverageSummaryData = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageSummaryData]
    }
    
    @scala.inline
    implicit class CoverageSummaryDataMutableBuilder[Self <: CoverageSummaryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: Totals): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctions(value: Totals): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: Totals): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatements(value: Totals): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileCoverageData extends StObject {
    
    var b: StringDictionary[js.Array[Double]] = js.native
    
    var branchMap: StringDictionary[BranchMapping] = js.native
    
    var f: StringDictionary[Double] = js.native
    
    var fnMap: StringDictionary[FunctionMapping] = js.native
    
    var path: String = js.native
    
    var s: StringDictionary[Double] = js.native
    
    var statementMap: StringDictionary[Range] = js.native
  }
  object FileCoverageData {
    
    @scala.inline
    def apply(
      b: StringDictionary[js.Array[Double]],
      branchMap: StringDictionary[BranchMapping],
      f: StringDictionary[Double],
      fnMap: StringDictionary[FunctionMapping],
      path: String,
      s: StringDictionary[Double],
      statementMap: StringDictionary[Range]
    ): FileCoverageData = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], branchMap = branchMap.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], fnMap = fnMap.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], statementMap = statementMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileCoverageData]
    }
    
    @scala.inline
    implicit class FileCoverageDataMutableBuilder[Self <: FileCoverageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchMap(value: StringDictionary[BranchMapping]): Self = StObject.set(x, "branchMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setF(value: StringDictionary[Double]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnMap(value: StringDictionary[FunctionMapping]): Self = StObject.set(x, "fnMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: StringDictionary[Double]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementMap(value: StringDictionary[Range]): Self = StObject.set(x, "statementMap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FunctionMapping extends StObject {
    
    var decl: Range = js.native
    
    var line: Double = js.native
    
    var loc: Range = js.native
    
    var name: String = js.native
  }
  object FunctionMapping {
    
    @scala.inline
    def apply(decl: Range, line: Double, loc: Range, name: String): FunctionMapping = {
      val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionMapping]
    }
    
    @scala.inline
    implicit class FunctionMappingMutableBuilder[Self <: FunctionMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecl(value: Range): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoc(value: Range): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Location extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object Location {
    
    @scala.inline
    def apply(column: Double, line: Double): Location = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Range extends StObject {
    
    var end: Location = js.native
    
    var start: Location = js.native
  }
  object Range {
    
    @scala.inline
    def apply(end: Location, start: Location): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Totals extends StObject {
    
    var covered: Double = js.native
    
    var pct: Double = js.native
    
    var skipped: Double = js.native
    
    var total: Double = js.native
  }
  object Totals {
    
    @scala.inline
    def apply(covered: Double, pct: Double, skipped: Double, total: Double): Totals = {
      val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Totals]
    }
    
    @scala.inline
    implicit class TotalsMutableBuilder[Self <: Totals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
