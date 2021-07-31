package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance&#39;s serial console output.
  */
trait SchemaSerialPortOutput extends StObject {
  
  /**
    * [Output Only] The contents of the console output.
    */
  var contents: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Type of the resource. Always compute#serialPortOutput for
    * serial port output.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The position of the next byte of content from the serial
    * console output. Use this value in the next request as the start
    * parameter.
    */
  var next: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The starting byte position of the output that was returned. This should
    * match the start parameter sent with the request. If the serial console
    * output exceeds the size of the buffer, older output will be overwritten
    * by newer content and the start values will be mismatched.
    */
  var start: js.UndefOr[String] = js.undefined
}
object SchemaSerialPortOutput {
  
  @scala.inline
  def apply(): SchemaSerialPortOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSerialPortOutput]
  }
  
  @scala.inline
  implicit class SchemaSerialPortOutputMutableBuilder[Self <: SchemaSerialPortOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
