package typings.istanbulLibInstrument

import typings.istanbulLibCoverage.mod.FileCoverage
import typings.istanbulLibCoverage.mod.FileCoverageData
import typings.istanbulLibInstrument.anon.PartialInstrumenterOption
import typings.istanbulLibInstrument.anon.PartialVisitorOptions
import typings.istanbulLibInstrument.anon.TypeofbabelTypes
import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-instrument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("istanbul-lib-instrument", "Instrumenter")
  @js.native
  open class Instrumenter () extends StObject {
    def this(options: PartialInstrumenterOption) = this()
    
    var fileCoverage: FileCoverage = js.native
    
    def instrument(code: String, filenameOrCallback: String): Unit = js.native
    def instrument(code: String, filenameOrCallback: String, callback: Unit, inputSourceMap: RawSourceMap): Unit = js.native
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
      callback: Unit,
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
  
  inline def createInstrumenter(): Instrumenter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstrumenter")().asInstanceOf[Instrumenter]
  inline def createInstrumenter(options: PartialInstrumenterOption): Instrumenter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstrumenter")(options.asInstanceOf[js.Any]).asInstanceOf[Instrumenter]
  
  inline def programVisitor(types: TypeofbabelTypes): Visitor = ^.asInstanceOf[js.Dynamic].applyDynamic("programVisitor")(types.asInstanceOf[js.Any]).asInstanceOf[Visitor]
  inline def programVisitor(types: TypeofbabelTypes, sourceFilePath: String): Visitor = (^.asInstanceOf[js.Dynamic].applyDynamic("programVisitor")(types.asInstanceOf[js.Any], sourceFilePath.asInstanceOf[js.Any])).asInstanceOf[Visitor]
  inline def programVisitor(types: TypeofbabelTypes, sourceFilePath: String, opts: PartialVisitorOptions): Visitor = (^.asInstanceOf[js.Dynamic].applyDynamic("programVisitor")(types.asInstanceOf[js.Any], sourceFilePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Visitor]
  inline def programVisitor(types: TypeofbabelTypes, sourceFilePath: Unit, opts: PartialVisitorOptions): Visitor = (^.asInstanceOf[js.Dynamic].applyDynamic("programVisitor")(types.asInstanceOf[js.Any], sourceFilePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Visitor]
  
  inline def readInitialCoverage(code: String): InitialCoverage = ^.asInstanceOf[js.Dynamic].applyDynamic("readInitialCoverage")(code.asInstanceOf[js.Any]).asInstanceOf[InitialCoverage]
  
  trait InitialCoverage extends StObject {
    
    var coverageData: Any
    
    var gcv: Any
    
    var hash: String
    
    var path: String
  }
  object InitialCoverage {
    
    inline def apply(coverageData: Any, gcv: Any, hash: String, path: String): InitialCoverage = {
      val __obj = js.Dynamic.literal(coverageData = coverageData.asInstanceOf[js.Any], gcv = gcv.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialCoverage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitialCoverage] (val x: Self) extends AnyVal {
      
      inline def setCoverageData(value: Any): Self = StObject.set(x, "coverageData", value.asInstanceOf[js.Any])
      
      inline def setGcv(value: Any): Self = StObject.set(x, "gcv", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type InstrumenterCallback = js.Function2[/* error */ js.Error | Null, /* code */ String, Unit]
  
  trait InstrumenterOptions extends StObject {
    
    var autoWrap: Boolean
    
    var compact: Boolean
    
    var coverageVariable: String
    
    var debug: Boolean
    
    var esModules: Boolean
    
    var preserveComments: Boolean
    
    var produceSourceMap: Boolean
    
    def sourceMapUrlCallback(filename: String, url: String): Unit
  }
  object InstrumenterOptions {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: InstrumenterOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoWrap(value: Boolean): Self = StObject.set(x, "autoWrap", value.asInstanceOf[js.Any])
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setEsModules(value: Boolean): Self = StObject.set(x, "esModules", value.asInstanceOf[js.Any])
      
      inline def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      inline def setProduceSourceMap(value: Boolean): Self = StObject.set(x, "produceSourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlCallback(value: (String, String) => Unit): Self = StObject.set(x, "sourceMapUrlCallback", js.Any.fromFunction2(value))
    }
  }
  
  trait Visitor extends StObject {
    
    def enter(path: String): Unit
    
    def exit(path: String): typings.istanbulLibInstrument.anon.FileCoverage
  }
  object Visitor {
    
    inline def apply(enter: String => Unit, exit: String => typings.istanbulLibInstrument.anon.FileCoverage): Visitor = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), exit = js.Any.fromFunction1(exit))
      __obj.asInstanceOf[Visitor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Visitor] (val x: Self) extends AnyVal {
      
      inline def setEnter(value: String => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setExit(value: String => typings.istanbulLibInstrument.anon.FileCoverage): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    }
  }
  
  trait VisitorOptions extends StObject {
    
    var coverageVariable: String
    
    var inputSourceMap: RawSourceMap
  }
  object VisitorOptions {
    
    inline def apply(coverageVariable: String, inputSourceMap: RawSourceMap): VisitorOptions = {
      val __obj = js.Dynamic.literal(coverageVariable = coverageVariable.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VisitorOptions] (val x: Self) extends AnyVal {
      
      inline def setCoverageVariable(value: String): Self = StObject.set(x, "coverageVariable", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMap(value: RawSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
    }
  }
}
