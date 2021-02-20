package typings.markedjsHtmlDiffer

import typings.markedjsHtmlDiffer.mod.ChangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@markedjs/html-differ/lib/logger", "getDiffText")
  @js.native
  def getDiffText(result: js.Array[ChangeObject]): String = js.native
  @JSImport("@markedjs/html-differ/lib/logger", "getDiffText")
  @js.native
  def getDiffText(result: js.Array[ChangeObject], options: LoggerOptions): String = js.native
  
  @JSImport("@markedjs/html-differ/lib/logger", "logDiffText")
  @js.native
  def logDiffText(result: js.Array[ChangeObject]): String = js.native
  @JSImport("@markedjs/html-differ/lib/logger", "logDiffText")
  @js.native
  def logDiffText(result: js.Array[ChangeObject], options: LoggerOptions): String = js.native
  
  @js.native
  trait LoggerOptions extends StObject {
    
    /**
      * the number of characters around the diff result between two HTML
      * @default 40
      */
    var charsAroundDiff: js.UndefOr[Double] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharsAroundDiff(value: Double): Self = StObject.set(x, "charsAroundDiff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsAroundDiffUndefined: Self = StObject.set(x, "charsAroundDiff", js.undefined)
    }
  }
}
