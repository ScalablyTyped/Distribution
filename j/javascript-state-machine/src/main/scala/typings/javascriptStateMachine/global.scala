package typings.javascriptStateMachine

import typings.javascriptStateMachine.mod.StateMachineConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object StateMachine {
    
    @JSGlobal("StateMachine")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("StateMachine.ASYNC")
    @js.native
    val ASYNC: String = js.native
    
    object Error {
      
      @JSGlobal("StateMachine.Error")
      @js.native
      val ^ : js.Any = js.native
      
      // = 200, caller tried to fire an event while an async transition was still pending
      @JSGlobal("StateMachine.Error.INVALID_CALLBACK")
      @js.native
      def INVALID_CALLBACK: Double = js.native
      inline def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("StateMachine.Error.INVALID_TRANSITION")
      @js.native
      def INVALID_TRANSITION: Double = js.native
      inline def INVALID_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TRANSITION")(x.asInstanceOf[js.Any])
      
      // = 100, caller tried to fire an event that was innapropriate in the current state
      @JSGlobal("StateMachine.Error.PENDING_TRANSITION")
      @js.native
      def PENDING_TRANSITION: Double = js.native
      inline def PENDING_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_TRANSITION")(x.asInstanceOf[js.Any])
    }
    
    object Result {
      
      @JSGlobal("StateMachine.Result")
      @js.native
      val ^ : js.Any = js.native
      
      // = 2, the event was successfull but no state transition was necessary
      @JSGlobal("StateMachine.Result.CANCELLED")
      @js.native
      def CANCELLED: Double = js.native
      inline def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
      
      // = 1, the event transitioned successfully from one state to another
      @JSGlobal("StateMachine.Result.NOTRANSITION")
      @js.native
      def NOTRANSITION: Double = js.native
      inline def NOTRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTRANSITION")(x.asInstanceOf[js.Any])
      
      // = 3, the event was cancelled by the caller in a beforeEvent callback
      @JSGlobal("StateMachine.Result.PENDING")
      @js.native
      def PENDING: Double = js.native
      inline def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
      
      @JSGlobal("StateMachine.Result.SUCCEEDED")
      @js.native
      def SUCCEEDED: Double = js.native
      inline def SUCCEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
    }
    
    object StateMachine {
      
      @JSGlobal("StateMachine.StateMachine")
      @js.native
      val ^ : js.Any = js.native
      
      // = '*'
      @JSGlobal("StateMachine.StateMachine.ASYNC")
      @js.native
      val ASYNC: String = js.native
      
      object Error {
        
        @JSGlobal("StateMachine.StateMachine.Error")
        @js.native
        val ^ : js.Any = js.native
        
        // = 200, caller tried to fire an event while an async transition was still pending
        @JSGlobal("StateMachine.StateMachine.Error.INVALID_CALLBACK")
        @js.native
        def INVALID_CALLBACK: Double = js.native
        inline def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
        
        @JSGlobal("StateMachine.StateMachine.Error.INVALID_TRANSITION")
        @js.native
        def INVALID_TRANSITION: Double = js.native
        inline def INVALID_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TRANSITION")(x.asInstanceOf[js.Any])
        
        // = 100, caller tried to fire an event that was innapropriate in the current state
        @JSGlobal("StateMachine.StateMachine.Error.PENDING_TRANSITION")
        @js.native
        def PENDING_TRANSITION: Double = js.native
        inline def PENDING_TRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_TRANSITION")(x.asInstanceOf[js.Any])
      }
      
      // = 'async'
      object Result {
        
        @JSGlobal("StateMachine.StateMachine.Result")
        @js.native
        val ^ : js.Any = js.native
        
        // = 2, the event was successfull but no state transition was necessary
        @JSGlobal("StateMachine.StateMachine.Result.CANCELLED")
        @js.native
        def CANCELLED: Double = js.native
        inline def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
        
        // = 1, the event transitioned successfully from one state to another
        @JSGlobal("StateMachine.StateMachine.Result.NOTRANSITION")
        @js.native
        def NOTRANSITION: Double = js.native
        inline def NOTRANSITION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTRANSITION")(x.asInstanceOf[js.Any])
        
        // = 3, the event was cancelled by the caller in a beforeEvent callback
        @JSGlobal("StateMachine.StateMachine.Result.PENDING")
        @js.native
        def PENDING: Double = js.native
        inline def PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
        
        @JSGlobal("StateMachine.StateMachine.Result.SUCCEEDED")
        @js.native
        def SUCCEEDED: Double = js.native
        inline def SUCCEEDED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCEEDED")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("StateMachine.StateMachine.VERSION")
      @js.native
      val VERSION: String = js.native
      
      // = "2.4.0"
      @JSGlobal("StateMachine.StateMachine.WILDCARD")
      @js.native
      val WILDCARD: String = js.native
      
      inline def create(config: StateMachineConfig): typings.javascriptStateMachine.mod.StateMachine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.javascriptStateMachine.mod.StateMachine]
      inline def create(config: StateMachineConfig, target: typings.javascriptStateMachine.mod.StateMachine): typings.javascriptStateMachine.mod.StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.javascriptStateMachine.mod.StateMachine]
    }
    
    @JSGlobal("StateMachine.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSGlobal("StateMachine.WILDCARD")
    @js.native
    val WILDCARD: String = js.native
    
    inline def create(config: StateMachineConfig): typings.javascriptStateMachine.mod.StateMachine = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typings.javascriptStateMachine.mod.StateMachine]
    inline def create(config: StateMachineConfig, target: typings.javascriptStateMachine.mod.StateMachine): typings.javascriptStateMachine.mod.StateMachine = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[typings.javascriptStateMachine.mod.StateMachine]
  }
}
