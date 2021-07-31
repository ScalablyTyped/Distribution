package typings.jsonSchemaGenerator

import typings.jsonSchema.mod.JSONSchema4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * JSON schema generated based on draft-v4 of the specification.
    */
  @scala.inline
  def apply(schema: js.Object): JSONSchema4 = ^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema4]
  
  @JSImport("json-schema-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
