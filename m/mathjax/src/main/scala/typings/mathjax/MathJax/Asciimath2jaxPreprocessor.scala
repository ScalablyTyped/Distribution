package typings.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asciimath2jaxPreprocessor extends StObject {
  
  /*Array of pairs of strings that are to be used as math delimiters. The first in each pair is the initial
    * delimiter and the second is the terminal delimiter. You can have as many pairs as you want. For example,
    *
    * delimiters: [ ['$','$'], ['`','`'] ]
    * would cause asciimath2jax to look for $...$ and `...` as delimiters for inline mathematics. (Note that the
    * single dollar signs are not enabled by default because they are used too frequently in normal text, so if you
    * want to use them for math delimiters, you must specify them explicitly.)
    *
    * Note that the delimiters can’t look like HTML tags (i.e., can’t include the less-than sign), as these would be
    * turned into tags by the browser before MathJax has the chance to run. You can only include text, not tags,
    * as your math delimiters.
    */
  var delimiters: js.UndefOr[js.Any] = js.undefined
  
  /*This is the class name used to mark elements whose contents should not be processed by asciimath2jax (other
    * than to look for the processClass pattern below). Note that this is a regular expression, and so you need to
    * be sure to quote any regexp special characters. The pattern is inserted into one that requires your pattern to
    * match a complete word, so setting ignoreClass: "class2" would cause it to match an element with class="class1
    * class2 class3" but not class="myclass2". Note that you can assign several classes by separating them by the
    * vertical line character (|). For instance, with ignoreClass: "class1|class2" any element assigned a class of
    * either class1 or class2 will be skipped.
    */
  var ignoreClass: js.UndefOr[String] = js.undefined
  
  /*This controls whether asciimath2jax inserts MathJax_Preview spans to make a preview available, and what
    * preview to use, when it locates in-line or display mathematics in the page. The default is "AsciiMath", which
    * means use the ASCIIMath code as the preview (which will be visible until it is processed by MathJax). Set to
    * "none" to prevent previews from being inserted (the math will simply disappear until it is typeset). Set to
    * an array containing the description of an HTML snippet in order to use the same preview for all equations
    * on the page.
    *
    * Examples:
    *
    * preview: ["[math]"],     //  insert the text "[math]" as the preview
    * preview: [["img",{src: "/images/mypic.jpg"}]],  // insert an image as the preview
    */
  var preview: js.UndefOr[js.Any] = js.undefined
  
  /*This is the class name used to mark elements whose contents should be processed by asciimath2jax. This is used
    * to restart processing within tags that have been marked as ignored via the ignoreClass or to cause a tag that
    * appears in the skipTags list to be processed rather than skipped. Note that this is a regular expression, and
    * so you need to be sure to quote any regexp special characters. The pattern is inserted into one that requires
    * your pattern to match a complete word, so setting processClass: "class2" would cause it to match an element
    * with class="class1 class2 class3" but not class="myclass2". Note that you can assign several classes by
    * separating them by the vertical line character (|). For instance, with processClass: "class1|class2" any
    * element assigned a class of either class1 or class2 will have its contents processed.
    */
  var processClass: js.UndefOr[String] = js.undefined
  
  /*This array lists the names of the tags whose contents should not be processed by asciimath2jax (other than to
    * look for ignore/process classes as listed below). You can add to (or remove from) this list to prevent MathJax
    * from processing mathematics in specific contexts.
    */
  var skipTags: js.UndefOr[js.Array[String]] = js.undefined
}
object Asciimath2jaxPreprocessor {
  
  @scala.inline
  def apply(): Asciimath2jaxPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asciimath2jaxPreprocessor]
  }
  
  @scala.inline
  implicit class Asciimath2jaxPreprocessorMutableBuilder[Self <: Asciimath2jaxPreprocessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiters(value: js.Any): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    @scala.inline
    def setIgnoreClass(value: String): Self = StObject.set(x, "ignoreClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreClassUndefined: Self = StObject.set(x, "ignoreClass", js.undefined)
    
    @scala.inline
    def setPreview(value: js.Any): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setProcessClass(value: String): Self = StObject.set(x, "processClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessClassUndefined: Self = StObject.set(x, "processClass", js.undefined)
    
    @scala.inline
    def setSkipTags(value: js.Array[String]): Self = StObject.set(x, "skipTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipTagsUndefined: Self = StObject.set(x, "skipTags", js.undefined)
    
    @scala.inline
    def setSkipTagsVarargs(value: String*): Self = StObject.set(x, "skipTags", js.Array(value :_*))
  }
}
