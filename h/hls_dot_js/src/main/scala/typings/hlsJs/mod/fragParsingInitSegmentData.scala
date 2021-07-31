package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait fragParsingInitSegmentData extends StObject {
  
  var codecs: js.Any
  
  var frag: Fragment
  
  var id: String
  
  var moov: js.Any
}
object fragParsingInitSegmentData {
  
  @scala.inline
  def apply(codecs: js.Any, frag: Fragment, id: String, moov: js.Any): fragParsingInitSegmentData = {
    val __obj = js.Dynamic.literal(codecs = codecs.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moov = moov.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingInitSegmentData]
  }
  
  @scala.inline
  implicit class fragParsingInitSegmentDataMutableBuilder[Self <: fragParsingInitSegmentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecs(value: js.Any): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoov(value: js.Any): Self = StObject.set(x, "moov", value.asInstanceOf[js.Any])
  }
}
