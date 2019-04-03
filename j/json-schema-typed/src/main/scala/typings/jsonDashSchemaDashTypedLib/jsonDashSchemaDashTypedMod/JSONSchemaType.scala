package typings
package jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod

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
  sealed trait Array
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /**
    * Boolean
    */
  @js.native
  sealed trait Boolean
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /**
    * Integer
    */
  @js.native
  sealed trait Integer
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /**
    * Null
    */
  @js.native
  sealed trait Null
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /**
    * Number
    */
  @js.native
  sealed trait Number
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /**
    * Object
    */
  @js.native
  sealed trait Object
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /**
    * String
    */
  @js.native
  sealed trait String
    extends jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType
  
  /* "array" */ val Array: Array with java.lang.String = js.native
  /* "boolean" */ val Boolean: Boolean with java.lang.String = js.native
  /* "integer" */ val Integer: Integer with java.lang.String = js.native
  /* "null" */ val Null: Null with java.lang.String = js.native
  /* "number" */ val Number: Number with java.lang.String = js.native
  /* "object" */ val Object: Object with java.lang.String = js.native
  /* "string" */ val String: String with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    jsonDashSchemaDashTypedLib.jsonDashSchemaDashTypedMod.JSONSchemaType with java.lang.String
  ] = js.native
}

