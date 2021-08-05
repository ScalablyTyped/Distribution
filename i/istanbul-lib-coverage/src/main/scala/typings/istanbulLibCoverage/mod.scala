package typings.istanbulLibCoverage

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-coverage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  class FileCoverage protected ()
    extends StObject
       with FileCoverageData {
    def this(data: String) = this()
    def this(data: FileCoverage) = this()
    def this(data: FileCoverageData) = this()
    
    /* CompleteClass */
    var b: StringDictionary[js.Array[Double]] = js.native
    
    /* CompleteClass */
    var branchMap: StringDictionary[BranchMapping] = js.native
    
    def computeBranchTotals(): Totals = js.native
    
    def computeSimpleTotals(): Totals = js.native
    
    var data: FileCoverageData = js.native
    
    /* CompleteClass */
    var f: StringDictionary[Double] = js.native
    
    /* CompleteClass */
    var fnMap: StringDictionary[FunctionMapping] = js.native
    
    def getBranchCoverageByLine(): NumberDictionary[Coverage] = js.native
    
    def getLineCoverage(): NumberDictionary[Double] = js.native
    
    def getUncoveredLines(): js.Array[Double] = js.native
    
    def merge(other: FileCoverageData): Unit = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    def resetHits(): Unit = js.native
    
    /* CompleteClass */
    var s: StringDictionary[Double] = js.native
    
    /* CompleteClass */
    var statementMap: StringDictionary[Range] = js.native
    
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
    inline def FileCoverage_=(x: FileCoverage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileCoverage")(x.asInstanceOf[js.Any])
  }
  
  inline def createCoverageMap(): CoverageMap = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoverageMap")().asInstanceOf[CoverageMap]
  inline def createCoverageMap(data: CoverageMap): CoverageMap = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoverageMap")(data.asInstanceOf[js.Any]).asInstanceOf[CoverageMap]
  inline def createCoverageMap(data: CoverageMapData): CoverageMap = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoverageMap")(data.asInstanceOf[js.Any]).asInstanceOf[CoverageMap]
  
  inline def createCoverageSummary(): CoverageSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoverageSummary")().asInstanceOf[CoverageSummary]
  inline def createCoverageSummary(obj: CoverageSummary): CoverageSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoverageSummary")(obj.asInstanceOf[js.Any]).asInstanceOf[CoverageSummary]
  inline def createCoverageSummary(obj: CoverageSummaryData): CoverageSummary = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoverageSummary")(obj.asInstanceOf[js.Any]).asInstanceOf[CoverageSummary]
  
  inline def createFileCoverage(pathOrObject: String): FileCoverage = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileCoverage")(pathOrObject.asInstanceOf[js.Any]).asInstanceOf[FileCoverage]
  inline def createFileCoverage(pathOrObject: FileCoverage): FileCoverage = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileCoverage")(pathOrObject.asInstanceOf[js.Any]).asInstanceOf[FileCoverage]
  inline def createFileCoverage(pathOrObject: FileCoverageData): FileCoverage = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileCoverage")(pathOrObject.asInstanceOf[js.Any]).asInstanceOf[FileCoverage]
  
  trait BranchMapping extends StObject {
    
    var line: Double
    
    var loc: Range
    
    var locations: js.Array[Range]
    
    var `type`: String
  }
  object BranchMapping {
    
    inline def apply(line: Double, loc: Range, locations: js.Array[Range], `type`: String): BranchMapping = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BranchMapping]
    }
    
    extension [Self <: BranchMapping](x: Self) {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: Range): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[Range]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Range*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coverage extends StObject {
    
    var coverage: Double
    
    var covered: Double
    
    var total: Double
  }
  object Coverage {
    
    inline def apply(coverage: Double, covered: Double, total: Double): Coverage = {
      val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], covered = covered.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coverage]
    }
    
    extension [Self <: Coverage](x: Self) {
      
      inline def setCoverage(value: Double): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
      
      inline def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type CoverageMapData = StringDictionary[FileCoverage | FileCoverageData]
  
  trait CoverageSummaryData extends StObject {
    
    var branches: Totals
    
    var functions: Totals
    
    var lines: Totals
    
    var statements: Totals
  }
  object CoverageSummaryData {
    
    inline def apply(branches: Totals, functions: Totals, lines: Totals, statements: Totals): CoverageSummaryData = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageSummaryData]
    }
    
    extension [Self <: CoverageSummaryData](x: Self) {
      
      inline def setBranches(value: Totals): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: Totals): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Totals): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: Totals): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileCoverageData extends StObject {
    
    var b: StringDictionary[js.Array[Double]]
    
    var branchMap: StringDictionary[BranchMapping]
    
    var f: StringDictionary[Double]
    
    var fnMap: StringDictionary[FunctionMapping]
    
    var path: String
    
    var s: StringDictionary[Double]
    
    var statementMap: StringDictionary[Range]
  }
  object FileCoverageData {
    
    inline def apply(
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
    
    extension [Self <: FileCoverageData](x: Self) {
      
      inline def setB(value: StringDictionary[js.Array[Double]]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBranchMap(value: StringDictionary[BranchMapping]): Self = StObject.set(x, "branchMap", value.asInstanceOf[js.Any])
      
      inline def setF(value: StringDictionary[Double]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFnMap(value: StringDictionary[FunctionMapping]): Self = StObject.set(x, "fnMap", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setS(value: StringDictionary[Double]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setStatementMap(value: StringDictionary[Range]): Self = StObject.set(x, "statementMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait FunctionMapping extends StObject {
    
    var decl: Range
    
    var line: Double
    
    var loc: Range
    
    var name: String
  }
  object FunctionMapping {
    
    inline def apply(decl: Range, line: Double, loc: Range, name: String): FunctionMapping = {
      val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionMapping]
    }
    
    extension [Self <: FunctionMapping](x: Self) {
      
      inline def setDecl(value: Range): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: Range): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Location {
    
    inline def apply(column: Double, line: Double): Location = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Range extends StObject {
    
    var end: Location
    
    var start: Location
  }
  object Range {
    
    inline def apply(end: Location, start: Location): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEnd(value: Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Totals extends StObject {
    
    var covered: Double
    
    var pct: Double
    
    var skipped: Double
    
    var total: Double
  }
  object Totals {
    
    inline def apply(covered: Double, pct: Double, skipped: Double, total: Double): Totals = {
      val __obj = js.Dynamic.literal(covered = covered.asInstanceOf[js.Any], pct = pct.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Totals]
    }
    
    extension [Self <: Totals](x: Self) {
      
      inline def setCovered(value: Double): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
      
      inline def setPct(value: Double): Self = StObject.set(x, "pct", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
