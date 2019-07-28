package typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSONSchemaType extends _JSONSchemaTypeValue

@JSImport("json-schema-typed", "JSONSchemaType")
@js.native
object JSONSchemaType extends js.Object {
  /**
    * Array
    */
  @js.native
  sealed trait Array extends JSONSchemaType
  
  /**
    * Boolean
    */
  @js.native
  sealed trait Boolean extends JSONSchemaType
  
  /**
    * Integer
    */
  @js.native
  sealed trait Integer extends JSONSchemaType
  
  /**
    * Null
    */
  @js.native
  sealed trait Null extends JSONSchemaType
  
  /**
    * Number
    */
  @js.native
  sealed trait Number extends JSONSchemaType
  
  /**
    * Object
    */
  @js.native
  sealed trait Object extends JSONSchemaType
  
  /**
    * String
    */
  @js.native
  sealed trait String extends JSONSchemaType
  
  /* "array" */ val Array: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.Array with java.lang.String = js.native
  /* "boolean" */ val Boolean: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.Boolean with java.lang.String = js.native
  /* "integer" */ val Integer: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.Integer with java.lang.String = js.native
  /* "null" */ val Null: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.Null with java.lang.String = js.native
  /* "number" */ val Number: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.Number with java.lang.String = js.native
  /* "object" */ val Object: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.Object with java.lang.String = js.native
  /* "string" */ val String: typings.jsonDashSchemaDashTyped.jsonDashSchemaDashTypedMod.JSONSchemaType.String with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[JSONSchemaType with java.lang.String] = js.native
}

