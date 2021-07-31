package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpayload extends StObject {
  
  val output: String
  
  val parse: Boolean
}
object Typeofpayload {
  
  @scala.inline
  def apply(output: String, parse: Boolean): Typeofpayload = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpayload]
  }
  
  @scala.inline
  implicit class TypeofpayloadMutableBuilder[Self <: Typeofpayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: Boolean): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
