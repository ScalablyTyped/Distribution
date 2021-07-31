package typings.logkitty

import typings.logkitty.errorsMod.CodeError
import typings.logkitty.logkittyStrings.DEBUG
import typings.logkitty.logkittyStrings.DEFAULT
import typings.logkitty.logkittyStrings.ERROR
import typings.logkitty.logkittyStrings.FATAL
import typings.logkitty.logkittyStrings.INFO
import typings.logkitty.logkittyStrings.SILENT
import typings.logkitty.logkittyStrings.UNKNOWN
import typings.logkitty.logkittyStrings.VERBOSE
import typings.logkitty.logkittyStrings.WARN
import typings.logkitty.typesMod.Entry
import typings.logkitty.typesMod.IFilter
import typings.logkitty.typesMod.Platform
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("logkitty/build/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AndroidPriority {
    
    @JSImport("logkitty/build/api", "AndroidPriority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/api", "AndroidPriority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    @scala.inline
    def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.ERROR")
    @js.native
    def ERROR: Double = js.native
    @scala.inline
    def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.FATAL")
    @js.native
    def FATAL: Double = js.native
    @scala.inline
    def FATAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.INFO")
    @js.native
    def INFO: Double = js.native
    @scala.inline
    def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.SILENT")
    @js.native
    def SILENT: Double = js.native
    @scala.inline
    def SILENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.UNKNOWN")
    @js.native
    def UNKNOWN: Double = js.native
    @scala.inline
    def UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.VERBOSE")
    @js.native
    def VERBOSE: Double = js.native
    @scala.inline
    def VERBOSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERBOSE")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "AndroidPriority.WARN")
    @js.native
    def WARN: Double = js.native
    @scala.inline
    def WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_DEBUG(name: DEBUG): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_ERROR(name: ERROR): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_FATAL(name: FATAL): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_INFO(name: INFO): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_SILENT(name: SILENT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_UNKNOWN(name: UNKNOWN): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_VERBOSE(name: VERBOSE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_WARN(name: WARN): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT]
  }
  
  object IosPriority {
    
    @JSImport("logkitty/build/api", "IosPriority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/api", "IosPriority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    @scala.inline
    def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "IosPriority.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    @scala.inline
    def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "IosPriority.ERROR")
    @js.native
    def ERROR: Double = js.native
    @scala.inline
    def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/api", "IosPriority.INFO")
    @js.native
    def INFO: Double = js.native
    @scala.inline
    def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_DEBUG(name: DEBUG): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_DEFAULT(name: DEFAULT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_ERROR(name: ERROR): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def fromName_INFO(name: INFO): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[DEBUG | INFO | ERROR | DEFAULT]
  }
  
  @scala.inline
  def formatEntry(entry: Entry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatError(error: CodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatError(error: Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def logkitty(options: LogkittyOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("logkitty")(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  @scala.inline
  def makeAppFilter(appIdentifier: String): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAppFilter")(appIdentifier.asInstanceOf[js.Any]).asInstanceOf[FilterCreator]
  
  @scala.inline
  def makeCustomFilter(patterns: String*): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCustomFilter")(patterns.asInstanceOf[js.Any]).asInstanceOf[FilterCreator]
  
  @scala.inline
  def makeMatchFilter(regexes: RegExp*): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMatchFilter")(regexes.asInstanceOf[js.Any]).asInstanceOf[FilterCreator]
  
  @scala.inline
  def makeTagsFilter(tags: String*): FilterCreator = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagsFilter")(tags.asInstanceOf[js.Any]).asInstanceOf[FilterCreator]
  
  type FilterCreator = js.Function3[
    /* platform */ Platform, 
    /* minPriority */ js.UndefOr[Double], 
    /* adbPath */ js.UndefOr[String], 
    IFilter
  ]
  
  trait LogkittyOptions extends StObject {
    
    var adbPath: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[FilterCreator] = js.undefined
    
    var platform: Platform
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object LogkittyOptions {
    
    @scala.inline
    def apply(platform: Platform): LogkittyOptions = {
      val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogkittyOptions]
    }
    
    @scala.inline
    implicit class LogkittyOptionsMutableBuilder[Self <: LogkittyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdbPath(value: String): Self = StObject.set(x, "adbPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdbPathUndefined: Self = StObject.set(x, "adbPath", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* platform */ Platform, /* minPriority */ js.UndefOr[Double], /* adbPath */ js.UndefOr[String]) => IFilter
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
