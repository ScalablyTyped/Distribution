package typings.jsonSchemaTyped.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSONSchemaType extends _JSONSchemaTypeValue
@JSImport("json-schema-typed", "JSONSchemaType")
@js.native
object JSONSchemaType extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[JSONSchemaType with java.lang.String] = js.native
  
  /**
    * Array
    */
  @js.native
  sealed trait Array extends JSONSchemaType
  /* "array" */ val Array: typings.jsonSchemaTyped.mod.JSONSchemaType.Array with java.lang.String = js.native
  
  /**
    * Boolean
    */
  @js.native
  sealed trait Boolean extends JSONSchemaType
  /* "boolean" */ val Boolean: typings.jsonSchemaTyped.mod.JSONSchemaType.Boolean with java.lang.String = js.native
  
  /**
    * Integer
    */
  @js.native
  sealed trait Integer extends JSONSchemaType
  /* "integer" */ val Integer: typings.jsonSchemaTyped.mod.JSONSchemaType.Integer with java.lang.String = js.native
  
  /**
    * Null
    */
  @js.native
  sealed trait Null extends JSONSchemaType
  /* "null" */ val Null: typings.jsonSchemaTyped.mod.JSONSchemaType.Null with java.lang.String = js.native
  
  /**
    * Number
    */
  @js.native
  sealed trait Number extends JSONSchemaType
  /* "number" */ val Number: typings.jsonSchemaTyped.mod.JSONSchemaType.Number with java.lang.String = js.native
  
  /**
    * Object
    */
  @js.native
  sealed trait Object extends JSONSchemaType
  /* "object" */ val Object: typings.jsonSchemaTyped.mod.JSONSchemaType.Object with java.lang.String = js.native
  
  /**
    * String
    */
  @js.native
  sealed trait String extends JSONSchemaType
  /* "string" */ val String: typings.jsonSchemaTyped.mod.JSONSchemaType.String with java.lang.String = js.native
}
