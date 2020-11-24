package typings.hapiLab.mod.script

import typings.hapiLab.anon.OmitTestOptionsplan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Experiment extends js.Object {
  
  def apply(title: String, content: js.Function0[Unit]): Unit = js.native
  def apply(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
  
  def only(title: String, content: js.Function0[Unit]): Unit = js.native
  def only(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
  
  def skip(title: String, content: js.Function0[Unit]): Unit = js.native
  def skip(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
}
