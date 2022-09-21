package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TEX2jaxPreprocessor extends StObject {
  
  /*This value determines whether tex2jax requires braces to be balanced within math delimiters (which allows for
    * nested dollar signs). Set to false to get pre-v2.0 compatibility. When true,
    *
    * $y = x^2 \hbox{ when $x > 2$}$.
    * will be properly handled as a single expression. When false, it would be interpreted as two searpate
    * expressions, each with improperly balanced braces.
    */
  var balanceBraces: js.UndefOr[Boolean] = js.undefined
  
  /*Array of pairs of strings that are to be used as delimiters for displayed equations. The first in each pair is
    * the initial delimiter and the second is the terminal delimiter. You can have as many pairs as you want.
    *
    * Note that the delimiters can’t look like HTML tags (i.e., can’t include the less-than sign), as these would be
    * turned into tags by the browser before MathJax has the chance to run. You can only include text, not tags, as
    * your math delimiters.
    */
  var displayMath: js.UndefOr[Any] = js.undefined
  
  /*This is the class name used to mark elements whose contents should not be processed by tex2jax (other than to
    * look for the processClass pattern below). Note that this is a regular expression, and so you need to be sure
    * to quote any regexp special characters. The pattern is inserted into one that requires your pattern to match
    * a complete word, so setting ignoreClass: "class2" would cause it to match an element with class="class1 class2
    * class3" but not class="myclass2". Note that you can assign several classes by separating them by the vertical
    * line character (|). For instance, with ignoreClass: "class1|class2" any element assigned a class of either
    * class1 or class2 will be skipped.
    */
  var ignoreClass: js.UndefOr[String] = js.undefined
  
  /*Array of pairs of strings that are to be used as in-line math delimiters. The first in each pair is the
    * initial delimiter and the second is the terminal delimiter. You can have as many pairs as you want. For
    * example,
    *
    * inlineMath: [ ['$','$'], ['\\(','\\)'] ]
    * would cause tex2jax to look for $...$ and \(...\) as delimiters for inline mathematics. (Note that the single
    * dollar signs are not enabled by default because they are used too frequently in normal text, so if you want to
    * use them for math delimiters, you must specify them explicitly.)
    *
    * Note that the delimiters can’t look like HTML tags (i.e., can’t include the less-than sign), as these would be
    * turned into tags by the browser before MathJax has the chance to run. You can only include text, not tags, as
    * your math delimiters.
    */
  var inlineMath: js.UndefOr[Any] = js.undefined
  
  /*This controls whether tex2jax inserts MathJax_Preview spans to make a preview available, and what preview to
    * use, when it locates in-line or display mathematics in the page. The default is "TeX", which means use the TeX
    * code as the preview (which will be visible until it is processed by MathJax). Set to "none" to prevent
    * previews from being inserted (the math will simply disappear until it is typeset). Set to an array containing
    * the description of an HTML snippet in order to use the same preview for all equations on the page.
    *
    * Examples:
    *
    * preview: ["[math]"],     //  insert the text "[math]" as the preview
    * preview: [["img",{src: "/images/mypic.jpg"}]],  // insert an image as the preview
    */
  var preview: js.UndefOr[Any] = js.undefined
  
  /*This is the class name used to mark elements whose contents should be processed by tex2jax. This is used to
    * restart processing within tags that have been marked as ignored via the ignoreClass or to cause a tag that
    * appears in the skipTags list to be processed rather than skipped. Note that this is a regular expression, and
    * so you need to be sure to quote any regexp special characters. The pattern is inserted into one that requires
    * your pattern to match a complete word, so setting processClass: "class2" would cause it to match an element
    * with class="class1 class2 class3" but not class="myclass2". Note that you can assign several classes by
    * separating them by the vertical line character (|). For instance, with processClass: "class1|class2" any
    * element assigned a class of either class1 or class2 will have its contents processed.*/
  var processClass: js.UndefOr[String] = js.undefined
  
  /*When true, tex2jax looks not only for the in-line and display math delimiters, but also for LaTeX environments
    * (\begin{something}...\end{something}) and marks them for processing by MathJax. When false, LaTeX environments
    * will not be processed outside of math mode.
    */
  var processEnvironments: js.UndefOr[Boolean] = js.undefined
  
  /*When set to true, you may use \$ to represent a literal dollar sign, rather than using it as a math delimiter.
    * When false, \$ will not be altered, and the dollar sign may be considered part of a math delimiter. Typically
    * this is set to true if you enable the $ ... $ in-line delimiters, so you can type \$ and tex2jax will convert
    * it to a regular dollar sign in the rendered document.
    */
  var processEscapes: js.UndefOr[Boolean] = js.undefined
  
  /*This array lists the names of the tags whose contents should not be processed by tex2jax (other than to look
    * for ignore/process classes as listed below). You can add to (or remove from) this list to prevent MathJax from
    * processing mathematics in specific contexts.
    */
  var skipTags: js.UndefOr[js.Array[String]] = js.undefined
}
object TEX2jaxPreprocessor {
  
  inline def apply(): TEX2jaxPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TEX2jaxPreprocessor]
  }
  
  extension [Self <: TEX2jaxPreprocessor](x: Self) {
    
    inline def setBalanceBraces(value: Boolean): Self = StObject.set(x, "balanceBraces", value.asInstanceOf[js.Any])
    
    inline def setBalanceBracesUndefined: Self = StObject.set(x, "balanceBraces", js.undefined)
    
    inline def setDisplayMath(value: Any): Self = StObject.set(x, "displayMath", value.asInstanceOf[js.Any])
    
    inline def setDisplayMathUndefined: Self = StObject.set(x, "displayMath", js.undefined)
    
    inline def setIgnoreClass(value: String): Self = StObject.set(x, "ignoreClass", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClassUndefined: Self = StObject.set(x, "ignoreClass", js.undefined)
    
    inline def setInlineMath(value: Any): Self = StObject.set(x, "inlineMath", value.asInstanceOf[js.Any])
    
    inline def setInlineMathUndefined: Self = StObject.set(x, "inlineMath", js.undefined)
    
    inline def setPreview(value: Any): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setProcessClass(value: String): Self = StObject.set(x, "processClass", value.asInstanceOf[js.Any])
    
    inline def setProcessClassUndefined: Self = StObject.set(x, "processClass", js.undefined)
    
    inline def setProcessEnvironments(value: Boolean): Self = StObject.set(x, "processEnvironments", value.asInstanceOf[js.Any])
    
    inline def setProcessEnvironmentsUndefined: Self = StObject.set(x, "processEnvironments", js.undefined)
    
    inline def setProcessEscapes(value: Boolean): Self = StObject.set(x, "processEscapes", value.asInstanceOf[js.Any])
    
    inline def setProcessEscapesUndefined: Self = StObject.set(x, "processEscapes", js.undefined)
    
    inline def setSkipTags(value: js.Array[String]): Self = StObject.set(x, "skipTags", value.asInstanceOf[js.Any])
    
    inline def setSkipTagsUndefined: Self = StObject.set(x, "skipTags", js.undefined)
    
    inline def setSkipTagsVarargs(value: String*): Self = StObject.set(x, "skipTags", js.Array(value*))
  }
}
