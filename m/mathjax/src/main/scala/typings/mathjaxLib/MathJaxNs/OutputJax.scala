package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputJax extends js.Object {
  /*The directory where the jax files are stored (e.g., "[MathJax]/jax/output/HTML-CSS");*/
  var directory: java.lang.String
  /*The directory where the fonts are stored (e.g., "[MathJax]/fonts")*/
  var fontDir: java.lang.String
  /*The name of the jax.*/
  var id: java.lang.String
  /*The directory where MathJax images are found (e.g. "[MathJax]/images")*/
  var imageDir: java.lang.String
  /*The version number of the jax.*/
  var version: java.lang.String
  /*This registers the MIME-type for the element jax associated with this output jax so that MathJax knows to call
    * this jax when it wants to display an element jax of that type. Several output jax may register for the same
    * input jax, in which case the first one to register will be the default one for that type.
    */
  def Register(mimetype: java.lang.String): scala.Unit
  /*Removes the output associated with the given element jax. The routine can use jax.SourceElement() to locate
    * the <script> tag associated with the element jax.
    */
  def Remove(jax: js.Any): scala.Unit
  /*This is the main routine called by MathJax when an element jax is to be converted to output. The default
    * Translate() method throws an error indicating that Translate() hasn’t been defined, so when the jax.js file
    * loads, it should override the default Translate() with its own version that does the actual translation.
    *
    * You should use MathJax.Hub.getJaxFor(script) to obtain the element jax for the given script. The translation
    * process may modify the element jax (e.g., if it has data that needs to be stored with the jax), and may insert
    * DOM elements into the document near the jax’s <script> tag. The output jax can use the state variable to
    * maintain information about its processing state, but see preTranslate() above for naming conventions for
    * properties that are added.
    */
  def Translate(script: js.Any, state: js.Any): ElementJax
  def Zoom(jax: js.Any, span: js.Any, math: js.Any, Mw: scala.Double, Mh: scala.Double): ZoomStruct
  /*This is called by the event-handling code (MathEvents) to get the element jax associated with the DOM element
    * that caused an event to occur. The output jax will have attached event handlers to some DOM element that is
    * part of its output, and the MathEvents code uses this routine to map back to the jax associated with that
    * output.
    */
  def getJaxFromMath(math: js.Any): ElementJax
  /*This routines is called by MathJax.Hub when the translation of math elements is complete, and can be used by
    * the output processor to finalize any actions that it needs to complete. (For example, making the mathematics
    * visible, or forcing a reflow of the page.)
    *
    * The routine can use state.jax[this.id] to obtain the array of element jax that were processed, or can use the
    * state variable to store its own state information (see preProcess() above for caveats about naming
    * properties).
    */
  def postTranslate(state: js.Any): scala.Unit
  /*This is called by MathJax.Hub to ask the output processor to prepare to process math scripts. Its default
    * action is to start loading the jax’s jax.js file, and redefine itself to simply return the callback for the
    * load operation (so that further calls to it will cause the processing to wait for the callback).
    *
    * Once the jax.js file has loaded, this method is replaced by the jax’s preTranslate() method, so that subsequent
    * calls to preProcess() will perform the appropriate translation.
    */
  def preProcess(state: js.Any): scala.Unit
  /*This routine replaces preProcess() above when the jax’s jax.js file is loaded. It is called by MathJax.Hub to
    * ask the output processor to prepare to process math scripts. (For example, the HTML-CSS output jax uses this
    * to determine em-sizes for all the mathematics at once, to minimize page reflows that slow down Internet
    * Explorer.)
    *
    * The routine can use state.jax[this.id] to obtain the array of element jax that are to be processed. The output
    * jax can use the state variable to maintain its own state information, but any properties that it adds to the
    * variable should have a prefix that is the output jax’s ID. For example, the HTML-CSS output jax might use
    * state.HTMLCSSlast to keep track of the last equation it processed, or could add state.HTMLCSS = {...} to
    * create an object of its own within the state variable.
    */
  def preTranslate(state: js.Any): scala.Unit
}

object OutputJax {
  @scala.inline
  def apply(
    Register: js.Function1[java.lang.String, scala.Unit],
    Remove: js.Function1[js.Any, scala.Unit],
    Translate: js.Function2[js.Any, js.Any, ElementJax],
    Zoom: js.Function5[js.Any, js.Any, js.Any, scala.Double, scala.Double, ZoomStruct],
    directory: java.lang.String,
    fontDir: java.lang.String,
    getJaxFromMath: js.Function1[js.Any, ElementJax],
    id: java.lang.String,
    imageDir: java.lang.String,
    postTranslate: js.Function1[js.Any, scala.Unit],
    preProcess: js.Function1[js.Any, scala.Unit],
    preTranslate: js.Function1[js.Any, scala.Unit],
    version: java.lang.String
  ): OutputJax = {
    val __obj = js.Dynamic.literal(Register = Register, Remove = Remove, Translate = Translate, Zoom = Zoom, directory = directory, fontDir = fontDir, getJaxFromMath = getJaxFromMath, id = id, imageDir = imageDir, postTranslate = postTranslate, preProcess = preProcess, preTranslate = preTranslate, version = version)
  
    __obj.asInstanceOf[OutputJax]
  }
}

