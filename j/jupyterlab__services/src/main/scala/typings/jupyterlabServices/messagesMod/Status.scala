package typings.jupyterlabServices.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.unknown
  - typings.jupyterlabServices.jupyterlabServicesStrings.starting
  - typings.jupyterlabServices.jupyterlabServicesStrings.idle
  - typings.jupyterlabServices.jupyterlabServicesStrings.busy
  - typings.jupyterlabServices.jupyterlabServicesStrings.restarting
  - typings.jupyterlabServices.jupyterlabServicesStrings.autorestarting
  - typings.jupyterlabServices.jupyterlabServicesStrings.dead
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def autorestarting: typings.jupyterlabServices.jupyterlabServicesStrings.autorestarting = this.cast("autorestarting")
  @scala.inline
  def busy: typings.jupyterlabServices.jupyterlabServicesStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dead: typings.jupyterlabServices.jupyterlabServicesStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typings.jupyterlabServices.jupyterlabServicesStrings.idle = this.cast("idle")
  @scala.inline
  def restarting: typings.jupyterlabServices.jupyterlabServicesStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typings.jupyterlabServices.jupyterlabServicesStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typings.jupyterlabServices.jupyterlabServicesStrings.unknown = this.cast("unknown")
}

