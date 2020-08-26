package typings.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputJax extends js.Object {
  /*The directory where the jax files are stored (e.g., "[MathJax]/jax/input/TeX").*/
  var directory: String = js.native
  /*The name of the ElementJax class that this input jax will produce (typically mml, as that is the only
    * ElementJax at the moment).
    */
  var elementJax: String = js.native
  /*The name of the jax.*/
  var id: String = js.native
  /*The version number of the jax.*/
  var version: String = js.native
  /*This is the method that the MathJax.Hub calls when it needs the input jax to process the given math <script>.
    * Its default action is to do the following:
    *
    * Start loading any element jax specified in the elementJax array;
    * Start loading the jax’s jax.js file;
    * Start loading the required output jax (so it is ready when needed); and
    * Redefine itself to simply return the callback for the load operation (so that further calls to it will cause
    * the processing to wait for the callback).
    * Once the jax.js file has loaded, this method is replaced by the jax’s Translate() method (see below), so that
    * subsequent calls to Process() will perform the appropriate translation.
    */
  def Process(script: js.Any, state: js.Any): js.Any = js.native
  /*This registers the MIME-type associated with this input jax so that MathJax knows to call this input jax when
    * it sees a <script> of that type. An input jax can register more than one type, but it will be responsible for
    * distinguishing elements of the various types from one another.
    */
  def Register(mimetype: String): Unit = js.native
  /*This is the main routine called by MathJax when a <script> of the appropriate type is found. The default
    * Translate() method throws an error indicating that Translate() hasn’t been defined, so when the jax.js file
    * loads, it should override the default Translate() with its own version that does the actual translation.
    *
    * The translation process should include the creation of an Element Jax that stores the data needed for this
    * element.
    */
  def Translate(script: js.Any, state: js.Any): ElementJax = js.native
  /*This implements the element jax’s needsUpdate() method, and returns true if the jax needs to be rerendered
    * (i.e., the text has changed), and false otherwise.
    */
  def needsUpdate(element: js.Any): Boolean = js.native
}

object InputJax {
  @scala.inline
  def apply(
    Process: (js.Any, js.Any) => js.Any,
    Register: String => Unit,
    Translate: (js.Any, js.Any) => ElementJax,
    directory: String,
    elementJax: String,
    id: String,
    needsUpdate: js.Any => Boolean,
    version: String
  ): InputJax = {
    val __obj = js.Dynamic.literal(Process = js.Any.fromFunction2(Process), Register = js.Any.fromFunction1(Register), Translate = js.Any.fromFunction2(Translate), directory = directory.asInstanceOf[js.Any], elementJax = elementJax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], needsUpdate = js.Any.fromFunction1(needsUpdate), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputJax]
  }
  @scala.inline
  implicit class InputJaxOps[Self <: InputJax] (val x: Self) extends AnyVal {
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
    def setProcess(value: (js.Any, js.Any) => js.Any): Self = this.set("Process", js.Any.fromFunction2(value))
    @scala.inline
    def setRegister(value: String => Unit): Self = this.set("Register", js.Any.fromFunction1(value))
    @scala.inline
    def setTranslate(value: (js.Any, js.Any) => ElementJax): Self = this.set("Translate", js.Any.fromFunction2(value))
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementJax(value: String): Self = this.set("elementJax", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedsUpdate(value: js.Any => Boolean): Self = this.set("needsUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

