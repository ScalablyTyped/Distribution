package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputJax extends js.Object {
  
  /*This registers the MIME-type for the element jax associated with this output jax so that MathJax knows to call
    * this jax when it wants to display an element jax of that type. Several output jax may register for the same
    * input jax, in which case the first one to register will be the default one for that type.
    */
  def Register(mimetype: String): Unit = js.native
  
  /*Removes the output associated with the given element jax. The routine can use jax.SourceElement() to locate
    * the <script> tag associated with the element jax.
    */
  def Remove(jax: js.Any): Unit = js.native
  
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
  def Translate(script: js.Any, state: js.Any): ElementJax = js.native
  
  def Zoom(jax: js.Any, span: js.Any, math: js.Any, Mw: Double, Mh: Double): ZoomStruct = js.native
  
  /*The directory where the jax files are stored (e.g., "[MathJax]/jax/output/HTML-CSS");*/
  var directory: String = js.native
  
  /*The directory where the fonts are stored (e.g., "[MathJax]/fonts")*/
  var fontDir: String = js.native
  
  /*This is called by the event-handling code (MathEvents) to get the element jax associated with the DOM element
    * that caused an event to occur. The output jax will have attached event handlers to some DOM element that is
    * part of its output, and the MathEvents code uses this routine to map back to the jax associated with that
    * output.
    */
  def getJaxFromMath(math: js.Any): ElementJax = js.native
  
  /*The name of the jax.*/
  var id: String = js.native
  
  /*The directory where MathJax images are found (e.g. "[MathJax]/images")*/
  var imageDir: String = js.native
  
  /*This routines is called by MathJax.Hub when the translation of math elements is complete, and can be used by
    * the output processor to finalize any actions that it needs to complete. (For example, making the mathematics
    * visible, or forcing a reflow of the page.)
    *
    * The routine can use state.jax[this.id] to obtain the array of element jax that were processed, or can use the
    * state variable to store its own state information (see preProcess() above for caveats about naming
    * properties).
    */
  def postTranslate(state: js.Any): Unit = js.native
  
  /*This is called by MathJax.Hub to ask the output processor to prepare to process math scripts. Its default
    * action is to start loading the jax’s jax.js file, and redefine itself to simply return the callback for the
    * load operation (so that further calls to it will cause the processing to wait for the callback).
    *
    * Once the jax.js file has loaded, this method is replaced by the jax’s preTranslate() method, so that subsequent
    * calls to preProcess() will perform the appropriate translation.
    */
  def preProcess(state: js.Any): Unit = js.native
  
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
  def preTranslate(state: js.Any): Unit = js.native
  
  /*The version number of the jax.*/
  var version: String = js.native
}
object OutputJax {
  
  @scala.inline
  def apply(
    Register: String => Unit,
    Remove: js.Any => Unit,
    Translate: (js.Any, js.Any) => ElementJax,
    Zoom: (js.Any, js.Any, js.Any, Double, Double) => ZoomStruct,
    directory: String,
    fontDir: String,
    getJaxFromMath: js.Any => ElementJax,
    id: String,
    imageDir: String,
    postTranslate: js.Any => Unit,
    preProcess: js.Any => Unit,
    preTranslate: js.Any => Unit,
    version: String
  ): OutputJax = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction1(Register), Remove = js.Any.fromFunction1(Remove), Translate = js.Any.fromFunction2(Translate), Zoom = js.Any.fromFunction5(Zoom), directory = directory.asInstanceOf[js.Any], fontDir = fontDir.asInstanceOf[js.Any], getJaxFromMath = js.Any.fromFunction1(getJaxFromMath), id = id.asInstanceOf[js.Any], imageDir = imageDir.asInstanceOf[js.Any], postTranslate = js.Any.fromFunction1(postTranslate), preProcess = js.Any.fromFunction1(preProcess), preTranslate = js.Any.fromFunction1(preTranslate), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputJax]
  }
  
  @scala.inline
  implicit class OutputJaxOps[Self <: OutputJax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegister(value: String => Unit): Self = this.set("Register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: js.Any => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslate(value: (js.Any, js.Any) => ElementJax): Self = this.set("Translate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setZoom(value: (js.Any, js.Any, js.Any, Double, Double) => ZoomStruct): Self = this.set("Zoom", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDir(value: String): Self = this.set("fontDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetJaxFromMath(value: js.Any => ElementJax): Self = this.set("getJaxFromMath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDir(value: String): Self = this.set("imageDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostTranslate(value: js.Any => Unit): Self = this.set("postTranslate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreProcess(value: js.Any => Unit): Self = this.set("preProcess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreTranslate(value: js.Any => Unit): Self = this.set("preTranslate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
