package typings.jestTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  var global: StringDictionary[Double]
}
object Global {
  
  @scala.inline
  def apply(global: StringDictionary[Double]): Global = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobal(value: StringDictionary[Double]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
  }
}
