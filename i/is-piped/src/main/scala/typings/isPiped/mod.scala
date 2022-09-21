package typings.isPiped

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("is-piped", JSImport.Namespace)
  @js.native
  val ^ : typings.isPiped.mod.isPiped = js.native
  
  trait IsPipedResult extends StObject {
    
    /**
      * Whether or not we're absolutely sure of that.
      */
    var confident: Boolean
    
    /**
      * Whether or not it's a pipe.
      */
    var piped: Boolean
  }
  object IsPipedResult {
    
    inline def apply(confident: Boolean, piped: Boolean): IsPipedResult = {
      val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], piped = piped.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsPipedResult]
    }
    
    extension [Self <: IsPipedResult](x: Self) {
      
      inline def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
      
      inline def setPiped(value: Boolean): Self = StObject.set(x, "piped", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = typings.isPiped.mod.isPiped
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.isPiped.mod.isPiped = ^
  
  trait isPiped extends StObject {
    
    /**
      * Determines if an inbound file descriptor is piped or not, across platforms.
      *
      * @example
      * import * as isPiped from 'is-piped';
      *
      * console.log(isPiped.in(0));
      *
      * // {
      * //     piped: false,
      * //     confident: false
      * // }
      */
    def in(fd: Double): IsPipedResult
    
    /**
      * Determines if an outbound file descriptor is piped or not, across platforms.
      *
      * @example
      * import * as isPiped from 'is-piped';
      *
      * console.log(isPiped.out(1));
      *
      * // {
      * //     piped: false,
      * //     confident: false
      * // }
      */
    def out(fd: Double): IsPipedResult
  }
  object isPiped {
    
    inline def apply(in: Double => IsPipedResult, out: Double => IsPipedResult): typings.isPiped.mod.isPiped = {
      val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
      __obj.asInstanceOf[typings.isPiped.mod.isPiped]
    }
    
    extension [Self <: typings.isPiped.mod.isPiped](x: Self) {
      
      inline def setIn(value: Double => IsPipedResult): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
      
      inline def setOut(value: Double => IsPipedResult): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
    }
  }
}
