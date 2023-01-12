package typings.jsforce.apiMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveMessage extends StObject {
  
  var fileName: String
  
  var problem: String
}
object RetrieveMessage {
  
  inline def apply(fileName: String, problem: String): RetrieveMessage = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetrieveMessage] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setProblem(value: String): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
  }
}
