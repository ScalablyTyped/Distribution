package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoader extends js.Object {
  
  def load(resources: String): IgLoader = js.native
  def load(resources: String, callback: js.UndefOr[scala.Nothing], preinit: js.Function): IgLoader = js.native
  def load(resources: String, callback: js.Function): IgLoader = js.native
  def load(resources: String, callback: js.Function, preinit: js.Function): IgLoader = js.native
  
  def preinit(callback: js.Function): IgLoader = js.native
  
  var settings: js.UndefOr[IgLoaderSettings] = js.native
}
