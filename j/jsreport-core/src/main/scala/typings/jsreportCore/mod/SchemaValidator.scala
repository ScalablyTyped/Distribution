package typings.jsreportCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaValidator extends StObject {
  
  def addSchema(name: String, _schema: Any, replace: Boolean): Unit = js.native
  
  def getRootSchema(): Any = js.native
  
  def getSchema(name: String): Any = js.native
  
  var rootSchema: Any = js.native
  
  var schemaVersion: String = js.native
  
  def validate(name: String, data: Any): Any = js.native
  def validate(name: String, data: Any, schema: Any): Any = js.native
  
  def validateRoot(data: Any): Any = js.native
  def validateRoot(data: Any, schema: Any): Any = js.native
}
