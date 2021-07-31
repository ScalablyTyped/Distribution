package typings.jestTestResult.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncheckedSnapshot extends StObject {
  
  var filePath: String
  
  var keys: js.Array[String]
}
object UncheckedSnapshot {
  
  @scala.inline
  def apply(filePath: String, keys: js.Array[String]): UncheckedSnapshot = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncheckedSnapshot]
  }
  
  @scala.inline
  implicit class UncheckedSnapshotMutableBuilder[Self <: UncheckedSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
