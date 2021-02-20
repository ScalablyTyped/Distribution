package typings.javascriptStateMachine

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-state-machine", "ASYNC")
  @js.native
  val ASYNC: String = js.native
  
  object Error {
    
    @JSImport("javascript-state-machine", "Error")
    @js.native
    val ^ : js.Any = js.native
    
    // = 200, caller tried to fire an event while an async transition was still pending
    @JSImport("javascript-state-machine", "Error.INVALID_CALLBACK")
    @js.native
    def INVALID_CALLBACK: Double = js.native
    @scala.inline
    def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
    
    @JSImport("javascript-state-machine", "Error.INVALID_TRANSITION")
    @js.native
    def INVALID_TRANSITION: Double = js.native
    @scala.inline
    def INVALID_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TRANSITION")(x.asInstanceOf[js.Any])
    
    // = 100, caller tried to fire an event that was innapropriate in the current state
    @JSImport("javascript-state-machine", "Error.PENDING_TRANSITION")
    @js.native
    def PENDING_TRANSITION: Double = js.native
    @scala.inline
    def PENDING_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_TRANSITION")(x.asInstanceOf[js.Any])
  }
  
  object Result {
    
    @JSImport("javascript-state-machine", "Result")
    @js.native
    val ^ : js.Any = js.native
    
    // = 2, the event was successfull but no state transition was necessary
    @JSImport("javascript-state-machine", "Result.CANCELLED")
    @js.native
    def CANCELLED: Double = js.native
    @scala.inline
    def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    // = 1, the event transitioned successfully from one state to another
    @JSImport("javascript-state-machine", "Result.NOTRANSITION")
    @js.native
    def NOTRANSITION: Double = js.native
    @scala.inline
    def NOTRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTRANSITION")(x.asInstanceOf[js.Any])
    
    // = 3, the event was cancelled by the caller in a beforeEvent callback
    @JSImport("javascript-state-machine", "Result.PENDING")
    @js.native
    def PENDING: Double = js.native
    @scala.inline
    def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("javascript-state-machine", "Result.SUCCEEDED")
    @js.native
    def SUCCEEDED: Double = js.native
    @scala.inline
    def SUCCEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StateMachine extends StObject {
    
    def can(evt: String): Boolean = js.native
    @JSName("can")
    var can_Original: StateMachineCan = js.native
    
    def cannot(evt: String): Boolean = js.native
    @JSName("cannot")
    var cannot_Original: StateMachineCan = js.native
    
    var current: String = js.native
    
    def error(
      eventName: js.UndefOr[String],
      from: js.UndefOr[String],
      to: js.UndefOr[String],
      args: js.UndefOr[js.Array[_]],
      errorCode: js.UndefOr[Double],
      errorMessage: js.UndefOr[String],
      ex: js.UndefOr[Error]
    ): Unit = js.native
    @JSName("error")
    var error_Original: StateMachineErrorCallback = js.native
    
    def is(state: String): Boolean = js.native
    
    def isFinished(state: String): Boolean = js.native
    @JSName("isFinished")
    var isFinished_Original: StateMachineIsFinished = js.native
    
    @JSName("is")
    var is_Original: StateMachineIs = js.native
    
    /*  transition - only available when performing async state transitions; otherwise null. Can be a:
      [1] fsm.transition(); // called from async callback
      [2] fsm.transition.cancel();
      */
    def transition(): Unit = js.native
    /*  transition - only available when performing async state transitions; otherwise null. Can be a:
      [1] fsm.transition(); // called from async callback
      [2] fsm.transition.cancel();
      */
    @JSName("transition")
    var transition_Original: StateMachineTransition = js.native
    
    def transitions(): js.Array[String] = js.native
    @JSName("transitions")
    var transitions_Original: StateMachineTransitions = js.native
  }
  object StateMachine {
    
    // = '*'
    @JSImport("javascript-state-machine", "StateMachine.ASYNC")
    @js.native
    val ASYNC: String = js.native
    
    object Error {
      
      @JSImport("javascript-state-machine", "StateMachine.Error")
      @js.native
      val ^ : js.Any = js.native
      
      // = 200, caller tried to fire an event while an async transition was still pending
      @JSImport("javascript-state-machine", "StateMachine.Error.INVALID_CALLBACK")
      @js.native
      def INVALID_CALLBACK: Double = js.native
      @scala.inline
      def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
      
      @JSImport("javascript-state-machine", "StateMachine.Error.INVALID_TRANSITION")
      @js.native
      def INVALID_TRANSITION: Double = js.native
      @scala.inline
      def INVALID_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TRANSITION")(x.asInstanceOf[js.Any])
      
      // = 100, caller tried to fire an event that was innapropriate in the current state
      @JSImport("javascript-state-machine", "StateMachine.Error.PENDING_TRANSITION")
      @js.native
      def PENDING_TRANSITION: Double = js.native
      @scala.inline
      def PENDING_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_TRANSITION")(x.asInstanceOf[js.Any])
    }
    
    // = 'async'
    object Result {
      
      @JSImport("javascript-state-machine", "StateMachine.Result")
      @js.native
      val ^ : js.Any = js.native
      
      // = 2, the event was successfull but no state transition was necessary
      @JSImport("javascript-state-machine", "StateMachine.Result.CANCELLED")
      @js.native
      def CANCELLED: Double = js.native
      @scala.inline
      def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
      
      // = 1, the event transitioned successfully from one state to another
      @JSImport("javascript-state-machine", "StateMachine.Result.NOTRANSITION")
      @js.native
      def NOTRANSITION: Double = js.native
      @scala.inline
      def NOTRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTRANSITION")(x.asInstanceOf[js.Any])
      
      // = 3, the event was cancelled by the caller in a beforeEvent callback
      @JSImport("javascript-state-machine", "StateMachine.Result.PENDING")
      @js.native
      def PENDING: Double = js.native
      @scala.inline
      def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
      
      @JSImport("javascript-state-machine", "StateMachine.Result.SUCCEEDED")
      @js.native
      def SUCCEEDED: Double = js.native
      @scala.inline
      def SUCCEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("javascript-state-machine", "StateMachine.VERSION")
    @js.native
    val VERSION: String = js.native
    
    // = "2.4.0"
    @JSImport("javascript-state-machine", "StateMachine.WILDCARD")
    @js.native
    val WILDCARD: String = js.native
    
    @JSImport("javascript-state-machine", "StateMachine.create")
    @js.native
    def create(config: StateMachineConfig): StateMachine = js.native
    @JSImport("javascript-state-machine", "StateMachine.create")
    @js.native
    def create(config: StateMachineConfig, target: StateMachine): StateMachine = js.native
  }
  
  @JSImport("javascript-state-machine", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("javascript-state-machine", "WILDCARD")
  @js.native
  val WILDCARD: String = js.native
  
  @JSImport("javascript-state-machine", "create")
  @js.native
  def create(config: StateMachineConfig): StateMachine = js.native
  @JSImport("javascript-state-machine", "create")
  @js.native
  def create(config: StateMachineConfig, target: StateMachine): StateMachine = js.native
  
  type StateMachineCan = js.Function1[/* evt */ String, Boolean]
  
  @js.native
  trait StateMachineConfig extends StObject {
    
    var callbacks: js.UndefOr[
        StringDictionary[
          js.Function4[
            /* event */ js.UndefOr[String], 
            /* from */ js.UndefOr[String], 
            /* to */ js.UndefOr[String], 
            /* repeated */ js.Any, 
            _
          ]
        ]
      ] = js.native
    
    var error: js.UndefOr[StateMachineErrorCallback] = js.native
    
    // string or { state: 'foo', event: 'setup', defer: true|false }
    var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.native
    
    var initial: js.UndefOr[js.Any] = js.native
    
    var target: js.UndefOr[StateMachine] = js.native
  }
  object StateMachineConfig {
    
    @scala.inline
    def apply(): StateMachineConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateMachineConfig]
    }
    
    @scala.inline
    implicit class StateMachineConfigMutableBuilder[Self <: StateMachineConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(
        value: StringDictionary[
              js.Function4[
                /* event */ js.UndefOr[String], 
                /* from */ js.UndefOr[String], 
                /* to */ js.UndefOr[String], 
                /* repeated */ js.Any, 
                _
              ]
            ]
      ): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setError(
        value: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[js.Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[Error]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction7(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[StateMachineEventDef]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: StateMachineEventDef*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setInitial(value: js.Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setTarget(value: StateMachine): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type StateMachineErrorCallback = js.Function7[
    /* eventName */ js.UndefOr[String], 
    /* from */ js.UndefOr[String], 
    /* to */ js.UndefOr[String], 
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* errorCode */ js.UndefOr[Double], 
    /* errorMessage */ js.UndefOr[String], 
    /* ex */ js.UndefOr[Error], 
    Unit
  ]
  
  type StateMachineEvent = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait StateMachineEventDef extends StObject {
    
    var from: js.Any = js.native
    
    var name: String = js.native
    
    // string or string[]
    var to: String = js.native
  }
  object StateMachineEventDef {
    
    @scala.inline
    def apply(from: js.Any, name: String, to: String): StateMachineEventDef = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateMachineEventDef]
    }
    
    @scala.inline
    implicit class StateMachineEventDefMutableBuilder[Self <: StateMachineEventDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type StateMachineIs = js.Function1[/* state */ String, Boolean]
  
  type StateMachineIsFinished = js.Function1[/* state */ String, Boolean]
  
  @js.native
  trait StateMachineTransition extends StObject {
    
    def apply(): Unit = js.native
    
    def cancel(): Unit = js.native
  }
  
  type StateMachineTransitions = js.Function0[js.Array[String]]
}
