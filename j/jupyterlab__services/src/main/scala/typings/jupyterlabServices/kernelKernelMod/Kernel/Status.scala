package typings.jupyterlabServices.kernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Kernel status states.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabServices.jupyterlabServicesStrings.unknown
  - typings.jupyterlabServices.jupyterlabServicesStrings.starting
  - typings.jupyterlabServices.jupyterlabServicesStrings.reconnecting
  - typings.jupyterlabServices.jupyterlabServicesStrings.idle
  - typings.jupyterlabServices.jupyterlabServicesStrings.busy
  - typings.jupyterlabServices.jupyterlabServicesStrings.restarting
  - typings.jupyterlabServices.jupyterlabServicesStrings.autorestarting
  - typings.jupyterlabServices.jupyterlabServicesStrings.dead
  - typings.jupyterlabServices.jupyterlabServicesStrings.connected
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
  def connected: typings.jupyterlabServices.jupyterlabServicesStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typings.jupyterlabServices.jupyterlabServicesStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typings.jupyterlabServices.jupyterlabServicesStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typings.jupyterlabServices.jupyterlabServicesStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typings.jupyterlabServices.jupyterlabServicesStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typings.jupyterlabServices.jupyterlabServicesStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typings.jupyterlabServices.jupyterlabServicesStrings.unknown = this.cast("unknown")
}

