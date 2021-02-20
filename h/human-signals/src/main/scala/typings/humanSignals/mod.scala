package typings.humanSignals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Signal extends StObject {
    
    /**
      * What is the default action for this signal when it is not handled.
      */
    var action: SignalAction = js.native
    
    /**
      * Human-friendly description for the signal, for example 'User interruption with CTRL-C'.
      */
    var description: String = js.native
    
    /**
      * Whether the signal's default action cannot be prevented. This is true for SIGTERM, SIGKILL and SIGSTOP.
      */
    var forced: Boolean = js.native
    
    /**
      * Standard name of the signal, for example 'SIGINT'.
      */
    var name: String = js.native
    
    /**
      * Code number of the signal, for example 2. While most number are cross-platform, some are different between different OS.
      */
    var number: Double = js.native
    
    /**
      * Which standard defined that signal.
      */
    var standard: SignalStandard = js.native
    
    /**
      * Whether the current OS can handle this signal in Node.js using process.on(name, handler). The list of supported signals is OS-specific.
      */
    var supported: Boolean = js.native
  }
  object Signal {
    
    @scala.inline
    def apply(
      action: SignalAction,
      description: String,
      forced: Boolean,
      name: String,
      number: Double,
      standard: SignalStandard,
      supported: Boolean
    ): Signal = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signal]
    }
    
    @scala.inline
    implicit class SignalMutableBuilder[Self <: Signal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: SignalAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: SignalStandard): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanSignals.humanSignalsStrings.terminate
    - typings.humanSignals.humanSignalsStrings.core
    - typings.humanSignals.humanSignalsStrings.ignore
    - typings.humanSignals.humanSignalsStrings.pause
    - typings.humanSignals.humanSignalsStrings.unpause
  */
  trait SignalAction extends StObject
  object SignalAction {
    
    @scala.inline
    def core: typings.humanSignals.humanSignalsStrings.core = "core".asInstanceOf[typings.humanSignals.humanSignalsStrings.core]
    
    @scala.inline
    def ignore: typings.humanSignals.humanSignalsStrings.ignore = "ignore".asInstanceOf[typings.humanSignals.humanSignalsStrings.ignore]
    
    @scala.inline
    def pause: typings.humanSignals.humanSignalsStrings.pause = "pause".asInstanceOf[typings.humanSignals.humanSignalsStrings.pause]
    
    @scala.inline
    def terminate: typings.humanSignals.humanSignalsStrings.terminate = "terminate".asInstanceOf[typings.humanSignals.humanSignalsStrings.terminate]
    
    @scala.inline
    def unpause: typings.humanSignals.humanSignalsStrings.unpause = "unpause".asInstanceOf[typings.humanSignals.humanSignalsStrings.unpause]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanSignals.humanSignalsStrings.ansi
    - typings.humanSignals.humanSignalsStrings.posix
    - typings.humanSignals.humanSignalsStrings.bsd
    - typings.humanSignals.humanSignalsStrings.systemv
    - typings.humanSignals.humanSignalsStrings.other
  */
  trait SignalStandard extends StObject
  object SignalStandard {
    
    @scala.inline
    def ansi: typings.humanSignals.humanSignalsStrings.ansi = "ansi".asInstanceOf[typings.humanSignals.humanSignalsStrings.ansi]
    
    @scala.inline
    def bsd: typings.humanSignals.humanSignalsStrings.bsd = "bsd".asInstanceOf[typings.humanSignals.humanSignalsStrings.bsd]
    
    @scala.inline
    def other: typings.humanSignals.humanSignalsStrings.other = "other".asInstanceOf[typings.humanSignals.humanSignalsStrings.other]
    
    @scala.inline
    def posix: typings.humanSignals.humanSignalsStrings.posix = "posix".asInstanceOf[typings.humanSignals.humanSignalsStrings.posix]
    
    @scala.inline
    def systemv: typings.humanSignals.humanSignalsStrings.systemv = "systemv".asInstanceOf[typings.humanSignals.humanSignalsStrings.systemv]
  }
}
