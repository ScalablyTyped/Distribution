package typings.atLoadableServer.atLoadableServerMod

import typings.atLoadableServer.Anon_Default
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactElement
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
  def collectChunks(/**
  		 * JSX element that will be wrapped in `ChunkExtractorManager`
  		 */
  element: Element): Element = js.native
  /**
  	 * Get "prefetch" and "preload" links as an array of React `<link>` elements
  	 */
  def getLinkElements(): js.Array[ReactElement] = js.native
  def getLinkElements(attr: js.Object): js.Array[ReactElement] = js.native
  def getLinkElements(attr: AttrFn): js.Array[ReactElement] = js.native
  /**
  	 * Get "prefetch" and "preload" links as a string of `<link>` tags
  	 */
  def getLinkTags(): String = js.native
  def getLinkTags(attr: js.Object): String = js.native
  def getLinkTags(attr: AttrFn): String = js.native
  /**
  	 * Get scripts as an array of React `<script>` elements.
  	 */
  def getScriptElements(): js.Array[ReactElement] = js.native
  def getScriptElements(attr: js.Object): js.Array[ReactElement] = js.native
  def getScriptElements(attr: AttrFn): js.Array[ReactElement] = js.native
  /**
  	 * Get scripts as a string of `<script>` tags
  	 */
  def getScriptTags(): String = js.native
  def getScriptTags(attr: js.Object): String = js.native
  def getScriptTags(attr: AttrFn): String = js.native
  /**
  	 * Get style links as an array of React `<link>` elements
  	 */
  def getStyleElements(): js.Array[ReactElement] = js.native
  def getStyleElements(attr: js.Object): js.Array[ReactElement] = js.native
  def getStyleElements(attr: AttrFn): js.Array[ReactElement] = js.native
  /**
  	 * Get style links as a string of `<link>` tags
  	 */
  def getStyleTags(): String = js.native
  def getStyleTags(attr: js.Object): String = js.native
  def getStyleTags(attr: AttrFn): String = js.native
  /**
  	 * Require the entrypoint of your application as a commonjs module.
  	 */
  def requireEntrypoint(): Anon_Default = js.native
  def requireEntrypoint(name: String): Anon_Default = js.native
}

