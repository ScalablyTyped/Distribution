package typings
package mathjaxLib.MathJaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputJax extends js.Object {
  /*The directory where the jax files are stored (e.g., "[MathJax]/jax/input/TeX").*/
  var directory: java.lang.String
  /*The name of the ElementJax class that this input jax will produce (typically mml, as that is the only
    * ElementJax at the moment).
    */
  var elementJax: java.lang.String
  /*The name of the jax.*/
  var id: java.lang.String
  /*The version number of the jax.*/
  var version: java.lang.String
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
  def Process(script: js.Any, state: js.Any): js.Any
  /*This registers the MIME-type associated with this input jax so that MathJax knows to call this input jax when
    * it sees a <script> of that type. An input jax can register more than one type, but it will be responsible for
    * distinguishing elements of the various types from one another.
    */
  def Register(mimetype: java.lang.String): scala.Unit
  /*This is the main routine called by MathJax when a <script> of the appropriate type is found. The default
    * Translate() method throws an error indicating that Translate() hasn’t been defined, so when the jax.js file
    * loads, it should override the default Translate() with its own version that does the actual translation.
    *
    * The translation process should include the creation of an Element Jax that stores the data needed for this
    * element.
    */
  def Translate(script: js.Any, state: js.Any): ElementJax
  /*This implements the element jax’s needsUpdate() method, and returns true if the jax needs to be rerendered
    * (i.e., the text has changed), and false otherwise.
    */
  def needsUpdate(element: js.Any): scala.Boolean
}

object InputJax {
  @scala.inline
  def apply(
    Process: js.Function2[js.Any, js.Any, js.Any],
    Register: js.Function1[java.lang.String, scala.Unit],
    Translate: js.Function2[js.Any, js.Any, ElementJax],
    directory: java.lang.String,
    elementJax: java.lang.String,
    id: java.lang.String,
    needsUpdate: js.Function1[js.Any, scala.Boolean],
    version: java.lang.String
  ): InputJax = {
    val __obj = js.Dynamic.literal(Process = Process, Register = Register, Translate = Translate, directory = directory, elementJax = elementJax, id = id, needsUpdate = needsUpdate, version = version)
  
    __obj.asInstanceOf[InputJax]
  }
}

