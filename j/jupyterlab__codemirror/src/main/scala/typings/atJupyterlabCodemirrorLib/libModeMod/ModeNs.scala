package typings
package atJupyterlabCodemirrorLib.libModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/mode", "Mode")
@js.native
object ModeNs extends js.Object {
  /**
    * The interface of a codemirror mode spec.
    */
  trait IMode
    extends /* key */ org.scalablytyped.runtime.StringDictionary[atPhosphorCoreutilsLib.libJsonMod.JSONValue] {
    var name: java.lang.String
  }
  
  /**
    * The interface of a codemirror modeInfo spec.
    */
  trait ISpec extends js.Object {
    var ext: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var mime: java.lang.String
    var mode: java.lang.String
    var name: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def ensure(mode: ISpec): js.Promise[ISpec] = js.native
  /**
    * Ensure a codemirror mode is available by name or Codemirror spec.
    *
    * @param mode - The mode to ensure.  If it is a string, uses [findBest]
    *   to get the appropriate spec.
    *
    * @returns A promise that resolves when the mode is available.
    */
  def ensure(mode: java.lang.String): js.Promise[ISpec] = js.native
  def findBest(mode: ISpec): ISpec = js.native
  /**
    * Find a codemirror mode by name or CodeMirror spec.
    */
  def findBest(mode: java.lang.String): ISpec = js.native
  /**
    * Find a codemirror mode by extension.
    */
  def findByExtension(ext: java.lang.String): ISpec = js.native
  def findByExtension(ext: js.Array[java.lang.String]): ISpec = js.native
  /**
    * Find a codemirror mode by filename.
    */
  def findByFileName(name: java.lang.String): ISpec = js.native
  /**
    * Find a codemirror mode by MIME.
    */
  def findByMIME(mime: java.lang.String): ISpec = js.native
  /**
    * Find a codemirror mode by name.
    */
  def findByName(name: java.lang.String): ISpec = js.native
  /**
    * Get the raw list of available modes specs.
    */
  def getModeInfo(): js.Array[ISpec] = js.native
  def run(code: java.lang.String, mode: ISpec, el: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Running a CodeMirror mode outside of an editor.
    */
  def run(code: java.lang.String, mode: java.lang.String, el: stdLib.HTMLElement): scala.Unit = js.native
}

