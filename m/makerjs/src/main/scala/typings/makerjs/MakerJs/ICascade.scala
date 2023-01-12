package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A container that allows a series of functions to be called upon an object.
  */
trait ICascade extends StObject {
  
  /**
    * The initial context object of the cascade.
    */
  @JSName("$initial")
  var $initial: Any
  
  /**
    * Use the $original as the $result.
    */
  @JSName("$reset")
  def $reset(): this.type
  
  /**
    * The current final value of the cascade.
    */
  @JSName("$result")
  var $result: Any
}
object ICascade {
  
  inline def apply($initial: Any, $reset: () => ICascade, $result: Any): ICascade = {
    val __obj = js.Dynamic.literal($initial = $initial.asInstanceOf[js.Any], $reset = js.Any.fromFunction0($reset), $result = $result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICascade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICascade] (val x: Self) extends AnyVal {
    
    inline def set$initial(value: Any): Self = StObject.set(x, "$initial", value.asInstanceOf[js.Any])
    
    inline def set$reset(value: () => ICascade): Self = StObject.set(x, "$reset", js.Any.fromFunction0(value))
    
    inline def set$result(value: Any): Self = StObject.set(x, "$result", value.asInstanceOf[js.Any])
  }
}
