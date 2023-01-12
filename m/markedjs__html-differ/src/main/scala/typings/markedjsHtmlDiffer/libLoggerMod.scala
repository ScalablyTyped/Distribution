package typings.markedjsHtmlDiffer

import typings.markedjsHtmlDiffer.mod.ChangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggerMod {
  
  @JSImport("@markedjs/html-differ/lib/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDiffText(result: js.Array[ChangeObject]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffText")(result.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDiffText(result: js.Array[ChangeObject], options: LoggerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDiffText")(result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def logDiffText(result: js.Array[ChangeObject]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("logDiffText")(result.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def logDiffText(result: js.Array[ChangeObject], options: LoggerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("logDiffText")(result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait LoggerOptions extends StObject {
    
    /**
      * the number of characters around the diff result between two HTML
      * @default 40
      */
    var charsAroundDiff: js.UndefOr[Double] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      inline def setCharsAroundDiff(value: Double): Self = StObject.set(x, "charsAroundDiff", value.asInstanceOf[js.Any])
      
      inline def setCharsAroundDiffUndefined: Self = StObject.set(x, "charsAroundDiff", js.undefined)
    }
  }
}
