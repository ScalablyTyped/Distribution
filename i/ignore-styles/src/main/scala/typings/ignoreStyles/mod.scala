package typings.ignoreStyles

import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ignore-styles", JSImport.Default)
  @js.native
  def default(): Unit = js.native
  @JSImport("ignore-styles", JSImport.Default)
  @js.native
  def default(extensions: js.UndefOr[scala.Nothing], handler: Handler): Unit = js.native
  @JSImport("ignore-styles", JSImport.Default)
  @js.native
  def default(extensions: js.Array[String]): Unit = js.native
  @JSImport("ignore-styles", JSImport.Default)
  @js.native
  def default(extensions: js.Array[String], handler: Handler): Unit = js.native
  
  @JSImport("ignore-styles", "DEFAULT_EXTENSIONS")
  @js.native
  val DEFAULT_EXTENSIONS: js.Array[String] = js.native
  
  @JSImport("ignore-styles", "noOp")
  @js.native
  def noOp(): Unit = js.native
  
  @JSImport("ignore-styles", "restore")
  @js.native
  def restore(): Unit = js.native
  
  type Handler = js.Function2[/* m */ NodeModule, /* filename */ String, js.Any]
}
