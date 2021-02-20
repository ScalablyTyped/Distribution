package typings.gulpTslint

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Main plugin function
    * @param {PluginOptions} [pluginOptions] contains the options for gulp-tslint.
    * Optional.
    * @returns {any}
    */
  @JSImport("gulp-tslint", JSImport.Default)
  @js.native
  val default: TslintPlugin = js.native
  
  @js.native
  trait PluginOptions extends StObject {
    
    var configuration: js.UndefOr[js.Any] = js.native
    
    var fix: js.UndefOr[Boolean] = js.native
    
    var formatter: js.UndefOr[String | js.Function] = js.native
    
    var formattersDirectory: js.UndefOr[String] = js.native
    
    var program: js.UndefOr[js.Any] = js.native
    
    var rulesDirectory: js.UndefOr[String] = js.native
    
    var tslint: js.UndefOr[js.Any] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfiguration(value: js.Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      @scala.inline
      def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setFormattersDirectory(value: String): Self = StObject.set(x, "formattersDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattersDirectoryUndefined: Self = StObject.set(x, "formattersDirectory", js.undefined)
      
      @scala.inline
      def setProgram(value: js.Any): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setRulesDirectory(value: String): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
      
      @scala.inline
      def setTslint(value: js.Any): Self = StObject.set(x, "tslint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTslintUndefined: Self = StObject.set(x, "tslint", js.undefined)
    }
  }
  
  @js.native
  trait ReportOptions extends StObject {
    
    var allowWarnings: js.UndefOr[Boolean] = js.native
    
    var emitError: js.UndefOr[Boolean] = js.native
    
    var reportLimit: js.UndefOr[Double] = js.native
    
    var summarizeFailureOutput: js.UndefOr[Boolean] = js.native
  }
  object ReportOptions {
    
    @scala.inline
    def apply(): ReportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportOptions]
    }
    
    @scala.inline
    implicit class ReportOptionsMutableBuilder[Self <: ReportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowWarnings(value: Boolean): Self = StObject.set(x, "allowWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowWarningsUndefined: Self = StObject.set(x, "allowWarnings", js.undefined)
      
      @scala.inline
      def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      @scala.inline
      def setReportLimit(value: Double): Self = StObject.set(x, "reportLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportLimitUndefined: Self = StObject.set(x, "reportLimit", js.undefined)
      
      @scala.inline
      def setSummarizeFailureOutput(value: Boolean): Self = StObject.set(x, "summarizeFailureOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummarizeFailureOutputUndefined: Self = StObject.set(x, "summarizeFailureOutput", js.undefined)
    }
  }
  
  @js.native
  trait TslintFile extends StObject {
    
    var contents: Buffer | js.Any = js.native
    
    def isNull(): Boolean = js.native
    
    def isStream(): Boolean = js.native
    
    var path: String = js.native
    
    var relative: String = js.native
    
    var tslint: js.Any = js.native
  }
  object TslintFile {
    
    @scala.inline
    def apply(
      contents: Buffer | js.Any,
      isNull: () => Boolean,
      isStream: () => Boolean,
      path: String,
      relative: String,
      tslint: js.Any
    ): TslintFile = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], isNull = js.Any.fromFunction0(isNull), isStream = js.Any.fromFunction0(isStream), path = path.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any])
      __obj.asInstanceOf[TslintFile]
    }
    
    @scala.inline
    implicit class TslintFileMutableBuilder[Self <: TslintFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Buffer | js.Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNull(value: () => Boolean): Self = StObject.set(x, "isNull", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsStream(value: () => Boolean): Self = StObject.set(x, "isStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTslint(value: js.Any): Self = StObject.set(x, "tslint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TslintPlugin extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(pluginOptions: PluginOptions): ReadWriteStream = js.native
    
    var pluginOptions: PluginOptions = js.native
    
    def report(): ReadWriteStream = js.native
    def report(options: ReportOptions): ReadWriteStream = js.native
  }
  
  type _To = TslintPlugin
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: TslintPlugin = default
}
