package typings.jpm

import typings.jpm.jpmStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get and set text and HTML selections in the current web page
  */
object selectionMod {
  
  @JSImport("sdk/selection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sdk/selection", "html")
  @js.native
  def html: String = js.native
  @scala.inline
  def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
  
  @JSImport("sdk/selection", "isContiguous")
  @js.native
  val isContiguous: Boolean = js.native
  
  @JSImport("sdk/selection", "on")
  @js.native
  def on_select(event: select, handler: js.Function0[_]): Unit = js.native
  
  @JSImport("sdk/selection", "removeListener")
  @js.native
  def removeListener_select(event: select, handler: js.Function): Unit = js.native
  
  @JSImport("sdk/selection", "text")
  @js.native
  def text: String = js.native
  @scala.inline
  def text_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
}
