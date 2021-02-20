package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteRange extends StObject {
  
  // negative offset is relative to the end of the file.
  var length: Double = js.native
  
  var offset: Double = js.native
}
object ByteRange {
  
  @scala.inline
  def apply(length: Double, offset: Double): ByteRange = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteRange]
  }
  
  @scala.inline
  implicit class ByteRangeMutableBuilder[Self <: ByteRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
