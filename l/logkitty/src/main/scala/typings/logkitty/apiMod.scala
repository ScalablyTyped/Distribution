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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
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
    
    @JSImport("logkitty/build/api", "AndroidPriority.fromLetter")
    @js.native
    def fromLetter(letter: String): Double = js.native
    
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_DEBUG(name: DEBUG): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_ERROR(name: ERROR): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_FATAL(name: FATAL): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_INFO(name: INFO): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_SILENT(name: SILENT): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_UNKNOWN(name: UNKNOWN): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_VERBOSE(name: VERBOSE): Double = js.native
    @JSImport("logkitty/build/api", "AndroidPriority.fromName")
    @js.native
    def fromName_WARN(name: WARN): Double = js.native
    
    @JSImport("logkitty/build/api", "AndroidPriority.toLetter")
    @js.native
    def toLetter(code: Double): String = js.native
    
    @JSImport("logkitty/build/api", "AndroidPriority.toName")
    @js.native
    def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = js.native
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
    
    @JSImport("logkitty/build/api", "IosPriority.fromLetter")
    @js.native
    def fromLetter(letter: String): Double = js.native
    
    @JSImport("logkitty/build/api", "IosPriority.fromName")
    @js.native
    def fromName_DEBUG(name: DEBUG): Double = js.native
    @JSImport("logkitty/build/api", "IosPriority.fromName")
    @js.native
    def fromName_DEFAULT(name: DEFAULT): Double = js.native
    @JSImport("logkitty/build/api", "IosPriority.fromName")
    @js.native
    def fromName_ERROR(name: ERROR): Double = js.native
    @JSImport("logkitty/build/api", "IosPriority.fromName")
    @js.native
    def fromName_INFO(name: INFO): Double = js.native
    
    @JSImport("logkitty/build/api", "IosPriority.toLetter")
    @js.native
    def toLetter(code: Double): String = js.native
    
    @JSImport("logkitty/build/api", "IosPriority.toName")
    @js.native
    def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = js.native
  }
  
  @JSImport("logkitty/build/api", "formatEntry")
  @js.native
  def formatEntry(entry: Entry): String = js.native
  
  @JSImport("logkitty/build/api", "formatError")
  @js.native
  def formatError(error: CodeError): String = js.native
  @JSImport("logkitty/build/api", "formatError")
  @js.native
  def formatError(error: Error): String = js.native
  
  @JSImport("logkitty/build/api", "logkitty")
  @js.native
  def logkitty(options: LogkittyOptions): EventEmitter = js.native
  
  @JSImport("logkitty/build/api", "makeAppFilter")
  @js.native
  def makeAppFilter(appIdentifier: String): FilterCreator = js.native
  
  @JSImport("logkitty/build/api", "makeCustomFilter")
  @js.native
  def makeCustomFilter(patterns: String*): FilterCreator = js.native
  
  @JSImport("logkitty/build/api", "makeMatchFilter")
  @js.native
  def makeMatchFilter(regexes: RegExp*): FilterCreator = js.native
  
  @JSImport("logkitty/build/api", "makeTagsFilter")
  @js.native
  def makeTagsFilter(tags: String*): FilterCreator = js.native
  
  type FilterCreator = js.Function3[
    /* platform */ Platform, 
    /* minPriority */ js.UndefOr[Double], 
    /* adbPath */ js.UndefOr[String], 
    IFilter
  ]
  
  @js.native
  trait LogkittyOptions extends StObject {
    
    var adbPath: js.UndefOr[String] = js.native
    
    var filter: js.UndefOr[FilterCreator] = js.native
    
    var platform: Platform = js.native
    
    var priority: js.UndefOr[Double] = js.native
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
