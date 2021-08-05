package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathZoom extends StObject {
  
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathZoom.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.Any
}
object MathZoom {
  
  inline def apply(styles: js.Any): MathZoom = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathZoom]
  }
  
  extension [Self <: MathZoom](x: Self) {
    
    inline def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
