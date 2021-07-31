package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait manifestLoadingData extends StObject {
  
  var url: String
}
object manifestLoadingData {
  
  @scala.inline
  def apply(url: String): manifestLoadingData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestLoadingData]
  }
  
  @scala.inline
  implicit class manifestLoadingDataMutableBuilder[Self <: manifestLoadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
