package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concurrency extends StObject {
  
  var concurrency: Double
}
object Concurrency {
  
  inline def apply(concurrency: Double): Concurrency = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concurrency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Concurrency] (val x: Self) extends AnyVal {
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
  }
}
