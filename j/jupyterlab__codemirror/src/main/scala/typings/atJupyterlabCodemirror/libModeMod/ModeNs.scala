package typings.atJupyterlabCodemirror.libModeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atJupyterlabCodemirror.libModeMod.ModeNs.ISpec
import typings.atJupyterlabCodemirror.libModeMod.ModeNs.ISpecLoader
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror/lib/mode", "Mode")
@js.native
object ModeNs extends js.Object {
  /**
    * The interface of a codemirror mode spec.
    */
  trait IMode extends /* key */ StringDictionary[JSONValue] {
    var name: String
  }
  
  /**
    * The interface of a codemirror modeInfo spec.
    */
  trait ISpec extends js.Object {
    var ext: js.UndefOr[js.Array[String]] = js.undefined
    var mime: String
    var mode: String
    var name: js.UndefOr[String] = js.undefined
  }
  
  def addSpecLoader(loader: ISpecLoader, rank: Double): Unit = js.native
  /**
    * Ensure a codemirror mode is available by name or Codemirror spec.
    *
    * @param mode - The mode to ensure.  If it is a string, uses [findBest]
    *   to get the appropriate spec.
    *
    * @returns A promise that resolves when the mode is available.
    */
  def ensure(mode: String): js.Promise[ISpec] = js.native
  def ensure(mode: ISpec): js.Promise[ISpec] = js.native
  /**
    * Find a codemirror mode by name or CodeMirror spec.
    */
  def findBest(mode: String): ISpec = js.native
  def findBest(mode: ISpec): ISpec = js.native
  /**
    * Find a codemirror mode by extension.
    */
  def findByExtension(ext: String): ISpec = js.native
  def findByExtension(ext: js.Array[String]): ISpec = js.native
  /**
    * Find a codemirror mode by filename.
    */
  def findByFileName(name: String): ISpec = js.native
  /**
    * Find a codemirror mode by MIME.
    */
  def findByMIME(mime: String): ISpec = js.native
  /**
    * Find a codemirror mode by name.
    */
  def findByName(name: String): ISpec = js.native
  /**
    * Get the raw list of available modes specs.
    */
  def getModeInfo(): js.Array[ISpec] = js.native
  /**
    * Running a CodeMirror mode outside of an editor.
    */
  def run(code: String, mode: String, el: HTMLElement): Unit = js.native
  def run(code: String, mode: ISpec, el: HTMLElement): Unit = js.native
  /**
    * The interface for a codemirror spec resolver.
    */
  type ISpecLoader = js.Function1[/* spec */ ISpec, js.Promise[Boolean]]
}

