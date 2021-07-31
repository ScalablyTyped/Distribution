package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var describe: String
}
object `1` {
  
  @scala.inline
  def apply(describe: String): `1` = {
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
  }
}
