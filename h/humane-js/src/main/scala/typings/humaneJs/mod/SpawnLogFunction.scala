package typings.humaneJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpawnLogFunction extends js.Object {
  
  def apply(message: logMessage): Humane = js.native
  def apply(message: logMessage, callback: js.UndefOr[scala.Nothing], options: HumaneMessageOptions): Humane = js.native
  def apply(message: logMessage, callback: completionCallback): Humane = js.native
  def apply(message: logMessage, callback: completionCallback, options: HumaneMessageOptions): Humane = js.native
  def apply(message: logMessage, options: HumaneMessageOptions): Humane = js.native
}
