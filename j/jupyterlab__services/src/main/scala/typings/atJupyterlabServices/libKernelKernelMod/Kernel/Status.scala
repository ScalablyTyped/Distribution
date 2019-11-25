package typings.atJupyterlabServices.libKernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Kernel status states.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.unknown
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.starting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.reconnecting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.idle
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.busy
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.restarting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.autorestarting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.dead
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.connected
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def autorestarting: typings.atJupyterlabServices.atJupyterlabServicesStrings.autorestarting = this.cast("autorestarting")
  @scala.inline
  def busy: typings.atJupyterlabServices.atJupyterlabServicesStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.atJupyterlabServices.atJupyterlabServicesStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typings.atJupyterlabServices.atJupyterlabServicesStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typings.atJupyterlabServices.atJupyterlabServicesStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typings.atJupyterlabServices.atJupyterlabServicesStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typings.atJupyterlabServices.atJupyterlabServicesStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typings.atJupyterlabServices.atJupyterlabServicesStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typings.atJupyterlabServices.atJupyterlabServicesStrings.unknown = this.cast("unknown")
}

