package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inversify.inversifyStrings.Singleton
  - typings.inversify.inversifyStrings.Transient
  - typings.inversify.inversifyStrings.Request
*/
trait BindingScope extends js.Object

object BindingScope {
  @scala.inline
  def Request: typings.inversify.inversifyStrings.Request = this.cast("Request")
  @scala.inline
  def Singleton: typings.inversify.inversifyStrings.Singleton = this.cast("Singleton")
  @scala.inline
  def Transient: typings.inversify.inversifyStrings.Transient = this.cast("Transient")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

