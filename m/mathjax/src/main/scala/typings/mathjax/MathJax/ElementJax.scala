package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementJax extends js.Object {
  /*The directory where the jax files are stored (e.g., "[MathJax]/jax/element/mml").*/
  var directory: String = js.native
  /*The name of the jax.*/
  var id: String = js.native
  /*The DOM id of the <script> tag that generated this element (if it doesn’t have one initially, the MathJax hub
    * will supply one). Note that this is not a reference to the element itself; that element will have a reference
    * to this element jax, and if inputID were a reference back, that would cause a reference loop, which some
    * browsers would not free properly during trash collection, thus causing a memory leak.
    */
  var inputID: String = js.native
  /*The name of the input jax that created the element.*/
  var inputJax: String = js.native
  /*The MIME-type of the element jax (jax/mml in the case of an mml element jax).*/
  var mimeType: String = js.native
  /*A string indicating the original input text that was processed for this element. (In the future, this may be
    * managed by the input jax rather than MathJax.Hub.)
    */
  var originalText: String = js.native
  /*The name of the output jax that has processed this element.*/
  var outputJax: String = js.native
  /*The version number of the jax.*/
  var version: String = js.native
  /*Removes the output for this element from the web page (but does not remove the original <script>). The
    * <script> will be considered unprocessed, and the next call to MathJax.hub.Typeset() will re-display it.
    */
  def Remove(): Unit = js.native
  /*Removes the output and then retranslates the input into the internal form and reredners the output again. The
    * callback, if any, is called when the process completes.
    */
  def Reprocess(callback: js.Any): CallbackObject = js.native
  /*Removes the output and produces it again (for example, if CSS has changed that would alter the spacing of the
    * mathematics). Note that the internal representation isn’t regenerated; only the output is. The callback, if
    * any, is called when the process completes.
    */
  def Rerender(callback: js.Any): CallbackObject = js.native
  /*Returns a reference to the original <script> DOM element associated to this element jax.*/
  def SourceElement(): js.Any = js.native
  /*Sets the input text for this element to the given text and reprocesses the mathematics. (I.e., updates the
    * equation to the new one given by text). When the processing is complete, the callback, if any, is called.
    */
  def Text(text: String): CallbackObject = js.native
  def Text(text: String, callback: js.Any): CallbackObject = js.native
  /*Indicates whether the mathematics has changed so that its output needs to be updated.*/
  def needsUpdate(): Boolean = js.native
}

