package typings.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Int64")
@js.native
class Int64 protected () extends StObject {
  def this(lo: Double, hi: Double) = this()
  
  var hi: Double = js.native
  
  var lo: Double = js.native
}
/* static members */
object Int64 {
  
  @JSImport("kdbxweb", "Int64")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def from(value: Double): Int64 = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Int64]
}
