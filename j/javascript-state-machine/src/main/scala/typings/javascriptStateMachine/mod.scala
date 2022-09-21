package typings.javascriptStateMachine

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-state-machine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    inline def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
    
    @JSImport("javascript-state-machine", "Error.INVALID_TRANSITION")
    @js.native
    def INVALID_TRANSITION: Double = js.native
    inline def INVALID_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TRANSITION")(x.asInstanceOf[js.Any])
    
    // = 100, caller tried to fire an event that was innapropriate in the current state
    @JSImport("javascript-state-machine", "Error.PENDING_TRANSITION")
    @js.native
    def PENDING_TRANSITION: Double = js.native
    inline def PENDING_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_TRANSITION")(x.asInstanceOf[js.Any])
  }
  
  object Result {
    
    @JSImport("javascript-state-machine", "Result")
    @js.native
    val ^ : js.Any = js.native
    
    // = 2, the event was successfull but no state transition was necessary
    @JSImport("javascript-state-machine", "Result.CANCELLED")
    @js.native
    def CANCELLED: Double = js.native
    inline def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    // = 1, the event transitioned successfully from one state to another
    @JSImport("javascript-state-machine", "Result.NOTRANSITION")
    @js.native
    def NOTRANSITION: Double = js.native
    inline def NOTRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTRANSITION")(x.asInstanceOf[js.Any])
    
    // = 3, the event was cancelled by the caller in a beforeEvent callback
    @JSImport("javascript-state-machine", "Result.PENDING")
    @js.native
    def PENDING: Double = js.native
    inline def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("javascript-state-machine", "Result.SUCCEEDED")
    @js.native
    def SUCCEEDED: Double = js.native
    inline def SUCCEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
  }
  
  trait StateMachine extends StObject {
    
    def can(evt: String): Boolean
    @JSName("can")
    var can_Original: StateMachineCan
    
    def cannot(evt: String): Boolean
    @JSName("cannot")
    var cannot_Original: StateMachineCan
    
    var current: String
    
    def error(
      eventName: js.UndefOr[String],
      from: js.UndefOr[String],
      to: js.UndefOr[String],
      args: js.UndefOr[js.Array[Any]],
      errorCode: js.UndefOr[Double],
      errorMessage: js.UndefOr[String],
      ex: js.UndefOr[js.Error]
    ): Unit
    @JSName("error")
    var error_Original: StateMachineErrorCallback
    
    def is(state: String): Boolean
    
    def isFinished(state: String): Boolean
    @JSName("isFinished")
    var isFinished_Original: StateMachineIsFinished
    
    @JSName("is")
    var is_Original: StateMachineIs
    
    /*  transition - only available when performing async state transitions; otherwise null. Can be a:
      [1] fsm.transition(); // called from async callback
      [2] fsm.transition.cancel();
      */
    def transition(): Unit
    /*  transition - only available when performing async state transitions; otherwise null. Can be a:
      [1] fsm.transition(); // called from async callback
      [2] fsm.transition.cancel();
      */
    @JSName("transition")
    var transition_Original: StateMachineTransition
    
    def transitions(): js.Array[String]
    @JSName("transitions")
    var transitions_Original: StateMachineTransitions
  }
  object StateMachine {
    
    inline def apply(
      can: /* evt */ String => Boolean,
      cannot: /* evt */ String => Boolean,
      current: String,
      error: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[js.Error]) => Unit,
      is: /* state */ String => Boolean,
      isFinished: /* state */ String => Boolean,
      transition: StateMachineTransition,
      transitions: () => js.Array[String]
    ): StateMachine = {
      val __obj = js.Dynamic.literal(can = js.Any.fromFunction1(can), cannot = js.Any.fromFunction1(cannot), current = current.asInstanceOf[js.Any], error = js.Any.fromFunction7(error), is = js.Any.fromFunction1(is), isFinished = js.Any.fromFunction1(isFinished), transition = transition.asInstanceOf[js.Any], transitions = js.Any.fromFunction0(transitions))
      __obj.asInstanceOf[StateMachine]
    }
    
    @JSImport("javascript-state-machine", "StateMachine")
    @js.native
    val ^ : js.Any = js.native
    
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
      inline def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
      
      @JSImport("javascript-state-machine", "StateMachine.Error.INVALID_TRANSITION")
      @js.native
      def INVALID_TRANSITION: Double = js.native
      inline def INVALID_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TRANSITION")(x.asInstanceOf[js.Any])
      
      // = 100, caller tried to fire an event that was innapropriate in the current state
      @JSImport("javascript-state-machine", "StateMachine.Error.PENDING_TRANSITION")
      @js.native
      def PENDING_TRANSITION: Double = js.native
      inline def PENDING_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_TRANSITION")(x.asInstanceOf[js.Any])
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
      inline def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
      
      // = 1, the event transitioned successfully from one state to another
      @JSImport("javascript-state-machine", "StateMachine.Result.NOTRANSITION")
      @js.native
      def NOTRANSITION: Double = js.native
      inline def NOTRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTRANSITION")(x.asInstanceOf[js.Any])
      
      // = 3, the event was cancelled by the caller in a beforeEvent callback
      @JSImport("javascript-state-machine", "StateMachine.Result.PENDING")
      @js.native
      def PENDING: Double = js.native
      inline def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
      
      @JSImport("javascript-state-machine", "StateMachine.Result.SUCCEEDED")
      @js.native
      def SUCCEEDED: Double = js.native
      inline def SUCCEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("javascript-state-machine", "StateMachine.VERSION")
    @js.native
    val VERSION: String = js.native
    
    // = "2.4.0"
    @JSImport("javascript-state-machine", "StateMachine.WILDCARD")
    @js.native
    val WILDCARD: String = js.native
    
    inline def create(config: StateMachineConfig): StateMachine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine]
    inline def create(config: StateMachineConfig, target: StateMachine): StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StateMachine]
    
    extension [Self <: StateMachine](x: Self) {
      
      inline def setCan(value: /* evt */ String => Boolean): Self = StObject.set(x, "can", js.Any.fromFunction1(value))
      
      inline def setCannot(value: /* evt */ String => Boolean): Self = StObject.set(x, "cannot", js.Any.fromFunction1(value))
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setError(
        value: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[js.Error]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction7(value))
      
      inline def setIs(value: /* state */ String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setIsFinished(value: /* state */ String => Boolean): Self = StObject.set(x, "isFinished", js.Any.fromFunction1(value))
      
      inline def setTransition(value: StateMachineTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: () => js.Array[String]): Self = StObject.set(x, "transitions", js.Any.fromFunction0(value))
    }
  }
  
  @JSImport("javascript-state-machine", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("javascript-state-machine", "WILDCARD")
  @js.native
  val WILDCARD: String = js.native
  
  inline def create(config: StateMachineConfig): StateMachine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[StateMachine]
  inline def create(config: StateMachineConfig, target: StateMachine): StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StateMachine]
  
  type StateMachineCan = js.Function1[/* evt */ String, Boolean]
  
  trait StateMachineConfig extends StObject {
    
    var callbacks: js.UndefOr[
        StringDictionary[
          js.Function4[
            /* event */ js.UndefOr[String], 
            /* from */ js.UndefOr[String], 
            /* to */ js.UndefOr[String], 
            /* repeated */ Any, 
            Any
          ]
        ]
      ] = js.undefined
    
    var error: js.UndefOr[StateMachineErrorCallback] = js.undefined
    
    // string or { state: 'foo', event: 'setup', defer: true|false }
    var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.undefined
    
    var initial: js.UndefOr[Any] = js.undefined
    
    var target: js.UndefOr[StateMachine] = js.undefined
  }
  object StateMachineConfig {
    
    inline def apply(): StateMachineConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateMachineConfig]
    }
    
    extension [Self <: StateMachineConfig](x: Self) {
      
      inline def setCallbacks(
        value: StringDictionary[
              js.Function4[
                /* event */ js.UndefOr[String], 
                /* from */ js.UndefOr[String], 
                /* to */ js.UndefOr[String], 
                /* repeated */ Any, 
                Any
              ]
            ]
      ): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setError(
        value: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[js.Error]) => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction7(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setEvents(value: js.Array[StateMachineEventDef]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: StateMachineEventDef*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInitial(value: Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setTarget(value: StateMachine): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type StateMachineErrorCallback = js.Function7[
    /* eventName */ js.UndefOr[String], 
    /* from */ js.UndefOr[String], 
    /* to */ js.UndefOr[String], 
    /* args */ js.UndefOr[js.Array[Any]], 
    /* errorCode */ js.UndefOr[Double], 
    /* errorMessage */ js.UndefOr[String], 
    /* ex */ js.UndefOr[js.Error], 
    Unit
  ]
  
  @js.native
  trait StateMachineEvent extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait StateMachineEventDef extends StObject {
    
    var from: Any
    
    var name: String
    
    // string or string[]
    var to: String
  }
  object StateMachineEventDef {
    
    inline def apply(from: Any, name: String, to: String): StateMachineEventDef = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateMachineEventDef]
    }
    
    extension [Self <: StateMachineEventDef](x: Self) {
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
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
