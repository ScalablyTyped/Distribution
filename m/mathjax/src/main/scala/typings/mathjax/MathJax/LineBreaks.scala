package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineBreaks extends StObject {
  
  /*This controls the automatic breaking of expressions: when false, only linebreak="newline" is processed; when
    * true, line breaks are inserted automatically in long expressions.
    */
  var automatic: js.UndefOr[Boolean] = js.undefined
  
  /*This controls how wide the lines of mathematics can be.
    * Use an explicit width like "30em" for a fixed width. Use "container" to compute the size from the containing
    * element. Use "nn% container" for a portion of the container. Use "nn%" for a portion of the window size.
    * The container-based widths may be slower, and may not produce the expected results if the layout width changes
    * due to the removal of previews or inclusion of mathematics during typesetting.
    */
  var width: js.UndefOr[String] = js.undefined
}
object LineBreaks {
  
  @scala.inline
  def apply(): LineBreaks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineBreaks]
  }
  
  @scala.inline
  implicit class LineBreaksMutableBuilder[Self <: LineBreaks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticUndefined: Self = StObject.set(x, "automatic", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
