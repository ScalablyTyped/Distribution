package typings.jsdocToMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsdoc-to-markdown", "JsdocToMarkdown")
@js.native
class JsdocToMarkdown () extends js.Object {
  /**
    * By default, the output of each invocation of the main generation methods (render, getTemplateData etc)
    * is stored in the cache (your system's temporary directory).
    * Future jsdoc2md invocations with the same input options and source code will return the output immediately from cache,
    * making the tool much faster/cheaper. If the input options or source code changes,
    * fresh output will be generated. This method clears the cache,
    * which you should never need to do unless the cache is failing for some reason.
    * On Mac OSX, the system tmpdir clears itself every few days meaning your jsdoc2md cache will also be routinely cleared.
    */
  def clear(): js.Promise[Unit] = js.native
  /**
    * Returns raw data direct from the underlying jsdoc3.
    */
  def getJsdocData(options: JsdocOptions): js.Promise[js.Array[js.Object]] = js.native
  /**
    * Sync version of getJsdocData.
    */
  def getJsdocDataSync(options: JsdocOptions): js.Array[js.Object] = js.native
  /**
    * Returns all jsdoc namepaths found in the supplied source code.
    */
  def getNamepaths(options: JsdocOptions): js.Promise[js.Object] = js.native
  /**
    * Returns the template data (jsdoc-parse output) which is fed into the output template (dmd).
    */
  def getTemplateData(options: JsdocOptions): js.Promise[js.Array[js.Object]] = js.native
  /**
    * Sync version of getTemplateData.
    */
  def getTemplateDataSync(options: JsdocOptions): js.Array[js.Object] = js.native
  def render(options: JsdocOptions): js.Promise[String] = js.native
  /**
    * Returns markdown documentation from jsdoc-annoted source code.
    */
  def render(options: RenderOptions): js.Promise[String] = js.native
  def renderSync(options: JsdocOptions): String = js.native
  /**
    * Sync version of render.
    */
  def renderSync(options: RenderOptions): String = js.native
}

