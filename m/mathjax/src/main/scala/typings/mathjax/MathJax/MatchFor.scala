package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchFor extends StObject {
  
  /*Whether to match the font size for the HTML-CSS output.*/
  var `HTML-CSS`: js.UndefOr[Boolean] = js.undefined
  
  /*Whether to match the font size for the NativeMML output.*/
  var NativeMML: js.UndefOr[Boolean] = js.undefined
  
  /*Whether to match the font size for the SVG output.*/
  var SVG: js.UndefOr[Boolean] = js.undefined
}
object MatchFor {
  
  @scala.inline
  def apply(): MatchFor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchFor]
  }
  
  @scala.inline
  implicit class MatchForMutableBuilder[Self <: MatchFor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setHTML-CSS`(value: Boolean): Self = StObject.set(x, "HTML-CSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHTML-CSSUndefined`: Self = StObject.set(x, "HTML-CSS", js.undefined)
    
    @scala.inline
    def setNativeMML(value: Boolean): Self = StObject.set(x, "NativeMML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeMMLUndefined: Self = StObject.set(x, "NativeMML", js.undefined)
    
    @scala.inline
    def setSVG(value: Boolean): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVGUndefined: Self = StObject.set(x, "SVG", js.undefined)
  }
}
