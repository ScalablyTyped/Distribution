package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpayload2 extends StObject {
  
  val output_2: String
  
  val parse_2: Boolean
}
object Typeofpayload2 {
  
  @scala.inline
  def apply(output_2: String, parse_2: Boolean): Typeofpayload2 = {
    val __obj = js.Dynamic.literal(output_2 = output_2.asInstanceOf[js.Any], parse_2 = parse_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpayload2]
  }
  
  @scala.inline
  implicit class Typeofpayload2MutableBuilder[Self <: Typeofpayload2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput_2(value: String): Self = StObject.set(x, "output_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_2(value: Boolean): Self = StObject.set(x, "parse_2", value.asInstanceOf[js.Any])
  }
}
