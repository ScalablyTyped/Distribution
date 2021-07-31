package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestFailure extends StObject {
  
  var actualService: js.UndefOr[String] = js.undefined
  
  var expectedService: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object SchemaTestFailure {
  
  @scala.inline
  def apply(): SchemaTestFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestFailure]
  }
  
  @scala.inline
  implicit class SchemaTestFailureMutableBuilder[Self <: SchemaTestFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualService(value: String): Self = StObject.set(x, "actualService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualServiceUndefined: Self = StObject.set(x, "actualService", js.undefined)
    
    @scala.inline
    def setExpectedService(value: String): Self = StObject.set(x, "expectedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedServiceUndefined: Self = StObject.set(x, "expectedService", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
