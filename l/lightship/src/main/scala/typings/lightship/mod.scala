package typings.lightship

import typings.node.httpMod.Server
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lightship", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createLightship(): LightshipType = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightship")().asInstanceOf[LightshipType]
  @scala.inline
  def createLightship(configuration: ConfigurationInputType): LightshipType = ^.asInstanceOf[js.Dynamic].applyDynamic("createLightship")(configuration.asInstanceOf[js.Any]).asInstanceOf[LightshipType]
  
  type BeaconContextType = js.Object
  
  trait BeaconControllerType extends StObject {
    
    def die(): js.Promise[Unit]
  }
  object BeaconControllerType {
    
    @scala.inline
    def apply(die: () => js.Promise[Unit]): BeaconControllerType = {
      val __obj = js.Dynamic.literal(die = js.Any.fromFunction0(die))
      __obj.asInstanceOf[BeaconControllerType]
    }
    
    @scala.inline
    implicit class BeaconControllerTypeMutableBuilder[Self <: BeaconControllerType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDie(value: () => js.Promise[Unit]): Self = StObject.set(x, "die", js.Any.fromFunction0(value))
    }
  }
  
  trait ConfigurationInputType extends StObject {
    
    /**
      * Run Lightship in local mode when Kubernetes is not detected.
      * @default true.
      */
    var detectKubernetes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A number of milliseconds before forcefull termination if process does not gracefully exit.
      * The timer starts when `lightship.shutdown()` is called. This includes the time allowed to live beacons.
      * @default 60_000
      */
    var gracefulShutdownTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The port on which the Lightship service listens. This port must be different than your main service port, if any.
      * @default 9000
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * A number of milliseconds before forceful termination if shutdown handlers do not complete. The timer starts when the first shutdown handler is called.
      * @default 5000
      */
    var shutdownHandlerTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * An a array of [signal events](https://nodejs.org/api/process.html#process_signal_events).
      * @default [SIGTERM, SIGHUP, SIGINT].
      */
    var signals: js.UndefOr[js.Array[Signals]] = js.undefined
    
    /**
      * Method used to terminate Node.js process
      * @default `() => { process.exit(1) };`
      */
    var terminate: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ConfigurationInputType {
    
    @scala.inline
    def apply(): ConfigurationInputType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationInputType]
    }
    
    @scala.inline
    implicit class ConfigurationInputTypeMutableBuilder[Self <: ConfigurationInputType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectKubernetes(value: Boolean): Self = StObject.set(x, "detectKubernetes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectKubernetesUndefined: Self = StObject.set(x, "detectKubernetes", js.undefined)
      
      @scala.inline
      def setGracefulShutdownTimeout(value: Double): Self = StObject.set(x, "gracefulShutdownTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGracefulShutdownTimeoutUndefined: Self = StObject.set(x, "gracefulShutdownTimeout", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setShutdownHandlerTimeout(value: Double): Self = StObject.set(x, "shutdownHandlerTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShutdownHandlerTimeoutUndefined: Self = StObject.set(x, "shutdownHandlerTimeout", js.undefined)
      
      @scala.inline
      def setSignals(value: js.Array[Signals]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setSignalsVarargs(value: Signals*): Self = StObject.set(x, "signals", js.Array(value :_*))
      
      @scala.inline
      def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTerminateUndefined: Self = StObject.set(x, "terminate", js.undefined)
    }
  }
  
  @js.native
  trait LightshipType extends StObject {
    
    def createBeacon(): BeaconControllerType = js.native
    def createBeacon(context: BeaconContextType): BeaconControllerType = js.native
    
    /**
      * Checks if server is in SERVER_IS_READY state.
      */
    def isServerReady(): Boolean = js.native
    
    /**
      * Checks if server is in SERVER_IS_SHUTTING_DOWN state.
      */
    def isServerShuttingDown(): Boolean = js.native
    
    /**
      * Registers teardown functions that are called when shutdown is initialized.
      * All registered shutdown handlers are executed in the order they have been registered.
      * After all shutdown handlers have been executed, Lightship asks `process.exit()` to terminate the process synchronously.
      */
    def registerShutdownHandler(shutdownHandler: ShutdownHandlerType): Unit = js.native
    
    val server: Server = js.native
    
    /**
      * Changes server state to SERVER_IS_SHUTTING_DOWN and initialises the shutdown of the application.
      */
    def shutdown(): js.Promise[Unit] = js.native
    
    /**
      *  Changes server state to SERVER_IS_NOT_READY.
      */
    def signalNotReady(): Unit = js.native
    
    /**
      * Changes server state to SERVER_IS_READY.
      */
    def signalReady(): Unit = js.native
  }
  
  type ShutdownHandlerType = js.Function0[js.Promise[Unit] | Unit]
}
