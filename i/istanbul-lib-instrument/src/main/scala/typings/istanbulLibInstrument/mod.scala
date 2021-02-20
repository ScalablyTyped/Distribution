package typings.istanbulLibInstrument

import typings.istanbulLibCoverage.mod.FileCoverage
import typings.istanbulLibCoverage.mod.FileCoverageData
import typings.istanbulLibInstrument.anon.PartialInstrumenterOption
import typings.istanbulLibInstrument.anon.PartialVisitorOptions
import typings.istanbulLibInstrument.anon.TypeofbabelTypes
import typings.sourceMap.mod.RawSourceMap
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-instrument", "Instrumenter")
  @js.native
  class Instrumenter () extends StObject {
    def this(options: PartialInstrumenterOption) = this()
    
    var fileCoverage: FileCoverage = js.native
    
    def instrument(code: String, filenameOrCallback: String): Unit = js.native
    def instrument(
      code: String,
      filenameOrCallback: String,
      callback: js.UndefOr[scala.Nothing],
      inputSourceMap: RawSourceMap
    ): Unit = js.native
    def instrument(code: String, filenameOrCallback: String, callback: InstrumenterCallback): Unit = js.native
    def instrument(
      code: String,
      filenameOrCallback: String,
      callback: InstrumenterCallback,
      inputSourceMap: RawSourceMap
    ): Unit = js.native
    def instrument(code: String, filenameOrCallback: InstrumenterCallback): Unit = js.native
    def instrument(
      code: String,
      filenameOrCallback: InstrumenterCallback,
      callback: js.UndefOr[scala.Nothing],
      inputSourceMap: RawSourceMap
    ): Unit = js.native
    def instrument(code: String, filenameOrCallback: InstrumenterCallback, callback: InstrumenterCallback): Unit = js.native
    def instrument(
      code: String,
      filenameOrCallback: InstrumenterCallback,
      callback: InstrumenterCallback,
      inputSourceMap: RawSourceMap
    ): Unit = js.native
    
    def instrumentSync(code: String, filename: String): String = js.native
    def instrumentSync(code: String, filename: String, inputSourceMap: RawSourceMap): String = js.native
    
    def lastFileCoverage(): FileCoverageData = js.native
    
    def lastSourceMap(): RawSourceMap = js.native
    
    def normalizeOpts(): InstrumenterOptions = js.native
    def normalizeOpts(options: PartialInstrumenterOption): InstrumenterOptions = js.native
    
    var opts: InstrumenterOptions = js.native
    
    var sourceMap: RawSourceMap | Null = js.native
  }
  
  @JSImport("istanbul-lib-instrument", "createInstrumenter")
  @js.native
  def createInstrumenter(): Instrumenter = js.native
  @JSImport("istanbul-lib-instrument", "createInstrumenter")
  @js.native
  def createInstrumenter(options: PartialInstrumenterOption): Instrumenter = js.native
  
  @JSImport("istanbul-lib-instrument", "programVisitor")
  @js.native
  def programVisitor(types: TypeofbabelTypes): Visitor = js.native
  @JSImport("istanbul-lib-instrument", "programVisitor")
  @js.native
  def programVisitor(types: TypeofbabelTypes, sourceFilePath: js.UndefOr[scala.Nothing], opts: PartialVisitorOptions): Visitor = js.native
  @JSImport("istanbul-lib-instrument", "programVisitor")
  @js.native
  def programVisitor(types: TypeofbabelTypes, sourceFilePath: String): Visitor = js.native
  @JSImport("istanbul-lib-instrument", "programVisitor")
  @js.native
  def programVisitor(types: TypeofbabelTypes, sourceFilePath: String, opts: PartialVisitorOptions): Visitor = js.native
  
  @JSImport("istanbul-lib-instrument", "readInitialCoverage")
  @js.native
  def readInitialCoverage(code: String): InitialCoverage = js.native
  
  @js.native
  trait InitialCoverage extends StObject {
    
    var coverageData: js.Any = js.native
    
    var gcv: js.Any = js.native
    
    var hash: String = js.native
    
    var path: String = js.native
  }
  object InitialCoverage {
    
    @scala.inline
    def apply(coverageData: js.Any, gcv: js.Any, hash: String, path: String): InitialCoverage = {
      val __obj = js.Dynamic.literal(coverageData = coverageData.asInstanceOf[js.Any], gcv = gcv.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialCoverage]
    }
    
    @scala.inline
    implicit class InitialCoverageMutableBuilder[Self <: InitialCoverage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageData(value: js.Any): Self = StObject.set(x, "coverageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGcv(value: js.Any): Self = StObject.set(x, "gcv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type InstrumenterCallback = js.Function2[/* error */ Error | Null, /* code */ String, Unit]
  
  @js.native
  trait InstrumenterOptions extends StObject {
    
    var autoWrap: Boolean = js.native
    
    var compact: Boolean = js.native
    
    var coverageVariable: String = js.native
    
    var debug: Boolean = js.native
    
    var esModules: Boolean = js.native
    
    var preserveComments: Boolean = js.native
    
    var produceSourceMap: Boolean = js.native
    
    def sourceMapUrlCallback(filename: String, url: String): Unit = js.native
  }
  object InstrumenterOptions {
    
    @scala.inline
    def apply(
      autoWrap: Boolean,
      compact: Boolean,
      coverageVariable: String,
      debug: Boolean,
      esModules: Boolean,
      preserveComments: Boolean,
      produceSourceMap: Boolean,
      sourceMapUrlCallback: (String, String) => Unit
    ): InstrumenterOptions = {
      val __obj = js.Dynamic.literal(autoWrap = autoWrap.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], coverageVariable = coverageVariable.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], esModules = esModules.asInstanceOf[js.Any], preserveComments = preserveComments.asInstanceOf[js.Any], produceSourceMap = produceSourceMap.asInstanceOf[js.Any], sourceMapUrlCallback = js.Any.fromFunction2(sourceMapUrlCallback))
      __obj.asInstanceOf[InstrumenterOptions]
    }
    
    @scala.inline
    implicit class InstrumenterOptionsMutableBuilder[Self <: InstrumenterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoWrap(value: Boolean): Self = StObject.set(x, "autoWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsModules(value: Boolean): Self = StObject.set(x, "esModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduceSourceMap(value: Boolean): Self = StObject.set(x, "produceSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUrlCallback(value: (String, String) => Unit): Self = StObject.set(x, "sourceMapUrlCallback", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Visitor extends StObject {
    
    def enter(path: String): Unit = js.native
    
    def exit(path: String): typings.istanbulLibInstrument.anon.FileCoverage = js.native
  }
  object Visitor {
    
    @scala.inline
    def apply(enter: String => Unit, exit: String => typings.istanbulLibInstrument.anon.FileCoverage): Visitor = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
      __obj.asInstanceOf[Visitor]
    }
    
    @scala.inline
    implicit class VisitorMutableBuilder[Self <: Visitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnter(value: String => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExit(value: String => typings.istanbulLibInstrument.anon.FileCoverage): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait VisitorOptions extends StObject {
    
    var coverageVariable: String = js.native
    
    var inputSourceMap: RawSourceMap = js.native
  }
  object VisitorOptions {
    
    @scala.inline
    def apply(coverageVariable: String, inputSourceMap: RawSourceMap): VisitorOptions = {
      val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitorOptions]
    }
    
    @scala.inline
    implicit class VisitorOptionsMutableBuilder[Self <: VisitorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSourceMap(value: RawSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
    }
  }
}
