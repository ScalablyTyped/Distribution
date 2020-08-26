package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hub extends js.Object {
  /*The name of the browser as determined by MathJax. It will be one of Firefox, Safari, Chrome, Opera, MSIE,
    * Konqueror, or unkown. This is actually an object with additional properties and methods concerning the
    * browser
    */
  var Browser: js.UndefOr[BrowserInfo] = js.native
  var Register: js.UndefOr[typings.mathjax.MathJax.Register] = js.native
  /*This holds the configuration parameters for MathJax. Set these values using MathJax.Hub.Config() described
    * below. The options and their default values are given in the Core Options reference page.
    */
  var config: js.UndefOr[Config] = js.native
  /*An object storing the MIME types associated with the various registered input jax (these are the types of the
    * <script> tags that store the math to be processed by each input jax).
    */
  var inputJax: js.UndefOr[js.Any] = js.native
  /*An object storing the output jax associate with the various element jax MIME types for the registered output
    * jax.
    */
  var outputJax: js.UndefOr[js.Any] = js.native
  /*The pause (in milliseconds) between input and output phases of MathJax’s processing. Set this to 0 to avoid
    * jitter when updating output frequently (e.g., in a live preview environment).
    */
  var processSectionDelay: js.UndefOr[Double] = js.native
  /*The amount of time (in milliseconds) that MathJax pauses after issuing its processing message before starting
    * the processing again (to give browsers time to handle user interaction).
    */
  var processUpdateDelay: js.UndefOr[Double] = js.native
  /*The minimum time (in milliseconds) between updates of the “Processing Math” message. After this amount of time
    * has passed, and after the next equation has finished being processed, MathJax will stop processing momentarily
    * so that the update message can be displayed, and so that the browser can handle user interaction.
    */
  var processUpdateTime: js.UndefOr[Double] = js.native
  /*MathJax’s main processing queue. Use MathJax.Hub.Queue() to push callbacks onto this queue.*/
  var queue: js.UndefOr[js.Any] = js.native
  /*The hub processing signal (tied to the MathJax.Hub.Register.MessageHook() method).*/
  var signal: js.UndefOr[Signal] = js.native
  /*Sets the configuration options (stored in MathJax.Hub.config) to the values stored in the options object.*/
  def Config(config: typings.mathjax.MathJax.Config): Unit = js.native
  /*When delayStartupUntil is specified in the configuration file or in the script that loads MathJax.js,
    * MathJax’s startup sequence is delayed until this routine is called.
    */
  def Configured(): Unit = js.native
  /*Inserts data from the src object into the dst object. The key:value pairs in src are (recursively) copied into
    * dst, so that if value is itself an object, its content is copied into the corresponding object in dst.
    * That is, objects within src are merged into the corresponding objects in dst (they don’t replace them).
    */
  def Insert(dst: js.Any, src: js.Any): js.Any = js.native
  /*Calls the loaded preprocessors on the entire document, or on the given DOM element (or elements, if it is an
    * array of elements). The element is either the DOM id of the element, a reference to the DOM element itself, or
    * an array of id’s or references. The callback is called when the processing is complete.
    */
  def PreProcess(element: js.Any, callBack: js.Any): js.Any = js.native
  /*Scans either the entire document or a given DOM element (or array of elements) for MathJax <script> tags and
    * processes the math those tags contain. The element is either the DOM id of the element to scan, a reference to
    * the DOM element itself, or an array of id’s or references. The callback is called when the processing is
    * complete.
    */
  def Process(element: js.Any, callBack: js.Any): js.Any = js.native
  /*Pushes the given callbacks onto the main MathJax command queue. This synchronizes the commands with MathJax so
    * that they will be performed in the proper order even when some run asynchronously. See Using Queues for more
    * details about how to use queues, and the MathJax queue in particular. You may supply as many callback
    * specifications in one call to the Queue() method as you wish.
    */
  def Queue(callBack: js.Any): js.Any = js.native
  /*Removes any typeset mathematics from the document or DOM element (or elements if it is an array of elements),
    * and then processes the mathematics again, re-typesetting everything. This may be necessary, for example, if
    * the CSS styles have changed and those changes would affect the mathematics. Reprocess calls both the input and
    * output jax to completely rebuild the data for mathematics. The element is either the DOM id of the element to
    * scan, a reference to the DOM element itself, or an array of id’s or references. The callback is called when
    * the processing is complete.
    */
  def Reprocess(element: js.Any, callBack: js.Any): js.Any = js.native
  /*Removes any typeset mathematics from the document or DOM element (or elements if it is an array of elements),
    * and then renders the mathematics again, re-typesetting everything from the current internal version (without
    * calling the input jax again). The element is either the DOM id of the element to scan, a reference to the DOM
    * element itself, or an array of id’s or references. The callback is called when the processing is complete.
    */
  def Rerender(element: js.Any, callBack: js.Any): js.Any = js.native
  /*Calls the preprocessors on the given element (or elements if it is an array of elements), and then typesets
    * any math elements within the element. If no element is provided, the whole document is processed. The element
    * is either the DOM id of the element, a reference to the DOM element itself, or an array of id’s or refereneces.
    * The callback is called when the process is complete. See the Modifying Math section for details of how to use
    * this method properly.
    */
  def Typeset(element: js.Any, callBack: js.Any): js.Any = js.native
  /*Scans either the entire document or a given DOM element (or elements if it is an array of elements) for
    * mathematics that has changed since the last time it was processed, or is new, and typesets the mathematics
    * they contain. The element is either the DOM id of the element to scan, a reference to the DOM element itself,
    * or an array of id’s or references. The callback is called when the processing is complete.
    */
  def Update(element: js.Any, callBack: js.Any): js.Any = js.native
  /*This is called when an internal error occurs during the processing of a math element (i.e., an error in the
    * MathJax code itself). The script is a reference to the <script> tag where the error occurred, and error is the
    * Error object for the error. The default action is to insert an HTML snippet at the location of the script, but
    * this routine can be overriden during MathJax configuration in order to perform some other action.
    * MathJax.Hub.lastError holds the error value of the last error on the page.
    */
  def formatError(script: js.Any, error: js.Any): Unit = js.native
  /*Returns a list of all the element jax in the document or a specific DOM element. The element is either the DOM
    * id of the element, or a reference to the DOM element itself.
    */
  def getAllJax(element: js.Any): js.Array[_] = js.native
  /*Returns a list of all the element jax associated with input <script> tags with the given MIME-type within the
    * given DOM element or the whole document. The element is either the DOM id of the element to search, or a
    * reference to the DOM element itself.
    */
  def getJaxByInputType(`type`: String, element: js.Any): Unit = js.native
  /*Returns a list of all the element jax of a given MIME-type in the document or a specific DOM element. The
    * element is either the DOM id of the element to search, or a reference to the DOM element itself.
    */
  def getJaxByType(`type`: String, element: js.Any): Unit = js.native
  /*Returns the element jax associated with a given DOM element. If the element does not have an associated
    * element jax, null is returned. The element is either the DOM id of the element, or a reference to the DOM
    * element itself.
    */
  def getJaxFor(element: js.Any): js.Any = js.native
  /*Returns 0 if the element is not a <script> that can be processed by MathJax or the result of an output jax,
    * returns -1 if the element is an unprocessed <script> tag that could be handled by MathJax, and returns 1 if
    * the element is a processed <script> tag or an element that is the result of an output jax.
    */
  def isJax(element: js.Any): Double = js.native
  /*Sets the output jax for the given element jax type (or jax/mml if none is specified) to be the one given by
    * renderer, which must be the name of a renderer, such as NativeMML or HTML-CSS. Note that this does not cause
    * the math on the page to be rerendered; it just sets the renderer for output in the future
    * (call :meth:Rerender() above to replace the current renderings by new ones).
    */
  def setRenderer(renderer: String, `type`: String): Unit = js.native
}

object Hub {
  @scala.inline
  def apply(
    Config: Config => Unit,
    Configured: () => Unit,
    Insert: (js.Any, js.Any) => js.Any,
    PreProcess: (js.Any, js.Any) => js.Any,
    Process: (js.Any, js.Any) => js.Any,
    Queue: js.Any => js.Any,
    Reprocess: (js.Any, js.Any) => js.Any,
    Rerender: (js.Any, js.Any) => js.Any,
    Typeset: (js.Any, js.Any) => js.Any,
    Update: (js.Any, js.Any) => js.Any,
    formatError: (js.Any, js.Any) => Unit,
    getAllJax: js.Any => js.Array[_],
    getJaxByInputType: (String, js.Any) => Unit,
    getJaxByType: (String, js.Any) => Unit,
    getJaxFor: js.Any => js.Any,
    isJax: js.Any => Double,
    setRenderer: (String, String) => Unit
  ): Hub = {
    val __obj = js.Dynamic.literal(Config = js.Any.fromFunction1(Config), Configured = js.Any.fromFunction0(Configured), Insert = js.Any.fromFunction2(Insert), PreProcess = js.Any.fromFunction2(PreProcess), Process = js.Any.fromFunction2(Process), Queue = js.Any.fromFunction1(Queue), Reprocess = js.Any.fromFunction2(Reprocess), Rerender = js.Any.fromFunction2(Rerender), Typeset = js.Any.fromFunction2(Typeset), Update = js.Any.fromFunction2(Update), formatError = js.Any.fromFunction2(formatError), getAllJax = js.Any.fromFunction1(getAllJax), getJaxByInputType = js.Any.fromFunction2(getJaxByInputType), getJaxByType = js.Any.fromFunction2(getJaxByType), getJaxFor = js.Any.fromFunction1(getJaxFor), isJax = js.Any.fromFunction1(isJax), setRenderer = js.Any.fromFunction2(setRenderer))
    __obj.asInstanceOf[Hub]
  }
  @scala.inline
  implicit class HubOps[Self <: Hub] (val x: Self) extends AnyVal {
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
    def setConfig(value: Config => Unit): Self = this.set("Config", js.Any.fromFunction1(value))
    @scala.inline
    def setConfigured(value: () => Unit): Self = this.set("Configured", js.Any.fromFunction0(value))
    @scala.inline
    def setInsert(value: (js.Any, js.Any) => js.Any): Self = this.set("Insert", js.Any.fromFunction2(value))
    @scala.inline
    def setPreProcess(value: (js.Any, js.Any) => js.Any): Self = this.set("PreProcess", js.Any.fromFunction2(value))
    @scala.inline
    def setProcess(value: (js.Any, js.Any) => js.Any): Self = this.set("Process", js.Any.fromFunction2(value))
    @scala.inline
    def setQueue(value: js.Any => js.Any): Self = this.set("Queue", js.Any.fromFunction1(value))
    @scala.inline
    def setReprocess(value: (js.Any, js.Any) => js.Any): Self = this.set("Reprocess", js.Any.fromFunction2(value))
    @scala.inline
    def setRerender(value: (js.Any, js.Any) => js.Any): Self = this.set("Rerender", js.Any.fromFunction2(value))
    @scala.inline
    def setTypeset(value: (js.Any, js.Any) => js.Any): Self = this.set("Typeset", js.Any.fromFunction2(value))
    @scala.inline
    def setUpdate(value: (js.Any, js.Any) => js.Any): Self = this.set("Update", js.Any.fromFunction2(value))
    @scala.inline
    def setFormatError(value: (js.Any, js.Any) => Unit): Self = this.set("formatError", js.Any.fromFunction2(value))
    @scala.inline
    def setGetAllJax(value: js.Any => js.Array[_]): Self = this.set("getAllJax", js.Any.fromFunction1(value))
    @scala.inline
    def setGetJaxByInputType(value: (String, js.Any) => Unit): Self = this.set("getJaxByInputType", js.Any.fromFunction2(value))
    @scala.inline
    def setGetJaxByType(value: (String, js.Any) => Unit): Self = this.set("getJaxByType", js.Any.fromFunction2(value))
    @scala.inline
    def setGetJaxFor(value: js.Any => js.Any): Self = this.set("getJaxFor", js.Any.fromFunction1(value))
    @scala.inline
    def setIsJax(value: js.Any => Double): Self = this.set("isJax", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRenderer(value: (String, String) => Unit): Self = this.set("setRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def setBrowser(value: BrowserInfo): Self = this.set("Browser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser: Self = this.set("Browser", js.undefined)
    @scala.inline
    def setRegister(value: Register): Self = this.set("Register", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister: Self = this.set("Register", js.undefined)
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setInputJax(value: js.Any): Self = this.set("inputJax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputJax: Self = this.set("inputJax", js.undefined)
    @scala.inline
    def setOutputJax(value: js.Any): Self = this.set("outputJax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputJax: Self = this.set("outputJax", js.undefined)
    @scala.inline
    def setProcessSectionDelay(value: Double): Self = this.set("processSectionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessSectionDelay: Self = this.set("processSectionDelay", js.undefined)
    @scala.inline
    def setProcessUpdateDelay(value: Double): Self = this.set("processUpdateDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessUpdateDelay: Self = this.set("processUpdateDelay", js.undefined)
    @scala.inline
    def setProcessUpdateTime(value: Double): Self = this.set("processUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessUpdateTime: Self = this.set("processUpdateTime", js.undefined)
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
    @scala.inline
    def setSignal(value: Signal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

