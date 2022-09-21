package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeXInputProcessor extends StObject {
  
  /*Because a definition of the form \def\x{\x aaa} \x would loop infinitely, and at the same time stack up lots
    * of a’s in MathJax’s equation buffer, the MAXBUFFER constant is used to limit the size of the string being
    * processed by MathJax. It is set to 5KB, which should be sufficient for any reasonable equation.
    */
  var MAXBUFFER: js.UndefOr[Double] = js.undefined
  
  /*Because a definition of the form \def\x{\x} \x would cause MathJax to loop infinitely, the MAXMACROS constant
    * will limit the number of macro substitutions allowed in any expression processed by MathJax.
    */
  var MAXMACROS: js.UndefOr[Double] = js.undefined
  
  /*This lists macros to define before the TeX input processor begins. These are name:value pairs where the name
    * gives the name of the TeX macro to be defined, and value gives the replacement text for the macro. The value
    * can be an array of the form [value,n], where value is the replacement text and n is the number of parameters
    * for the macro. Note that since the value is a javascript string, backslashes in the replacement text must be
    * doubled to prevent them from acting as javascript escape characters.
    */
  var Macros: js.UndefOr[Any] = js.undefined
  
  /*The width to use for the multline environment that is part of the AMSmath extension. This width gives room for
    * tags at either side of the equation, but if you are displaying mathematics in a small area or a thin column of
    * text, you might need to change the value to leave sufficient margin for tags.
    */
  var MultLineWidth: js.UndefOr[String] = js.undefined
  
  /*This is the amount of indentation (from the right or left) for the tags produced by the \tag{} macro.*/
  var TagIndent: js.UndefOr[String] = js.undefined
  
  /*This specifies the side on which \tag{} macros will place the tags. Set it to "left" to place the tags on the
    * left-hand side.
    */
  var TagSide: js.UndefOr[String] = js.undefined
  
  /*This object controls the automatic equation numbering and the equation referencing.*/
  var equationNumbers: js.UndefOr[EquationNumbers] = js.undefined
  
  /*A comma-separated list of extensions to load at startup. The default directory is MathJax/extensions. The
    * tex2jax and mml2jax preprocessors can be listed here, as well as a FontWarnings extension that you can use to
    * inform your user that mathematics fonts are available that they can download to improve their experience of
    * your site.
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
}
object TeXInputProcessor {
  
  inline def apply(): TeXInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeXInputProcessor]
  }
  
  extension [Self <: TeXInputProcessor](x: Self) {
    
    inline def setEquationNumbers(value: EquationNumbers): Self = StObject.set(x, "equationNumbers", value.asInstanceOf[js.Any])
    
    inline def setEquationNumbersUndefined: Self = StObject.set(x, "equationNumbers", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMAXBUFFER(value: Double): Self = StObject.set(x, "MAXBUFFER", value.asInstanceOf[js.Any])
    
    inline def setMAXBUFFERUndefined: Self = StObject.set(x, "MAXBUFFER", js.undefined)
    
    inline def setMAXMACROS(value: Double): Self = StObject.set(x, "MAXMACROS", value.asInstanceOf[js.Any])
    
    inline def setMAXMACROSUndefined: Self = StObject.set(x, "MAXMACROS", js.undefined)
    
    inline def setMacros(value: Any): Self = StObject.set(x, "Macros", value.asInstanceOf[js.Any])
    
    inline def setMacrosUndefined: Self = StObject.set(x, "Macros", js.undefined)
    
    inline def setMultLineWidth(value: String): Self = StObject.set(x, "MultLineWidth", value.asInstanceOf[js.Any])
    
    inline def setMultLineWidthUndefined: Self = StObject.set(x, "MultLineWidth", js.undefined)
    
    inline def setTagIndent(value: String): Self = StObject.set(x, "TagIndent", value.asInstanceOf[js.Any])
    
    inline def setTagIndentUndefined: Self = StObject.set(x, "TagIndent", js.undefined)
    
    inline def setTagSide(value: String): Self = StObject.set(x, "TagSide", value.asInstanceOf[js.Any])
    
    inline def setTagSideUndefined: Self = StObject.set(x, "TagSide", js.undefined)
  }
}
