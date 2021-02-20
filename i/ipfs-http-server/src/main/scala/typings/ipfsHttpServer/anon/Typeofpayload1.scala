package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpayload1 extends StObject {
  
  val output_1: String = js.native
  
  val parse_1: Boolean = js.native
}
object Typeofpayload1 {
  
  @scala.inline
  def apply(output_1: String, parse_1: Boolean): Typeofpayload1 = {
    val __obj = js.Dynamic.literal(output_1 = output_1.asInstanceOf[js.Any], parse_1 = parse_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpayload1]
  }
  
  @scala.inline
  implicit class Typeofpayload1MutableBuilder[Self <: Typeofpayload1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput_1(value: String): Self = StObject.set(x, "output_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_1(value: Boolean): Self = StObject.set(x, "parse_1", value.asInstanceOf[js.Any])
  }
}
