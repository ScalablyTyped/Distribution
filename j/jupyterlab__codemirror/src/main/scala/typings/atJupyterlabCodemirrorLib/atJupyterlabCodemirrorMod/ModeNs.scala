package typings
package atJupyterlabCodemirrorLib.atJupyterlabCodemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codemirror", "Mode")
@js.native
object ModeNs extends js.Object {
  def ensure(mode: atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec): js.Promise[atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec] = js.native
  /**
    * Ensure a codemirror mode is available by name or Codemirror spec.
    *
    * @param mode - The mode to ensure.  If it is a string, uses [findBest]
    *   to get the appropriate spec.
    *
    * @returns A promise that resolves when the mode is available.
    */
  def ensure(mode: java.lang.String): js.Promise[atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec] = js.native
  def findBest(mode: atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  /**
    * Find a codemirror mode by name or CodeMirror spec.
    */
  def findBest(mode: java.lang.String): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  /**
    * Find a codemirror mode by extension.
    */
  def findByExtension(ext: java.lang.String): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  def findByExtension(ext: js.Array[java.lang.String]): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  /**
    * Find a codemirror mode by filename.
    */
  def findByFileName(name: java.lang.String): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  /**
    * Find a codemirror mode by MIME.
    */
  def findByMIME(mime: java.lang.String): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  /**
    * Find a codemirror mode by name.
    */
  def findByName(name: java.lang.String): atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec = js.native
  /**
    * Get the raw list of available modes specs.
    */
  def getModeInfo(): js.Array[atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec] = js.native
  def run(
    code: java.lang.String,
    mode: atJupyterlabCodemirrorLib.libModeMod.ModeNs.ISpec,
    el: stdLib.HTMLElement
  ): scala.Unit = js.native
  /**
    * Running a CodeMirror mode outside of an editor.
    */
  def run(code: java.lang.String, mode: java.lang.String, el: stdLib.HTMLElement): scala.Unit = js.native
}

