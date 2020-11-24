package typings.lightship.mod

import typings.node.processMod.global.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationInputType extends js.Object {
  
  /**
    * Run Lightship in local mode when Kubernetes is not detected.
    * @default true.
    */
  var detectKubernetes: js.UndefOr[Boolean] = js.native
  
  /**
    * A number of milliseconds before forcefull termination if process does not gracefully exit.
    * The timer starts when `lightship.shutdown()` is called. This includes the time allowed to live beacons.
    * @default 60_000
    */
  var gracefulShutdownTimeout: js.UndefOr[Double] = js.native
  
  /**
    * The port on which the Lightship service listens. This port must be different than your main service port, if any.
    * @default 9000
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * A number of milliseconds before forceful termination if shutdown handlers do not complete. The timer starts when the first shutdown handler is called.
    * @default 5000
    */
  var shutdownHandlerTimeout: js.UndefOr[Double] = js.native
  
  /**
    * An a array of [signal events](https://nodejs.org/api/process.html#process_signal_events).
    * @default [SIGTERM, SIGHUP, SIGINT].
    */
  var signals: js.UndefOr[js.Array[Signals]] = js.native
  
  /**
    * Method used to terminate Node.js process
    * @default `() => { process.exit(1) };`
    */
  var terminate: js.UndefOr[js.Function0[Unit]] = js.native
}
object ConfigurationInputType {
  
  @scala.inline
  def apply(): ConfigurationInputType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationInputType]
  }
  
  @scala.inline
  implicit class ConfigurationInputTypeOps[Self <: ConfigurationInputType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectKubernetes(value: Boolean): Self = this.set("detectKubernetes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectKubernetes: Self = this.set("detectKubernetes", js.undefined)
    
    @scala.inline
    def setGracefulShutdownTimeout(value: Double): Self = this.set("gracefulShutdownTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGracefulShutdownTimeout: Self = this.set("gracefulShutdownTimeout", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setShutdownHandlerTimeout(value: Double): Self = this.set("shutdownHandlerTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShutdownHandlerTimeout: Self = this.set("shutdownHandlerTimeout", js.undefined)
    
    @scala.inline
    def setSignalsVarargs(value: Signals*): Self = this.set("signals", js.Array(value :_*))
    
    @scala.inline
    def setSignals(value: js.Array[Signals]): Self = this.set("signals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignals: Self = this.set("signals", js.undefined)
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteTerminate: Self = this.set("terminate", js.undefined)
  }
}
