package typings
package atLoadableServerLib.atLoadableServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@loadable/server", "ChunkExtractor")
@js.native
class ChunkExtractor protected () extends js.Object {
  def this(options: ChunkExtractorOptions) = this()
  /**
  	 * Wrap your application in a `ChunkExtractorManager`
  	 */
  def collectChunks(
    /**
  		 * JSX element that will be wrapped in `ChunkExtractorManager`
  		 */
  element: reactLib.reactMod.Global.JSXNs.Element
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /**
  	 * Get "prefetch" and "preload" links as an array of React `<link>` elements
  	 */
  def getLinkElements(): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  def getLinkElements(attr: AttrFn): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  def getLinkElements(attr: js.Object): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  /**
  	 * Get "prefetch" and "preload" links as a string of `<link>` tags
  	 */
  def getLinkTags(): java.lang.String = js.native
  def getLinkTags(attr: AttrFn): java.lang.String = js.native
  def getLinkTags(attr: js.Object): java.lang.String = js.native
  /**
  	 * Get scripts as an array of React `<script>` elements.
  	 */
  def getScriptElements(): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  def getScriptElements(attr: AttrFn): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  def getScriptElements(attr: js.Object): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  /**
  	 * Get scripts as a string of `<script>` tags
  	 */
  def getScriptTags(): java.lang.String = js.native
  def getScriptTags(attr: AttrFn): java.lang.String = js.native
  def getScriptTags(attr: js.Object): java.lang.String = js.native
  /**
  	 * Get style links as an array of React `<link>` elements
  	 */
  def getStyleElements(): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  def getStyleElements(attr: AttrFn): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  def getStyleElements(attr: js.Object): js.Array[reactLib.reactMod.ReactElement[js.Object]] = js.native
  /**
  	 * Get style links as a string of `<link>` tags
  	 */
  def getStyleTags(): java.lang.String = js.native
  def getStyleTags(attr: AttrFn): java.lang.String = js.native
  def getStyleTags(attr: js.Object): java.lang.String = js.native
  /**
  	 * Require the entrypoint of your application as a commonjs module.
  	 */
  def requireEntrypoint(): atLoadableServerLib.Anon_Default = js.native
  def requireEntrypoint(name: java.lang.String): atLoadableServerLib.Anon_Default = js.native
}

