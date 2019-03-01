package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hub extends js.Object {
  /*The name of the browser as determined by MathJax. It will be one of Firefox, Safari, Chrome, Opera, MSIE,
    * Konqueror, or unkown. This is actually an object with additional properties and methods concerning the
    * browser
    */
  var Browser: js.UndefOr[BrowserInfo] = js.undefined
  var Register: js.UndefOr[Register] = js.undefined
  /*This holds the configuration parameters for MathJax. Set these values using MathJax.Hub.Config() described
    * below. The options and their default values are given in the Core Options reference page.
    */
  var config: js.UndefOr[Config] = js.undefined
  /*An object storing the MIME types associated with the various registered input jax (these are the types of the
    * <script> tags that store the math to be processed by each input jax).
    */
  var inputJax: js.UndefOr[js.Any] = js.undefined
  /*An object storing the output jax associate with the various element jax MIME types for the registered output
    * jax.
    */
  var outputJax: js.UndefOr[js.Any] = js.undefined
  /*The pause (in milliseconds) between input and output phases of MathJax’s processing. Set this to 0 to avoid
    * jitter when updating output frequently (e.g., in a live preview environment).
    */
  var processSectionDelay: js.UndefOr[scala.Double] = js.undefined
  /*The amount of time (in milliseconds) that MathJax pauses after issuing its processing message before starting
    * the processing again (to give browsers time to handle user interaction).
    */
  var processUpdateDelay: js.UndefOr[scala.Double] = js.undefined
  /*The minimum time (in milliseconds) between updates of the “Processing Math” message. After this amount of time
    * has passed, and after the next equation has finished being processed, MathJax will stop processing momentarily
    * so that the update message can be displayed, and so that the browser can handle user interaction.
    */
  var processUpdateTime: js.UndefOr[scala.Double] = js.undefined
  /*MathJax’s main processing queue. Use MathJax.Hub.Queue() to push callbacks onto this queue.*/
  var queue: js.UndefOr[js.Any] = js.undefined
  /*The hub processing signal (tied to the MathJax.Hub.Register.MessageHook() method).*/
  var signal: js.UndefOr[Signal] = js.undefined
  /*Sets the configuration options (stored in MathJax.Hub.config) to the values stored in the options object.*/
  def Config(config: Config): scala.Unit
  /*When delayStartupUntil is specified in the configuration file or in the script that loads MathJax.js,
    * MathJax’s startup sequence is delayed until this routine is called.
    */
  def Configured(): scala.Unit
  /*Inserts data from the src object into the dst object. The key:value pairs in src are (recursively) copied into
    * dst, so that if value is itself an object, its content is copied into the corresponding object in dst.
    * That is, objects within src are merged into the corresponding objects in dst (they don’t replace them).
    */
  def Insert(dst: js.Any, src: js.Any): js.Any
  /*Calls the loaded preprocessors on the entire document, or on the given DOM element (or elements, if it is an
    * array of elements). The element is either the DOM id of the element, a reference to the DOM element itself, or
    * an array of id’s or references. The callback is called when the processing is complete.
    */
  def PreProcess(element: js.Any, callBack: js.Any): js.Any
  /*Scans either the entire document or a given DOM element (or array of elements) for MathJax <script> tags and
    * processes the math those tags contain. The element is either the DOM id of the element to scan, a reference to
    * the DOM element itself, or an array of id’s or references. The callback is called when the processing is
    * complete.
    */
  def Process(element: js.Any, callBack: js.Any): js.Any
  /*Pushes the given callbacks onto the main MathJax command queue. This synchronizes the commands with MathJax so
    * that they will be performed in the proper order even when some run asynchronously. See Using Queues for more
    * details about how to use queues, and the MathJax queue in particular. You may supply as many callback
    * specifications in one call to the Queue() method as you wish.
    */
  def Queue(callBack: js.Any): js.Any
  /*Removes any typeset mathematics from the document or DOM element (or elements if it is an array of elements),
    * and then processes the mathematics again, re-typesetting everything. This may be necessary, for example, if
    * the CSS styles have changed and those changes would affect the mathematics. Reprocess calls both the input and
    * output jax to completely rebuild the data for mathematics. The element is either the DOM id of the element to
    * scan, a reference to the DOM element itself, or an array of id’s or references. The callback is called when
    * the processing is complete.
    */
  def Reprocess(element: js.Any, callBack: js.Any): js.Any
  /*Removes any typeset mathematics from the document or DOM element (or elements if it is an array of elements),
    * and then renders the mathematics again, re-typesetting everything from the current internal version (without
    * calling the input jax again). The element is either the DOM id of the element to scan, a reference to the DOM
    * element itself, or an array of id’s or references. The callback is called when the processing is complete.
    */
  def Rerender(element: js.Any, callBack: js.Any): js.Any
  /*Calls the preprocessors on the given element (or elements if it is an array of elements), and then typesets
    * any math elements within the element. If no element is provided, the whole document is processed. The element
    * is either the DOM id of the element, a reference to the DOM element itself, or an array of id’s or refereneces.
    * The callback is called when the process is complete. See the Modifying Math section for details of how to use
    * this method properly.
    */
  def Typeset(element: js.Any, callBack: js.Any): js.Any
  /*Scans either the entire document or a given DOM element (or elements if it is an array of elements) for
    * mathematics that has changed since the last time it was processed, or is new, and typesets the mathematics
    * they contain. The element is either the DOM id of the element to scan, a reference to the DOM element itself,
    * or an array of id’s or references. The callback is called when the processing is complete.
    */
  def Update(element: js.Any, callBack: js.Any): js.Any
  /*This is called when an internal error occurs during the processing of a math element (i.e., an error in the
    * MathJax code itself). The script is a reference to the <script> tag where the error occurred, and error is the
    * Error object for the error. The default action is to insert an HTML snippet at the location of the script, but
    * this routine can be overriden during MathJax configuration in order to perform some other action.
    * MathJax.Hub.lastError holds the error value of the last error on the page.
    */
  def formatError(script: js.Any, error: js.Any): scala.Unit
  /*Returns a list of all the element jax in the document or a specific DOM element. The element is either the DOM
    * id of the element, or a reference to the DOM element itself.
    */
  def getAllJax(element: js.Any): js.Array[_]
  /*Returns a list of all the element jax associated with input <script> tags with the given MIME-type within the
    * given DOM element or the whole document. The element is either the DOM id of the element to search, or a
    * reference to the DOM element itself.
    */
  def getJaxByInputType(`type`: java.lang.String, element: js.Any): scala.Unit
  /*Returns a list of all the element jax of a given MIME-type in the document or a specific DOM element. The
    * element is either the DOM id of the element to search, or a reference to the DOM element itself.
    */
  def getJaxByType(`type`: java.lang.String, element: js.Any): scala.Unit
  /*Returns the element jax associated with a given DOM element. If the element does not have an associated
    * element jax, null is returned. The element is either the DOM id of the element, or a reference to the DOM
    * element itself.
    */
  def getJaxFor(element: js.Any): js.Any
  /*Returns 0 if the element is not a <script> that can be processed by MathJax or the result of an output jax,
    * returns -1 if the element is an unprocessed <script> tag that could be handled by MathJax, and returns 1 if
    * the element is a processed <script> tag or an element that is the result of an output jax.
    */
  def isJax(element: js.Any): scala.Double
  /*Sets the output jax for the given element jax type (or jax/mml if none is specified) to be the one given by
    * renderer, which must be the name of a renderer, such as NativeMML or HTML-CSS. Note that this does not cause
    * the math on the page to be rerendered; it just sets the renderer for output in the future
    * (call :meth:Rerender() above to replace the current renderings by new ones).
    */
  def setRenderer(renderer: java.lang.String, `type`: java.lang.String): scala.Unit
}

object Hub {
  @scala.inline
  def apply(
    Config: js.Function1[Config, scala.Unit],
    Configured: js.Function0[scala.Unit],
    Insert: js.Function2[js.Any, js.Any, js.Any],
    PreProcess: js.Function2[js.Any, js.Any, js.Any],
    Process: js.Function2[js.Any, js.Any, js.Any],
    Queue: js.Function1[js.Any, js.Any],
    Reprocess: js.Function2[js.Any, js.Any, js.Any],
    Rerender: js.Function2[js.Any, js.Any, js.Any],
    Typeset: js.Function2[js.Any, js.Any, js.Any],
    Update: js.Function2[js.Any, js.Any, js.Any],
    formatError: js.Function2[js.Any, js.Any, scala.Unit],
    getAllJax: js.Function1[js.Any, js.Array[_]],
    getJaxByInputType: js.Function2[java.lang.String, js.Any, scala.Unit],
    getJaxByType: js.Function2[java.lang.String, js.Any, scala.Unit],
    getJaxFor: js.Function1[js.Any, js.Any],
    isJax: js.Function1[js.Any, scala.Double],
    setRenderer: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    Browser: BrowserInfo = null,
    Register: Register = null,
    config: Config = null,
    inputJax: js.Any = null,
    outputJax: js.Any = null,
    processSectionDelay: scala.Int | scala.Double = null,
    processUpdateDelay: scala.Int | scala.Double = null,
    processUpdateTime: scala.Int | scala.Double = null,
    queue: js.Any = null,
    signal: Signal = null
  ): Hub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Config")(Config)
    __obj.updateDynamic("Configured")(Configured)
    __obj.updateDynamic("Insert")(Insert)
    __obj.updateDynamic("PreProcess")(PreProcess)
    __obj.updateDynamic("Process")(Process)
    __obj.updateDynamic("Queue")(Queue)
    __obj.updateDynamic("Reprocess")(Reprocess)
    __obj.updateDynamic("Rerender")(Rerender)
    __obj.updateDynamic("Typeset")(Typeset)
    __obj.updateDynamic("Update")(Update)
    __obj.updateDynamic("formatError")(formatError)
    __obj.updateDynamic("getAllJax")(getAllJax)
    __obj.updateDynamic("getJaxByInputType")(getJaxByInputType)
    __obj.updateDynamic("getJaxByType")(getJaxByType)
    __obj.updateDynamic("getJaxFor")(getJaxFor)
    __obj.updateDynamic("isJax")(isJax)
    __obj.updateDynamic("setRenderer")(setRenderer)
    if (Browser != null) __obj.updateDynamic("Browser")(Browser)
    if (Register != null) __obj.updateDynamic("Register")(Register)
    if (config != null) __obj.updateDynamic("config")(config)
    if (inputJax != null) __obj.updateDynamic("inputJax")(inputJax)
    if (outputJax != null) __obj.updateDynamic("outputJax")(outputJax)
    if (processSectionDelay != null) __obj.updateDynamic("processSectionDelay")(processSectionDelay.asInstanceOf[js.Any])
    if (processUpdateDelay != null) __obj.updateDynamic("processUpdateDelay")(processUpdateDelay.asInstanceOf[js.Any])
    if (processUpdateTime != null) __obj.updateDynamic("processUpdateTime")(processUpdateTime.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[Hub]
  }
}

