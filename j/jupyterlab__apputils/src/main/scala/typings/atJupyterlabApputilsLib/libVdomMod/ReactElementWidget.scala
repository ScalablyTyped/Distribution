package typings
package atJupyterlabApputilsLib.libVdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/vdom", "ReactElementWidget")
@js.native
class ReactElementWidget ()
  extends VDomRenderer[js.Any] {
  /**
    * Creates a Phosphor widget that renders the element(s) `es`.
    */
  def this(es: js.Array[reactLib.reactMod.ReactElement[_]]) = this()
  def this(es: reactLib.reactMod.ReactElement[_]) = this()
  var _es: js.Any = js.native
}

